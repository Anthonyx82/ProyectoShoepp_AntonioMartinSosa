# Spring-eshop

Tienda de comercio electronico de zapatillas, aunque cambiando los productos podria usarse para cualquier otra tienda a continuacion se pasa a hacer una pequeña documentacion del proyecto

# Indice

- [Spring-eshop](#spring-eshop)
- [Indice](#indice)
  - [Como ejecutar](#como-ejecutar)
  - [Tecnologias:](#tecnologias)
  - [Funciones:](#funciones)
  - [Base de datos](#base-de-datos)
    - [Partes del proyecto](#partes-del-proyecto)
    - [Home](#home)
    - [Tienda](#tienda)
    - [Carrito de la compra](#carrito-de-la-compra)
    - [Mi cuenta](#mi-cuenta)
    - [ADMIN PORTAL](#admin-portal)
    - [Errores y Contacto con el autor](#errores-y-contacto-con-el-autor)
    - [Recursos utilizados](#recursos-utilizados)

## Como ejecutar

**NOTA:** no cambiar la estructura de directorios para el correcto funcionamiento del programa
1. Importar el proyecto a eclipse, refrescar eclipse y actualizar dependencias de maven
2. Configurar el fichero `aplication.properties`
3. Arrancar base de datos mysql
4. Ejecutar el programa y disfrutar

**PD:** por defecto las credenciales para entrar como administrador es: `admin` `admin` 

## Tecnologias:
- Java 8
- Spring framework (Sping boot, Spring MVC, Spring Data JPA/Hibernate, Spring Security)
- MySQL
- Thymeleaf
- Bootstrap
- jQuery

## Funciones:

Se especifica con mas desarrollo en [partes del proyecto](#partes-del-proyecto)

- Registro/inicio de sesión de usuarios con autorización basada en roles.
- Portal de administrador para operaciones CRUD en productos (solo accesible por usuarios administradores).
- Tienda: mostrar todos los productos, filtrar productos por precio, categoría, tamaño o marca, ordenar resultados por diferentes criterios o filtrar por entrada de búsqueda.
- Compra: ver detalles del producto, agregar al carrito de compras, realizar el pago, realizar el pedido con dirección de envío e información de pago.
- Crear y editar perfil de usuario, ver historial de pedidos.
Diseño receptivo.

## Base de datos

La base de datos contienen las siguientes tablas:
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

*La exportacion de la base de datos se encuentra en la carpeta `Database` y se ejecuta de forma automatica al arrancar el programa, en esta carpeta tambien se encuentra mas documentacion sobre la base de datos exportada directamente de phpMyAdmin*

### Partes del proyecto

La aplicacion se devide en varias partes, generalmente 2 (usuario y admin)
En la parte del usuario tenemos lo siguiente:
- [Home](#home)
- [Tienda](#tienda)
- [Carrito de la compra](#carrito-de-la-compra)
- [Mi cuenta](#mi-cuenta)

Y en la parte del admin tenemos lo siguiente:
- [ADMIN PORTAL](#admin-portal)
- [PRODUCTOS](#productos)

### Home

Pequeña presentacion a la tienda con un poco de informacion sobre la misma

![Home](https://github.com/AntonioMartinSosa/ProyectoShoepp_AntonioMartinSosa/blob/main/Capturas/home.png)

### Tienda

Aqui se van a concentrar todos los productos añadidos por el administrador, con varios filtros para que el cliente pueda encontrar segun sus intereses

![Tienda](https://github.com/AntonioMartinSosa/ProyectoShoepp_AntonioMartinSosa/blob/main/Capturas/tienda.png)

### Carrito de la compra

Aqui estaran todos los productos que el usuario a querido añadir
![Carrito](https://github.com/AntonioMartinSosa/ProyectoShoepp_AntonioMartinSosa/blob/main/Capturas/carrito.png)

### Mi cuenta

Informacion de la cuenta con los datos del usuario los cuales puede actualizar asi como revias informacion de sus pedidos y su direccion predeterminada
![Cuenta](https://github.com/AntonioMartinSosa/ProyectoShoepp_AntonioMartinSosa/blob/main/Capturas/cuenta.png)

### ADMIN PORTAL

Portal para usuarios con rol de administradores en el cual gestionar los productos que se van a vender desde la navbar en el boton de menu PRODUCTOS
![LISTARPRODUCTOS](https://github.com/AntonioMartinSosa/ProyectoShoepp_AntonioMartinSosa/blob/main/Capturas/listarproductos.png)
![AÑADIRPRODUCTOS](https://github.com/AntonioMartinSosa/ProyectoShoepp_AntonioMartinSosa/blob/main/Capturas/a%C3%B1adirproductos.png)

### Errores y Contacto con el autor

A dia de hoy no se a detectado ningun error en la app, igualmente cualquier error, problema, peticion o consejo estaria super agradecido de escucharlo, podras contactarme por mi mail:
- alumno01_smr1_20@iescastelar.com

### Recursos utilizados

- [Google imagenes](https://www.google.com)
- [ChatGpt](https://chat.openai.com/)
- [plantillashtml](https://plantillashtmlgratis.com/)
- [bootstrapmade](https://bootstrapmade.com/)
  
*Si algun recurso es de su propiedad y usted cree que no tiene la representacion que merece puede contactarme y se le ofrecera una solucion*
