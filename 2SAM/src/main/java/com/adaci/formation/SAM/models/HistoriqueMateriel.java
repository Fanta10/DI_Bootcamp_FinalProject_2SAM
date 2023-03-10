package com.adaci.formation.SAM.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="material_hystory")
public class HistoriqueMateriel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @CreationTimestamp
    @Column(name="created_at", columnDefinition = "timestamp")
    private Date createdAt;
    @CreationTimestamp
    @Column(name="updated_at", columnDefinition = "timestamp")
    private Date updatedAt;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Materiel_id", nullable = false)
    private Materiel materiel;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Employe_id", nullable = false)
    private Employe employe;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}
