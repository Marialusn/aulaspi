package ifrn.progi.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.progi.eventos.models.Evento;
import ifrn.progi.eventos.repositories.EventoRepository;

@Controller 
public class EventosController {
	
	@Autowired
	private EventoRepository er;
	

	@RequestMapping("/eventos/form")
	public String form() {
		return "eventos/formEvento";
	}
	
	@PostMapping("/eventos")
	public String redirecionar(Evento evento) {
		System.out.println(evento);
		er.save(evento);
		return "eventos/eventoRedirecionado";
	}
	
}


