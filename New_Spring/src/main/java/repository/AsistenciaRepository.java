/*
 * Copyright 2024 Esteban_Rey.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import model.Asistencia;

/**
 *
 * @author Esteban_Rey
 */
@Repository
public interface AsistenciaRepository extends JpaRepository<Asistencia, Long> {

    // Método para buscar asistencias por tipo
    List<Asistencia> findByTipo(String tipo);

    // Método para buscar asistencias por mensaje que contiene cierto texto
    List<Asistencia> findByMensajeContaining(String texto);

    // Método para contar las asistencias por tipo
    long countByTipo(String tipo);

    // Método para buscar asistencias por tipo y mensaje
    List<Asistencia> findByTipoAndMensaje(String tipo, String mensaje);

    // Método para buscar asistencias por tipo y ordenarlas por mensaje
    List<Asistencia> findByTipoOrderByMensajeAsc(String tipo);

    // Método para eliminar asistencias por tipo
    void deleteByTipo(String tipo);

    // Método para buscar asistencias por ID y tipo
    Asistencia findByIdAndTipo(Long id, String tipo);

    // Método para buscar asistencias por tipo o mensaje
    List<Asistencia> findByTipoOrMensaje(String tipo, String mensaje);
}
