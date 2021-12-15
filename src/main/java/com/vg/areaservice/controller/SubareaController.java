package com.vg.areaservice.controller;

import com.vg.areaservice.document.Subarea;
import com.vg.areaservice.service.SubareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subarea")
public class SubareaController {

    @Autowired
    private SubareaService subareaService;

    @GetMapping
    public ResponseEntity<List<Subarea>> getAll(){
        return ResponseEntity.ok(subareaService.getAll());
    }

    @PostMapping
    public ResponseEntity<Subarea> save (@RequestBody Subarea subarea){
        return ResponseEntity.ok(subareaService.save(subarea));
    }
}
