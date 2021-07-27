package qx.leizige.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import qx.leizige.factory.OrderTypeFactory;
import qx.leizige.moudle.OrderContext;
import qx.leizige.strategy.OrderStrategy;

import java.math.BigDecimal;

@SpringBootTest
@WebAppConfiguration
@RunWith(SpringRunner.class)
public class ApplicationTest {

    OrderContext context = null;

    @Before
    public void before() {
//        context = new OrderContext("NO1", BigDecimal.TEN, (short) 10);
        context = new OrderContext("NO1", BigDecimal.TEN, (short) 20);
    }

    @Test
    public void Test() {
        OrderStrategy orderStrategy = OrderTypeFactory.getHandler(context.getTradeType());
        orderStrategy.handleOrder(context);
    }

}
