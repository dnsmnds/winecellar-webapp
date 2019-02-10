package com.cellar.wine.models;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Producer extends BaseEntity {

    @Builder
    public Producer(Long id, String name, String country, String appellation, Set<Wine> wines) {
        super(id);
        this.name = name;
        this.country = country;
        this.appellation = appellation;
        if(wines != null) {
            this.wines = wines;
        }
    }

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @Column(name = "appellation")
    private String appellation;

    @Column(name = "province")
    private String province;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producer")
    private Set<Wine> wines = new HashSet<>();

    public Wine getWine(String label) {
        return getWine(label, false);
    }

    public Wine getWine(String label, boolean ignoreNew) {
        label = label.toLowerCase();
        for (Wine wine : wines) {
            if (!ignoreNew || !wine.isNew()) {
                String compName = wine.getLabel();
                compName = compName.toLowerCase();
                if(compName.equals(label)) {
                    return wine;
                }
            }
        }
        return null;
    }

}
