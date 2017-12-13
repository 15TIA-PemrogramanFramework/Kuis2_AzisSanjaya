/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setia.kuiz1012.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Azis
 */
@Entity
@Table(name = "tableidentitas_1012")

public class TableIdentitas implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nim;
    @Column(length = 100, nullable = false, unique = true)
    private String nama;
    @Column(length = 255, nullable = true)
    private String prodi;
    @Column(length = 255, nullable = true)
    private String kelas;
    

    public Long getnim() {
        return nim;
    }

    public void setnim(Long nim) {
        this.nim = nim;
    }

    /**
     * @return the name
     */
    public String getnama() {
        return nama;
    }

    /**
     * @param nama the name to set
     */
    public void setnama(String nama) {
        this.nama = nama;
    }
    
     /**
     * @return the Username
     */
    public String getprodi() {
        return prodi;
    }

    /**
     * @param prodi the Username to set
     */
    public void setprodi(String prodi) {
        this.prodi = prodi;
    }

     /**
     * @return the name
     */
    public String getkelas() {
        return kelas;
    }

    /**
     * @param kelas the Password to set
     */
    public void setkelas(String kelas) {
        this.kelas = kelas;
    }
    
}
