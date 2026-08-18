# ☕ Day 2: The Relationship Entity (`Order`)

## 🎯 Goal
Connect `Customer` and `CoffeeItem` using an `Order` relationship entity with `@ManyToOne` annotations.

---

## ⚠️ Prerequisite
Make sure Day 1 PRs are merged into `main`! Both members run:
```bash
git checkout main
git pull origin main
```

---

## 🤝 Joint Tasks (Branch: `feature/order`)

### Tasks:
1. **Entity (`model/Order.java`):**
   - Annotations: `@Entity`, `@Table(name = "orders")`
   - Fields:
     - `id` (`@Id`, `@GeneratedValue`)
     - `orderDate` (`LocalDate`, set to `LocalDate.now()` in default constructor)
     - `@ManyToOne` `@JoinColumn(name = "customer_id")` private `Customer customer`
     - `@ManyToOne` `@JoinColumn(name = "coffee_id")` private `CoffeeItem coffeeItem`
2. **Repository (`repository/OrderRepository.java`):**
   - Interface extending `JpaRepository<Order, Long>`.
3. **Service (`service/OrderService.java`):**
   - Annotated with `@Service`.
   - Inject `OrderRepository`.
   - Methods: `getAllOrders()`, `placeOrder(Order order)`.
4. **Controller (`controller/OrderController.java`):**
   - Annotated with `@RestController`, `@RequestMapping("/api/orders")`.
   - Endpoints:
     - `GET /api/orders` -> List all orders.
     - `POST /api/orders` -> Create a new order linking a customer ID and coffee ID.

---

## 🧪 Testing the Order Flow
1. POST a customer: `POST /api/customers` -> `{"name": "Jane", "phone": "555-1234"}`
2. POST a coffee: `POST /api/coffees` -> `{"name": "Espresso", "price": 3.50}`
3. POST an order: `POST /api/orders` -> `{"customer": {"id": 1}, "coffeeItem": {"id": 1}}`
4. GET all orders: `GET /api/orders` -> Verify that the JSON contains customer and coffee details!

---

## 🔀 Git Workflow Checklist
- [ ] Create branch `feature/order`
- [ ] Test locally
- [ ] Commit & Push to GitHub
- [ ] Create PR & Merge to `main`
