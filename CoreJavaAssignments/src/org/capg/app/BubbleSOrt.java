package org.capg.app;

public class BubbleSOrt {
  
    public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5};  
                int n = arr.length;  
                int temp = 0;
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                for(int i=0; i < n; i++){  
                    for(int j=1; j < (n-i); j++){  
                             if(arr[j-1] > arr[j]){  
                                    temp = arr[j-1];  
                                    arr[j-1] = arr[j];  
                                    arr[j] = temp;  
                            }  
                             
                    }  
            }  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
}
}