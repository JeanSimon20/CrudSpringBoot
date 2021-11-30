package interfaceService;

import java.util.List;
import java.util.Optional;

import modelo.Area;



public interface AreaServiceCrud {
	
	public List<Area> listar();

	public Optional<Area> listarId(int id);

	public int save(Area p);

	public void delete(int id);

}
