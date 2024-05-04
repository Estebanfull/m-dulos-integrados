# m-dulos-integrados
GA8-220501096-AA1-EV01 desarrollar software a partir de la integración de sus módulos componentes  ----  GA8-220501096-AA1 - Integrar módulos


# Iniciar con Create React App

Este proyecto fue creado con Create React App.

En el directorio del proyecto, puedes ejecutar:



Instalar dependencias: Navega al directorio del proyecto clonado e instala las dependencias necesarias utilizando npm. Ejecuta el siguiente comando:

                        npm install


Iniciar la aplicación: Una vez que todas las dependencias estén instaladas, puedes iniciar la aplicación en modo de desarrollo con el siguiente comando:

                        npm start

Esto iniciará la aplicación y la abrirá en tu navegador predeterminado en http://localhost:3000. La página se recargará automáticamente cuando realices cambios en el código.

Explorar la aplicación: Una vez que la aplicación esté en funcionamiento, puedes comenzar a explorar sus características y funcionalidades. 

Aquí hay algunas rutas importantes que puedes probar:

/ingreso: Página de inicio de sesión para usuarios y funcionarios.
/menu-funcionarios: Menú principal para los funcionarios.
/menu-usuarios: Menú principal para los usuarios.
/crear-asistencia: Crear una nueva asistencia.


## Características Principales

- Ingreso de usuarios y funcionarios.
- Creación, modificación y eliminación de usuarios, trabajadores, proveedores y técnicos de asistencia.
- Solicitud de asistencia
- Modificar Perfil
- Menús diferenciados para usuarios y funcionarios.

## Estructura de Enrutamiento

La aplicación utiliza React Router para gestionar las rutas. Aquí tienes un resumen de las rutas y los componentes asociados:

- `App.js`
  - Ruta "/" - Representa la página de inicio de la aplicación y muestra el componente Inicio.
  - Ruta "/ingreso" - Dirige a la página de inicio de sesión y muestra el componente IngresoApp.
  - Ruta "/ingreso-usuarios" - También dirige a la página de inicio de sesión y muestra el componente IngresoApp.
  - Ruta "/ingreso-funcionarios" - Dirige a la página de inicio de sesión para los funcionarios y muestra el componente IngresoFuncionarios.
  - Ruta "/menu-funcionarios" - Muestra el menú principal para los funcionarios y muestra el componente MenuFuncionarios.
  - Ruta "/menu-usuarios" - Muestra el menú principal para los usuarios y muestra el componente MenuUsuarios.
  - Ruta "/crear-asistencia" - Permite crear una nueva asistencia y muestra el componente CrearAsistencia.
  - Ruta "/modificar-asistencia" - Permite modificar asistencias existentes y muestra el componente ModificarAsistencia.
  - Ruta "/eliminar-asistencia" - Permite eliminar asistencias y muestra el componente EliminarAsistencia.
  - Ruta "/modificar-perfil" - Permite modificar el perfil y muestra el componente ModificarPerfil.
  - Ruta "/crear-usuario" - Permite crear un nuevo usuario y muestra el componente CrearUsuario.
  - Ruta "/modificar-usuarios" - Permite modificar usuarios existentes y muestra el componente ModificarUsuario.
  - Ruta "/eliminar-usuarios" - Permite eliminar usuarios y muestra el componente EliminarUsuario.
  - Ruta "/crear-trabajador" - Permite crear un nuevo trabajador y muestra el componente CrearTrabajador.
  - Ruta "/modificar-trabajador" - Permite modificar trabajadores existentes y muestra el componente ModificarTrabajador.
  - Ruta "/eliminar-trabajador" - Permite eliminar trabajadores y muestra el componente EliminarTrabajador.
  - Ruta "/crear-proveedor" - Permite crear un nuevo proveedor y muestra el componente CrearProveedor.
  - Ruta "/modificar-proveedor" - Permite modificar proveedores existentes y muestra el componente ModificarProveedor.
  - Ruta "/eliminar-proveedor" - Permite eliminar proveedores y muestra el componente EliminarProveedor.
  - Ruta "/crear-tecnico" - Permite crear un nuevo técnico y muestra el componente CrearTecnico.
  - Ruta "/modificar-tecnico" - Permite modificar técnicos existentes y muestra el componente ModificarTecnico.
  - Ruta "/eliminar-tecnico" - Permite eliminar técnicos y muestra el componente EliminarTecnico.

