package com.cerelus.compemulator.utils;

public class Util {


    public static Integer[] invertRank(Integer[] in, Integer grade) {

        Integer out[] = new Integer[grade];

        for (int i = 0; i < grade; i++) {
            out[i] = in[i] == 1 ? 0 : 1;
        }

        return out;
    }

    public static Integer setBinaryDigitsFromRank(Integer[] in, Integer grade) {

        int out = 0;

        for (int i = 0; i < grade; i++) {
            out = out + (int) Math.pow(2, i) * in[grade - i - 1];
        }

        return out;
    }

    public static Integer setBinaryDigits(Integer[] in, Integer grade) {

        int out = 0;

        for (int i = 0; i < grade; i++) {
            out = out + in[i];
        }

        return out;
    }

    public static Integer setBinaryRank(Integer[] in, Integer grade) {

        String out = "";

        for (int i = 0; i < grade; i++) {
            out = out + in[i];
        }

        return Integer.valueOf(out);
    }

    public static Integer[] getBinaryRank(Integer in, Integer grade) {

        Integer[] out = new Integer[grade];

        for (int i = 0; i < grade; i++) {
            out[grade - i - 1] = getDigit(in, i) != 0 ? 1 : 0;
        }

        return out;
    }

    public static Integer[] getBinaryDigits(Integer in, Integer grade) {

        Integer[] out = new Integer[grade];

        for (int i = 0; i < grade; i++) {
            out[grade - i - 1] = getDigit(in, i);
        }

        return out;
    }

    private static Integer getDigit(Integer in, Integer p) {
        return in & (int) (Math.pow(2, p));
    }
}
