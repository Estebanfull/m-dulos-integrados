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
import service.TrabajadorService;
import model.Trabajador;


/**
 *
 * @author Esteban_Rey
 */




@RestController
@RequestMapping("/api/trabajadores")
public class TrabajadorController {
    private final TrabajadorService trabajadorService;

    @Autowired
    public TrabajadorController(TrabajadorService trabajadorService) {
        this.trabajadorService = trabajadorService;
    }

    // Crear un nuevo trabajador
    @PostMapping
    public ResponseEntity<Trabajador> createTrabajador(@RequestBody Trabajador trabajador) {
        Trabajador newTrabajador = trabajadorService.createTrabajador(trabajador);
        return new ResponseEntity<>(newTrabajador, HttpStatus.CREATED);
    }

    // Obtener todos los trabajadores
    @GetMapping
    public ResponseEntity<List<Trabajador>> getAllTrabajadores() {
        List<Trabajador> trabajadores = trabajadorService.getAllTrabajadores();
        return new ResponseEntity<>(trabajadores, HttpStatus.OK);
    }

    // Obtener un trabajador por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Trabajador> getTrabajadorById(@PathVariable Long id) {
        Trabajador trabajador = trabajadorService.getTrabajadorById(id);
        return new ResponseEntity<>(trabajador, HttpStatus.OK);
    }

    // Actualizar un trabajador existente
    @PutMapping("/{id}")
    public ResponseEntity<Trabajador> updateTrabajador(@PathVariable Long id, @RequestBody Trabajador trabajador) {
        Trabajador updatedTrabajador = trabajadorService.updateTrabajador(id, trabajador);
        return new ResponseEntity<>(updatedTrabajador, HttpStatus.OK);
    }

    // Eliminar un trabajador por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrabajador(@PathVariable Long id) {
        trabajadorService.deleteTrabajador(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}