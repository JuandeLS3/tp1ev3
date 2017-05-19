# tp2ev3
Segundo trabajo práctico de la tercera evaluación para el módulo de Entornos de desarrollo, en el cual empleamos maven para compilar y para ejecutar los test. Es importante identificar que no existe main alguno en el proyecto, puesto que lo único que lo unico que vamos a ejecutar son los test, y no emplearemos JTestSuite. 

### Para compilar:

Dentro de la carpeta en la que se encuentre nuestro fichero pom.xml debemos ejecutar el siguiente comando maven: 

`$ mvn compile` 

Una vez ejecutado este comando se habrá creado la carpeta target, donde se encontrarán los archivos .class , y todos aquellos .jar que la aplicación necesite para funcionar (en este caso JUnit).

### Para ejecutar:

Tras compilar podemos ejecutar los test con este comando:

`$ mvn test`
