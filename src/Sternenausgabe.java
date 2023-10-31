import java.util.Scanner;

public class Sternenausgabe {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Anzahl Zeilen: ");
        int anzahlDerZeilen = eingabe.nextInt();

        // TODO
        for (int zeile=1; zeile <= anzahlDerZeilen; zeile++) {
            for (int spalte=1; spalte <= zeile; spalte++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
