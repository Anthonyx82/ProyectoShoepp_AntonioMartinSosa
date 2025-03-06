# Spring-eshop

Spring-eshop es una aplicación de comercio electrónico pensada para zapatillas, aunque con unos ajustes mínimos se puede usar para vender prácticamente lo que quieras. Aquí te dejo una documentación detallada, pero sin demasiada formalidad, para que te resulte fácil arrancar y entender qué funcionalidades trae el proyecto.

## Índice

- [Spring-eshop](#spring-eshop)
- [Índice](#índice)
  - [Cómo arrancar la app](#cómo-arrancar-la-app)
  - [Tecnologías](#tecnologías)
  - [Funciones](#funciones)
  - [Base de datos](#base-de-datos)
    - [Partes del proyecto](#partes-del-proyecto)
    - [Home](#home)
    - [Tienda](#tienda)
    - [Carrito de la compra](#carrito-de-la-compra)
    - [Mi cuenta](#mi-cuenta)
    - [ADMIN PORTAL](#admin-portal)
    - [Errores y contacto](#errores-y-contacto)
  - [Dockerización y despliegue](#dockerización-y-despliegue)
  - [Recursos utilizados](#recursos-utilizados)

## Cómo arrancar la app

**Atento:** No modifiques la estructura de carpetas, ya que es clave para que todo funcione correctamente.

1. Importa el proyecto en Eclipse, refresca el workspace y actualiza las dependencias de Maven.
2. Configura el archivo `application.properties` a tu gusto.
3. Asegúrate de que la base de datos MySQL esté en funcionamiento.
4. Ejecuta la aplicación y ¡listo!

**PD:** Las credenciales de administrador por defecto son:  
Usuario: `admin`  
Contraseña: `admin`

## Tecnologías

- Java 8
- Spring Framework (Spring Boot, Spring MVC, Spring Data JPA/Hibernate, Spring Security)
- MySQL
- Thymeleaf
- Bootstrap
- jQuery

## Funciones

(Para más detalles, revisa la sección [Partes del proyecto](#partes-del-proyecto).)

- **Usuarios:** Registro e inicio de sesión con roles definidos.
- **Administrador:** Portal exclusivo para gestionar productos (CRUD).
- **Tienda:** Visualiza todos los productos y usa filtros para encontrar justo lo que buscas (precio, categoría, tamaño, marca, etc.).
- **Compra:** Detalles del producto, añadir al carrito, realizar el pago y confirmar el pedido con dirección de envío e info de pago.
- **Perfil:** Actualiza tus datos personales, revisa tu historial de pedidos y gestiona tu dirección.
- **Diseño responsivo:** Funciona perfectamente tanto en móvil como en escritorio.

## Base de datos

La base de datos incluye estas tablas:

- address
- article
- brand
- cart_item
- category
- hibernate_sequence
- payment
- role
- shipping
- size
- user
- user_order
- user_role

La exportación de la base de datos se encuentra en la carpeta `Database` y se ejecuta automáticamente al arrancar la aplicación. Además, encontrarás documentación extra exportada directamente de phpMyAdmin.

### Partes del proyecto

El proyecto se divide en dos áreas: la de usuario y la de administrador.

#### Área de Usuario

- **Home:** Breve presentación de la tienda con información clave.
- **Tienda:** Sección donde se muestran todos los productos, con filtros para facilitar la búsqueda.
- **Carrito de la compra:** Aquí se guardan los productos que eliges.
- **Mi cuenta:** Donde gestionas tus datos, revisas pedidos y administras tu dirección.

#### Área de Administrador

- **ADMIN PORTAL:** Zona exclusiva para administradores, desde donde se gestiona todo lo relacionado con los productos.

### Home

Una presentación atractiva de la tienda, con información básica y destacada.

![Home](https://github.com/AntonioMartinSosa/ProyectoShoepp_AntonioMartinSosa/blob/main/Capturas/home.png)

### Tienda

La sección de productos, con filtros que te ayudan a encontrar lo que buscas sin complicaciones.

![Tienda](https://github.com/AntonioMartinSosa/ProyectoShoepp_AntonioMartinSosa/blob/main/Capturas/tienda.png)

### Carrito de la compra

Donde se acumulan los productos que has seleccionado para comprar.

![Carrito](https://github.com/AntonioMartinSosa/ProyectoShoepp_AntonioMartinSosa/blob/main/Capturas/carrito.png)

### Mi cuenta

Aquí puedes ver y actualizar tus datos personales, revisar el historial de pedidos y gestionar tu dirección de envío.

![Cuenta](https://github.com/AntonioMartinSosa/ProyectoShoepp_AntonioMartinSosa/blob/main/Capturas/cuenta.png)

### ADMIN PORTAL

Portal exclusivo para administradores, desde donde gestionas todos los productos de la tienda.

![Listar Productos](https://github.com/AntonioMartinSosa/ProyectoShoepp_AntonioMartinSosa/blob/main/Capturas/listarproductos.png)  
![Añadir Productos](https://github.com/AntonioMartinSosa/ProyectoShoepp_AntonioMartinSosa/blob/main/Capturas/a%C3%B1adirproductos.png)

### Errores y contacto

Hasta ahora, la app ha funcionado sin problemas. Si encuentras algún error, tienes sugerencias o simplemente quieres comentar algo, ¡no dudes en contactarme!

- **Correo:** antoniomartinmanzanares2004@gmail.com

## Dockerización y despliegue

El proyecto está completamente dockerizado, lo que facilita su despliegue y permite usar un proxy inverso junto con un dominio propio.  
Para configurar todo, solo tienes que definir las variables necesarias en un archivo `.env` (como las credenciales de la base de datos, la URL del datasource y los datos específicos para el proxy). Con esto, la aplicación se enruta correctamente a través del proxy y se accede mediante tu dominio personalizado.  
Puedes ver el proyecto en acción en:  
[https://anthonyx82.ddns.net/springboot/](https://anthonyx82.ddns.net/springboot/)

## Recursos utilizados

- [Google Imágenes](https://www.google.com)
- [ChatGPT](https://chat.openai.com/)
- [Plantillas HTML](https://plantillashtmlgratis.com/)
- [BootstrapMade](https://bootstrapmade.com/)

Si algún recurso es de tu propiedad y crees que merece mayor reconocimiento, ¡contáctame y lo solucionamos!
