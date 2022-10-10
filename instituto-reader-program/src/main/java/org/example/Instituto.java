package org.example;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Objects;

public class Instituto {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instituto instituto = (Instituto) o;
        return Objects.equals(name, instituto.name) && Objects.equals(address, instituto.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public String toString() {
        return "Instituto{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
