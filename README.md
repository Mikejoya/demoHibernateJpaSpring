# demoHibernateJpaSpring

Este proyecto es una aplicación de ejemplo desarrollada en Java utilizando Spring Boot, JPA (Hibernate), Docker y PostgreSQL. Su objetivo es servir como práctica y referencia para la integración de estas tecnologías en aplicaciones modernas.

## Tecnologías utilizadas

- **Java 17+**
- **Spring Boot**: Framework para desarrollo rápido de aplicaciones Java.
- **JPA (Hibernate)**: Persistencia de datos y mapeo objeto-relacional.
- **PostgreSQL**: Base de datos relacional de código abierto.
- **Docker**: Contenerización para facilitar el despliegue y desarrollo.

## Características principales

- Arquitectura limpia con separación de capas (controlador, servicio, repositorio).
- CRUD básico utilizando Spring Data JPA.
- Configuración y orquestación de servicios con Docker Compose.
- Persistencia en base de datos PostgreSQL.

## Requisitos previos

- [Java 17+](https://adoptium.net/)
- [Maven 3.6+](https://maven.apache.org/)
- [Docker](https://www.docker.com/) y [Docker Compose](https://docs.docker.com/compose/)

## Ejecución rápida con Docker

```bash
# Clona el repositorio
git clone https://github.com/Mikejoya/demoHibernateJpaSpring.git
cd demoHibernateJpaSpring

# Inicia la aplicación y la base de datos
docker-compose up --build
```

La aplicación estará disponible en `http://localhost:8080` y la base de datos en el puerto `5432`.

## Ejecución local (sin Docker)

1. Asegúrate de tener una instancia de PostgreSQL corriendo y actualiza la configuración en `src/main/resources/application.properties`.
2. Compila y ejecuta la aplicación:

```bash
mvn spring-boot:run
```

## Estructura del proyecto

```
demoHibernateJpaSpring/
├── src/
│   └── main/
│       ├── java/
│       └── resources/
├── docker-compose.yml
├── Dockerfile
└── README.md
```

## Configuración de la base de datos

El archivo `docker-compose.yml` contiene los parámetros necesarios para levantar tanto la aplicación como PostgreSQL. Los datos de acceso por defecto son:

- **Usuario:** postgres
- **Contraseña:** postgres
- **Base de datos:** demo_db

## Endpoints de ejemplo

Puedes probar los endpoints CRUD utilizando herramientas como [Postman](https://www.postman.com/) o `curl`. (Agrega aquí ejemplos si tienes endpoints definidos).

## Licencia

MIT

---

> Proyecto creado por [Mikejoya](https://github.com/Mikejoya) para prácticas de integración Java + Spring Boot + JPA + Docker + PostgreSQL.
