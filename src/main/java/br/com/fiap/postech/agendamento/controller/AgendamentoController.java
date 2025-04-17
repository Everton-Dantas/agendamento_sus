
package br.com.fiap.postech.agendamento.controller;

import br.com.fiap.postech.agendamento.dto.AgendamentoDTO;
import br.com.fiap.postech.agendamento.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<AgendamentoDTO> criarAgendamento(@RequestBody AgendamentoDTO agendamentoDTO) {
        AgendamentoDTO agendamentoCriado = agendamentoService.criarAgendamento(agendamentoDTO);
        return new ResponseEntity<>(agendamentoCriado, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AgendamentoDTO> consultarAgendamento(@PathVariable Long id) {
        AgendamentoDTO agendamentoDTO = agendamentoService.consultarAgendamento(id);
        return new ResponseEntity<>(agendamentoDTO, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AgendamentoDTO> atualizarAgendamento(@PathVariable Long id, @RequestBody AgendamentoDTO agendamentoDTO) {
        AgendamentoDTO agendamentoAtualizado = agendamentoService.atualizarAgendamento(id, agendamentoDTO);
        return new ResponseEntity<>(agendamentoAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancelarAgendamento(@PathVariable Long id) {
        agendamentoService.cancelarAgendamento(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<AgendamentoDTO>> listarAgendamentos() {
        List<AgendamentoDTO> agendamentos = agendamentoService.listarAgendamentos();
        return new ResponseEntity<>(agendamentos, HttpStatus.OK);
    }
}
