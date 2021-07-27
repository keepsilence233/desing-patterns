package qx.leizige.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import qx.leizige.strategy.OrderStrategy;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class OrderTypeFactory {


    public static final Map<Short, OrderStrategy> handlerMap = new ConcurrentHashMap<>();


    @Autowired
    private void register(OrderStrategy[] orderStrategies) {
        if (orderStrategies != null && orderStrategies.length > 0) {
            handlerMap.clear();
            Arrays.stream(orderStrategies).forEach(v -> {
                handlerMap.put(v.getOrderType(), v);
            });
        }
    }


    public static OrderStrategy getHandler(Short type) {
        return handlerMap.getOrDefault(type, null);
    }

}
