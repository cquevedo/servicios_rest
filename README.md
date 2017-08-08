# Servicios Rest
Proyecto Basico Servicio Rest

# Instalacion de artefacto Java en maven 
#### Ejecutar el siguiente comando: 
mvn install:install-file -DgroupId=[groupId] -DartifactId=[artefactId] -Dversion=[version] -Dpackaging=jar -Dfile=[ruta JAR] -DgeneratePom=true
#### Ejemplo:
mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc7 -Dversion=12.1.0.1 -Dpackaging=jar -Dfile=ojdbc7.jar -DgeneratePom=true
