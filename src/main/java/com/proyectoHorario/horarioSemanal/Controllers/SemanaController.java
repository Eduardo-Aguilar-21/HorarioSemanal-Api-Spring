package com.proyectoHorario.horarioSemanal.Controllers;

import com.proyectoHorario.horarioSemanal.Models.SemanaModel;
import com.proyectoHorario.horarioSemanal.Services.SemanaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("semana")
public class SemanaController {
    @Autowired
    SemanaService semanaService;

    @GetMapping
    public List<SemanaModel> ListarS(){
        return semanaService.ListarSemana();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SemanaModel> ListarSId(@PathVariable Long id){
        Optional<SemanaModel> semana  = semanaService.ListarSemanaId(id);
        if(semana.isPresent()){
            return new ResponseEntity<>(semana.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<SemanaModel> CrearS(@RequestBody SemanaModel semanaModel){
        SemanaModel csemana = semanaService.CrearSemana(semanaModel);
        return new ResponseEntity<>(csemana, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SemanaModel> EditarS(@RequestBody SemanaModel semanaModel, @PathVariable Long id){
        SemanaModel esemana = semanaService.EditarSemana(semanaModel, id);
        if(esemana!=null){
            return new ResponseEntity<>(esemana, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SemanaModel> EliminarS(@PathVariable Long id){
        semanaService.EliminarSemana(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
