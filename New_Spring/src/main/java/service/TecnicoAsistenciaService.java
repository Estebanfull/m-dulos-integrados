/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import model.TecnicoAsistencia;
import repository.TecnicoAsistenciaRepository;

/**
 *
 * @author Esteban_Rey
 */


@Service
public class TecnicoAsistenciaService {
    private final TecnicoAsistenciaRepository tecnicoAsistenciaRepository;

    @Autowired
    public TecnicoAsistenciaService(TecnicoAsistenciaRepository tecnicoAsistenciaRepository) {
        this.tecnicoAsistenciaRepository = tecnicoAsistenciaRepository;
    }

    public List<TecnicoAsistencia> findAllTecnicosAsistencia() {
        return tecnicoAsistenciaRepository.findAll();
    }

    public Optional<TecnicoAsistencia> findTecnicoAsistenciaById(Long id) {
        return tecnicoAsistenciaRepository.findById(id);
    }

    public TecnicoAsistencia saveTecnicoAsistencia(TecnicoAsistencia tecnicoAsistencia) {
        return tecnicoAsistenciaRepository.save(tecnicoAsistencia);
    }

    public void deleteTecnicoAsistenciaById(Long id) {
        tecnicoAsistenciaRepository.deleteById(id);
    }

    public TecnicoAsistencia createTecnicoAsistencia(TecnicoAsistencia tecnicoAsistencia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<TecnicoAsistencia> getAllTecnicosAsistencia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public TecnicoAsistencia getTecnicoAsistenciaById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public TecnicoAsistencia updateTecnicoAsistencia(Long id, TecnicoAsistencia tecnicoAsistencia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void deleteTecnicoAsistencia(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
