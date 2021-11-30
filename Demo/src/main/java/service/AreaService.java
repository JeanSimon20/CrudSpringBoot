package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import interfaceService.AreaServiceCrud;
import interfaces.IArea;
import modelo.Area;

@Service
public class AreaService implements AreaServiceCrud{

	@Autowired
	private IArea data;
	@Override
	public List<Area> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Area> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Area p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public IArea getData() {
		return data;
	}

	public void setData(IArea data) {
		this.data = data;
	}
	
	
	

	
}
