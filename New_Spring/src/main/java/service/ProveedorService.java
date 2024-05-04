/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import model.Proveedor;
import repository.ProveedorRepository;

/**
 *
 * @author Esteban_Rey
 */


@Service
public class ProveedorService {
    private final ProveedorRepository proveedorRepository;

    @Autowired
    public ProveedorService(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    public List<Proveedor> findAllProveedores() {
        return proveedorRepository.findAll();
    }

    public Optional<Proveedor> findProveedorById(Long id) {
        return proveedorRepository.findById(id);
    }

    public Proveedor saveProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public void deleteProveedorById(Long id) {
        proveedorRepository.deleteById(id);
    }

    public List<Proveedor> getAllProveedores() {
        return findAllProveedores();
    }

    public Proveedor getProveedorById(Long id) {
        return findProveedorById(id)
                .orElseThrow(() -> new NoSuchElementException("Proveedor no encontrado con ID: " + id));
    }

    public Proveedor updateProveedor(Long id, Proveedor proveedor) {
        if (!proveedorRepository.existsById(id)) {
            throw new NoSuchElementException("Proveedor no encontrado con ID: " + id);
        }
        proveedor.setId(id);
        return proveedorRepository.save(proveedor);
    }

    public void deleteProveedor(Long id) {
        if (!proveedorRepository.existsById(id)) {
            throw new NoSuchElementException("Proveedor no encontrado con ID: " + id);
        }
        proveedorRepository.deleteById(id);
    }

    public Proveedor createProveedor(Proveedor proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
