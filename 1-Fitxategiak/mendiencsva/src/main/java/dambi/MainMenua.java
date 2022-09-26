package dambi;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class MainMenua {
    public static final String SEPARATOR = ";";
    public static final String QUOTE = "\"";
    private static ArrayList<Mendiak> mendiak = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("MENUAREN IZENBURUA");
            System.out.println("====================================");
            System.out.println("1.- Mendien zerrenda");
            System.out.println("2.- Mendirik altuena bistaratu");
            System.out.println("3.- Mendiak esportatu ");
            System.out.println("4.- ...");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    MendienZerrenda();
                    break;
                case 2:
                    met2();
                    break;

                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 5);
        in.next();
    }

    public static void MendienZerrenda() throws IOException {
        BufferedReader inputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader("Mendiak.csv"));
            String l;
            Mendiak[] mendia = new Mendiak[mendiak.size()];
            int i = 0;
            while ((l = inputStream.readLine()) != null) {
                mendia[i] = new Mendiak();
                mendiak.add(mendia[i]);
            }

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }

        }

    }

    
    public static void met2() {

    }
}
