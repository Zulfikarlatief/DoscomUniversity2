/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

import java.util.Objects;

/**
 *
 * @author zword
 */
public class crudModel {
    private String nama;
    private String nim;
    private int nilai;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nama);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final crudModel other = (crudModel) obj;
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        return true;
    }

   

  
    
}
