import React, { useState } from 'react';
import logo from '../../Imagenes/logoike.svg'; // Importa el logo
import axios from 'axios'; // Importa Axios
import '../../Css/EstilosSubMenu.css'; // Importa el archivo CSS específico para CrearUsuario

function CrearUsuario() {
  // Definir el estado para almacenar los datos del nuevo usuario
  const [usuario, setUsuario] = useState({
    nombre: '',
    telefono: '',
    correoElectronico: '',
    direccion: '',
    tipoDeAsistencia: '', // Cambiado a campo de selección
    clave: ''
  });
  // Estado para el mensaje de éxito
  const [mensajeExito, setMensajeExito] = useState('');

  // Manejar cambios en los campos del formulario
  const handleInputChange = (event) => {
    const { name, value } = event.target;
    setUsuario({ ...usuario, [name]: value });
  };

  // Manejar el envío del formulario
  const handleSubmit = async (event) => {
    event.preventDefault();
    try {
      // Enviar los datos del usuario al servidor utilizando Axios
      const response = await axios.post('/api/usuarios', usuario); // Modifica la URL aquí
      // Mostrar la respuesta del servidor (en este caso, un mensaje de éxito)
      setMensajeExito(response.data.message);
      // Limpiar el formulario después del envío exitoso
      setUsuario({
        nombre: '',
        telefono: '',
        correoElectronico: '',
        direccion: '',
        tipoDeAsistencia: '',
        clave: ''
      });
    } catch (error) {
      console.error('Error:', error);
    }
  };

  return (
    <div className="crear-usuario-container">
      <div className="crear-usuario-logo-container">
        <img src={logo} alt="Ike" className="crear-usuario-logo" />
        <button className="crear-usuario-boton-volver" onClick={() => window.history.back()}>Salir</button>
      </div>

      <div className="crear-usuario-contenido">
        <header className="crear-usuario-encabezado">
          <h1 className="crear-usuario-titulo-menu">Crear Usuario</h1>
        </header>

        <div className="crear-usuario-contenedor-central">
          <form onSubmit={handleSubmit} className="crear-usuario-formulario">
            <label className="crear-usuario-label">
              Nombre:
              <input type="text" name="nombre" value={usuario.nombre} onChange={handleInputChange} className="crear-usuario-input" required />
            </label>
            <label className="crear-usuario-label">
              Teléfono:
              <input type="text" name="telefono" value={usuario.telefono} onChange={handleInputChange} className="crear-usuario-input" required />
            </label>
            <label className="crear-usuario-label">
              Correo Electrónico:
              <input type="email" name="correoElectronico" value={usuario.correoElectronico} onChange={handleInputChange} className="crear-usuario-input" required />
            </label>
            <label className="crear-usuario-label">
              Dirección:
              <input type="text" name="direccion" value={usuario.direccion} onChange={handleInputChange} className="crear-usuario-input" required />
            </label>
            <label className="crear-usuario-label">
              Tipo de Asistencia:
              <select name="tipoDeAsistencia" value={usuario.tipoDeAsistencia} onChange={handleInputChange} className="crear-usuario-input" required>
                <option value="">Seleccione una opción</option>
                <option value="HOGAR">HOGAR</option>
                <option value="MEDICA">MEDICA</option>
                <option value="AMBULANCIA">AMBULANCIA</option>
                <option value="AUTOS">AUTOS</option>
                <option value="CONDUCTOR ELEGIDO">CONDUCTOR ELEGIDO</option>
                <option value="LEGAL">LEGAL</option>
              </select>
            </label>
            <label className="crear-usuario-label">
              Clave:
              <input type="password" name="clave" value={usuario.clave} onChange={handleInputChange} className="crear-usuario-input" required />
            </label>
            <button type="submit" className="crear-usuario-submit">Crear Usuario</button>
          </form>
          {/* Mostrar el mensaje de éxito */}
          {mensajeExito && <p className="mensaje-exito">{mensajeExito}</p>}
        </div>

        <footer className="crear-usuario-pie-pagina">
          Hecho por <img src={logo} alt="Ike" /> Asistencia
        </footer>
      </div>
    </div>
  );
}

export default CrearUsuario;
