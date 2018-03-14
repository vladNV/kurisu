package model.entity;

import javax.persistence.*;

@Entity
@Table(name = "PDF")
public class Pdf {
    @Id
    @Column(name = "refId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "refRepository")
    private String refRepository;

    @Column(name = "refInternet")
    private String refInternet;

    @Column(name = "size")
    private long sizeKB;

    @Column(name = "description")
    private String desc;

    public Pdf(long id, String refRepository,
               String refInternet, long sizeKB, String desc) {
        this.id = id;
        this.refRepository = refRepository;
        this.refInternet = refInternet;
        this.sizeKB = sizeKB;
        this.desc = desc;
    }

    public long getId() {
        return id;
    }

    public String getRefRepository() {
        return refRepository;
    }

    public String getRefInternet() {
        return refInternet;
    }

    public long getSizeKB() {
        return sizeKB;
    }

    public String getDesc() {
        return desc;
    }
}
