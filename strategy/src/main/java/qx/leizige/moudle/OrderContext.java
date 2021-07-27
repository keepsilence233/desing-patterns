package qx.leizige.moudle;

import java.math.BigDecimal;

public class OrderContext {

    private String orderNo;

    private BigDecimal price;

    private Short tradeType;

    public OrderContext(String orderNo, BigDecimal price, Short tradeType) {
        this.orderNo = orderNo;
        this.price = price;
        this.tradeType = tradeType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Short getTradeType() {
        return tradeType;
    }

    public void setTradeType(Short tradeType) {
        this.tradeType = tradeType;
    }
}
