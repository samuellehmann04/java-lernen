import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hallo Welt");

        int alter = 22;
        double groesse = 1.80;
        String name = "Sammy";
        boolean aktiv = true;

        System.out.println("Name: " + name);
        System.out.println("Groesse: " + groesse);
        System.out.println("Alter: " + alter);

        System.out.println("Wie heißt du? ");
        Scanner scannername = new Scanner(System.in);
        String eingabename = scannername.nextLine();

        Scanner scanneralter = new Scanner(System.in);
        System.out.println("Wie alt bist du?");
        int eingabealter = scanneralter.nextInt();

        if (eingabealter >= 18) {
            System.out.println("Hallo " + eingabename + " du bist also volljährig");
        } else {
            System.out.println("Hallo " + eingabename + " du bist nicht volljährig");
        }

    }

}
