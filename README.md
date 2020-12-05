# 2020-2-PROYCVDS-3SD

# Escuela Colombiana de Ingeniería
#PROYECTO TERCER CORTE 
#AÑO 2020 - Segundo Semestre

**********************************************************
----------------------------------------------------------
**********************************************************
### Datos básicos
 * **Nombres:** Johan Sebastian Garcia\ 
				David Fernando Rivera\
				Janer Stiven Vanegas\
				Steven Ricardo Garzon Reina
				
				
**********************************************************
----------------------------------------------------------
**********************************************************


###INTRODUCCION
	La Plataforma Historial de Equipos, es una herramienta donde el personal del laboratorio de informática (LabInfo) pertenecientes a la decanatura de Ingeniería de Sistemas de la Escuela Colombiana de Ingeniería Julio Garavito, pueden registrar los laboratorio, equipos y elementos de cada equipo, junto con las novedades que se realizan a cada uno de estos. El sistema, más allá de facilitar el registro de los equipos y novedades, es una valiosa base de conocimiento donde el personal del laboratorio, puede revisar el histórico de novedades que se le han realizado a cada elemento a través del tiempo durante todo su ciclo de vida útil. El personal administrativo del laboratorio puede crear laboratorios, equipos y elementos, asociar unos a otros y registrar novedades para cada uno; además de tener una variedad de reportes que les permitirá tener el control administrativo de estos implementos.

###OBJETIVO
	El objetivo del sistema es permitir el registro y seguimiento de las novedades que han sido realizadas sobre los equipos de cómputo pertenecientes al Laboratorio de Informática. La plataforma de historial de equipos debe contar con una interfaz de usuario amigable con los usuarios.


**********************************************************
----------------------------------------------------------
**********************************************************

**********************************************************
----------------------------------------------------------
**********************************************************

 * Nombre del proyecto
 # 2020-2-CVDS-3SD
 * Período académico, nombre del curso, nombre de los integrantes, nombre del profesor, roles asignados (no olvidar que el profesor tuvo el rol de 'dueño de producto').
 * **Periodo Academico:** 2020-2
 * **Nombre del curso:** Ciclos de vida y desarrollo de software
 * **nombre de los integrantes:** Steven Garzon, Stiven, David Rivera,Sebastian Garcia
 * **Profesor:** Julian Velasco
 ## Roles Asignados
 * **Julian Velasco** - *Product Owner*
 * **Sebastian Garcia** - *Developer*
 * **Steven Garzon** - *Developer*
 * **David Rivera** - *Scrum Master*
 * **Janer Stiven** - *Developer*

 ### Descripción del producto.
	* Descripción general.
	El objetivo del producto es mantener un orden sobre los laboratorios del programa de ingenieria de sistemas
	Los equipos que pertenecen a cada uno de estos laboratorios y los elementos que conforman los equipos, tambien
	de mantener al tanto por medio de novedades y reportes, al personal que los administre
 ## Manual de Usuario
 Lo primero que se tiene que hacer es registrarse en la plataforma en la ventana de registro de usuario 
 ![alt](resources/ImagenesReadme/UsuarioRegistro.jpg)

 Despues del registro en la base de datos, procedemos a iniciar sesion con las credenciales creadas
 ![alt](resources/ImagenesReadme/Login.jpg)

 Entramos al menu administrador donde podemos encontrar las diferentes secciones para Elemento,Equipo,Laboratorio,Novedad
 ![alt](resources/ImagenesReadme/Menu.jpg)

 Podemos entrar a la seccion de Elementos donde encontramos las opciones de registrar un nuevo elemento y consultar todos los elementos existentes
 ![alt](resources/ImagenesReadme/registrarElemento.jpg)
 ![alt](resources/ImagenesReadme/registroElemento.jpg)

 Una vez registrados los elementos se pueden consultar 
 ![alt](resources/ImagenesReadme/consultarElementos.jpg)

 una vez se tengan los elementos necesarios para establecer un equipo se puede registrar el equipo
 ![alt](resources/ImagenesReadme/registrarEquipo.jpg)
 
 Donde se deben asignar los componentes del equipo, como sus elementos 
 
 Definidos los elementos del equipo, estos quedan asociados al equipo directamente y el equipo queda registrado como disponible lo cual lo hace visible a la consulta
 ![alt](resources/ImagenesReadme/consultarEquipos.jpg)

 Teniendo equipos completos estos se pueden asignar a un laboratorio creado, registrando el laboratorio
 ![alt](resources/ImagenesReadme/registrarLaboratorio.jpg)

 Los cuales quedan asignados a los equipos correspondientes y se pueden consultar 
 ![alt](resources/ImagenesReadme/consultarLaboratorios.jpg)

 Donde se contempla la opcion de cerrar los elementos, lo que desasocia a los equipos y sus elementos de los laboratorios asignados


 Tambien se tiene un registro de novedades, donde se ingresa cada actividad realizada dentro de la plataforma
 ![alt](resources/ImagenesReadme/novedades.jpg)

 Y se cuenta con un reporte exportado a excel para un mejor control y manejo de la información 
 ![alt](resources/ImagenesReadme/reporte.jpg)


 
 * Arquitectura y Diseño detallado:
	* Modelo E-R.
	![alt](Resources/ImagenesReadme/diagramaE-R.jpg)
	* Diagrama de clases (hacerlo mediante ingeniería inversa)
	
	* Descripción de la arquitectura (capas) y del Stack de tecnologías utilizado (PrimeFaces, Guice, QuickTheories, PostgreSQL).

	* **PrimeFaces(FRONT)** brinda una experiencia cómoda tanto para el desarrollador como para el usuario final 
	* **GUICE(BACK):** Genera la conexión segura entre los calculos y el back del proyecto con lo que se muestra en la vista del proyecto1
	* **PostGre(MBD):** Servidor de base de datos que utilizamos para almacenar, buscar y modificar la información relacionada con el proyecto
	* Enlace a la aplicación en Heroku.
	[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://proyecto3sd.herokuapp.com/)
		
	* Enlace al sistema de integración continua.
 * Descripción del proceso:
	* Integrantes.
				Johan Sebastian Garcia\ 
				David Fernando Rivera\
				Janer Stiven Vanegas\
				Steven Ricardo Garzon Reina
	* Breve descripción de la Metodología.
	* Enlace a Taiga (hacer público el Backlog).
	* Generar el 'release-burndown chart' del proyecto, e indicar los puntos de historia realizados y los faltantes.
	* Para cada Sprint:
		* Imagen del 'sprint-backlog'
		* Imagen del 'sprint-burndown chart' (sacado del sprint-backlog anterior), y una descripción breve de los problemas encontrados y mejoras realizadas al proceso.
	* Reporte de pruebas y de cubrimiento de las mismas (sólo la foto del reporte principal). Para la cobertura, pueden usar los plugins disponibles (EclEmma, Jacoco, etc.)
	* Reporte de análisis estático de código. Se pueden usar las mismas herramientas trabajadas en los laboratorios.
