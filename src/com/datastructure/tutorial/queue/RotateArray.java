package com.recusrion.homework;

public class RotateArray {

	public static void main(String[] args) {
		int inputArray[]={7,6,5,4,3,2,1};
		
		System.out.println("Before Rotation ");
		for(int i:inputArray){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("After Rotation ");
		rotateArray(inputArray,3);
		for(int i:inputArray){
			System.out.print(i+" ");
		}
	}
	
	public static void rotateArray(int[] inputArray,int shift){
		int temp=0;
		int j=1;
		while(j<=shift){
			for(int i=inputArray.length-1;i>0;i--){
				temp=inputArray[i];
				inputArray[i]=inputArray[i-1];
				inputArray[i-1]=temp;
			}
			j++;
		}
		
	}

}
