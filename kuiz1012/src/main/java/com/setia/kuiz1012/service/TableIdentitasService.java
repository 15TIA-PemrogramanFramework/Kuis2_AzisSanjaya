/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setia.kuiz1012.service;

import com.setia.kuiz1012.entity.TableIdentitas;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.setia.kuiz1012.repo.TableIdentitasRepo;

/**
 *
 * @author Azis
 */
@Service("TableIndetitasService")
@Transactional
public class TableIdentitasService {

    @Autowired
    private TableIdentitasRepo repo;

    public TableIdentitas insert(TableIdentitas tableinde) {
        return repo.save(tableinde);
    }
    
    public TableIdentitas update(TableIdentitas tableinde) {
        return repo.save(tableinde);
    }
    
    public boolean delete(Long nim){
        repo.delete(nim);
        return true;
    }
    
    public TableIdentitas getBynim(Long nim){
        return repo.findOne(nim);
    }
    
    public List<TableIdentitas> getAll(){
        return repo.findAlltableinde();
    }
}
