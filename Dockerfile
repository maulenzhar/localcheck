# Используем официальное изображение OpenJDK для контейнера
FROM eclipse-temurin:17-jre-alpine

# Указываем рабочую директорию
WORKDIR /app

# Копируем артефакт JAR в контейнер
COPY target/demo-0.0.1-SNAPSHOT.jar demo.jar

# Открываем порт для приложения
EXPOSE 9090

# Запускаем приложение
ENTRYPOINT ["java", "-jar", "demo.jar"]
