package DataStructure;
//import java.util.*;
//import java.io.*;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,3,6,8,9,11};
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
