# ☕ Day 1: Base Setup & Individual Entities

## 🎯 Goal
Set up the Spring Boot project, connect to MySQL, and build your assigned entity using the **Controller ➡️ Service ➡️ Repository** architecture.

---

## 🛠️ Base Setup (Done by one member)
1. Go to [start.spring.io](https://start.spring.io) and generate a project with:
   - **Language:** Java
   - **Build:** Maven (or Gradle)
   - **Dependencies:** Spring Web, Spring Data JPA, MySQL Driver
2. Create local database in MySQL:
   ```sql
   CREATE DATABASE cafe_db;
   ```
3. Configure `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/cafe_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
   spring.datasource.username=root
   spring.datasource.password=YOUR_PASSWORD
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```
4. Push initial project to GitHub `main` branch.

---

## 👤 Friend 1 (Branch: `feature/customer`)

### Tasks:
1. **Entity (`model/Customer.java`):**
   - Annotations: `@Entity`, `@Table(name = "customers")`
   - Fields: `id` (Primary key `@Id` with `@GeneratedValue`), `name` (String), `phone` (String).
2. **Repository (`repository/CustomerRepository.java`):**
   - Interface extending `JpaRepository<Customer, Long>`.
3. **Service (`service/CustomerService.java`):**
   - Class annotated with `@Service`.
   - Inject `CustomerRepository`.
   - Methods: `getAllCustomers()`, `saveCustomer(Customer customer)`.
4. **Controller (`controller/CustomerController.java`):**
   - Class annotated with `@RestController`, `@RequestMapping("/api/customers")`.
   - Inject `CustomerService`.
   - Endpoints:
     - `GET /api/customers` -> Call service to get all customers.
     - `POST /api/customers` -> Call service to save a customer.

---

## ☕ Friend 2 (Branch: `feature/coffee`)

### Tasks:
1. **Entity (`model/CoffeeItem.java`):**
   - Annotations: `@Entity`, `@Table(name = "coffee_items")`
   - Fields: `id` (Primary key `@Id` with `@GeneratedValue`), `name` (String), `price` (Double).
2. **Repository (`repository/CoffeeItemRepository.java`):**
   - Interface extending `JpaRepository<CoffeeItem, Long>`.
3. **Service (`service/CoffeeItemService.java`):**
   - Class annotated with `@Service`.
   - Inject `CoffeeItemRepository`.
   - Methods: `getAllCoffeeItems()`, `saveCoffeeItem(CoffeeItem item)`.
4. **Controller (`controller/CoffeeItemController.java`):**
   - Class annotated with `@RestController`, `@RequestMapping("/api/coffees")`.
   - Inject `CoffeeItemService`.
   - Endpoints:
     - `GET /api/coffees` -> Call service to get all coffees.
     - `POST /api/coffees` -> Call service to save a coffee item.

---

## 🔀 Git Workflow Checklist
- [ ] Create branch: `git checkout -b feature/customer` (or `feature/coffee`)
- [ ] Write code & test locally
- [ ] Commit & Push: `git push origin <branch-name>`
- [ ] Open Pull Request on GitHub
- [ ] Friend reviews and approves PR
- [ ] Merge into `main`!
