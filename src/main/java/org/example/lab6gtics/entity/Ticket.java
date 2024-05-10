package org.example.lab6gtics.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.security.Timestamp;

@Getter
@Setter
@Entity
@Table(name="ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ticketid",nullable = false)
    private int ticketId;

    @ManyToOne
    @JoinColumn(name="siteid",nullable = false)
    private Site siteId;

    @ManyToOne
    @JoinColumn(name="technicianid",nullable = false)
    private Site technicianId;

    @Column(name="status")
    @Size(max=50, message="El campo no puede tener más de 50 caracteres")
    private String status;

    @Column(name="openeddate")
    private Timestamp openedDate;

    @Column(name="closedate")
    private Timestamp closeDate;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Site getSiteId() {
        return siteId;
    }

    public void setSiteId(Site siteId) {
        this.siteId = siteId;
    }

    public Site getTechnicianId() {
        return technicianId;
    }

    public void setTechnicianId(Site technicianId) {
        this.technicianId = technicianId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(Timestamp openedDate) {
        this.openedDate = openedDate;
    }

    public Timestamp getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Timestamp closeDate) {
        this.closeDate = closeDate;
    }
}