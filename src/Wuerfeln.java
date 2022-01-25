import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wuerfeln {

    public static void main(String[] args) throws IOException {

        //Deklaration der Werte
        int experimente;
        int wuerfe;
        double [] mw;
        double [] stA;

        //Einlesen der Größen für den 2D Array
        System.out.println("Wie viele Würfelexperimente möchten Sie durchführen? : ");
        experimente = readInt();
        System.out.println("Wie viele Würfe möchten Sie pro Experiment durchführen? : ");
        wuerfe = readInt();
        double [][] a = new double[experimente][wuerfe];
        mw = new double[experimente];
    }
    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String antwort = br.readLine();
        return antwort;
    }

    public static Integer readInt() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String antwort = br.readline();
        //Integer zahl = Integer.parseInt(antwort);
        //return zahl;
        return Integer.parseInt(br.readLine().trim());
    }

    public static Double readDouble() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String antwort = br.readLine().replace(',' , '.').trim();
        Double zahl = Double.parseDouble(antwort);
        return zahl;
        //return Double.parseDouble(br.readLine().replace(',' , '.').trim());
    }

    public static Boolean readBoolean() throws IOException {
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String eingabe = br.readLine().trim();
            if ((eingabe.equals("1"))
                    || (eingabe.equalsIgnoreCase("go on"))
                    || (eingabe.equalsIgnoreCase("continue"))
                    || (eingabe.equalsIgnoreCase("weiter"))
                    || (eingabe.equalsIgnoreCase("j"))
                    || (eingabe.equalsIgnoreCase("ja"))
                    || (eingabe.equalsIgnoreCase("y"))
                    || (eingabe.equalsIgnoreCase("yes"))
                    || (eingabe.equalsIgnoreCase("w"))
                    || (eingabe.equalsIgnoreCase("wahr"))
                    || (eingabe.equalsIgnoreCase("t"))
                    || (eingabe.equalsIgnoreCase("true"))) {
                return true;
            } else if ((eingabe.equals("0"))
                    || (eingabe.equalsIgnoreCase("stop"))
                    || (eingabe.equalsIgnoreCase("stopp"))
                    || (eingabe.equalsIgnoreCase("n"))
                    || (eingabe.equalsIgnoreCase("nein"))
                    || (eingabe.equalsIgnoreCase("no"))
                    || (eingabe.equalsIgnoreCase("f"))
                    || (eingabe.equalsIgnoreCase("falsch"))
                    || (eingabe.equalsIgnoreCase("false"))) {
                return false;
            }
            System.out.print("Ungültige Eingabe. Bitte erneut versuchen: ");
        }
    }
    public static double runden(double wert) {

        return Math.round(wert * 1000) / 1000.0;

    }

    public static double runden(double wert, int nachkommastellen) {

        return Math.round(wert * Math.pow(10, nachkommastellen)) / Math.pow(10, nachkommastellen);

    }
}
