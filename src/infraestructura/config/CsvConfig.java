package infraestructura.config;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CsvConfig {

    private final Path path;
    private final String delimiter;

    public CsvConfig(String fileName) {
        this.path = Path.of("src/infraestructura/database", fileName);
        this.delimiter = ",";
    }

    public List<Map<String, String>> readAll() {
        try (Stream<String> lines = Files.lines(path)) {
            List<String> allLines = lines.toList();
            String[] headers = allLines.getFirst().split(delimiter);

            return allLines.stream()
                    .skip(1)
                    .map(line -> {
                        String[] values = line.split(delimiter);
                        Map<String, String> row = new HashMap<>();
                        for (int i = 0; i < headers.length; i++) {
                            row.put(headers[i], values[i]);
                        }
                        return row;
                    })
                    .toList();

        } catch (IOException e) {
            throw new RuntimeException("Error leyendo CSV: " + path, e);
        }
    }

    public void insert(Map<String, String> row) {
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
            String line = String.join(delimiter, row.values());
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException("Error insertando en CSV: " + path, e);
        }
    }

    public void update(String idColumn, String idValue, Map<String, String> newRow) {
        try {
            List<String> allLines = Files.readAllLines(path);
            String[] headers = allLines.getFirst().split(delimiter);

            List<String> updated = new ArrayList<>();
            updated.add(allLines.getFirst()); // cabecera

            for (int i = 1; i < allLines.size(); i++) {
                String[] values = allLines.get(i).split(delimiter);
                Map<String, String> row = new HashMap<>();
                for (int j = 0; j < headers.length; j++) {
                    row.put(headers[j], values[j]);
                }

                if (row.get(idColumn).equals(idValue)) {
                    updated.add(String.join(delimiter, newRow.values()));
                } else {
                    updated.add(allLines.get(i));
                }
            }

            Files.write(path, updated);

        } catch (IOException e) {
            throw new RuntimeException("Error actualizando CSV: " + path, e);
        }
    }

    public void delete(String idColumn, String idValue) {
        try {
            List<String> allLines = Files.readAllLines(path);
            String[] headers = allLines.getFirst().split(delimiter);

            List<String> filtered = new ArrayList<>();
            filtered.add(allLines.getFirst()); // cabecera

            for (int i = 1; i < allLines.size(); i++) {
                String[] values = allLines.get(i).split(delimiter);
                Map<String, String> row = new HashMap<>();
                for (int j = 0; j < headers.length; j++) {
                    row.put(headers[j], values[j]);
                }

                if (!row.get(idColumn).equals(idValue)) {
                    filtered.add(allLines.get(i));
                }
            }

            Files.write(path, filtered);

        } catch (IOException e) {
            throw new RuntimeException("Error eliminando en CSV: " + path, e);
        }
    }
}
