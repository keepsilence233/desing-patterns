package qx.leizige;

import java.io.Serializable;

public class EmailAddress implements Serializable {


    public static EmailAddress of(String address) {
        return new EmailAddress();
    }

    public static EmailAddress of(String... address) {
        return new EmailAddress();
    }

}
