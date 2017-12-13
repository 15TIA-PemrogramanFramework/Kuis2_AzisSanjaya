/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setia.kuiz1012.controller;

import com.setia.kuiz1012.entity.TableIdentitas;
import com.setia.kuiz1012.service.TableIdentitasService;
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
@RequestMapping("/TableIndetitas")
public class TableIdentitasController {

    @Autowired
    private TableIdentitasService TableIndetitasService;

    @RequestMapping(method = RequestMethod.POST)
    public TableIdentitas insert(@RequestBody TableIdentitas tableinde) {
        return TableIndetitasService.insert(tableinde);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public TableIdentitas update(@RequestBody TableIdentitas tableinde) {
        return TableIndetitasService.update(tableinde);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{nim}")
    public boolean delete(@PathVariable("nim") Long nim) {
        return TableIndetitasService.delete(nim);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{nim}")
    public TableIdentitas getBynim(@PathVariable("nim") Long nim){
        return TableIndetitasService.getBynim(nim);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<TableIdentitas> getAll(){
        return TableIndetitasService.getAll();
    }
}
