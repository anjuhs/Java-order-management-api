import java.util.*;

public class OrderController {

    private Map<Integer, Order> orders = new HashMap<>();

    public Order createOrder(Order order) {
        orders.put(order.getId(), order);
        return order;
    }

    public Collection<Order> getOrders() {
        return orders.values();
    }

    public void deleteOrder(int id) {
        orders.remove(id);
    }
}
