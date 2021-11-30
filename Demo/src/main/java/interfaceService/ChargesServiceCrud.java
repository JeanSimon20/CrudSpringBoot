package interfaceService;

import java.util.List;
import java.util.Optional;

import modelo.Charges;


public interface ChargesServiceCrud {
	
	public List<Charges> listar();

	public Optional<Charges> listarId(int id);

	public int save(Charges p);

	public void delete(int id);

}
