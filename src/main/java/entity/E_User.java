package entity;

import java.util.Date;
//员工表
public class E_User {

    private Integer euid;//编号
    private Integer eunumber;//员工卡号
    private String euname;//姓名
    private String eupassword;//密码
    private String eusex;//性别
    private Integer eucardno;//身份证
    private  Integer euphone;//电话
    private  String euadress;//住址
    private String  eubirthplace;//籍贯
    private Date eubirthday;//生日
    private  String euducation;//学历
    private  Date eustatrtime;//入职时间
    private  Date euendtime;//离职时间
    private  Integer euposition;//职位

    public E_User() {

    }

    public E_User( Integer euid, Integer eunumber, String euname, String eupassword, String eusex, Integer eucardno, Integer euphone, String euadress, String eubirthplace, Date eubirthday, String euducation, Date eustatrtime, Date euendtime, Integer euposition ) {
        this.euid = euid;
        this.eunumber = eunumber;
        this.euname = euname;
        this.eupassword = eupassword;
        this.eusex = eusex;
        this.eucardno = eucardno;
        this.euphone = euphone;
        this.euadress = euadress;
        this.eubirthplace = eubirthplace;
        this.eubirthday = eubirthday;
        this.euducation = euducation;
        this.eustatrtime = eustatrtime;
        this.euendtime = euendtime;
        this.euposition = euposition;
    }

    @Override
    public String toString() {
        return "E_User{" +
                "euid=" + euid +
                ", eunumber=" + eunumber +
                ", euname='" + euname + '\'' +
                ", eupassword='" + eupassword + '\'' +
                ", eusex='" + eusex + '\'' +
                ", eucardno=" + eucardno +
                ", euphone=" + euphone +
                ", euadress='" + euadress + '\'' +
                ", eubirthplace='" + eubirthplace + '\'' +
                ", eubirthday=" + eubirthday +
                ", euducation='" + euducation + '\'' +
                ", eustatrtime=" + eustatrtime +
                ", euendtime=" + euendtime +
                ", euposition=" + euposition +
                '}';
    }

    public Integer getEuid() {
        return euid;
    }

    public void setEuid( Integer euid ) {
        this.euid = euid;
    }

    public Integer getEunumber() {
        return eunumber;
    }

    public void setEunumber( Integer eunumber ) {
        this.eunumber = eunumber;
    }

    public String getEuname() {
        return euname;
    }

    public void setEuname( String euname ) {
        this.euname = euname;
    }

    public String getEupassword() {
        return eupassword;
    }

    public void setEupassword( String eupassword ) {
        this.eupassword = eupassword;
    }

    public String getEusex() {
        return eusex;
    }

    public void setEusex( String eusex ) {
        this.eusex = eusex;
    }

    public Integer getEucardno() {
        return eucardno;
    }

    public void setEucardno( Integer eucardno ) {
        this.eucardno = eucardno;
    }

    public Integer getEuphone() {
        return euphone;
    }

    public void setEuphone( Integer euphone ) {
        this.euphone = euphone;
    }

    public String getEuadress() {
        return euadress;
    }

    public void setEuadress( String euadress ) {
        this.euadress = euadress;
    }

    public String getEubirthplace() {
        return eubirthplace;
    }

    public void setEubirthplace( String eubirthplace ) {
        this.eubirthplace = eubirthplace;
    }

    public Date getEubirthday() {
        return eubirthday;
    }

    public void setEubirthday( Date eubirthday ) {
        this.eubirthday = eubirthday;
    }

    public String getEuducation() {
        return euducation;
    }

    public void setEuducation( String euducation ) {
        this.euducation = euducation;
    }

    public Date getEustatrtime() {
        return eustatrtime;
    }

    public void setEustatrtime( Date eustatrtime ) {
        this.eustatrtime = eustatrtime;
    }

    public Date getEuendtime() {
        return euendtime;
    }

    public void setEuendtime( Date euendtime ) {
        this.euendtime = euendtime;
    }

    public Integer getEuposition() {
        return euposition;
    }

    public void setEuposition( Integer euposition ) {
        this.euposition = euposition;
    }
}
