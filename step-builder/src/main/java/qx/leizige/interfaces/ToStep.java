package qx.leizige.interfaces;

import qx.leizige.EmailAddress;

public interface ToStep {

    SubjectStep to(EmailAddress... to);

}
