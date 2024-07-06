
# Kapeta Readme
This file contains some structural information about this service.

This file will be overwritten every time you change the service definition in Kapeta.

## Structure
This service is structured as follows:
* ```src/generated```: Contains generated code that shouldn't be edited directly
* ```src/main```: Contains your own and generated code that you can and should edit

In the sub folder structure you'll find the following:
* ```src/generated/java/com/kapeta/everything/repositories```: Contains anything related to databases
* ```src/generated/java/com/kapeta/everything/dto```: Contains the entities used by the service.
  * These are generated files and should not be edited directly
* ```src/generated/java/com/kapeta/everything/rest```: Contains the REST API routes.
* ```src/generated/java/com/kapeta/everything/service```: Contains the REST interfaces.
  * These are generated files and should not be edited directly
* ```src/main/java/com/kapeta/everything/service```: Contains the service layer logic. This is where you should add your business logic

## REST API 
To edit the REST API handlers edit the services found here:
[src/main/java/com/kapeta/everything/service](src/main/java/com/kapeta/everything/service/)

The REST layer itself is generated for you - so your service
will be called as specified within the REST API definition in Kapeta.

You just need to worry about the logic.

The service files will only be generated if they don't already exist - or if they have not
changed since the last time they were generated.

## Postgres: customers
To use the "customers" Postgres database - simply create Spring 
repositories in this package:
```com.kapeta.everything.repositories.customers```

### Schema changes
This service uses Flyway to manage the database schema and migrations.

To add a new migration simply create a new file in the following folder:
```src/main/resources/db/migrations/customers```

The file name should be in the following format:
```<prefix><version>__<description>.<type>```

For example:  
```V1_0__my_migration.sql```

See the Flyway documentation for more information:
1. Naming pattern: https://www.red-gate.com/blog/database-devops/flyway-naming-patterns-matter
2. Migrations: https://documentation.red-gate.com/fd/migrations-184127470.html

Migrations will be applied automatically when the service starts.



