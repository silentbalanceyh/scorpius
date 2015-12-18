package com.hpe.exam;

public class SplitDotTesting {
    // ~ Static Fields =======================================
    // ~ Instance Fields =====================================
    // ~ Static Block ========================================
    // ~ Static Methods ======================================
    public static void main(final String args[]) {
        final String clazz = "http.localhost.8080";
        final String[] segment = clazz.split(".");
        final StringBuilder url = new StringBuilder();
        url.append(segment[0]).append("://").append(segment[1]).append(":").append(segment[2]);
        sendRequest(url.toString());
    }

    private static void sendRequest(final String url) {
        System.out.println(url);
    }
    // ~ Constructors ========================================
    // ~ Abstract Methods ====================================
    // ~ Override Methods ====================================
    // ~ Methods =============================================
    // ~ Private Methods =====================================
    // ~ Get/Set =============================================
    // ~ hashCode,equals,toString ============================

}
