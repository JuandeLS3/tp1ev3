# tp1ev3
Trabajo práctico realizado para el módulo profesional Entornos de desarrollo, en el cual se procede a realizar testing de dos clases en java mediante el framework JUnit.

##Para compilar: 

Se debe ejecutar en la linea de comandos la siguiente sentencia:javac -cp /home/alumnado/jarjunit/*:.  *.java
La ruta "" indica en que carpeta busca el sistema el jar de junit. Por otro lado, el asterisco hace que podamos compilar todas las clases de un solo movimiento, aunque esto tiene un inconveniente, y es que si la compilación da error puede que cueste un poco más ver donde está el fallo. 

##Para ejecutar:

Ejecutamos la siguiente sentencia: java -cp /home/alumnado/jarjunit/*:. org.junit.runner.JUnitCore JunitTestSuite

Una vez ha realizado esto, se ejecutarán los test.

