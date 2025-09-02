package infraestructura.persistencia.csv;

import dominio.modelos.Producto;
import infraestructura.config.CsvConfig;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CsvProductoRepository {
    private final CsvConfig tabla = new CsvConfig("productos.csv");

    public List<Producto> findAll() {
        return tabla.readAll().stream()
                .map(row -> new Producto(
                        row.get("codigo"),
                        row.get("nombre"),
                        Double.parseDouble(row.get(("precio"))),
                        Double.parseDouble(row.get("costo")),
                        row.get("categoria"),
                        row.get("fecha_de_nacimiento"),
                        row.get("estado")                ))
                .toList();
    }

    public void save(Producto producto) {
        Map<String, String> row = new LinkedHashMap<>();
        row.put("id", String.valueOf(producto.id()));
        row.put("nombre", producto.nombre());
        row.put("precio", String.valueOf(producto.precio()));
        row.put("cantidad", String.valueOf(producto.cantidad()));

        tabla.insert(row);
    }

    public void update(Producto producto) {
        Map<String, String> row = new LinkedHashMap<>();
        row.put("id", String.valueOf(producto.id()));
        row.put("nombre", producto.nombre());
        row.put("precio", String.valueOf(producto.precio()));
        row.put("cantidad", String.valueOf(producto.cantidad()));

        tabla.update("id", String.valueOf(producto.id()), row);
    }

    public void delete(int id) {
        tabla.delete("id", String.valueOf(id));
    }
}
