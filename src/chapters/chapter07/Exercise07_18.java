package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");

        int[] numbers = new int[10];

        for (int i=0;i< numbers.length;i++){
            numbers[i]=input.nextInt();
        }
        bubbleSort(numbers);
        System.out.println("Numbers are sorted with bubble sort:");
        for (int a:numbers) {
            System.out.print(a +" ");

        }
    }
    public static void bubbleSort(int[] list){
        int temp;
        for(int i =1;i< list.length;i++){
            for(int j=0;j< list.length-i;j++){
                if(list[j]>list[j+1]){
                 temp=list[j];
                 list[j]=list[j+1];
                 list[j+1]=temp;
                }
            }
        }
    }
}
