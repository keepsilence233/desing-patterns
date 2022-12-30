package qx.leizige;

import qx.leizige.interfaces.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Email implements Serializable {

    private EmailAddress from;
    private List<EmailAddress> to;
    private List<EmailAddress> cc;
    private List<EmailAddress> bcc;
    private Subject subject;
    private Content content;


    public static FromStep builder() {
        return new Builder();
    }

    public static class Builder implements FromStep, ToStep, SubjectStep, ContentStep, Build {

        private EmailAddress from;
        private List<EmailAddress> to;
        private List<EmailAddress> cc;
        private List<EmailAddress> bcc;
        private Subject subject;
        private Content content;

        @Override
        public Email build() {
            return new Email(this);
        }

        @Override
        public Build cc(EmailAddress... cc) {
            Objects.requireNonNull(cc);
            this.cc = new ArrayList<>(Arrays.asList(cc));
            return this;
        }

        @Override
        public Build bcc(EmailAddress... bcc) {
            Objects.requireNonNull(bcc);
            this.bcc = new ArrayList<>(Arrays.asList(bcc));
            return this;
        }

        @Override
        public ToStep from(EmailAddress from) {
            Objects.requireNonNull(from);
            this.from = from;
            return this;
        }

        @Override
        public SubjectStep to(EmailAddress... to) {
            Objects.requireNonNull(to);
            this.to = new ArrayList<>(Arrays.asList(to));
            return this;
        }

        @Override
        public ContentStep subject(Subject subject) {
            Objects.requireNonNull(subject);
            this.subject = subject;
            return this;
        }

        @Override
        public Build content(Content content) {
            Objects.requireNonNull(content);
            this.content = content;
            return this;
        }
    }


    private Email(Builder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.cc = builder.cc;
        this.bcc = builder.bcc;
        this.subject = builder.subject;
        this.content = builder.content;
    }
}
