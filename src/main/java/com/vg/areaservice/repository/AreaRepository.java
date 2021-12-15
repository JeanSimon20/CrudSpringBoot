package com.vg.areaservice.repository;
import com.vg.areaservice.document.Area;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends MongoRepository<Area, String>{
    
}
