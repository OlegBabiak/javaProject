package lesson2HW.task1;

import java.util.Arrays;

public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private double[] geo = new double[2];

    public Address() {
    }

    public Address(String street, String suite, String city, String zipcode, double[] geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public double[] getGeo() {
        return geo;
    }

    public void setGeo(double[] geo) {
        this.geo = geo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", suite='" + suite + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", geo=" + Arrays.toString(geo) +
                '}';
    }
}
