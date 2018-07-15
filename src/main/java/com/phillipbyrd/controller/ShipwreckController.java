package com.phillipbyrd.controller;


import com.phillipbyrd.model.Shipwreck;
import com.phillipbyrd.repository.ShipwreckRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

    @Autowired
    private ShipwreckRepository shipwreckRepository;

    @RequestMapping(value="shipwrecks", method=RequestMethod.GET)
    public List<Shipwreck> list(){
        return shipwreckRepository.findAll();
    }


    @RequestMapping(value="shipwrecks", method=RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipwreck){
        return shipwreckRepository.saveAndFlush(shipwreck);
    }






}
