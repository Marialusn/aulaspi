package ifrn.progi.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.progi.eventos.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{
	

}
