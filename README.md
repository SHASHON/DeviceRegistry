# Реестр техники
    Проект был сделан в рамках тестового задания на должность Java Backend разработчика

## Технические требования

•	Язык программирования: Java 8;

•	Frameworks: Spring Boot Starter, Spring Web, Spring JPA, Spring Hibernate;

•	База данных: Postgres SQL;

•	Библиотека для генерации документации: springdoc-openapi v1.5.9.

## Установка

1. Сохраните проект в каталог на локальной машине.
2. Создайте базу данных в pgAdmin4 с именем "DeviceRegistry".
3. Нажмите правой кнопкой мыши на только что созданную базу данных и в появившемся списке выберите (Restore...). В появившемся окне в поле (Filename) выберите лежащую в каталоге (database) базу данных с именем "db_registry.sql" и нажмите кнопку (Restore). База данных восстановится из дампа.
4. Измените настройки в файле application.properties:

    spring.datasource.url=jdbc:postgresql://localhost:{свой_порт}/DeviceRegistry

    spring.datasource.username={имя_пользователя}

    spring.datasource.password={пароль}
5. Запустите проект, нажав (Run, если работате в IntelliJ IDEA), после чего в браузере откройте:
   http://localhost:8080/swagger-ui/index.html
