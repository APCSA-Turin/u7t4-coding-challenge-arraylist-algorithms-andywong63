package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] arr1 = {"test", "time", "hello", "another i"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1));
        Main.insertAfterI(list1, "insert");
        System.out.println(list1);
        System.out.println();

        String[] arr2 = {"test", "tri", "hi", "bye"};
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr2));
        Main.removeThree(list2);
        System.out.println(list2);
        System.out.println();

        int[] arr3 = {1, 2, 3, 4, 5};
        ArrayList<Integer> list3 = Main.reverseArray(arr3);
        System.out.println(list3);
        System.out.println();

        String[] arr4 = {"hello", "world"};
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList(arr4));
        Main.duplicateUpperEnd(list4);
        System.out.println(list4);
        System.out.println();

        System.out.println(Main.parseSentence("this is a test"));
        System.out.println();

        String[] arr5 = {"test", "B" ,"tri", "hi", "bye"};
        ArrayList<String> list5 = new ArrayList<>(Arrays.asList(arr5));
        Main.moveBWords(list5);
        System.out.println(list5);
        System.out.println();

        Integer[] arr6 = {1, 2, 3, 3, 4, 4, 5, 4, 1};
        ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(arr6));
        Main.removeDuplicates(list6);
        System.out.println(list6);
        System.out.println();

        Integer[] arr7a = {3, 4, 5};
        ArrayList<Integer> list7a = new ArrayList<>(Arrays.asList(arr7a));
        System.out.println(Main.sameFirstLast(list7a));
        Integer[] arr7b = {3, 4, 3};
        ArrayList<Integer> list7b = new ArrayList<>(Arrays.asList(arr7b));
        System.out.println(Main.sameFirstLast(list7b));
        ArrayList<Integer> list7c = new ArrayList<>();
        System.out.println(Main.sameFirstLast(list7c));
        System.out.println();

        Integer[] arr8 = {1, 2, 3, 4, 5};
        ArrayList<Integer> list8 = new ArrayList<>(Arrays.asList(arr8));
        Main.swapEnds(list8);
        System.out.println(list8);
        System.out.println();

        Integer[] arr9 = {1, 2, 0, 3, 4, 0, 5, 0};
        ArrayList<Integer> list9 = new ArrayList<>(Arrays.asList(arr9));
        Main.zeroFront(list9);
        System.out.println(list9);
        System.out.println();

        Integer[] arr10 = {3, 3, 0, 8, 3, 4, 3};
        ArrayList<Integer> list10 = new ArrayList<>(Arrays.asList(arr10));
        Main.notAlone(list10, 3);
        System.out.println(list10);
        System.out.println();

        Integer[] arr11 = {4, 1, 2, 3};
        ArrayList<Integer> list11 = new ArrayList<>(Arrays.asList(arr11));
        Main.shiftLeft(list11);
        System.out.println(list11);
        System.out.println();

        Integer[] arr12 = {5, 6, 4, 7, 3, 5, 3, 6, 4};
        ArrayList<Integer> list12 = new ArrayList<>(Arrays.asList(arr12));
        Main.fix34(list12);
        System.out.println(list12);
        System.out.println();

        int[] arr13 = {1, 2, 3, 2, 4, 5, 5, 6};
        ArrayList<Integer> list13 = Main.modes(arr13);
        System.out.println(list13);
        System.out.println();
    }
}