package br.com.fiap.postech.agendamento.service;

import br.com.fiap.postech.agendamento.dto.AgendamentoDTO;
import br.com.fiap.postech.agendamento.model.Agendamento;
import br.com.fiap.postech.agendamento.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public AgendamentoDTO criarAgendamento(AgendamentoDTO agendamentoDTO) {
        Agendamento agendamento = new Agendamento(agendamentoDTO);
        agendamentoRepository.save(agendamento);
        return new AgendamentoDTO(agendamento);
    }

    public AgendamentoDTO consultarAgendamento(Long id) {
        return agendamentoRepository.findById(id)
                .map(AgendamentoDTO::new)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Agendamento não encontrado com ID: " + id));
    }

    public AgendamentoDTO atualizarAgendamento(Long id, AgendamentoDTO agendamentoDTO) {
        return agendamentoRepository.findById(id)
                .map(agendamento -> {
                    agendamento.update(agendamentoDTO);
                    agendamentoRepository.save(agendamento);
                    return new AgendamentoDTO(agendamento);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Agendamento para atualizar não encontrado com ID: " + id));
    }

    public void cancelarAgendamento(Long id) {
        agendamentoRepository.deleteById(id);
    }

    public List<AgendamentoDTO> listarAgendamentos() {
        return agendamentoRepository.findAll().stream()
                .map(AgendamentoDTO::new)
                .collect(Collectors.toList());
    }
}
