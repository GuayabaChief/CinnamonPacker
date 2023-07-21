package com.cinnamon.packer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cinnamon.packer.interfaceService.IproductoService;
import com.cinnamon.packer.interfaces.Iproducto;
import com.cinnamon.packer.model.Producto;

public class ProductoService implements IproductoService{

	@Autowired
	private Iproducto data;
	
	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return (List<Producto>)data.findAll();
	}

	@Override
	public Optional<Producto> listarid(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Producto p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
