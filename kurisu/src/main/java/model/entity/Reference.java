package model.entity;

import javax.persistence.Entity;

@Entity
public class Reference {
    private long id;
    private String reference;
    private String desc;
    private String shortDesc;
    private String shortRef;

    public long getId() {
        return id;
    }

    public String getReference() {
        return reference;
    }

    public String getDesc() {
        return desc;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public String getShortRef() {
        return shortRef;
    }

    public Reference setId(long id) {
        this.id = id;
        return this;
    }

    public Reference setReference(String reference) {
        this.reference = reference;
        return this;
    }

    public Reference setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public Reference setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
        return this;
    }

    public Reference setShortRef(String shortRef) {
        this.shortRef = shortRef;
        return this;
    }


}
