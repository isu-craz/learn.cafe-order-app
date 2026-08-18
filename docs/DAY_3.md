# ☕ Day 3: Custom JPA Search Queries 🔍

## 🎯 Goal
Learn how to create custom database search queries in Spring Data JPA without writing raw SQL.

---

## 👤 Friend 1 Tasks (Branch: `feature/customer-search`)

### Objective: Find Customer by Phone Number
1. **Repository (`CustomerRepository`):**
   - Add method declaration:
     ```java
     Optional<Customer> findByPhone(String phone);
     ```
2. **Service (`CustomerService`):**
   - Add method `getCustomerByPhone(String phone)`.
3. **Controller (`CustomerController`):**
   - Add endpoint: `GET /api/customers/search?phone=555-1234`
   - Call service and return customer.

---

## ☕ Friend 2 Tasks (Branch: `feature/coffee-search`)

### Objective: Find Coffee Items Cheaper Than a Given Price
1. **Repository (`CoffeeItemRepository`):**
   - Add method declaration:
     ```java
     List<CoffeeItem> findByPriceLessThan(Double maxPrice);
     ```
2. **Service (`CoffeeItemService`):**
   - Add method `getCoffeesCheaperThan(Double maxPrice)`.
3. **Controller (`CoffeeItemController`):**
   - Add endpoint: `GET /api/coffees/cheap?maxPrice=5.00`
   - Call service and return matching coffee items.

---

## 🔀 Git Workflow Checklist
- [ ] Push feature branches to GitHub
- [ ] Code review & merge into `main`
- [ ] Pull `main` locally to test both search endpoints!
