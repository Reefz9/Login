# Proyecto de Pruebas Automatizadas, BDD e Integración Continua

Proyecto académico que implementa pruebas automatizadas para una funcionalidad de **inicio de sesión**, integrando pruebas unitarias, BDD, pruebas de performance e integración continua.

## Tecnologías

* Java 26
* Maven
* JUnit 5
* Cucumber
* Gherkin
* Git
* GitHub Actions

## Funcionalidad

El proyecto implementa un servicio de autenticación que valida un usuario y contraseña.

Credenciales utilizadas para las pruebas:

Usuario: admin
Contraseña: 123456

## Pruebas

### Pruebas unitarias

LoginServiceTest.java contiene pruebas para:

* Autenticación con credenciales válidas.
* Contraseña incorrecta.
* Usuario incorrecto.
* Credenciales nulas.

Ejecutar:

mvn test

### Pruebas BDD

Los escenarios se encuentran en:

src/test/resources/features/login.feature

Se implementan:

* Un Scenario para login exitoso.
* Un Scenario Outline para credenciales inválidas.
* Tres ejemplos mediante Examples.

Las definiciones de pasos se encuentran en:

src/test/java/cl/empresa/bdd/LoginSteps.java

## Prueba de performance

LoginPerformanceTest.java realiza múltiples operaciones de autenticación y calcula:

* TPS (Transactions Per Second).
* Latencia promedio.
* Tasa de errores.

Ejecutar:

mvn test -Dtest=LoginPerformanceTest

## Integración continua

El pipeline está definido en:

.github/workflows/ci.yml

Se ejecuta mediante GitHub Actions ante:

* Push a master.
* Pull Request hacia master.

El flujo implementado es:

Pruebas funcionales y BDD
          
Prueba de performance
          
Métricas
          
Quality Gate

## Reporting

El pipeline genera los siguientes artefactos:

* Reporte JUnit.
* Reporte HTML de Cucumber.
* Reporte de performance.

Además, las métricas de performance se muestran en el resumen de GitHub Actions.

## Quality Gate

Se utilizan los siguientes umbrales:

| Métrica         | Umbral |
| --------------- | -----: |
| TPS             | > 1000 |
| Latencia        | < 1 ms |
| Tasa de errores |  < 1 % |

Si los criterios no se cumplen, el Quality Gate provoca el fallo del pipeline.

## Control de versiones

El proyecto utiliza Git para gestionar los cambios y GitHub como repositorio remoto.

Ejemplos de commits:

feat: agregar funcionalidad de login
test: agregar pruebas unitarias
test: agregar escenarios BDD
perf: agregar prueba de rendimiento
ci: configurar pipeline
docs: actualizar README

## Ejecución completa

Para ejecutar todas las pruebas:

mvn clean test

El resultado esperado es:

BUILD SUCCESS
