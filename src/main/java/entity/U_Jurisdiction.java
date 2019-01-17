package entity;
//职位表
public class U_Jurisdiction {
    private  Integer ujid;//职位编号
    private  String ujname;//职位名称

    public U_Jurisdiction() {
    }

    public U_Jurisdiction( Integer ujid, String ujname ) {
        this.ujid = ujid;
        this.ujname = ujname;
    }

    @Override
    public String toString() {
        return "U_Jurisdiction{" +
                "ujid=" + ujid +
                ", ujname='" + ujname + '\'' +
                '}';
    }

    public Integer getUjid() {
        return ujid;
    }

    public void setUjid( Integer ujid ) {
        this.ujid = ujid;
    }

    public String getUjname() {
        return ujname;
    }

    public void setUjname( String ujname ) {
        this.ujname = ujname;
    }
}
