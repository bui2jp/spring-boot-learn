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
動作確認用にdocker-composeでDBを準備

```
$ docker-compose up -d
$ docker-compose down
```

## Redis
```
```

## Postgres
```
```

## Ubuntu 20.04
作業用に psql と redis cli を入れたubuntu

redis-cli (接続確認)
```
/# redis-cli -h my-redis
my-redis:6379> set mykey01 testvalue01
OK
my-redis:6379> get mykey01
"testvalue01"
```

psql (接続確認)
```
# psql -h my-postgre -U postgres
 ( passwordが必要 )

dbの一覧
postgres=# \l

postgres=# \q
```
