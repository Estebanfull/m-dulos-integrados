import React, { useState } from 'react';
import '../Css/IngresoApp.css';
import logo from '../Imagenes/logoike.svg';
import axios from 'axios';

function IngresoApp() {
  const [error, setError] = useState('');
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  const handleFormSubmit = async (event) => {
    event.preventDefault();

    try {
      const response = await axios.post('http://localhost:8080/ingreso-usuarios', {
        username,
        password
      });

      if (response.data.success) {
        // Si la autenticación fue exitosa, redirige al menú de usuarios
        window.location.href = '/menu-usuarios';
      } else {
        // Si la autenticación falló, muestra un mensaje de error
        setError(response.data.error);
      }
    } catch (error) {
      console.error('Error al enviar el formulario:', error);
      setError('Error al iniciar sesión');
    }
  };

  return (
    <div className="contenedor">
      <img src={logo} alt="Logo de la aplicación" className="logo" />
      <div className="formulario">
        <div className="cuadro-azul"></div>
        <div className="cuadro-gris">
          <h2>Iniciar Sesión Usuarios</h2>
          <form onSubmit={handleFormSubmit}>
            <input type="text" name="usuario" value={username} onChange={(e) => setUsername(e.target.value)} placeholder="Usuario" required />
            <input type="password" name="contraseña" value={password} onChange={(e) => setPassword(e.target.value)} placeholder="Contraseña" required />
            <input type="submit" value="Ingresar" className="boton-ingresar" />
          </form>
          {error && <p className="error-message">{error}</p>}
          <a href="contrasena.html" className="boton-olvido">¿Olvidó o bloqueó su contraseña?</a>
        </div>
      </div>
      <footer className="pie-pagina">
        Hecho por <img src={logo} alt="Ike" /> Asistencia
      </footer>
    </div>
  );
}

export default IngresoApp;
