/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setia.kuiz1012.controller;

import com.setia.kuiz1012.entity.TableIpk;
import com.setia.kuiz1012.service.TableIpkService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Azis
 */
@RestController
@RequestMapping("/TableIpk")
public class TableIpkController {

    @Autowired
    private TableIpkService TableIpkService;

    @RequestMapping(method = RequestMethod.POST)
    public TableIpk insert(@RequestBody TableIpk tableipk) {
        return TableIpkService.insert(tableipk);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public TableIpk update(@RequestBody TableIpk tableipk) {
        return TableIpkService.update(tableipk);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return TableIpkService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public TableIpk getByid(@PathVariable("id") Long id){
        return TableIpkService.getByid(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<TableIpk> getAll(){
        return TableIpkService.getAll();
    }
}
