package control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Domicilio;
import modelo.Nota;
/**
 *
 * @author pablo.alejos
 */
public class AdmN {

    /*inicializar archivos*/
    static ArrayList<Nota> notas = new ArrayList();
    static ArrayList<Domicilio> doms = new ArrayList();

    public AdmN() {

    }

    public void tiket(String fecha, String hora, String calle, int numero, String nombre, String concepto, int monto, int semana) {
        /*solicitar usuario y contraseña*/
        notas = (ArrayList<Nota>) CSVNota.read();
        Collections.sort(notas, Collections.reverseOrder((Nota t, Nota t1) -> t.getId().compareTo(t1.getId())));
        int id;
        if (notas.size() > 0) {
            id = notas.get(0).getId() + 1;
        } else {
            id = 0;
        }
        Nota notaBuffer = new Nota(id, fecha, hora, calle, numero, nombre, concepto, monto, semana);
        notas.add(notaBuffer);
        CSVNota.write(notas);
        System.out.println(notas);
        doms = (ArrayList<Domicilio>) CSVDom.read();
        for (int i = 0; i < doms.size(); i++) {
            Domicilio d = doms.get(i);
            if (d.getCalle().equals(notaBuffer.getCalle()) && d.getNumero() == notaBuffer.getNumero()) {
                Domicilio domBuffer = doms.get(i);
                domBuffer.setSemana(semana);
                doms.remove(d);
                doms.add(domBuffer);
            }
        }
        CSVDom.write(doms);
    }

    public static DefaultTableModel leer() {
        DefaultTableModel tableModel = new DefaultTableModel();
        notas = (ArrayList<Nota>) CSVNota.read();
        tableModel.addColumn("Folio");
        tableModel.addColumn("Fecha");
        tableModel.addColumn("Hora");
        tableModel.addColumn("Calle");
        tableModel.addColumn("Numero");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Concepto");
        tableModel.addColumn("Monto");
        tableModel.addColumn("Semana");
        Collections.sort(notas, Collections.reverseOrder((Nota t, Nota t1) -> t.getId().compareTo(t1.getId())));
        for (Nota n : notas) {
            List<String> rows = new ArrayList();
            for (int i = 0; i < 3; i++) {
                rows.add(Integer.toString(n.getId()));
                rows.add(n.getFecha());
                rows.add(n.getHora());
                rows.add(n.getCalle());
                rows.add(Integer.toString(n.getNumero()));
                rows.add(n.getNombre());
                rows.add(n.getConcepto());
                rows.add(Integer.toString(n.getMonto()));
                rows.add(Integer.toString(n.getSemanas()));
            }
            tableModel.insertRow(tableModel.getRowCount(), rows.toArray());
        }
        return tableModel;
    }

    public static DefaultTableModel leer(int id) {
        DefaultTableModel tableModel = new DefaultTableModel();
        notas = (ArrayList<Nota>) CSVNota.read();
        tableModel.addColumn("Folio");
        tableModel.addColumn("Fecha");
        tableModel.addColumn("Hora");
        tableModel.addColumn("Calle");
        tableModel.addColumn("Numero");
        tableModel.addColumn("Concepto");
        tableModel.addColumn("Monto");
        tableModel.addColumn("Semana");
        Collections.sort(notas, Collections.reverseOrder((Nota t, Nota t1) -> t.getId().compareTo(t1.getId())));
        for (Nota n : notas) {
            if (n.getId() == id) {
                List<String> rows = new ArrayList();
                for (int i = 0; i < 3; i++) {
                    rows.add(Integer.toString(n.getId()));
                    rows.add(n.getFecha());
                    rows.add(n.getHora());
                    rows.add(n.getCalle());
                    rows.add(Integer.toString(n.getNumero()));
                    rows.add(n.getConcepto());
                    rows.add(Integer.toString(n.getMonto()));
                    rows.add(Integer.toString(n.getSemanas()));
                }
                tableModel.insertRow(tableModel.getRowCount(), rows.toArray());
            }
        }
        return tableModel;
    }

    public static DefaultTableModel leer(String calle, String numero) {
        DefaultTableModel tableModel = new DefaultTableModel();
        notas = (ArrayList<Nota>) CSVNota.read();
        tableModel.addColumn("Folio");
        tableModel.addColumn("Fecha");
        tableModel.addColumn("Hora");
        tableModel.addColumn("Calle");
        tableModel.addColumn("Numero");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Concepto");
        tableModel.addColumn("Monto");
        tableModel.addColumn("Semana");
        Collections.sort(notas, Collections.reverseOrder((Nota t, Nota t1) -> t.getId().compareTo(t1.getId())));
        for (Nota n : notas) {
            if (n.getCalle().equals(calle) && n.getNumero() == Integer.parseInt(numero)) {
                List<String> rows = new ArrayList();
                for (int i = 0; i < 3; i++) {
                    rows.add(Integer.toString(n.getId()));
                    rows.add(n.getFecha());
                    rows.add(n.getHora());
                    rows.add(n.getCalle());
                    rows.add(Integer.toString(n.getNumero()));
                    rows.add(n.getNombre());
                    rows.add(n.getConcepto());
                    rows.add(Integer.toString(n.getMonto()));
                    rows.add(Integer.toString(n.getSemanas()));
                }
                tableModel.insertRow(tableModel.getRowCount(), rows.toArray());
            }
        }
        return tableModel;
    }

    private Object searchN(int id) {
        //lamar archivo
        //busqueda ( x folio x fecha x usuario x semanas)
        //complicada, empezar x folio e ir implementando mas
        //devolver objeto
        return null;
    }

    private int deleteN() {
        //busqueda
        //eliminar del archivo
        return 0;
    }

    private void modifyN() {
        //busqueda
        //nuevo model
        //actualiar archivo
    }

}
