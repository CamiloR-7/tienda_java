package utils;

import java.util.UUID;

public final class GenerarUUID {
    private GenerarUUID() {
        throw new UnsupportedOperationException("No instanciable");
    }

    public static String generar() {
        return UUID.randomUUID().toString();
    }
}