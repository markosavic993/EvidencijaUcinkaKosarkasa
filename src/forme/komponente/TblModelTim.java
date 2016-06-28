/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.komponente;

import domen.Kosarkas;
import domen.Tim;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import kontroler.Kontroler;

/**
 *
 * @author Marko
 */
public class TblModelTim extends AbstractTableModel{
    
    List<Tim> lt;

    public TblModelTim(List<Tim> lt) {
        this.lt = lt;
        System.out.println(lt.size());
    }
    

    @Override
    public int getRowCount() {
        return lt.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tim t = lt.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return t.getNaziv();
            case 1: return t.getGodinaOsnivanja();
            case 2: return t.getGrad();
            case 3: return t.getNazivHale();
            default: return "n/a";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0: return "Naziv";
            case 1: return "Godina osnivanja";
            case 2: return "Grad";
            case 3: return "Hala";
            default: return "n/a";
        }
    }

    
    public void obrisiTim(int t) {
        Kontroler.getInstance().izbrisiTim(lt.get(t));
        lt.remove(t);
        fireTableDataChanged();
    }

    public List<Tim> getLt() {
        return lt;
    }
    
    public void osvezi() {
        fireTableDataChanged();
    }
    
    
}
