package ifrn.progi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.progi.eventos.models.Evento;

@Controller 
public class EventosController {

	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}
	
	@PostMapping("/eventos")
	public String redirecionar(Evento evento) {
		System.out.println(evento);
		return "eventoRedirecionado";
	}
	
}


