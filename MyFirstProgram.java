package MyFirstProgram;

import java.util.Arrays;
import java.util.Scanner;

public class MyFirstProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入数组大小：");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.println("请输入数组中数值：");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
//		for(int element:arr) {
//			System.out.println(element+" ");
//		}
		System.out.println("请输入需要查找的数字：");
		int key = scan.nextInt();
		int[] brr = arrSort(arr);
		System.out.println(Arrays.toString(brr));
		System.out.print("所要查找的数字下标为："+binarySearch(brr,key));
	}
	public static int[] arrSort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			} 
		}
		return a;
	}
	public static int binarySearch(int[] b,int n) {
        int low = 0;
        int high = b.length-1;
        while(low<high) {
        int mid = (low+high)/2;
        if(n<b[mid]) {
        high = mid-1;
        }else if(n>b[mid]) {
        	low = mid+1;
        }else {
        	return mid;
        }
        }
        return -1;
	}
}
