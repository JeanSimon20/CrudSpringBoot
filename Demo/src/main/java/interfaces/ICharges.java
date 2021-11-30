package interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import modelo.Charges;

@Repository
public interface ICharges extends CrudRepository<Charges, Integer>{

}
