/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setia.kuiz1012.repo;

import com.setia.kuiz1012.entity.TableIpk;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Azis
 */
public interface TableIpkRepo extends CrudRepository<TableIpk, Long> {

    @Query("select tip from TableIpk tip")
    public List<TableIpk> findAlltableipk();
    
    
}
