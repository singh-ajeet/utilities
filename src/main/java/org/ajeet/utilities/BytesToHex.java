package org.ajeet.utilities;

public final class BytesToHex {

    private BytesToHex() {
        throw new IllegalStateException(getClass().getName() + " should not be instantiated.");
    }

    public static String hex(byte[] bytes){
        if(bytes == null || bytes.length == 0){
            throw new IllegalArgumentException("bytes parameter cant be null or empty.");
        }

        char[] hexArray = new char[bytes.length * 2];
        for (int i=0; i<bytes.length; i++){
            hexArray[i++] = (char) (bytes[i] & 0xf0 >>> 4); // First byte
            hexArray[i++] = (char) (bytes[i] & 0x0f); // Second byte
        }

        return String.valueOf(hexArray);
    }
}
