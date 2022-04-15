# Spring-boot 入門

https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/

## web　(spring-boot-starter-web)

## web flux (reactive) spring-boot-starter-webflux

# web client
## RestTemplate

## WebClient (reactive ではこちら)

## Security

## Session


# Redis, Postgre SQL
```
$ docker-compose up -d
$ docker-compose down
```

## Redis
```

```

## Postgres
```
$ docker exec -it 435933d179da sh
# psql -U postgres
postgres=# \l
                                 List of databases
   Name    |  Owner   | Encoding |  Collate   |   Ctype    |   Access privileges   
-----------+----------+----------+------------+------------+-----------------------
 postgres  | postgres | UTF8     | en_US.utf8 | en_US.utf8 | 
 template0 | postgres | UTF8     | en_US.utf8 | en_US.utf8 | =c/postgres          +
           |          |          |            |            | postgres=CTc/postgres
 template1 | postgres | UTF8     | en_US.utf8 | en_US.utf8 | =c/postgres          +
           |          |          |            |            | postgres=CTc/postgres
(3 rows)
```

## Ubuntu 20.04
作業用に psql と redis cli を入れたubuntu
