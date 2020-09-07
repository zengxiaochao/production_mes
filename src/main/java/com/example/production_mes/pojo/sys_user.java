package com.example.production_mes.pojo;

public class sys_user {
    private String id;
    private String company_id;
    private String office_id;
    private String login_name;
    private String password;
    private String no;
    private String name;
    private String email;
    private String phone;
    private String mobile;
    private String user_type;
    private String photo;
    private String login_ip;
    private String login_date;
    private String login_flag;
    private String create_by;
    private String create_date;
    private String update_by;
    private String update_date;
    private String remarks;
    private String del_flag;

    @Override
    public String toString() {
        return "sys_user{" +
                "id='" + id + '\'' +
                ", company_id='" + company_id + '\'' +
                ", office_id='" + office_id + '\'' +
                ", login_name='" + login_name + '\'' +
                ", password='" + password + '\'' +
                ", no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", user_type='" + user_type + '\'' +
                ", photo='" + photo + '\'' +
                ", login_ip='" + login_ip + '\'' +
                ", login_date='" + login_date + '\'' +
                ", login_flag='" + login_flag + '\'' +
                ", create_by='" + create_by + '\'' +
                ", create_date='" + create_date + '\'' +
                ", update_by='" + update_by + '\'' +
                ", update_date='" + update_date + '\'' +
                ", remarks='" + remarks + '\'' +
                ", del_flag='" + del_flag + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getOffice_id() {
        return office_id;
    }

    public void setOffice_id(String office_id) {
        this.office_id = office_id;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getLogin_ip() {
        return login_ip;
    }

    public void setLogin_ip(String login_ip) {
        this.login_ip = login_ip;
    }

    public String getLogin_date() {
        return login_date;
    }

    public void setLogin_date(String login_date) {
        this.login_date = login_date;
    }

    public String getLogin_flag() {
        return login_flag;
    }

    public void setLogin_flag(String login_flag) {
        this.login_flag = login_flag;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDel_flag() {
        return del_flag;
    }

    public void setDel_flag(String del_flag) {
        this.del_flag = del_flag;
    }
}