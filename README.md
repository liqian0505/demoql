# demoql

## How to run

#### Db file

Put the data file somewhere, say ~/data.mv.db

#### Change application properities

Change the line of the location of the data file

```
spring.datasource.url=jdbc:h2:file:~/data
```

#### Run

```
mvn spring-boot:run
```

#### Query

Use postman or [graphiql](https://www.electronjs.org/apps/graphiql) to post the query

``` graphql
{
  findAllContracts{
    contractId
    client{
      clientName
    }
  }
}
```