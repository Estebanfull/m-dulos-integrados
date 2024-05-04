/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Trabajador;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Esteban_Rey
 */



@Repository
public interface TrabajadorRepository extends JpaRepository<Trabajador, Long> {
    
    // Método para buscar trabajadores por su nombre, ignorando mayúsculas y minúsculas
    List<Trabajador> findByNombreIgnoreCase(String nombre);
    
    // Método para buscar trabajadores cuyo nombre contenga una cadena específica
    List<Trabajador> findByNombreContaining(String nombre);
    
    // Método para contar el número de trabajadores por su tipo de servicio
    long countByTipoDeServicio(String tipoDeServicio);
    
    // Método para buscar trabajadores por su especialidad
    List<Trabajador> findByEspecialidad(String especialidad);
    
    // Método para buscar trabajadores cuya especialidad contenga una cadena específica
    List<Trabajador> findByEspecialidadContaining(String especialidad);
    
    // Método para buscar trabajadores por su correo electrónico
    Optional<Trabajador> findByCorreoElectronico(String correoElectronico);
}
