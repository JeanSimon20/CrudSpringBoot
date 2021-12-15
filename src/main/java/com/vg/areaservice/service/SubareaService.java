package com.vg.areaservice.service;

import com.vg.areaservice.document.Subarea;
import com.vg.areaservice.repository.SubareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubareaService {

    @Autowired
    private SubareaRepository subareaRepository;

    public List<Subarea> getAll() {
        return subareaRepository.findAll();
    }

    public Subarea save(Subarea subarea) {
        return subareaRepository.save(subarea);
    }

}
