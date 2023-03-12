package PRAKTIKUM;

import java.util.Scanner;

public class Drive extends Segitiga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Segitiga<Integer, Integer> luasInt = new Segitiga<>();
        Segitiga<Double, Double> luasDouble = new Segitiga<>();
        int input;

        System.out.print("1. Hasil to Integer : \n2. Hasil to Double : \n Masukkan pilihan : ");
        input = in.nextInt();

        if (input == 1) {
            System.out.println("masukkan alas dan tinggi :");
            luasInt.setAlas(in.nextInt());
            luasInt.setTinggi(in.nextInt());
            System.out.println("Luas Segitiga (int): " + luasInt.getLuasInt());
        } else if (input == 2) {
            System.out.println("masukkan alas dan tinggi :");
            luasDouble.setAlas(in.nextDouble());
            luasDouble.setTinggi(in.nextDouble());
            System.out.println("Luas Segitiga (double): " + luasDouble.getLuasDouble());
        } else {
            System.out.println("tidak ada di menu");
        }


    }
}


