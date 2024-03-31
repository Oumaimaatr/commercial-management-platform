package com.platform.gestioncommerciale.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class BonAchat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_bon_achat;

    @Column
    private Float montant_bon_achat;
    @Column
    private Date date_bon_achat;
    @Column
    private String statue_bon_achat;

    public BonAchat() {
    }

    public BonAchat(Long id_bon_achat, Float montant_bon_achat, Date date_bon_achat, String statue_bon_achat) {
        this.id_bon_achat = id_bon_achat;
        this.montant_bon_achat = montant_bon_achat;
        this.date_bon_achat = date_bon_achat;
        this.statue_bon_achat = statue_bon_achat;
    }

    public BonAchat(Float montant_bon_achat, Date date_bon_achat, String statue_bon_achat) {
        this.montant_bon_achat = montant_bon_achat;
        this.date_bon_achat = date_bon_achat;
        this.statue_bon_achat = statue_bon_achat;
    }

    public Long getId_bon_achat() {
        return id_bon_achat;
    }

    public void setId_bon_achat(Long id_bon_achat) {
        this.id_bon_achat = id_bon_achat;
    }

    public Float getMontant_bon_achat() {
        return montant_bon_achat;
    }

    public void setMontant_bon_achat(Float montant_bon_achat) {
        this.montant_bon_achat = montant_bon_achat;
    }

    public Date getDate_bon_achat() {
        return date_bon_achat;
    }

    public void setDate_bon_achat(Date date_bon_achat) {
        this.date_bon_achat = date_bon_achat;
    }

    public String getStatue_bon_achat() {
        return statue_bon_achat;
    }

    public void setStatue_bon_achat(String statue_bon_achat) {
        this.statue_bon_achat = statue_bon_achat;
    }

    @Override
    public String toString() {
        return "BonAchat{" +
                "id_bon_achat=" + id_bon_achat +
                ", montant_bon_achat=" + montant_bon_achat +
                ", date_bon_achat=" + date_bon_achat +
                ", statue_bon_achat='" + statue_bon_achat + '\'' +
                '}';
    }
}
