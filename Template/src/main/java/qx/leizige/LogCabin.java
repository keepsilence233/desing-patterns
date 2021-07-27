package qx.leizige;

/**
 * 木屋
 */
public class LogCabin extends AbstractHouseTemplate {

    protected LogCabin() {
        super("木屋");
    }

    @Override
    protected void buildFoundation() {
        System.out.println(houseName + "地基");
    }

    @Override
    protected void buildDoor() {
        System.out.println(houseName + "门");
    }

    @Override
    protected void buildWall() {
        System.out.println(houseName + "窗");
    }

    @Override
    protected void buildWindow() {
        System.out.println(houseName + "围墙");
    }

    @Override
    protected boolean isOpen() {
        return super.isOpen();
    }

    @Override
    protected void hookFunction() {
        System.out.println("盖完房子了......");
    }
}
