package com.tona.springboot.di.app.models.domain;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemFactura {
	private Producto producto;
	private Integer cantidad;

	public Integer calcularImporte() {
		return cantidad* producto.getPrecio();
	}
}
