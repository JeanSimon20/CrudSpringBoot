package com.vg.areaservice.controller;

import com.vg.areaservice.document.Area;
import com.vg.areaservice.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/areas")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @GetMapping
    public ResponseEntity<List<Area>> getAll(){
        return ResponseEntity.ok(areaService.getAll());
    }

    @PostMapping
    public ResponseEntity<Area> save (@RequestBody Area areas){
        return ResponseEntity.ok(areaService.save(areas));
    }
}
