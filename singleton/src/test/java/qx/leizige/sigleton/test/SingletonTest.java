package qx.leizige.sigleton.test;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import qx.leizige.sigleton.NoSingleton;
import qx.leizige.sigleton.Singleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SingletonTest {

    @Test
    public void singletonTest() throws InterruptedException {

        Set<Integer> instanceSet = Collections.synchronizedSet(new HashSet<>());

        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                String threadName = Thread.currentThread().getName();
                int hashCode = Singleton.getInstance().hashCode();
//                System.out.println(threadName + ":" + hashCode);
                instanceSet.add(hashCode);
            }).start();
        }

        Thread.sleep(5000);
        System.out.println("value : " + JSON.toJSONString(instanceSet) + ", size : " + instanceSet.size());
    }


}
