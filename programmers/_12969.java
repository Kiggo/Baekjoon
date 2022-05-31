package programmers;

import java.util.Scanner;

class _12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int k=0; k<b; k++){
            for(int i=0; i<a; i++){
                System.out.printf("*");
            }
             System.out.println();
        }
    }
}