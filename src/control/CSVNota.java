package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import modelo.Nota;

/**
 *
 * @author pablo.alejos
 */
public class CSVNota {

    private static final int NOTA_ID_IDX = 0;
    private static final int NOTA_FECHA_IDX = 1;
    private static final int NOTA_HORA_IDX = 2;
    private static final int NOTA_CALLE_IDX = 3;
    private static final int NOTA_NUMERO_IDX = 4;
    private static final int NOTA_NOMBRE_IDX = 5;
    private static final int NOTA_CONCEPTO_IDX = 6;
    private static final int NOTA_MONTO_IDX = 7;
    private static final int NOTA_SEMANAS_IDX = 8;
    private static final String CSV_HEADER = "id,fecha,hora,calle,numero,nombre,concepto,monto,semanas";

    public static List read() {

        BufferedReader fileReader = null;

        try {
            List<Nota> notas = new ArrayList<>();
            String line = "";
            fileReader = new BufferedReader(new FileReader("notas.csv"));

            // Read CSV header
            fileReader.readLine();

            // Read data line by line
            while ((line = fileReader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length > 0) {
                    Nota nota = new Nota(
                            Integer.parseInt(tokens[NOTA_ID_IDX]),
                            tokens[NOTA_FECHA_IDX],
                            tokens[NOTA_HORA_IDX],
                            tokens[NOTA_CALLE_IDX],
                            Integer.parseInt(tokens[NOTA_NUMERO_IDX]),
                            tokens[NOTA_NOMBRE_IDX],
                            tokens[NOTA_CONCEPTO_IDX],
                            Integer.parseInt(tokens[NOTA_MONTO_IDX]),
                            Integer.parseInt(tokens[NOTA_SEMANAS_IDX])
                    );
                    notas.add(nota);
                }
            }
            return notas;
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

    public static void write(ArrayList<Nota> notas) {

        FileWriter fileWriter = null;
        eliminarFichero(new File("notas.csv"));
        try {
            fileWriter = new FileWriter("notas.csv");
            fileWriter.append(CSV_HEADER);
            fileWriter.append('\n');

            for (Nota d : notas) {
                fileWriter.append(String.valueOf(d.getId()));
                fileWriter.append(',');
                fileWriter.append(d.getFecha());
                fileWriter.append(',');
                fileWriter.append(d.getHora());
                fileWriter.append(',');
                fileWriter.append(d.getCalle());
                fileWriter.append(',');
                fileWriter.append(String.valueOf(d.getNumero()));
                fileWriter.append(',');
                fileWriter.append(d.getNombre());
                fileWriter.append(',');
                fileWriter.append(d.getConcepto());
                fileWriter.append(',');
                fileWriter.append(String.valueOf(d.getMonto()));
                fileWriter.append(',');
                fileWriter.append(String.valueOf(d.getSemanas()));
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
