package com.joytrav.model;

import javax.persistence.*;

@Entity
@Table(name = "picture")
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "link")
    private String link;

    @Column(name = "catalog")
    private String catalog;

    @ManyToOne
    @JoinColumn(name = "tourId")
    private Tour tour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", link='" + link + '\'' +
                ", catalog='" + catalog + '\'' +
                '}';
    }
}
