package qx.leizige;

/**
 * 模板抽象类,定义盖房子的步骤
 *
 * @author leizige
 * created 2021/07/27
 */
public abstract class AbstractHouseTemplate {

    protected String houseName;

    protected AbstractHouseTemplate(String houseName) {
        this.houseName = houseName;
    }


    /* 地基 */
    protected abstract void buildFoundation();

    /* 门 */
    protected abstract void buildDoor();

    /* 窗 */
    protected abstract void buildWall();

    /* 围墙 */
    protected abstract void buildWindow();


    /* 钩子函数 */
    protected boolean isOpen() {
        return Boolean.FALSE;
    }

    protected abstract void hookFunction();

    /* 盖房子流程 */
    public final void buildHouse() {
        buildFoundation();
        buildDoor();
        buildWall();
        buildWindow();
        if (isOpen()) {
            hookFunction();
        }
    }

}
