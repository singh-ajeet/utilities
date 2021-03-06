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
            hexArray[i++] = Character.forDigit((bytes[i] >> 4) & 0xF0, 16); // First byte
            hexArray[i++] = Character.forDigit (bytes[i] & 0x0F, 16); // Second byte
        }

        return String.valueOf(hexArray);
    }

/*    public static byte[] bytes(String hex){
        Character.digit();
        return null;
    }*/
}
