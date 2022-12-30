package qx.leizige.interfaces;

import qx.leizige.Email;
import qx.leizige.EmailAddress;

public interface Build {

    Email build();

    Build cc(EmailAddress... cc);

    Build bcc(EmailAddress... bcc);
}
