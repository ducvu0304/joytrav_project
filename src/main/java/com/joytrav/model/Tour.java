package com.joytrav.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tour")
public class Tour implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "departure")
    private String departure;
    @Column(name = "price")
    private double price;
    @Column(name = "slots")
    private short slots;
    @Column(name = "category")
    private String category;
    @Column(name = "intro")
    private String intro;
    @Column(name = "details")
    private String details;

    @Column(name = "sale")
    private String sale;

    @ManyToOne()
    @JoinColumn(name = "typeId")
    private Type type;

    @OneToMany(mappedBy = "tour")
    private List<Picture> pictureList;

    public List<Picture> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<Picture> pictureList) {
        this.pictureList = pictureList;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public short getSlots() {
        return slots;
    }

    public void setSlots(short slots) {
        this.slots = slots;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", departure='" + departure + '\'' +
                ", price=" + price +
                ", slots=" + slots +
                ", category='" + category + '\'' +
                ", intro='" + intro + '\'' +
                ", details='" + details + '\'' +
                ", type=" + type +
                '}';
    }
}
