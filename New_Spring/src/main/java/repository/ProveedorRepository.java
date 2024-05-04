/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;


import org.springframework.data.jpa.repository.JpaRepository;
import model.Proveedor;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Esteban_Rey
 */

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
    
    // Método para buscar proveedores por su nombre, ignorando mayúsculas y minúsculas
    List<Proveedor> findByNombreIgnoreCase(String nombre);
    
    // Método para buscar proveedores cuyo nombre contenga una cadena específica
    List<Proveedor> findByNombreContaining(String nombre);
    
    // Método para buscar proveedores por su tipo de servicio
    List<Proveedor> findByTipoDeServicio(String tipoDeServicio);
    
    // Método para buscar proveedores cuyo tipo de servicio contenga una cadena específica
    List<Proveedor> findByTipoDeServicioContaining(String tipoDeServicio);
    
    // Método para buscar proveedores por su correo electrónico
    Optional<Proveedor> findByCorreoElectronico(String correoElectronico);
}

