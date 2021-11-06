package part1basicprogramming;

import java.util.Scanner;

class faktorbilangan {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan angka");
        int bilangan = a.nextInt();
        System.out.println("faktor-faktor bilangannya :");
        int plus = 0;
        for(int x=0; x<= bilangan; x++){
            plus++;
            if(bilangan % plus ==0){
                System.out.print(plus + " ");
            }
        }
    }
}
