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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Azis
 */
@Entity
@Table(name = "tableipk_1012")
public class TableIpk implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private Long nim;
    @Column(length = 255, nullable = true)
    private int ipk;
    @Column(length = 255, nullable = true)
    private int semester;
    
    
    
    @ManyToOne
    private TableIdentitas tableinde;

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public Long getnim() {
        return nim;
    }

    /**
     * @param nim the name to set
     */
    public void setnim(Long nim) {
        this.nim = nim;
    }
    
     /**
     * @return the ipk
     */
    public int getipk() {
        return ipk;
    }

    /**
     * @param ipk the Username to set
     */
    public void setipk(int ipk) {
        this.ipk = ipk;
    }

     /**
     * @return the name
     */
    public int getsemester() {
        return semester;
    }

    /**
     * @param semester the Password to set
     */
    public void setsemester(int semester) {
        this.semester = semester;
    }
    
}
