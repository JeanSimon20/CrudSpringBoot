package com.vg.areaservice.service;
import com.vg.areaservice.document.Area;
import com.vg.areaservice.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {
    @Autowired
    private AreaRepository areaRepository;

    public List<Area> getAll() {
        return areaRepository.findAll();
    }

    public Area save(Area areas) {
        return areaRepository.save(areas);
    }
}
