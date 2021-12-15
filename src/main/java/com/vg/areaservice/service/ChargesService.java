package com.vg.areaservice.service;
import com.vg.areaservice.document.Charges;
import com.vg.areaservice.repository.ChargesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChargesService {

    @Autowired
    private ChargesRepository chargesRepository;

    public List<Charges> getAll() {
        return chargesRepository.findAll();
    }

    public Charges save(Charges charges) {
        return chargesRepository.save(charges);
    }
}
