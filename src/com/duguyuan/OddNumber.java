package com.duguyuan;

public class OddNumber {

    public static int range = 30;

    public static void main(String[] args) {
        System.out.println(range + "以内从大到小的前12个奇数为：");
        if ((range & 1) == 0) {
            range--;
        }
        int[] odd = new int[12];
        int index = 0;
        for (int i = range; i >= 0; i -= 2) {
            if (index < 12) {
                odd[index] = i;
                System.out.println(odd[index++]);
            }
        }
    }

}
