package org.example.it355dz08.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "comic")
public class Comic {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "comic_name")
    private String comicName;
    @Basic
    @Column(name = "issue")
    private Integer issue;
    @Basic
    @Column(name = "publish_month")
    private Integer publishMonth;
    @Basic
    @Column(name = "publish_year")
    private Integer publishYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComicName() {
        return comicName;
    }

    public void setComicName(String comicName) {
        this.comicName = comicName;
    }

    public Integer getIssue() {
        return issue;
    }

    public void setIssue(Integer issue) {
        this.issue = issue;
    }

    public Integer getPublishMonth() {
        return publishMonth;
    }

    public void setPublishMonth(Integer publishMonth) {
        this.publishMonth = publishMonth;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }
}
