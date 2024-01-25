package com.iflak;

public class qnsecnd {
    public static void main(String[] args) {
        int num[] = {18, 12, 9, 14, 77, 50};
        //System.out.println(arr.index);
        int target = 9;
        int ans = linearsearch(num, target);
        System.out.println(ans);
    }

    static int linearsearch(int arr[],int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
                //  System.out.println(Arrays.stream(arr).max());
            }
        }
        return -1;

    }

}

