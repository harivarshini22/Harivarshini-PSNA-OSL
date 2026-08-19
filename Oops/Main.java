class Order{
    public int orderId;
    public String orderStatus;
}

public Order(int orderID){
    this.orderID=orderID;
}

public Order(int orderId,String orderStatus){
    this.orderId=orderId;
    this.orderStatus=orderStatus;
}
