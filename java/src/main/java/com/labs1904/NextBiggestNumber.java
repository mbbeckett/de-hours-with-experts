package com.labs1904;
import java.util.Arrays;
import java.util.Comparator;

public class NextBiggestNumber {

    public static void main(String[] args) {
//        Integer input = Integer.parseInt(args[0]);
        int input = 3012311;
        Integer nextBiggestNumber = getNextBiggestNumber(input);
        System.out.println("Input: " + input);
        System.out.println("Next biggest number: " + nextBiggestNumber);
    }

    public static int getNextBiggestNumber(Integer i) {

        String[] stringArray = Integer.toString(i).split("");

        Comparator<String> comp = new PairComparator();

        Arrays.sort(stringArray, comp);

        StringBuilder stringBuilder = new StringBuilder();

        for(String s : stringArray){
            stringBuilder.append(s);
        }

        int maxNumber = Integer.parseInt(stringBuilder.toString());

        return maxNumber;
    }
}
