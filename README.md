# Proyecto de Pruebas Automatizadas e Integración Continua

## Objetivo

Este proyecto demuestra la implementación de un flujo básico de integración continua en Java.

Se utiliza Git para el control de versiones, Maven para la gestión de dependencias y JUnit para la ejecución de pruebas unitarias automatizadas. Además, se utiliza GitHub Actions para compilar y ejecutar las pruebas automáticamente en cada cambio enviado al repositorio.

---

## Tecnologías utilizadas

* Java
* Maven
* JUnit 5
* Git
* GitHub
* GitHub Actions

---

## Estructura del proyecto

* src/main/java: contiene el código principal de la aplicación.
* src/test/java: contiene las pruebas unitarias.
* pom.xml: configura Maven y las dependencias del proyecto.
* .gitignore: define los archivos que no serán incluidos en Git.
* .github/workflows/ci.yml: contiene la configuración del pipeline de integración continua.

---

## Archivos principales

### Calculadora.java

Contiene las operaciones principales de la aplicación:

* Sumar dos números.
* Restar dos números.

### CalculadoraTest.java

Contiene las pruebas unitarias para verificar el correcto funcionamiento de las operaciones de suma y resta.

### pom.xml

Configura el proyecto Maven e incorpora JUnit como dependencia para las pruebas automatizadas.

---

## Comandos utilizados

### Verificar herramientas instaladas

java -version
mvn -version
git --version

### Inicializar el repositorio

git init
git status

### Crear y utilizar una rama

git branch feature/calculadora
git switch feature/calculadora

### Realizar un commit

git add .
git commit -m "mensaje descriptivo"

### Visualizar el historial

git log --oneline --graph --all

### Ejecutar las pruebas

mvn test


---

## Pruebas automatizadas

El proyecto incluye dos pruebas unitarias:

1. Verificación de la operación de suma.
2. Verificación de la operación de resta.

Las pruebas son atómicas e independientes, ya que cada una verifica una funcionalidad específica sin depender de la ejecución de la otra.

---

## Pipeline de Integración Continua

El pipeline está definido en:

.github/workflows/ci.yml

El pipeline se ejecuta automáticamente ante un:

* push a la rama main.
* pull request hacia la rama main.

El proceso realiza las siguientes acciones:

1. Obtiene el código del repositorio.
2. Configura el entorno de Java.
3. Ejecuta la compilación y las pruebas mediante Maven.
4. Genera y publica los resultados de las pruebas como un artefacto.

El comando principal ejecutado por el pipeline es:

mvn test

Los reportes generados por Maven se encuentran en:

target/surefire-reports/

---

## Ejecución local

Para ejecutar el proyecto localmente, abrir una terminal en la carpeta raíz y ejecutar:

mvn test

Si las pruebas se ejecutan correctamente, Maven mostrará un resultado exitoso sin errores ni fallos.

---

## Control de versiones

Durante el desarrollo se utiliza Git para registrar los cambios realizados en el proyecto.

Se recomienda realizar commits frecuentes y utilizar mensajes descriptivos, por ejemplo:

feat: agregar operaciones de suma y resta
test: agregar pruebas unitarias
chore: agregar archivo gitignore
docs: actualizar documentacion del proyecto
