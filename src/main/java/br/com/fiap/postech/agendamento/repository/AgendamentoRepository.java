
package br.com.fiap.postech.agendamento.repository;

import br.com.fiap.postech.agendamento.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {}
