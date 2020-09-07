package com.example.production_mes.pojo;

public class equip_maintenance_plan {
    private String id;
    private String equip_type;
    private String maintenance;
    private String cycle;
    private int warn_time;
    private String user_name;
    private String user_id;
    private String create_by;
    private String update_by;
    private String create_date;
    private String update_date;
    private String remarks;
    private String del_flag;

    @Override
    public String toString() {
        return "equip_maintenance_plan{" +
                "id='" + id + '\'' +
                ", equip_type='" + equip_type + '\'' +
                ", maintenance='" + maintenance + '\'' +
                ", cycle='" + cycle + '\'' +
                ", warn_time=" + warn_time +
                ", user_name='" + user_name + '\'' +
                ", user_id='" + user_id + '\'' +
                ", create_by='" + create_by + '\'' +
                ", update_by='" + update_by + '\'' +
                ", create_date='" + create_date + '\'' +
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

    public String getEquip_type() {
        return equip_type;
    }

    public void setEquip_type(String equip_type) {
        this.equip_type = equip_type;
    }

    public String getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public int getWarn_time() {
        return warn_time;
    }

    public void setWarn_time(int warn_time) {
        this.warn_time = warn_time;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
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
