package cz.tul.alp.lilianl;

import java.util.Scanner;

/**
 * 8. Program tridi sadu bodu ve 3D dle vzrustajici vzdalenosti jednotlivych
 * bodu od pocatku soustavy souradne.
 *
 * @author Lilian
 * @version 0.1 11/12/2022
 */
public class SemestralniPrace {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        spustit();
    }

    public static void spustit() {
        char pokracovat;
        do {
            System.out.println("Zadej pocet bodu: ");
            int pocetZpracovanychBodu = scanner.nextInt();
            while (pocetZpracovanychBodu <= 0) {
                System.out.println("Hodnota musi byt kladna! Zadej pocet bodu: ");
                pocetZpracovanychBodu = scanner.nextInt();
            }
            System.out.println("Zadej souradnice bodu: ");
            double[][] body = new double[pocetZpracovanychBodu][4];
            for (int i = 0; i < pocetZpracovanychBodu; i++) {
                body[i][0] = scanner.nextDouble();
                body[i][1] = scanner.nextDouble();
                body[i][2] = scanner.nextDouble();
                body[i][3] = Math.sqrt(
                        Math.pow(body[i][0], 2)
                        + Math.pow(body[i][1], 2)
                        + Math.pow(body[i][2], 2)
                );
            }
            trideni(body);
            System.out.println("Setridene body: ");
            for (double[] bod : body) {
                for (int j = 0; j < bod.length - 1; j++) {
                    System.out.print(bod[j] + " ");
                }
                System.out.println("");
            }
            System.out.println("Pokracovat ve zpracovani? (a/n)");
            pokracovat = scanner.next().charAt(0);
            while(pokracovat != 'a' && pokracovat != 'A' && pokracovat != 'n' && pokracovat != 'N'){
                System.out.println("Nevalidni vstup. Pokracovat ve zpracovani? (a/n)");
                pokracovat = scanner.next().charAt(0);
            }
        } while (pokracovat == 'a' || pokracovat == 'A');
    }

    /**
     * Metoda tridi sadu bodu dle vzrustajici vzdalenosti od pocatku soustavy
     * souradne.
     *
     * @param arr
     */
    public static void trideni(double[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j][3] > arr[j + 1][3]) {
                    double[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
