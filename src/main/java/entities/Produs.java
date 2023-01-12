package entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Produs {
    @Id
    private int id;
    private double pret;
    @Column(name = "denumire", nullable = false)
    private String nume;
    private int stoc;
    @Temporal(TemporalType.DATE)
    private Date dataExpirare;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getStoc() {
        return stoc;
    }

    public void setStoc(int stoc) {
        this.stoc = stoc;
    }

    public Date getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(Date dataExpirare) {
        this.dataExpirare = dataExpirare;
    }
}
