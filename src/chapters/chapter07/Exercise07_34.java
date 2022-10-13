package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to sort: ");
        String s = input.next();

        System.out.println("sorted form: " +  sort(s));
    }
    public static String sort(String s){
        char[] c = new char[s.length()];
        for(int i=0;i<c.length;i++){
            c[i]=s.charAt(i);
        }

        char temp ;
        for(int i =1;i<s.length();i++){
            for(int j=0;j<s.length()-i;j++){
                if(c[j]>c[j+1]){
                    temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;

                }
            }
        }
        String str="";
        for(int k=0;k< c.length;k++){
            str +=c[k];
        }
        return str;
    }
}
