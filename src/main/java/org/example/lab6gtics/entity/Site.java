package org.example.lab6gtics.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="site")
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="siteid",nullable = false)
    private int siteId;

    @Column(name="sitename")
    @Size(max=255, message="El campo no puede tener más de 255 caracteres")
    private String deviceName;

    @ManyToOne
    @JoinColumn(name="locationid",nullable = false)
    private Location locationId;

    @Column(name="installationdate")
    private Date installationDate;

    @Column(name="latitude")
    @Size(max=45, message="El campo no puede tener más de 45 caracteres")
    private String latitude;

    @Column(name="longitude")
    @Size(max=45, message="El campo no puede tener más de 45 caracteres")
    private String longitude;

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Location getLocationId() {
        return locationId;
    }

    public void setLocationId(Location locationId) {
        this.locationId = locationId;
    }

    public Date getInstallationDate() {
        return installationDate;
    }

    public void setInstallationDate(Date installationDate) {
        this.installationDate = installationDate;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}