# CURSO BASICO DE JAVA 

Este repositorio fue creado para estudiar el lenguaje JAVA sin usar un entorno de desarrollo integrado como Netbeans, Eclipse, entre otros.
Cada código fue escrito en un bloc de notas y se ejecuto desde el símbolo del sistema, para ello se proporciona una guia de como correr el programa llamado **"ejecutar-programa.txt"**. ¡¡ IMPORTANTE!! Se tiene que descargar el Java Development Kit (JSK) de Java.

## Proyecto final

Como proyecto final del curso se realizo un programa con interfaz gráfica de usuario, el cual debe realizar el cálculo de los días de vacaciones a los que tiene derecho un trabajador, dependiendo de su puesto y antigüedad en la empresa, usando como referencia la marca Coca Cola. El programa deberá contener tres distintas interfaces, para navegar entre ellas:

**1. Interfaz de bienvenida**

![Interfaz de bienvenida](https://github.com/Alejandraglezjaime/Curso-Java-en-bloc-notas-/blob/master/Img-proyecto-cocacola/Interfaz%20de%20bienvenida.jpg?raw=true)

**2. Interfaz de Términos y Condiciones**. Solo se permitirá avanzar de interfaz si se aceptan los términos y condiciones, una vez aceptados el bóton de continuar será habilitado.

![Interfaz de terminos y condiciones](https://github.com/Alejandraglezjaime/Curso-Java-en-bloc-notas-/blob/master/Img-proyecto-cocacola/Interfaz%20de%20terminos%20y%20condiciones.jpg?raw=true)

**3. Pantalla principal**. En esta sección además de proporcionarnos el cálculo vacacional, nos muestra una barra de herramientas, donde en la sección de opciones nos permite cambiar el fondo de color (rojo, negro morado,), limpiar los datos para crear un nuevo cálculo, y salir (esta opción regresa a la interfaz de bienvenida). Cuenta con un botón de calcular y una opción para visualizar los datos del creador del sistema.   

![Pantalla principal](https://github.com/Alejandraglezjaime/Curso-Java-en-bloc-notas-/blob/master/Img-proyecto-cocacola/Pantalla%20principal.jpg?raw=true)

### Empaquetado de aplicaciones en Java 

El proyecto final además de encontrarlo en su código también se puede encontrar empaquetado, es decir, en un archivo **.jar**, lo cuál nos permite ejecutar nuestro programa únicamente dando doble clic sobre él, de esta manera el usuario ya no depende del símbolo del sistema y será mucho mas sencillo compartir el programa con cualquier persona si no tiene conocimientos sobre programación, así como poder proteger nuestro código si no queremos que alguien más lo tenga. 

¡IMPORTANTE! Se agrego los pasos a seguir para empaquetar una aplicación, los pasos los puedes visualizar en el archivo **"empaquetado-app-Java.txt"**. 

### EXTRAS 

- [ ]  **Ingresarle una base de datos:** configurar la aplicación, para que calcule el tiempo vacacional del trabajador con los datos ingresados en una base de datos. 
- [ ]  **Actualización automática**. Al momento de ingresar el nombre completo del trabajador, rellene automáticamente el departamento, la antiguedad y el reusltado, tomando los datos de una base de datos.
- [ ]  **Error de persona** Si no encuentra al trabajador, mandar un mensaje de error con un botón que permita ingresar un nuevo trabajador.
- [ ]  **Interfaz de trabajador nuevo**. Crea una interfaz donde te permita ingresar un nuevo trabajador, y que sus datos se registren en la base de datos.
- [ ]  **Clave de seguridad** Solo se podra acceder al sistema si el nombre ingresado tiene autorización y que cuente con una clave de acceso, si esta es erronea no permite el acceso al programa.
- [ ]  *En la pantalla principal debe aparecer el personal que ha ingresado al sistema*
