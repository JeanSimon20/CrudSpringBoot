package com.vg.areaservice.repository;

import com.vg.areaservice.document.Subarea;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubareaRepository extends MongoRepository<Subarea, String>{
    
}
