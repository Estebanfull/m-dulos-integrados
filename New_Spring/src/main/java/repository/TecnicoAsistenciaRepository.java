/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.TecnicoAsistencia;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Esteban_Rey
 */





@Repository
public interface TecnicoAsistenciaRepository extends JpaRepository<TecnicoAsistencia, Long> {
    
    // Método para buscar técnicos de asistencia por su nombre, ignorando mayúsculas y minúsculas
    List<TecnicoAsistencia> findByNombreIgnoreCase(String nombre);
    
    // Método para buscar técnicos de asistencia cuyo nombre contenga una cadena específica
    List<TecnicoAsistencia> findByNombreContaining(String nombre);
    
    // Método para buscar técnicos de asistencia por su especialidad
    List<TecnicoAsistencia> findByEspecialidad(String especialidad);
    
    // Método para buscar técnicos de asistencia cuya especialidad contenga una cadena específica
    List<TecnicoAsistencia> findByEspecialidadContaining(String especialidad);
    
    // Método para buscar técnicos de asistencia por su correo electrónico
    Optional<TecnicoAsistencia> findByCorreoElectronico(String correoElectronico);
}
