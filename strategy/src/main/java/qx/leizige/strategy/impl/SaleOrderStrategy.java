package qx.leizige.strategy.impl;

import org.springframework.stereotype.Component;
import qx.leizige.common.OrderTypeEnum;
import qx.leizige.moudle.OrderContext;
import qx.leizige.strategy.OrderStrategy;

@Component
public class SaleOrderStrategy implements OrderStrategy {


    @Override
    public Short getOrderType() {
        return OrderTypeEnum.SALE_ORDER.getType();
    }

    @Override
    public void checked(OrderContext context) {

    }

    @Override
    public void handleOrder(OrderContext context) {
        System.err.println("销售订单");
    }
}
