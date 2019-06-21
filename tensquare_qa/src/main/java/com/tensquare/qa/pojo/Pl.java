package com.tensquare.qa.pojo;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @ClassName Pl
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/20 0020 11:01
 * @Version 1.0
 **/
@Entity
@Table(name="tb_pl")
public class Pl implements Serializable {
    private static final long serialVersionUID = -4460769530270441160L;
    @Id
    private String problemid;
    @Id
    private String lableid;
    public String getLableid() {
        return lableid;
    }
    public void setLableid(String lableid) {
        this.lableid = lableid;
    }
    public String getProblemid() {
        return problemid;
    }
    public void setProblemid(String problemid) {
        this.problemid = problemid;
    }
}