## Estructura del Proyecto

La carpeta `src` contiene todo el código fuente de tu aplicación,



src
└── components
    ├── Home.js
    ├── IngresoApp.js
    ├── IngresoFuncionarios.js
    ├── ListaUsuarios.js
    ├── MenuFuncionarios.js
    ├── MenuUsuarios.js
    ├── Menu Funcionario
    │   ├── CrearUsuario.js
    │   ├── CrearTrabajador.js
    │   ├── CrearProveedor.js
    │   ├── CrearTecnico.js
    │   ├── ModificarUsuario.js
    │   ├── ModificarTrabajador.js
    │   ├── ModificarProveedor.js
    │   ├── ModificarTecnico.js
    │   ├── EliminarUsuario.js
    │   ├── EliminarTrabajador.js
    │   ├── EliminarProveedor.js
    │   └── EliminarTecnico.js
    └── Menu Usuario
        ├── CrearAsistencia.js
        ├── ModificarAsistencia.js
        ├── EliminarAsistencia.js
        └── ModificarPerfil.js




Los estilos se encuentran en la carpeta `css`,



css
├── EstilosSubMenu.css
├── Home.css
├── IngresoApp.css
├── MenuFuncionarios.css
├── MenuUsuarios.css
└── MenuFuncionario
    └── EstilosSubMenu.css





## PHP Scripts

Aunque estos archivos PHP no se están utilizando en esta ocasión, se han guardado para futuras pruebas o referencia. Los archivos se encuentran en la carpeta `Server`:

La carpeta Server contiene los siguientes scripts PHP:
Server
├── login.php
├── conexion.php
├── AsistenciaController.php
├── CrearController.php
├── ModificarController.php
├── EliminarController.php
├── ModificarPerfilController.php
└── ObtenerController.php




### Backend

Este proyecto cuenta con un backend desarrollado en Java con Spring Boot para gestionar las operaciones CRUD y la lógica de negocio. Se ejecuta en el puerto localhost:8080.

#### Conexión a la Base de Datos

La aplicación utiliza una conexión a la base de datos para almacenar y recuperar datos. La configuración de la conexión se encuentra en el archivo `application.properties`.

# Base de Datos con MySQL Workbench
La aplicación utiliza una base de datos llamada `bd_ike`. Aquí tienes las tablas utilizadas:

### Tabla: asistencia
- ID_ASISTENCIA (int)
- fecha (date)
- hora (time)
- descripcion (text)
- estado_de_asistencia (varchar(50))
- ID_USUARIO (int)
- ID_TECNICO (int)
- ID_PROVEEDOR (int)

### Tabla: usuario
- ID_USUARIO (int)
- nombre (varchar(100))
- telefono (varchar(15))
- correo_electronico (varchar(100))
- direccion (varchar(255))
- tipo_de_asistencia (varchar(100))
- clave (varchar(50))

### Tabla: trabajador
- ID_TRABAJADOR (int)
- nombre (varchar(100))
- telefono (varchar(15))
- correo_electronico (varchar(100))
- contrasena (varchar(50))

### Tabla: proveedor
- ID_PROVEEDOR (int)
- nombre (varchar(100))
- numero (varchar(20))
- correo_electronico (varchar(100))
- tipo_de_servicio (varchar(100))

### Tabla: tecnico_asistencia
- ID_TECNICO (int)
- nombre (varchar(100))
- telefono (varchar(15))
- especialidad (varchar(100))



#### Controlador de Inicio de Sesión

