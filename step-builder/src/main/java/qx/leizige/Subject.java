package qx.leizige;

import java.io.Serializable;

public class Subject implements Serializable {


    public static Subject of(String subject){
        return new Subject();
    }

}
