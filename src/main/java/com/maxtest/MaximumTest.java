package com.maxtest;

public class MaximumTest <T extends Comparable<T>>{
    T x, y ,z;
    public MaximumTest(T x, T y, T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T maximum(){
        return MaximumTest.maximum(x, y , z);
    }

    public static String testMaximun(String x, String y, String z){
        String max = x;
        if(y.compareTo(max)>0)
        {
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        printMax(x, y ,z);
        return max;
    }

    private static void printMax(String x, String y, String z) {
        System.out.println(""+testMaximun(x,y,z));
    }

    public static Integer testMaximun(Integer x, Integer y, Integer z){
        Integer max = x;
        if(y.compareTo(max)>0)
        {
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        printMax(x, y ,z);
        return max;
    }
    private static void printMax(Integer x, Integer y, Integer z) {
        System.out.println(""+testMaximun(x,y,z));
    }
    public static Float testMaximun(Float x, Float y, Float z){
        Float max = x;
        if(y.compareTo(max)>0)
        {
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        printMax(x, y ,z);
        return max;
    }

    private static void printMax(Float x, Float y, Float z) {
        System.out.println(testMaximun(x, y, z));
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0 ){
            max = y;
        }
        if(z.compareTo(max) > 0 ){
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }
    public static <T> void printMax(T x, T y, T z, T max) {
        System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);
    }
    public static void main(String[] args){
        Integer xInt = 3, yInt = 4, zInt = 5;
        Float xF1 = 6.6f, yF2 = 8.8f, zF3 = 9.9f;
        String xStr = "Apple", yStr = "Orange", zStr = "Banana";

        MaximumTest.testMaximun(xStr, yStr, zStr);
        new MaximumTest(xInt, yInt, zInt).maximum();
        new MaximumTest(xF1, yF2, zF3).maximum();
        new MaximumTest(xStr, yStr, zStr).maximum();
    }
}