El controlador `LoginController` maneja las solicitudes relacionadas con el inicio de sesión de usuarios. Utiliza la anotación `@PostMapping` para escuchar las solicitudes POST en la ruta `/ingreso-usuarios`.

##### Endpoints

- `POST /ingreso-usuarios`: Este endpoint se utiliza para iniciar sesión de usuarios. Recibe un objeto JSON en el cuerpo de la solicitud con las credenciales del usuario (nombre de usuario y contraseña). Retorna un objeto JSON que indica si el inicio de sesión fue exitoso (`success: true`) o falló (`success: false`). En caso de error, el objeto JSON también incluye un mensaje de error.

##### Clases Auxiliares

El controlador hace uso de las siguientes clases auxiliares:

- `LoginRequest`: Representa la solicitud de inicio de sesión y contiene las credenciales del usuario.
- `LoginResponse`: Representa la respuesta del servidor al intento de inicio de sesión y contiene información sobre si la operación fue exitosa y un mensaje de error en caso de falla.

#### Endpoints de la API

##### Usuarios

- `GET /api/usuarios`: Obtiene todos los usuarios.
- `GET /api/usuarios/{id}`: Obtiene un usuario por su ID.
- `POST /api/usuarios`: Crea un nuevo usuario.
- `PUT /api/usuarios/{id}`: Actualiza un usuario existente.
- `DELETE /api/usuarios/{id}`: Elimina un usuario por su ID.

##### Trabajadores

- `POST /api/trabajadores`: Crea un nuevo trabajador.
- `GET /api/trabajadores`: Obtiene todos los trabajadores.
- `GET /api/trabajadores/{id}`: Obtiene un trabajador por su ID.
- `PUT /api/trabajadores/{id}`: Actualiza un trabajador existente.
- `DELETE /api/trabajadores/{id}`: Elimina un trabajador por su ID.

##### Proveedores

- `POST /api/proveedores`: Crea un nuevo proveedor.
- `GET /api/proveedores/{id}`: Obtiene un proveedor por su ID.
- `PUT /api/proveedores/{id}`: Actualiza un proveedor existente.
- `DELETE /api/proveedores/{id}`: Elimina un proveedor por su ID.

##### Técnicos de Asistencia

- `POST /api/tecnicos-asistencia`: Crea un nuevo técnico de asistencia.
- `GET /api/tecnicos-asistencia`: Obtiene todos los técnicos de asistencia.
- `GET /api/tecnicos-asistencia/{id}`: Obtiene un técnico de asistencia por su ID.
- `PUT /api/tecnicos-asistencia/{id}`: Actualiza un técnico de asistencia existente.
- `DELETE /api/tecnicos-asistencia/{id}`: Elimina un técnico de asistencia por su ID.

##### Asistencias

- `GET /api/asistencias`: Obtiene todas las asistencias.
- `GET /api/asistencias/{id}`: Obtiene una asistencia por su ID.
- `POST /api/asistencias/modificar`: Modifica una asistencia.
- `POST /api/asistencias/solicitar`: Solicita una asistencia.
- `DELETE /api/asistencias/{id}`: Elimina una asistencia por su ID.

#### Estructura del Proyecto

El proyecto sigue una estructura MVC (Modelo-Vista-Controlador), donde cada entidad tiene su modelo, controlador, repositorio y servicio correspondientes.

- `model/`: Contiene las clases que representan las entidades del sistema (Usuario, Trabajador, Proveedor, Tecnico de Asistencia, Asistencia).
- `repository/`: Contiene las interfaces de repositorio que interactúan con la base de datos.
- `service/`: Contiene las clases de servicio que implementan la lógica de negocio.
- `controller/`: Contiene los controladores que gestionan las peticiones HTTP y definen los endpoints de la API.

#### Instrucciones de Ejecución

1. Clona este repositorio.
2. Asegúrate de tener Java y Maven instalados en tu sistema.
3. Navega a la carpeta del proyecto.
4. Ejecuta `mvn spring-boot:run` para iniciar la aplicación.
