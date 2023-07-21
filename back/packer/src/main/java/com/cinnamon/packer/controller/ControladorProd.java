package com.cinnamon.packer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cinnamon.packer.interfaceService.IproductoService;
import com.cinnamon.packer.model.Producto;


@Controller
@RequestMapping
public class ControladorProd {
	
	@Autowired
	private IproductoService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Producto>productos=service.listar();
		model.addAttribute("productos", productos);
		return "index";
	}
}
