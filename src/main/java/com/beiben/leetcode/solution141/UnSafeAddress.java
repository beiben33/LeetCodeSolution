package com.beiben.leetcode.solution141;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnSafeAddress {
    static final Unsafe unsafe = getUnsafe();
    static final boolean is64bit = true;

    public static long getAddresses(Object... objects) {
        int offset = unsafe.arrayBaseOffset(objects.getClass());
        int scale = unsafe.arrayIndexScale(objects.getClass());
        switch (scale) {
            case 4:
                long factor = is64bit ? 8 : 1;
                final long i1 = (unsafe.getInt(objects, offset) & 0xFFFFFFFFL) * factor;
                return i1;
            default:
                throw new AssertionError("Not supported");
        }
    }

    private static Unsafe getUnsafe() {
        try {
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            return (Unsafe) theUnsafe.get(null);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }
}
