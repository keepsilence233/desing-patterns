package qx.leizige;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author leizige
 * created 2021/07/26
 */
public class Address {

    @JSONField(ordinal = 0)
    private String province;

    @JSONField(ordinal = 1)
    private String city;

    @JSONField(ordinal = 2)
    private String district;

    public static Address.Builder builder() {
        return new Address.Builder();
    }


    public static class Builder {


        private String province;

        private String city;

        private String district;


        public Builder province(String province) {
            this.province = province;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder district(String district) {
            this.district = district;
            return this;
        }

        public Address build() {
            return new Address(province, city, district);
        }

    }


    public Address() {

    }

    public Address(String province, String city, String district) {
        this.province = province;
        this.city = city;
        this.district = district;
    }


    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Address{" +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                '}';
    }
}
