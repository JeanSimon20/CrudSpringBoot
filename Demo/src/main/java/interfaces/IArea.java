package interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import modelo.Area;

@Repository
public interface IArea extends CrudRepository<Area, Integer>{

}
