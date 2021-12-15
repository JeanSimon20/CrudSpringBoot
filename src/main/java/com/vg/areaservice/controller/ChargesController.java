package com.vg.areaservice.controller;

import com.vg.areaservice.document.Charges;
import com.vg.areaservice.service.ChargesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/charges")
public class ChargesController {

    @Autowired
    private ChargesService chargesService;

    @GetMapping
    public ResponseEntity<List<Charges>> getAll(){
        return ResponseEntity.ok(chargesService.getAll());
    }

    @PostMapping
    public ResponseEntity<Charges> save (@RequestBody Charges charges){
        return ResponseEntity.ok(chargesService.save(charges));
    }
}
