# Java-Backend-1

## S1E1 

### Revisar plugins
```bash
gradle tasks
```

### Compilar proyecto
```bash
gradle build
```

### Agregar clase principal
```groovy
jar {
    manifest{
        attributes 'Main-Class': 'HelloWorldExample'
    }
}
```

### Ejecutar jar
```bash
java -jar archivo.jar
```