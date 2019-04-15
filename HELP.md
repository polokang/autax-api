# API :

1.  [post] /users/add

- `{"user":{"name": "nihao","age": "11"}}`

2.  [get] /users/1
3.  [get] /sendmail

- `{"email":{"m_to":"polokang@163.com","m_subject":"邮件测试标题","m_content":"邮件测试内容","m_token":"testxxx"}}`

### website: https://www.auselection.com/autax-api

### local: http://localhost:8080

# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

### Guides

The following guides illustrate how to use some features concretely:

- [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

#Fix

1.  com.fasterxml.jackson.databind.exc.InvalidDefinitionException

**[解决]只需要在实体类上添加如下注解即可:`@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })`**

_[原因]因为 jsonplugin 用的是 java 的内审机制.hibernate 会给被管理的 pojo 加入一个 hibernateLazyInitializer 属性,jsonplugin 会把 hibernateLazyInitializer 也拿出来操作,并读取里面一个不能被反射操作的属性就产生了这个异常._

2. JPA 主键自增策略
   `@Id @GeneratedValue(strategy=GenerationType.IDENTITY) public int getId() { return id; }`

   - JPA 提供的四种标准用法为 TABLE、SEQUENCE、IDENTITY、AUTO。
     TABLE：使用一个特定的数据库表格来保存主键。
     SEQUENCE：根据底层数据库的序列来生成主键，条件是数据库支持序列。
     IDENTITY：主键由数据库自动生成（主要是自动增长型）。
     AUTO：主键由程序控制。
   - IDENTITY:
     使用 SQL Server 和 MySQL 的自增字段，这个方法不能放到 Oracle 中，因为 Oracle 不支持自增字段，要设定 sequence（MySQL 和 SQL Server 中很常用）。
     同时，也可采用 uuid、native 等其它策略。(自行百度)
   - IDENTITY 方式在使用的时候，MySQL 数据库的表 id 字段必须设为自增（Auto Increment）
   - AUTO 方式会在数据库中新建一张 hibernate_squence 的表，制定自增的方式。

3. 在 service 层新增 MailService 类，项目启动后找不到该对象。

   - 在该类上增加注入 @Component 即可