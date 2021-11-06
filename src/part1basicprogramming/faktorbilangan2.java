package part1basicprogramming;

import java.util.Scanner;

class faktorbilangan2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan angka");
        int bilangan = a.nextInt();
        System.out.println("faktor-faktor bilangannya :");
        for(int i=bilangan; i>0; i--){
            int hasil = bilangan %i;
            if(hasil == 0){
                System.out.print(i+ " ");
            }
        }
    }
}

