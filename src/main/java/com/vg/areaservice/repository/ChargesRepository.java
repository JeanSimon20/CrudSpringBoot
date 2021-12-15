package com.vg.areaservice.repository;
import com.vg.areaservice.document.Charges;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChargesRepository extends MongoRepository<Charges, String>{
    
}
