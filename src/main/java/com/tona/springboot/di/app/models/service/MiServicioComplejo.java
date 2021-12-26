package com.tona.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//Service aporta una semántica, indica que la clase es una fachada 
//@Service

//@Component("miServicioSimpleComlejo")

public class MiServicioComplejo implements IServicio {
	
	public String operacion() {
		return "ejecutar algún proceso importante...  COMPLICADO";
	}

}
