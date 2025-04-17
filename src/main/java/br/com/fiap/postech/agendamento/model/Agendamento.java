
package br.com.fiap.postech.agendamento.model;

import br.com.fiap.postech.agendamento.dto.AgendamentoDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomePaciente;
    private String tipoConsulta;
    private LocalDateTime dataHoraAgendamento;

    public Agendamento() {}

    public Agendamento(AgendamentoDTO dto) {
        this.nomePaciente = dto.getNomePaciente();
        this.tipoConsulta = dto.getTipoConsulta();
        this.dataHoraAgendamento = dto.getDataHoraAgendamento();
    }

    public void update(AgendamentoDTO dto) {
        this.nomePaciente = dto.getNomePaciente();
        this.tipoConsulta = dto.getTipoConsulta();
        this.dataHoraAgendamento = dto.getDataHoraAgendamento();
    }

    // Getters and setters
}
