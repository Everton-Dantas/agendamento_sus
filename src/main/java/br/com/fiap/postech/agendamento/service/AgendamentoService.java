
package br.com.fiap.postech.agendamento.service;

import br.com.fiap.postech.agendamento.dto.AgendamentoDTO;
import br.com.fiap.postech.agendamento.model.Agendamento;
import br.com.fiap.postech.agendamento.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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
        Optional<Agendamento> agendamento = agendamentoRepository.findById(id);
        return agendamento.map(AgendamentoDTO::new).orElse(null);
    }

    public AgendamentoDTO atualizarAgendamento(Long id, AgendamentoDTO agendamentoDTO) {
        Optional<Agendamento> existing = agendamentoRepository.findById(id);
        if (existing.isPresent()) {
            Agendamento agendamento = existing.get();
            agendamento.update(agendamentoDTO);
            agendamentoRepository.save(agendamento);
            return new AgendamentoDTO(agendamento);
        }
        return null;
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
