package model;

/**
 * @author zhangTao
 * @Date:2019/4/9 10:07
 */
public class UserModel {
    private String userName;//注册用户名
    private String sex;//注册用户性别
    private String identity;//注册用户 身份：工作 大学生  中学生  以上都不是
    private String addr_province; //注册用户 地址
    private String addr_city; //注册用户 城市
    private String company;  //注册用户 公司
    private String userType; //注册用户类型，如果 是学生才选择： 大学生 硕士 博士
    private String school; //注册用户 学校：如果 是学生才填写。

    private String email; //注册用户 邮箱
    private String pwd; //注册用户 首次输入密码
    private String pwd2; //注册用户 确认密码

    public UserModel() {
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getAddr_province() {
        return addr_province;
    }

    public void setAddr_province(String addr_province) {
        this.addr_province = addr_province;
    }

    public String getAddr_city() {
        return addr_city;
    }

    public void setAddr_city(String addr_city) {
        this.addr_city = addr_city;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd2() {
        return pwd2;
    }

    public void setPwd2(String pwd2) {
        this.pwd2 = pwd2;
    }
}

