/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setia.kuiz1012.service;

import com.setia.kuiz1012.entity.TableIpk;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.setia.kuiz1012.repo.TableIpkRepo;

/**
 *
 * @author Azis
 */
@Service("TableIpkService")
@Transactional
public class TableIpkService {

    @Autowired
    private TableIpkRepo repo;

    public TableIpk insert(TableIpk tableipk) {
        return repo.save(tableipk);
    }
    
    public TableIpk update(TableIpk tableipk) {
        return repo.save(tableipk);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public TableIpk getByid(Long id){
        return repo.findOne(id);
    }
    
    public List<TableIpk> getAll(){
        return repo.findAlltableipk();
    }
}
