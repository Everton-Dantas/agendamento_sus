
package br.com.fiap.postech.agendamento.dto;

import br.com.fiap.postech.agendamento.model.Agendamento;

import java.time.LocalDateTime;
@lombok.Data
public class AgendamentoDTO {

    private Long id;
    private String nomePaciente;
    private String tipoConsulta;
    private LocalDateTime dataHoraAgendamento;

    public AgendamentoDTO() {}
@lombok.Builder
    public AgendamentoDTO(Agendamento agendamento) {
        this.id = agendamento.getId();
        this.nomePaciente = agendamento.getNomePaciente();
        this.tipoConsulta = agendamento.getTipoConsulta();
        this.dataHoraAgendamento = agendamento.getDataHoraAgendamento();
    }




}
