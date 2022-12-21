package cz.tul.alp.lilianl;

import java.util.Scanner;

/**
 * Aplikace ve ktere uzivatel vybira mezi vanocni ulohou a semestralni praci.
 * @author Lilian
 */
public class Aplikace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                           ************************
                           * Vyberte projekt:     *
                           * 0. Ukoncit program   *
                           * 1. Vanocni uloha     *
                           * 2. Semestralni prace *
                           ************************
                           """;
        System.out.print(menu);
        int volba = scanner.nextInt();
        do{
            switch (volba) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    //Vanocni uloha
                    VanocniUloha.spustit();
                    System.out.print(menu);
                    volba = scanner.nextInt();
                    break;
                case 2:
                    //Semestralni prace
                    SemestralniPrace.spustit();
                    System.out.print(menu);
                    volba = scanner.nextInt();
                    break;
            }
            while(volba != 1 && volba != 2 && volba != 0){
                System.out.println(menu);
                volba = scanner.nextInt();
            }
        }while(volba == 1 || volba == 2);
    }
}
