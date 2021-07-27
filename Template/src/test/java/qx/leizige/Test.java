package qx.leizige;

public class Test {

    @org.junit.Test
    public void test() {
        AbstractHouseTemplate villa = new Villa();
        villa.buildHouse();

        AbstractHouseTemplate logCabin = new LogCabin();
        logCabin.buildHouse();
    }
}
