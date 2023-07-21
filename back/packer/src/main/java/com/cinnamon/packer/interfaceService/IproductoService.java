package com.cinnamon.packer.interfaceService;

import java.util.List;
import java.util.Optional;

import com.cinnamon.packer.model.Producto;

public interface IproductoService {
	public List<Producto>listar();
	public Optional<Producto>listarid(int id);
	public int save(Producto p);
	public void delete(int id);
}
