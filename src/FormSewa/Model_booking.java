/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FormSewa;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ardy Sendleep
 */
public class Model_booking {

  
    private DefaultTableModel tabel = new DefaultTableModel();
    public Model_booking(){
        
        getTabel().addColumn("Lapangan");
        getTabel().addColumn("Kode");
        getTabel().addColumn("Tanggal");
        getTabel().addColumn("Jam Pemesanan");
        getTabel().addColumn("Lama Pemesanan");
        getTabel().addColumn("Nama");
        getTabel().addColumn("Team");
        getTabel().addColumn("No HP");
       
    }
    
  


    /**
     * @return the tabel
     */
    public DefaultTableModel getTabel() {
        return tabel;
    }

    /**
     * @param tabel the tabel to set
     */
    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
 
    
     
}

