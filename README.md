# Repositorio para practicar Patrones de Diseño y Algoritmos con JAVA 17.

Este repositorio contiene una colección de implementaciones de patrones de diseño y algoritmos en Java. El objetivo del proyecto es explorar cómo utilizar patrones de diseño comunes en diferentes situaciones y mejorar la comprensión de su uso y funcionalidad. A través de este proyecto, se busca mejorar la modularidad, flexibilidad y mantenibilidad del código.

Patrones de Diseño Implementados
A continuación se enumeran los patrones de diseño incluidos en el proyecto, con una breve descripción de cada uno:

# Adapter: 
Convierte la interfaz de una clase en otra interfaz que el cliente espera, permitiendo que clases con interfaces incompatibles trabajen juntas.

# Composite: 
Permite a los clientes tratar objetos individuales y composiciones de objetos de manera uniforme, ideal para estructuras jerárquicas como árboles.

# DAO (Data Access Object): 
Define una interfaz para interactuar con una fuente de datos (en este caso, una base de datos PostgreSQL), separando la lógica de negocios del acceso a los datos.

# Decorator: 
Permite añadir funcionalidades adicionales a un objeto de manera dinámica, sin modificar la clase original.

# Facade: 
Proporciona una interfaz simplificada para un conjunto de interfaces en un subsistema complejo, facilitando la interacción del cliente.

# Observer: 
Define una dependencia uno-a-muchos entre objetos para que cuando uno cambie de estado, todos sus dependientes sean notificados y actualizados automáticamente.

# Proxy: 
Proporciona un sustituto o intermediario para controlar el acceso a un objeto.

# Strategy: 
Permite definir una familia de algoritmos, encapsular cada uno de ellos, y hacerlos intercambiables. Esto permite que el algoritmo varíe independientemente de los clientes que lo utilicen.

/src
│
├── adapter/
├── composite/
├── dao/          # Implementación de DAO con PostgreSQL
├── decorator/
├── facade/
├── observer/
├── proxy/
└── strategy/