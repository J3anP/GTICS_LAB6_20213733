package org.example.lab6gtics.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="locationid",nullable = false)
    private int locationId;

    @Column(name="city")
    @Size(max=255, message="El campo no puede tener más de 255 caracteres")
    private String city;

    @Column(name="country")
    @Size(max=255, message="El campo no puede tener más de 255 caracteres")
    private String country;

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}