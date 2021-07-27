package qx.leizige.strategy;

import qx.leizige.moudle.OrderContext;

public interface OrderStrategy {


    Short DEFAULT_ORDER_TYPE = -1;

    Short getOrderType();

    void checked(OrderContext context);

    void handleOrder(OrderContext context);

}
