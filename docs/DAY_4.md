# ☕ Day 4: Full CRUD (Update & Delete) 🛠️

## 🎯 Goal
Complete full CRUD capabilities by implementing `@PutMapping` (update) and `@DeleteMapping` (delete) endpoints.

---

## 👤 Friend 1 Tasks (Branch: `feature/customer-crud`)

### 1. Update Customer (`@PutMapping`)
* **Service:** Find customer by ID (`findById`). Update name/phone, then save.
* **Controller:** `@PutMapping("/{id}")` -> Accepts `@PathVariable Long id` and `@RequestBody Customer details`.

### 2. Delete Customer (`@DeleteMapping`)
* **Service:** Delete customer by ID (`deleteById`).
* **Controller:** `@DeleteMapping("/{id}")` -> Accepts `@PathVariable Long id`.

---

## ☕ Friend 2 Tasks (Branch: `feature/coffee-crud`)

### 1. Update Coffee Price (`@PutMapping`)
* **Service:** Find coffee by ID (`findById`), update price/name, save.
* **Controller:** `@PutMapping("/{id}")` -> Accepts `@PathVariable Long id` and `@RequestBody CoffeeItem details`.

### 2. Delete Order / Coffee (`@DeleteMapping`)
* **Service:** Cancel/delete an order by ID.
* **Controller:** Add `@DeleteMapping("/api/orders/{id}")` in `OrderController`.

---

## 🔀 Git Workflow Checklist
- [ ] Push feature branches to GitHub
- [ ] Code review & merge into `main`
- [ ] Test PUT & DELETE requests in Postman/cURL!
