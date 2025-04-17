package br.com.fiap.postech.agendamento.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "API Agendamento SUS",
                description = "API para otimização do agendamento de consultas e exames no SUS",
                version = "v1"
        ),
        tags = {
                @Tag(name = "Agendamentos", description = "Endpoints relacionados ao agendamento de consultas e exames"),
                @Tag(name = "Prontuários", description = "Endpoints relacionados ao gerenciamento de prontuários")
        }
)
public class SwaggerConfig {
        // Não é necessário mais adicionar nenhuma configuração manualmente, pois o Springdoc faz isso automaticamente.
}
