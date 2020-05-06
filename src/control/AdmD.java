package control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Domicilio;

/**
 *
 * @author pablo.alejos
 */
public class AdmD {

    static ArrayList<Domicilio> doms = new ArrayList();

    public void crear(String calle, int numero, int semana) {
        doms = (ArrayList<Domicilio>) CSVDom.read();
        Collections.sort(doms, (Domicilio n1, Domicilio n2) -> n1.getCalle().compareTo(n2.getCalle()));
        Domicilio domBuffer = new Domicilio(calle, numero, semana);
        doms.add(domBuffer);
        CSVDom.write(doms);
    }

    public DefaultTableModel leer() {
        DefaultTableModel tableModel = new DefaultTableModel();
        doms = (ArrayList<Domicilio>) CSVDom.read();
        tableModel.addColumn("Calle");
        tableModel.addColumn("Numero");
        tableModel.addColumn("Semana");
        Collections.sort(doms, (Domicilio t, Domicilio t1) -> t.getCalle().compareTo(t1.getCalle()));
        for (Domicilio d : doms) {
            List<String> rows = new ArrayList();
            for (int i = 0; i < 3; i++) {
                rows.add(d.getCalle());
                rows.add(Integer.toString(d.getNumero()));
                rows.add(Integer.toString(d.getSemana()));
            }
            tableModel.insertRow(tableModel.getRowCount(), rows.toArray());
        }
        return tableModel;
    }

    public void actualizar() {
    }

    public void eliminar() {
    }

    public DefaultTableModel leer(String itemC, String itemN) {
        DefaultTableModel tableModel = new DefaultTableModel();
        doms = (ArrayList<Domicilio>) CSVDom.read();
        tableModel.addColumn("Calle");
        tableModel.addColumn("Numero");
        tableModel.addColumn("Semana");
        for (Domicilio d : doms) {
            if (d.getCalle().equals(itemC) && String.valueOf(d.getNumero()).equals(itemN)) {
                List<String> rows = new ArrayList();
                for (int i = 0; i < 3; i++) {
                    rows.add(d.getCalle());
                    rows.add(Integer.toString(d.getNumero()));
                    rows.add(Integer.toString(d.getSemana()));
                }
                tableModel.insertRow(tableModel.getRowCount(), rows.toArray());
            }
        }
        return tableModel;
    }

    public static int buscar(String itemC, String itemN) {
        doms = (ArrayList<Domicilio>) CSVDom.read();
        for (Domicilio d : doms) {
            if (d.getCalle().equals(itemC) && String.valueOf(d.getNumero()).equals(itemN)) {
                return d.getSemana();
            }
        }
        return -1;
    }

}
