package com.hspedu.pkg;

import java.util.Arrays;

//import java.util.Scanner;只引入java.util包下的scanner
//import java.util.*;表示将java.util包下的所有类全部导入
//建议需要那个类就导入那个类，不建议使用 *
public class Import01 {
    public static void main(String[] args) {
        int[] arr = {-1,20,2,13,5};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
