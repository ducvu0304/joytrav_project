package com.joytrav.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type")
public class Type {
    @Id
    private String id;

    @Column(name = "title")
    private String title;
    @OneToMany(mappedBy = "type")
    private List<Tour> tourList;

    public List<Tour> getTourList() {
        return tourList;
    }

    public void setTourList(List<Tour> tourList) {
        this.tourList = tourList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
