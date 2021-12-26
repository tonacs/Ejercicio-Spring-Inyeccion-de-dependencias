package com.tona.springboot.di.app.models.domain;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Component
@NoArgsConstructor
@AllArgsConstructor

@RequestScope
public class Factura implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2287911176223836920L;

	@Value("${factura.descripcion}")
	private String descripcion;
	
	@Autowired
	private Cliente cliente;
	
	@Autowired
	private List<ItemFactura> items;
	
	@PostConstruct
	public void inicializar() {
		cliente.setNombre(cliente.getNombre().concat(" ").concat("José"));
		descripcion=descripcion.concat(" del cliente : " ).concat(cliente.getNombre());
	}
	@PreDestroy
	public void destruir() {
		System.out.println("Factura destruída ".concat(descripcion));
	}
	
	
	
	
	
	
	
	
	
	
}
