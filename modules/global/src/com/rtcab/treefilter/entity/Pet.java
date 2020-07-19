package com.rtcab.treefilter.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "TREEFILTER_PET")
@Entity(name = "treefilter_Pet")
@NamePattern("%s|name")
public class Pet extends StandardEntity {

    private static final long serialVersionUID = -5676690247250974106L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TOP_LEVEL_PARENT_ID")
    private Pet topLevelParent;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    private Pet parent;


    @Column(name = "NAME")
    private String name;

    public Pet getTopLevelParent() {
        return topLevelParent;
    }

    public void setTopLevelParent(Pet topLevelParent) {
        this.topLevelParent = topLevelParent;
    }

    public Pet getParent() {
        return parent;
    }

    public void setParent(Pet parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}