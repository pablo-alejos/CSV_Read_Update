package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import modelo.Domicilio;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


/**
 *
 * @author pablo.alejos
 */
public class CSVDom {

    private static final int DOMICILIO_CALLE_IDX = 0;
    private static final int DOMICILIO_NUMERO_IDX = 1;
    private static final int DOMICILIO_SEMANA_IDX = 2;
    private static final String CSV_HEADER = "calle,numero,semana";

    public static List read() {

        BufferedReader fileReader = null;

        try {
            List<Domicilio> doms = new ArrayList<>();
            String line = "";
            fileReader = new BufferedReader(new FileReader("domicilios.csv"));

            // Read CSV header
            fileReader.readLine();

            // Read data line by line
            while ((line = fileReader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length > 0) {
                    Domicilio dom = new Domicilio(
                            tokens[DOMICILIO_CALLE_IDX],
                            Integer.parseInt(tokens[DOMICILIO_NUMERO_IDX]),
                            Integer.parseInt(tokens[DOMICILIO_SEMANA_IDX]));
                    doms.add(dom);
                }
            }
            return doms;
        } catch (IOException | NumberFormatException e) {
            System.out.println("Reading CSV Error!");
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Closing fileReader Error!");
            }
        }
        return null;
    }

    public static void write(ArrayList<Domicilio> doms) {

        FileWriter fileWriter = null;
        eliminarFichero(new File("domicilios.csv"));
        try {
            fileWriter = new FileWriter("domicilios.csv");
            fileWriter.append(CSV_HEADER);
            fileWriter.append('\n');

            for (Domicilio d : doms) {
                fileWriter.append(d.getCalle());
                fileWriter.append(',');
                fileWriter.append(String.valueOf(d.getNumero()));
                fileWriter.append(',');
                fileWriter.append(String.valueOf(d.getSemana()));
                fileWriter.append('\n');
            }

            System.out.println("Write CSV successfully!");
        } catch (IOException e) {
            System.out.println("Writing CSV error!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Flushing/closing error!");
                e.printStackTrace();
            }
        }
    }

    public static void eliminarFichero(File fichero) {

        if (!fichero.exists()) {
            System.out.println("El archivo data no existe.");
        } else {
            fichero.delete();
            System.out.println("El archivo data fue eliminado.");
        }

    }
}
