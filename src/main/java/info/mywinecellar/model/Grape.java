/*
 * My-Wine-Cellar, copyright 2019
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 */

package info.mywinecellar.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
public class Grape extends BaseEntity implements Comparable<Grape> {

    public Grape() {
        super();
    }

    public Grape(String name, String color, String description, String weblink) {
        super();
        this.name = name;
        this.color = color;
        this.description = description;
        this.weblink = weblink;
    }

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "color")
    private String color;

    @Column(name = "description", length = 8192)
    private String description;

    @Column(name = "weblink")
    private String weblink;

    @OneToMany
    private List<Grape> alternativeNames;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "grape_area",
            joinColumns =
            @JoinColumn(name = "grape_id", referencedColumnName = "id"),
            inverseJoinColumns =
            @JoinColumn(name = "area_id", referencedColumnName = "id")
    )
    private List<Area> areas;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "grape")
    private List<GrapeComponent> grapeComponents;

    @Override
    public int compareTo(Grape g) {
        return name.compareTo(g.getName());
    }

    @Override
    public String toString() {
        return "Grape(" + id + ")";
    }
}