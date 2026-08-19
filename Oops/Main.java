class Order{
    public int orderId;
    public String orderStatus;
    private double orderPrice;
    public Order(int orderId,OrderStatus order)
        this.orderId=orderId;
        this.orderStatus=orderStatus;
        this.orderPrice=orderPrice;
}

public Order(int orderID){
    this.orderID=orderID;
}

public Order(int orderId,String orderStatus){
    this.orderId=orderId;
    this.orderStatus=orderStatus;
}
enum OrderStatus{
    PENDING,
    SHIPPED,
    DELIVERED,
    CANCELLED
}
public class Main{
    public static void main(String[] args){
        Order order=new Order(orderId:1);
        System.out.println("Order ID: " + order.orderId);
        Order order1 = new Order(orderId:2, OrderStatus,PENDING);
        Order order2=new Order(orderID:2, OrderStatus.PENDING);
        System.out.prinln("Order status:"+ order.orderStatus);
        Order order 3=new Order(3,OrderStatus.SHIPPED,999);
        System.out.println("Order price: ",+order3.getOrderPrice());

    }
}