package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import interfaceService.ChargesServiceCrud;
import interfaces.ICharges;
import modelo.Charges;

public class ChargesService implements ChargesServiceCrud {

	@Autowired
	private ICharges data;
	
	@Override
	public List<Charges> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Charges> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Charges p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
	}

	public ICharges getData() {
		return data;
	}

	public void setData(ICharges data) {
		this.data = data;
	}
	
	

}
