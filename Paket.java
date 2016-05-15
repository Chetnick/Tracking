/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Korisnik
 */
@Entity
@Table(name="tracking")
public class Paket {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    
    @Column(name = "faktura")
    private int faktura;
    
    @Column(name = "awb")
    private int awb;
    
    @Column(name = "time")
    private String time;
    
    @Column(name = "date")
    private String date;
    
    @Column(name = "stanje")
    private String stanje;
    
    public Paket(int faktura, int awb,String time,String date,String Stanje){
        this.awb=awb;
        this.date=date;
        this.faktura=faktura;
       
        this.stanje=stanje;
        this.time=time;
    }
    public Paket(){
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the faktura
     */
    public int getFaktura() {
        return faktura;
    }

    /**
     * @param faktura the faktura to set
     */
    public void setFaktura(int faktura) {
        this.faktura = faktura;
    }

    /**
     * @return the awb
     */
    public int getAwb() {
        return awb;
    }

    /**
     * @param awb the awb to set
     */
    public void setAwb(int awb) {
        this.awb = awb;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the stanje
     */
    public String getStanje() {
        return stanje;
    }

    /**
     * @param stanje the stanje to set
     */
    public void setStanje(String stanje) {
        this.stanje = stanje;
    }
    
}
