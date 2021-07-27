package qx.leizige;

/**
 * @author leizige
 * created 2021/07/26
 */
public class Student {

    private Long id;

    private String name;

    private Integer age;

    private Address address;


    /* builder */

    public static Student.Builder builder() {
        return new Student.Builder();
    }

    public static class Builder {

        private Long id;

        private String name;

        private Integer age;

        private Address address;


        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(id, name, age, address);
        }

    }

    /* constructor */

    public Student() {
    }

    public Student(Long id, String name, Integer age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /* getter and setter */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /* toString */

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
