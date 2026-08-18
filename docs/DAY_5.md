# ☕ Day 5: Swagger UI & Interactive API Demo 🪄

## 🎯 Goal
Add interactive browser-based API documentation (Swagger UI) to test and showcase your entire application visually.

---

## 🛠️ Step 1: Add Springdoc Dependency
In `pom.xml`, add the following dependency:

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.5.0</version>
</dependency>
```

*(If using Gradle, add `implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.5.0'`)*

---

## 🚀 Step 2: Run and Test
1. Start your Spring Boot Application.
2. Open your browser and navigate to:
   ```
   http://localhost:8080/swagger-ui.html
   ```

---

## 🎨 Step 3: Interactive Testing Checklist
Use Swagger UI to test all your endpoints visually:
- [ ] `POST /api/customers` -> Create 2 customers
- [ ] `POST /api/coffees` -> Create 3 coffee items
- [ ] `POST /api/orders` -> Create orders linking customers to coffees
- [ ] `GET /api/orders` -> Verify full relationship response
- [ ] `GET /api/coffees/cheap` -> Test custom search query
- [ ] `PUT /api/customers/{id}` -> Update customer data
- [ ] `DELETE /api/orders/{id}` -> Delete an order

---

## 🎉 Congratulations!
You and your friend have built a complete, production-structured Spring Boot micro-project with MySQL, JPA relationships, full CRUD, custom queries, Git branching, and OpenAPI documentation! 🚀
