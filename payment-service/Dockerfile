# Usando a imagem base OpenJDK 17
FROM openjdk:17-alpine

# Definindo a variável para o arquivo .jar
ARG JAR_FILE=target/*.jar

# Copiando o arquivo .jar gerado para o contêiner
COPY ${JAR_FILE} app.jar

# Comando para executar o arquivo .jar
ENTRYPOINT ["java", "-jar", "/app.jar"]