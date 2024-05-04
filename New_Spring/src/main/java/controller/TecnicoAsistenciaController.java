/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import model.TecnicoAsistencia;
import service.TecnicoAsistenciaService;

/**
 *
 * @author Esteban_Rey
 */



@RestController
@RequestMapping("/api/tecnicos-asistencia")
public class TecnicoAsistenciaController {
    private final TecnicoAsistenciaService tecnicoAsistenciaService;

    @Autowired
    public TecnicoAsistenciaController(TecnicoAsistenciaService tecnicoAsistenciaService) {
        this.tecnicoAsistenciaService = tecnicoAsistenciaService;
    }

    // Crear un nuevo técnico de asistencia
    @PostMapping
    public ResponseEntity<TecnicoAsistencia> createTecnicoAsistencia(@RequestBody TecnicoAsistencia tecnicoAsistencia) {
        TecnicoAsistencia newTecnicoAsistencia = tecnicoAsistenciaService.createTecnicoAsistencia(tecnicoAsistencia);
        return new ResponseEntity<>(newTecnicoAsistencia, HttpStatus.CREATED);
    }

    // Obtener todos los técnicos de asistencia
    @GetMapping
    public ResponseEntity<List<TecnicoAsistencia>> getAllTecnicosAsistencia() {
        List<TecnicoAsistencia> tecnicosAsistencia = tecnicoAsistenciaService.getAllTecnicosAsistencia();
        return new ResponseEntity<>(tecnicosAsistencia, HttpStatus.OK);
    }

    // Obtener un técnico de asistencia por su ID
    @GetMapping("/{id}")
    public ResponseEntity<TecnicoAsistencia> getTecnicoAsistenciaById(@PathVariable Long id) {
        TecnicoAsistencia tecnicoAsistencia = tecnicoAsistenciaService.getTecnicoAsistenciaById(id);
        return new ResponseEntity<>(tecnicoAsistencia, HttpStatus.OK);
    }

    // Actualizar un técnico de asistencia existente
    @PutMapping("/{id}")
    public ResponseEntity<TecnicoAsistencia> updateTecnicoAsistencia(@PathVariable Long id, @RequestBody TecnicoAsistencia tecnicoAsistencia) {
        TecnicoAsistencia updatedTecnicoAsistencia = tecnicoAsistenciaService.updateTecnicoAsistencia(id, tecnicoAsistencia);
        return new ResponseEntity<>(updatedTecnicoAsistencia, HttpStatus.OK);
    }

    // Eliminar un técnico de asistencia por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTecnicoAsistencia(@PathVariable Long id) {
        tecnicoAsistenciaService.deleteTecnicoAsistencia(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}