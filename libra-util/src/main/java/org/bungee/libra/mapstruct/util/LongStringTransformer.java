package org.bungee.libra.mapstruct.util;

public class LongStringTransformer {
    public static String longToString(Long value) {
        if (value == null) {
            return null;
        } else {
            return String.valueOf(value);
        }
    }

    public static Long stringToLong(String text) {
        if (null == text || text.isEmpty()) {
            return 0L;
        } else {
            return Long.valueOf(text);
        }
    }
}
