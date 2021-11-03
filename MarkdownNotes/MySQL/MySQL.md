# MySQL

## 

* sql 脚本

> sql 脚本文件以 .sql 后缀结尾，文件中有大量 SQL 语句。在 MySQL 中可以通过 source 命令执行。

## 数据库常用命令

* 1.登录 mysql 数据库管理系统

> `mysql -uroot -p`

* 2.查看现有数据库列表

> `show databases;`

* 3.创建数据库

> `create database <database name>;`

* 4.使用数据库 

> `use <database name>;`

* 5.查看当前数据库中的表 

> `show tables`

* 6.初始化数据 

> `source D:\xx\xxx\x\xx\x.sql;`

* 7.删除数据库 

> `drop database <database name>;`

* 8.查看表结构

> `desc <table name>;`

* 9.查询当前使用的数据库 

> `select database();`

* 10.查看 mysql 版本号

> `select version();`

* 11.结束一条语句 

> `\c`

* 12.退出 MySQL

> `\q`、`QUIT`或`EXIT`

* 13.查看其他库中的表

> `show tables from <database name>;`

* 14.查看创建表的语句 

> `show create table <table name>;`

## 查询语句

* 简单的查询语句

> `select 字段名1,字段名2,字段名3,.... from <table name>;`

* 查询全部字段

> `select * from <database name>;`

* 条件查询

> `select 字段名1,字段名2,字段名3,.... from <table name> where
 条件;`

* 条件运算符

> `=` | `<>` 或 	`!=` | `<` | `<=` | `>` | `>=` | `between...and...` | `is null` | `and` | `or` | `in` | `not` | `not` | `like` 

## 排序

* 升序/降序排列

> `select 字段名1,字段名2,字段名3,.... from <table name> order by asc/desc;`

## 分组函数

* 通常和 group by 联合使用，任何一个分组函数都是在 group by 语句执行结束之后才会执行的。分组函数不可直接用在 where 子句当中。

* count

> 自动忽略NULL

* sum 

> 自动忽略NULL

* avg

* max

* min 

## group by 和 having 

* having 与 group by 搭配使用。

## 结果去重

* distinct 关键字去重

> `select distinct 字段名1,字段名2,字段名3,.... from <table name>;`

## 连接查询

### 內连接

#### 等值连接

* 条件是等量关系
* `select distinct 字段名1,字段名2,字段名3,.... from <table name> join <table name> on 条件;`

#### 非等值连接

* 条件是非等值关系

#### 自连接

* 自己连接自己

### 外连接

* 主表的数据无条件的全部查询出来

#### 左连接

#### 右连接 

### union

### limit

* limit 是 mysql 中特有的，其他数据库中没有，不通用。

* 语法

> `limit startIndex, length`

## 创建表

> 

## insert 插入语句

> 

## 表的复制

> `create <table name> as select语句`

## update

> `update <table name> set 字段名1,字段名2,字段名3... where 条件`

## 删除数据

> `delete from <table name> where 条件;`

> 删除大表：`truncate table <table name>;`

## 约束

* 在创建表的时候，可以给表的字段添加相应的约束，添加约束的目的是为了保证表中数据的合法性、有效性、完整性。

### 非空约束（not null）

> 

### 唯一性约束（unique）

> 

### 主键约束（primary key）

### 外键约束（foreign key）

### 检查约束（check）

## 事务

## 索引
   
## 视图

## 数据库设计三范式

### 1.任何一张表都应该有主键，并且每一个字段原子性不可再分。

### 2.所有非主键字段完全依赖主键，不能产生部分依赖。

### 3.所有非主键字段直接依赖主键，不能产生传递依赖。