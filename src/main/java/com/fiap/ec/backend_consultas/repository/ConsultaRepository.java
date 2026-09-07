package com.fiap.ec.backend_consultas.repository;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.ec.backend_consultas.model.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    boolean existsByMedicoIdAndDataHoraAndStatusIn(
            Long medicoId,
            LocalDateTime dataHora,
            Collection<String> status);

    List<Consulta> findByMedicoId(Long medicoId);
    List<Consulta> findByPacienteId(Long pacienteId);
}
