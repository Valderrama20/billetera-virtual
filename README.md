# 💳 Proyecto: Mi Billetera Virtual (Aprendiendo Spring Boot)

Este proyecto representa mucho más que una simple aplicación; ha sido mi viaje de descubrimiento por el ecosistema de **Spring Boot**. Como apasionado del backend y la lógica de negocio, decidí dar un paso adelante y sumergirme en el desarrollo profesional con Spring para construir bases sólidas y escalables. 🚀

## 🌟 El Viaje del Aprendizaje

Una vez que dominé los conceptos fundamentales, me propuse un reto ambicioso: crear una **Billetera Virtual** (sí, ¡un poco loco para empezar, lo sé! 😄). 

Inicialmente, seguí la arquitectura por capas tradicional que aprendí en los tutoriales, pero sentía que algo faltaba para que el proyecto fuera verdaderamente robusto. Comencé a investigar sobre la **arquitectura hexagonal**, tratando de encontrarle sentido a través de videos y guías, pero aún no lograba aterrizar los conceptos.

Todo cambió cuando consulté a mi tutor y maestro, **Sergio**. Su respuesta fue iluminadora: me explicó que, aunque la arquitectura hexagonal es muy utilizada, en ciertos contextos de evolución rápida se puede optar por enfoques más modernos como **Clean Architecture**. Desde ese momento, reorienté mi aventura hacia estos principios de diseño. 💡

Aunque el proyecto no esté terminado en su totalidad, el valor de lo aprendido en el camino es incalculable. Espero seguir enriqueciendo este repositorio con la sabiduría compartida en clase.

---

## 🏗️ Estructura del Proyecto

El proyecto sigue principios de **Clean Architecture**, organizando el código en capas bien definidas para asegurar la separación de responsabilidades y la mantenibilidad.

### 📂 Organización de Carpetas (`src/main/java/billeteraVirtual`)

```text
billeteraVirtual/
├── 📗 domain/                # El corazón del negocio
│   ├── entities/            # Entidades de negocio (User, Account, Transaction)
│   ├── enums/               # Tipos definidos (Currency, Status, Roles)
│   └── interfaces/          # Contratos y lógica de validación
├── 📘 application/           # Casos de uso y lógica de la aplicación
├── 📙 infrastructure/        # Implementaciones técnicas (Persistencia, Configuración)
├── 📒 presentation/          # Punto de entrada (Controllers, DTOs, Mappers)
└── 🚀 BilleteraVirtualApplication.java
```

## 🛠️ ¿Qué se ha creado hasta ahora?

Actualmente, el proyecto cuenta con los cimientos sólidos de una billetera digital:

*   **Gestión de Usuarios (`User`)**: Entidad robusta para el manejo de perfiles y roles.
*   **Cuentas Bancarias Virtuales (`Account`)**: Soporte para múltiples divisas (`ARS`, `USD`) y gestión de saldos.
*   **Sistema de Transacciones (`Transaction`)**: Registro de movimientos, tipos de operación (Depósito, Transferencia) y estados de transacción.
*   **Arquitectura Desacoplada**: Implementación de DTOs y Mappers para una comunicación limpia entre capas.

---

## 🧠 En este camino aprendí diversas cosas como:

### 1. Fundamentos de Spring Boot 🍃
- **Anotaciones Esenciales**: Uso de `@SpringBootApplication`, `@RestController`, y `@RequestMapping`.
- **Mapeos HTTP**: Implementación de endpoints profesionales con verbos estandarizados.
- **Inyección de Dependencias (IoC)**: Manejo inteligente de beans y desacoplamiento.

### 2. Diseño de APIs y Estándares 🌐
- **Protocolo HTTP**: Manejo correcto de códigos de estado y respuestas ricas con `ResponseEntity`.
- **RESTful Design**: Convenciones de URI/URL y versionado de servicios.
- **Serialización con Jackson**: Dominio del intercambio de datos en formato JSON.

### 3. Arquitectura y Código Limpio ✨
- **Programación Orientada a Interfaces**: Flexibilidad y facilidad de testing.
- **Capa de Servicios**: Lógica de negocio centralizada y limpia.
- **Evolución Arquitectónica**: Del modelo de capas a **Clean Architecture**.

### 4. Herramientas de Desarrollo 🛠️
- **Spring Initializr**: Configuración ágil de proyectos.
- **Maven**: Gestión profesional del ciclo de vida del software.

---
*Este proyecto es una muestra de perseverancia y curiosidad técnica. ¡Seguimos avanzando!* 🚀
