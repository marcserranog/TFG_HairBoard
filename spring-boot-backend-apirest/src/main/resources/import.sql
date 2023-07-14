/* Populate tabla clientes */

INSERT INTO regiones (id, nombre) VALUES (1, 'Barbería Arenys');
INSERT INTO regiones (id, nombre) VALUES (2, 'Barbería Mataró');
INSERT INTO regiones (id, nombre) VALUES (3, 'Barbería Barcelona - Les Corts');
INSERT INTO regiones (id, nombre) VALUES (4, 'Barbería Barcelona - Plaça Catalunya');
INSERT INTO regiones (id, nombre) VALUES (5, 'Barbería Vilassar de Mar');
INSERT INTO regiones (id, nombre) VALUES (6, 'Barbería Calella');
INSERT INTO regiones (id, nombre) VALUES (7, 'Barbería Sant Celoni');
INSERT INTO regiones (id, nombre) VALUES (8, 'Barbería Cabrera de Mar');

INSERT INTO clientes (region_id, nombre, apellido, email, create_at,hora) VALUES(1, 'Marc', 'Serrano', 'mserrano@gmail.com', '2023-01-01','04:30 PM');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at,hora) VALUES(1, 'Mario', 'Gómez', 'mario.gomez@gmail.com', '2023-01-01','04:30 PM');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at,hora) VALUES(2, 'Ana', 'Pérez', 'ana.perez@gmail.com', '2023-01-02','06:30 PM');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at,hora) VALUES(4, 'Luis', 'Martínez', 'luis.martinez@gmail.com', '2023-01-03','05:30 PM');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at,hora) VALUES(4, 'Laura', 'González', 'laura.gonzalez@gmail.com', '2023-01-04','04:00 PM');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at,hora) VALUES(4, 'María', 'Sánchez', 'maria.sanchez@gmail.com', '2023-02-01','04:30 PM');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at,hora) VALUES(3, 'Pedro', 'Romero', 'pedro.romero@gmail.com', '2023-02-10','10:30 AM');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at,hora) VALUES(3, 'Elena', 'López', 'elena.lopez@gmail.com', '2023-02-18','07:30 PM');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at,hora) VALUES(3, 'Carlos', 'García', 'carlos.garcia@gmail.com', '2023-02-28','06:00 PM');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at,hora) VALUES(3, 'Sofía', 'Hernández', 'sofia.hernandez@gmail.com', '2023-03-03','11:30 AM');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at,hora) VALUES(5, 'Julia', 'Luna', 'julia.luna@gmail.com', '2023-03-04','11:00 AM');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at,hora) VALUES(6, 'Diego', 'Ríos', 'diego.rios@gmail.com', '2023-03-05','12:00 AM');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at,hora) VALUES(7, 'Valeria', 'Díaz', 'valeria.diaz@gmail.com', '2023-03-06','13:30 AM');

/* Creamos algunos usuarios con sus roles */
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('marc','$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq',1, 'Marc', 'Serrano','mserrano@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK',1, 'John', 'Doe','jhon.doe@gmail.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);

/* Populate tabla productos */
INSERT INTO productos (nombre, precio, create_at) VALUES('Corte de Pelo', 15, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Arreglo de Barba Tradicional', 7, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Arreglo de Barba Express', 5, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Corte de Pelo + Arreglo Barba Tradicional', 18, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Corte de Pelo + Arreglo Barba Express', 17, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Afeitado', 3, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Peinar', 3, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Tinte Cabello', 20, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Mechas', 18, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Masaje relajante Facial (10 min)', 10, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Tratamiento Anticaída', 23, NOW());


/* Creamos algunas facturas */
INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura de un corte de Pelo', null, 1, NOW());

INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(2, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura Corte de Pelo + Barba', 'Alguna nota importante!', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(3, 2, 6);