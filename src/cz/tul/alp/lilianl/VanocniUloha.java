package cz.tul.alp.lilianl;

import java.util.Scanner;

/**
 *
 * @author Lilian
 */
public class VanocniUloha {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void spustit() {
        char pokracovat;
        do {
            System.out.println("Zadej pocet kouli: ");
            int numOfSnowballs = scanner.nextInt();
            while (numOfSnowballs <= 0){
                System.out.println("Nevalidni vstup. Zadej pocet kouli: ");
                numOfSnowballs = scanner.nextInt();
            }
            System.out.println("Zadej pocet snehulaku: ");
            int numOfSnowmen = scanner.nextInt();
            while (numOfSnowmen <= 0){
                System.out.println("Nevalidni vstup. Zadej pocet snehulaku: ");
                numOfSnowmen = scanner.nextInt();
            }

            for (int i = 0; i < numOfSnowmen; i++) {
                System.out.println(drawSnowmanWithFor(numOfSnowballs));
                System.out.print("----------------------" + "\n" + "\n");
            }
            System.out.println("Pokracovat ve zpracovani? (a/n)");
            pokracovat = scanner.next().charAt(0);
            while (pokracovat != 'a' && pokracovat != 'A' && pokracovat != 'n' && pokracovat != 'N') {
                System.out.println("Nevalidni vstup. Pokracovat ve zpracovani? (a/n)");
                pokracovat = scanner.next().charAt(0);
            }
        } while (pokracovat == 'a' || pokracovat == 'A');
    }

    public static String drawSnowheadWithBlock() {
        String snowhead = """
                         .---------------.
                         |     Merry     | 
                         |   Christmas   |
                         |               |
                         |_______________|
                          /  °       °  \\
                         |               |
                         |    ())))      |
                         |               |
                          \\    \\___/    /
                           \\-----------/
                          """;

        return snowhead;
    }

    public static String drawSnowheadWithFor() {
        String snowhead = "";
        for (int i = 0; i < 11; i++) {
            if (i == 0) {
                snowhead += "." + "-----------------" + "." + "\n";
            } else if (i == 1) {
                snowhead += "|" + "      Merry      " + "|" + "\n";
            } else if (i == 2) {
                snowhead += "|" + "    Christmas    " + "|" + "\n";
            } else if (i == 3) {
                snowhead += "|" + "                 " + "|" + "\n";
            } else if (i == 4) {
                snowhead += "|" + "_________________" + "|" + "\n";
            } else if (i == 5) {
                snowhead += "  /  °       °  \\" + "\n";
            } else if (i == 7) {
                snowhead += " |    ())))      |" + "\n";
            } else if (i == 9) {
                snowhead += "  \\    \\___/    /" + "\n";
            } else if (i == 10) {
                snowhead += "   \\-----------/" + "\n";
            } else {
                snowhead += " |" + "               " + "|" + "\n";
            }
        }

        return snowhead;
    }

    public static String drawSnowballWithBlock() {
        String snowball = """
                           /-----------\\
                          /      *      \\
                         |               |
                         |       *       |
                         |               |
                          \\      *      /
                           \\-----------/
                          """;

        return snowball;
    }

    public static String drawSnowballWithFor() {
        String snowball = "";

        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                snowball += "   /-----------\\" + "\n";
            } else if (i == 1) {
                snowball += "  /      *      \\" + "\n";
            } else if (i == 3) {
                snowball += " |       *       |" + "\n";
            } else if (i == 5) {
                snowball += "  \\      *      /" + "\n";
            } else if (i == 6) {
                snowball += "   \\-----------/" + "\n";
            } else {
                snowball += " |               |" + "\n";
            }
        }

        return snowball;
    }

    public static String drawSnowmanWithBlock(int numOfSnowballs) {
        String snowman = drawSnowheadWithBlock();

        for (int i = 0; i < numOfSnowballs - 1; i++) {
            if (i + 1 == 1) {
                snowman += """
                           /-----------\\      \\==/
                          /      *      \\.     \\/
                         |               |\\    ||
                         |       *       |  \\  ||
                         |               | \\  \\|| 
                          \\      *      /   \\__||
                           \\-----------/       ||
                          """;
            } else {
                snowman += drawSnowballWithBlock();
            }
        }

        return snowman;
    }

    public static String drawSnowmanWithFor(int numOfSnowballs) {
        String snowman = drawSnowheadWithFor();

        for (int i = 0; i < numOfSnowballs - 1; i++) {
            if (i + 1 == 1) {
                for (int j = 0; j < 7; j++) {
                    if (j == 0) {
                        snowman += "   /-----------\\      \\==/" + "\n";
                    } else if (j == 1) {
                        snowman += "  /      *      \\.     \\/" + "\n";
                    } else if (j == 2) {
                        snowman += " |               |\\    ||" + "\n";
                    } else if (j == 3) {
                        snowman += " |       *       |  \\  ||" + "\n";
                    } else if (j == 4) {
                        snowman += " |               | \\  \\|| " + "\n";
                    } else if (j == 5) {
                        snowman += "  \\      *      /   \\__||" + "\n";
                    } else if (j == 6) {
                        snowman += "   \\-----------/       ||" + "\n";
                    }
                }
            } else {
                snowman += drawSnowballWithFor();
            }
        }

        return snowman;
    }

}
