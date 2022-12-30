package qx.leizige;

public class Main {
    public static void main(String[] args) {

        Email email = Email.builder().from(EmailAddress.of("qx_leizige@163.com"))
                .to(EmailAddress.of("qx.leizige@gmail.com", "silence@gmail.com"))
                .subject(Subject.of("subject"))
                .content(Content.of("Test email"))
                .cc(EmailAddress.of("lei.tl@bitsun-inc.com"))
                .bcc(EmailAddress.of("lei.tl@bitsun-inc.com"))
                .build();
    }
}
