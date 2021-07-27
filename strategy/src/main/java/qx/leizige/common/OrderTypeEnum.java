package qx.leizige.common;

public enum OrderTypeEnum {

    /**
     * 销售订单
     */
    SALE_ORDER((short) 10, "商城订单"),

    /**
     * 逆向订单
     */
    REVERSE_ORDER((short) 20, "逆向订单");


    public static OrderTypeEnum fromValue(Short type) {
        for (OrderTypeEnum orderType : OrderTypeEnum.values()) {
            if (orderType.type.equals(type)) {
                return orderType;
            }
        }
        throw new IllegalArgumentException("非法的订单类型参数：" + type);
    }


    private final Short type;
    private final String desc;

    public Short getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    OrderTypeEnum(Short type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
