package one;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            ArrayList<Integer> lista = new ArrayList<>();

            System.out.println("Podaj liczbę");
            int number = 0;
            do {

                try {
                    number = scan.nextInt();
                    if (number > 0) {
                        lista.add(number);
                    } else if (number == 0 ){
                        System.out.println("Podaj liczbę większą od 0");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Wprowadź poprawną liczbę.");
                    scan.nextLine();
                }

            } while (number >= 0);

            for (int i = lista.size() - 1; i >= 0; i--) {
                System.out.println(lista.get(i));
            }

            System.out.println("Suma liczb:");

            int total = 0;
            for (int i = 0; i < lista.size(); i++) {
                System.out.print(lista.get(i));
                if (i == lista.size() - 1) {
                    System.out.print("=");
                } else {
                    System.out.print("+");
                }
                total = total + lista.get(i);
            }

            System.out.println(total);

            int max = 0;
            int min = 0;
            for (int i = 0; i < lista.size(); i++) {
                if (max < lista.get(i)) {
                    max = lista.get(i);
                }

                if (i == 0) {
                    min = lista.get(i);
                } else if (min > lista.get(i)) {
                    min = lista.get(i);
                }
            }

            if (lista.size() == 0 ){
                System.out.println("Max liczb: - \nMin liczb: - ");
            } else {
                System.out.println("Max liczb: " + max + "\nMin liczb: " + min);
            }

        }


    }
