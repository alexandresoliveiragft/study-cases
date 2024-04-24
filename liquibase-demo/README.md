# Study Case

## Liquibase

### Resume

This project is a test for functions in liquibase and liquibase-maven-plugin.

### Requirements

Is necessary to use docker for up postgresql database.

See the ***docker-compose*** in ***./devops*** folder.

### How can run in terminal using plugin?

- Run update

    ```shell
    $ mvn liquibase:update \
          -Dliquibase.changeLogFile=src/main/resources/db/changelog/liquibase-demo-db-changeLog.xml \
          -Dliquibase.url=jdbc:postgresql://localhost:5432/liquibase-demo-db \
          -Dliquibase.username=dev \
          -Dliquibase.password=
    ```
  
- Run rollback

    ***-Dliquibase.rollbackCount:*** Number of rows to execute

    ```shell
    $ mvn liquibase:rollback \
          -Dliquibase.rollbackCount=1 \
          -Dliquibase.changeLogFile=src/main/resources/db/changelog/liquibase-demo-db-changeLog.xml \
          -Dliquibase.url=jdbc:postgresql://localhost:5432/liquibase-demo-db \
          -Dliquibase.username=dev \
          -Dliquibase.password=
    ```

### Documentation

See [liquibase docs](https://docs.liquibase.com/home.html) for more details.