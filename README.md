# Proyecto de Comercio

Este proyecto es una aplicación de escritorio desarrollada en Java que permite gestionar productos, ventas y ganancias de un comercio. 
Está construido utilizando JPA para la persistencia de datos y se conecta a una base de datos MySQL.



## Requisitos

Para correr el programa debes tener instalados los siguientes programas:

- **JDK 8 o superior**
- **MySQL**
- **Maven**
- **Un IDE compatible con Java**

## Configuración de la Base de Datos

1. **Crea la base de datos en MySQL:**

    ```sql
    CREATE DATABASE comercio;
    ```

2. **Configura la conexión a la base de datos:**

    - Crea el archivo `src/main/resources/META-INF/persistence.xml`.
    - Setea los valores según tu configuración de MySQL:

    ```xml
    <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/comercio?serverTimezone=UTC"/>
    <property name="javax.persistence.jdbc.user" value="TU_USUARIO"/>
    <property name="javax.persistence.jdbc.password" value="TU_CONTRASEÑA"/>
    ```

3. **Inicializa la base de datos:**
   - Al ejecutar la aplicación, JPA creará automáticamente las tablas necesarias en la base de datos.

## Ejecución del Proyecto

1. **Clona este repositorio:**

2. **Importa el proyecto en tu IDE:**
   - Abre tu IDE y selecciona la opción para importar un proyecto Maven o desde un archivo `pom.xml`.
     
3. **Compila y ejecuta el proyecto:**
   - Asegúrate de que el servicio de MySQL esté en funcionamiento antes de ejecutar la aplicación.
   - Utiliza tu IDE para compilar y ejecutar la aplicación.


# Ventana Principal

![Principal](https://github.com/user-attachments/assets/6ed43fb3-9b34-420a-bbb8-6a201d355da1)


# Ventana Productos

![Productos](https://github.com/user-attachments/assets/14681928-9d35-42e8-82de-4a0eb701280b)


# Ventana Ventas

![Ventas](https://github.com/user-attachments/assets/37463482-b440-45f1-8400-caf0af2c837a)


# Ventana Ganancias

![Ganancias](https://github.com/user-attachments/assets/3245f7e7-8c13-4511-b549-6df188051fc2)

