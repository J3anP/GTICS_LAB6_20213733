package org.example.lab6gtics.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="device")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="deviceid",nullable = false)
    private int deviceId;

    @Column(name="devicename")
    @Size(max=255, message="El campo no puede tener más de 255 caracteres")
    private String deviceName;

    @Column(name="devicetype")
    @Size(max=255, message="El campo no puede tener más de 255 caracteres")
    private String deviceType;

    @Column(name="model")
    @Size(max=255, message="El campo no puede tener más de 255 caracteres")
    private String model;

    @Column(name="serialnumber")
    @Size(max=255, message="El campo no puede tener más de 255 caracteres")
    private String serialNumber;

    @ManyToOne
    @JoinColumn(name="siteid",nullable = false)
    private Site siteId;

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Site getSiteId() {
        return siteId;
    }

    public void setSiteId(Site siteId) {
        this.siteId = siteId;
    }
}