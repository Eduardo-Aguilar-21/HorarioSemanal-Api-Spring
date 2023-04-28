package com.proyectoHorario.horarioSemanal.Repositories;

import com.proyectoHorario.horarioSemanal.Models.SemanaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemanaRepository extends JpaRepository<SemanaModel, Long> {
}
