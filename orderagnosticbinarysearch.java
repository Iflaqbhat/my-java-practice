package com.iflak;



public class orderagnosticbinarysearch {
    public static void main(String[] args) {
        int arr[]={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target=22;
        int ans=ordagno(arr,target);
        System.out.println(ans);}

    static int ordagno(int arr[],int target) {
        {
            int start = 0;
            int end = arr.length - 1;
            boolean isAsc;
            if (arr[start] < arr[end]) {
                isAsc = true;
            } else{
                    isAsc = false;
                }
                while (start <= end) {
                    int mid = (start + end) / 2;
                    if (arr[mid] == target) {
                      return mid;
                    }
                    if (isAsc) {
                        if (target < arr[mid]) {
                            end = mid - 1;
                        } else if (target > arr[mid]) {
                            start = mid + 1;
                        }
                    } else {
                        if (target > arr[mid]) {
                            end = mid - 1;
                        } else {
                            start = mid + 1;
                        }

                    }


                }
                return -1;
            }
        }
    }

