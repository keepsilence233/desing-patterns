package qx.leizige.filter;

import org.junit.Test;
import qx.leizige.filter.filter.AuthenticationFilter;
import qx.leizige.filter.filter.LogFilter;

public class FilterTest {


    @Test
    public void test() {

        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new LogFilter());

        filterManager.process("666");
    }

}
