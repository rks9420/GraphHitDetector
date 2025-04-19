# AreaHitChecker - Веб-приложение для проверки попадания точек в область

## Описание
**AreaHitChecker** - это full-stack веб-приложение для проверки попадания точек в заданную область на координатной плоскости. Проект включает:

- **Бэкенд**: Java EE с EJB, JPA (Hibernate) и REST API
- **Фронтенд**: React + Redux с компонентами PrimeReact
- **Аутентификацию**: Защищенный доступ на основе JWT
- **Базу данных**: PostgreSQL для хранения данных
- **Адаптивный дизайн**: Поддержка десктопов, планшетов и мобильных устройств

## Интерфейс системы

### Страница входа
![Главная панель](docs/image/homepage.jpg)

### Главная страница
![Архивация журналов](docs/image/mainpage.jpg)

### Формы входа, выхода и смены пароля
| Вход                                      | Регистрация                                        | 
|-------------------------------------------|----------------------------------------------------|
| ![Форма входа](docs/image/login_form.jpg) | ![Форма регистрации](docs/image/register_form.jpg) |


## Технологии

### Бэкенд
| Технология    | Назначение |
|---------------|---------|
| Java EE 9     | Фреймворк для enterprise-приложений |
| EJB           | Компоненты бизнес-логики |
| JPA/Hibernate | ORM для работы с БД |
| RESTEasy      | RESTful веб-сервисы |
| PostgreSQL    | Основная база данных |
| JWT           | Аутентификация и авторизация |

### Фронтенд
| Технология | Назначение |
|------------|---------|
| React 18 | Библиотека для интерфейсов |
| Redux Toolkit | Управление состоянием |
| PrimeReact | Библиотека UI-компонентов |
| Axios | HTTP-клиент |
| Vite | Сборка фронтенда |

## Структура проекта

```
lab4_back/
├── front/                   # Фронтенд на React
│   ├── src/
│   │   ├── api/             # API-сервисы
│   │   ├── components/      # React-компоненты
│   │   ├── hook/            # Кастомные хуки
│   │   ├── slice/           # Redux-слайсы
│   │   └── store.js         # Redux-хранилище
├── src/main/java/com/web/lab4_back/
│   ├── controller/          # REST-контроллеры
│   ├── dao/                 # Доступ к данным
│   ├── dto/                 # DTO-объекты
│   ├── entity/              # JPA-сущности
│   ├── exception/           # Кастомные исключения
│   ├── filter/              # HTTP-фильтры
│   ├── service/             # Бизнес-логика
│   └── util/                # Утилиты
├── src/main/resources/      # Конфигурационные файлы
├── pom.xml                  # Maven-конфигурация
└── docker-compose.yml       # Docker-конфигурация
```

## Основные функции

1. **Проверка координат**
    - Графический интерфейс для выбора точек
    - Математическая проверка попадания
    - История результатов

2. **Аутентификация**
    - Безопасный вход/выход на JWT
    - Хеширование паролей
    - Обновление токенов

3. **Адаптивный интерфейс**
    - Поддержка разных устройств
    - Интерактивная координатная плоскость
    - Таблица результатов с фильтрацией

Вот исправленный README.md с учетом ваших требований к WildFly 34.0.1.Final и настройке PostgreSQL:

## Запуск проекта

### Требования
- JDK 17+
- Node.js 16+
- Docker 20+
- PostgreSQL 14+
- WildFly 34.0.1.Final

### Настройка WildFly

1. Установите драйвер PostgreSQL в WildFly:
   - Создайте директорию: `wildfly-34.0.1.Final/modules/org/postgresql/main`
   - Поместите в нее файл `module.xml` с содержимым:
     ```xml
     <?xml version="1.0" ?>
     <module xmlns="urn:jboss:module:1.5" name="org.postgresql">
         <resources>
             <resource-root path="postgresql-42.7.5.jar"/>
         </resources>
         <dependencies>
             <module name="javax.api"/>
             <module name="jakarta.transaction.api"/>
         </dependencies>
     </module>
     ```
   - Загрузите [postgresql-42.7.5.jar](https://jdbc.postgresql.org/download/postgresql-42.7.5.jar) и поместите в ту же директорию

2. Настройте datasource в `standalone.xml`:
   ```xml
   <subsystem xmlns="urn:jboss:domain:datasources:7.2">
       <datasources>
           <other-data-sources>
            ...
           </other-data-sources>
   
           <datasource jndi-name="java:/PostgresDS" pool-name="PostgresDS">
               <connection-url>jdbc:postgresql://localhost:5432/mydatabase</connection-url>
               <driver-class>org.postgresql.Driver</driver-class>
               <driver>postgresql</driver>
               <security user-name="myuser" password="mypassword"/>
               <validation>
                   <valid-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.postgres.PostgreSQLValidConnectionChecker"/>
                   <validate-on-match>true</validate-on-match>
                   <exception-sorter class-name="org.jboss.jca.adapters.jdbc.extensions.postgres.PostgreSQLExceptionSorter"/>
               </validation>
           </datasource>
           <drivers>
               <other-drivers>
               ...
               </other-drivers>
   
               <driver name="postgresql" module="org.postgresql">
                   <driver-class>org.postgresql.Driver</driver-class>
               </driver>
           </drivers>
       </datasources>
   </subsystem>
   ```

### Доступ
- Фронтенд: `http://localhost:5173`
- Бэкенд: `http://localhost:8080/your-war-name-1.0-SNAPSHOT/api`

## 📝 Лицензия
Проект распространяется под лицензией MIT.