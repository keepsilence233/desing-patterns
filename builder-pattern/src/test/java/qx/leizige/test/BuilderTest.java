package qx.leizige.test;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import qx.leizige.Address;
import qx.leizige.Student;

/**
 * @author leizige
 * created 2021/07/26
 */
public class BuilderTest {


    @Test
    public void Test() {


        Address address = Address.builder().province("山西省").city("长治市").district("沁县").build();
        System.out.println(JSON.toJSONString(address, Boolean.TRUE));

        Student student = Student.builder().id(1L).name("zs").age(23).address(address).build();
        System.out.println(JSON.toJSONString(student, Boolean.TRUE));

    }


}
