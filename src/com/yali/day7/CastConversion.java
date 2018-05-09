package com.yali.day7;

import java.math.BigInteger;

class CastConversion {
	final int CLASS_DAY = 10;
    public static void main(String[] args) {
        int big = 1234;
        float approx = big;
        long lBig = 100000000000000000L;
        int bigAgain = (int)lBig;
        System.out.println("int to float : "+bigAgain);
        //System.out.println("int to logn :" +lBig);
        //int againInt = (int)lBig;
        //System.out.println("long to int : "+againInt);
        
        /*float fmin = 100.00F;
        double fmax = 1000.00D;
        BigInteger bigInteger = new BigInteger("12222222222222222222222222222222222222222222222");
        BigInteger bigInteger1 = new BigInteger("1222222222222222222222222222222222222222222332");
        bigInteger = bigInteger.add(bigInteger);
        System.out.println("float: " + fmin +
                ".." + fmax);
        System.out.println("long: " + (int)fmin +
                           ".." + (long)fmax);
        System.out.println(bigInteger);
        byte b  = -128;*/
    }
}