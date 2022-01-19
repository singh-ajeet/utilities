package org.ajeet.utilities;

public final class HexUtilities {

    private HexUtilities() {
        throw new RuntimeException(getClass() + " must not be instantiated. ");
    }

    public static long reHash(Object object){
        if(object == null)
            return 0;

        long hash = object.hashCode();
        hash = hash ^ ( hash >>> 16 );
        return hash;
    }

    public static int getNextSizePowerOf2(int n) {
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;

        n = n +1;
        return n;
    }
}
