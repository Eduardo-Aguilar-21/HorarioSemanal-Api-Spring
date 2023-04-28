package com.proyectoHorario.horarioSemanal.Services;

import com.proyectoHorario.horarioSemanal.Models.SemanaModel;
import com.proyectoHorario.horarioSemanal.Repositories.SemanaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class SemanaService {
    @Autowired
    SemanaRepository semanaRepository;

    public List<SemanaModel> ListarSemana(){
        return semanaRepository.findAll();
    }

    public Optional<SemanaModel> ListarSemanaId(Long id){
        return semanaRepository.findById(id);
    }

    public SemanaModel CrearSemana(SemanaModel semanaModel){
        return semanaRepository.save(semanaModel);
    }

    public SemanaModel EditarSemana(SemanaModel semanaModel, Long id){
        Optional<SemanaModel> exist = semanaRepository.findById(id);
        if (exist.isPresent()){
            SemanaModel semana = exist.get();
            semana.setNsemana(semanaModel.getNsemana());
            semana.setLunes(semanaModel.getLunes());
            semana.setMartes(semanaModel.getMartes());
            semana.setMiercoles(semanaModel.getMiercoles());
            semana.setJueves(semanaModel.getJueves());
            semana.setViernes(semanaModel.getViernes());
            semana.setSabado(semanaModel.getSabado());
            semana.setDomingo(semanaModel.getDomingo());
            semana.setCompletado(semanaModel.getCompletado());
            return semanaRepository.save(semana);
        } else {
            return null;
        }
    }

    public void EliminarSemana(Long id){
        semanaRepository.deleteById(id);
    }


}
