
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


package service;

import model.Asistencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AsistenciaRepository;
import java.util.List;


/**
 *
 * @author Esteban_Rey
 */

@Service
public class AsistenciaService {

    private final AsistenciaRepository asistenciaRepository;

    @Autowired
    public AsistenciaService(AsistenciaRepository asistenciaRepository) {
        this.asistenciaRepository = asistenciaRepository;
    }

    public List<Asistencia> getAllAsistencias() {
        return asistenciaRepository.findAll();
    }

    public Asistencia getAsistenciaById(Long id) {
        return asistenciaRepository.findById(id).orElse(null);
    }

    public void modificarAsistencia(Long id, String tipoModificacion, String mensaje) {
        // Lógica para modificar la asistencia según el tipo de modificación
    }

    public void solicitarAsistencia(String tipoAsistencia, String mensaje) {
        // Lógica para solicitar la asistencia
    }

    public void eliminarAsistencia(Long id) {
        // Lógica para eliminar la asistencia
    }
}
