package service;

import java.util.UUID;

public class Utils {

    public static String generateString() {
        return UUID.randomUUID().toString();
    }
}
