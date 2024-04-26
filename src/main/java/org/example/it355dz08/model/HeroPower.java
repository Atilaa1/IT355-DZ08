package org.example.it355dz08.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "hero_power", schema = "superhero", catalog = "")
public class HeroPower {
    @Basic
    @Column(name = "hero_id")
    private Integer heroId;
    @Basic
    @Column(name = "power_id")
    private Integer powerId;
    @Id
    private Long id;

    public Integer getHeroId() {
        return heroId;
    }

    public void setHeroId(Integer heroId) {
        this.heroId = heroId;
    }

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeroPower that = (HeroPower) o;
        return Objects.equals(heroId, that.heroId) && Objects.equals(powerId, that.powerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heroId, powerId);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
