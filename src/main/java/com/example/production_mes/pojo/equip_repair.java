package com.example.production_mes.pojo;

public class equip_repair {
    private String id;
    private String mid;
    private String fault_type;
    private String fault_reason;
    private String fault_desc;
    private String fault_imgs;
    private String create_by;
    private String create_date;
    private String update_by;
    private String update_date;
    private String remarks;
    private String del_flag;

    @Override
    public String toString() {
        return "equip_repair{" +
                "id='" + id + '\'' +
                ", mid='" + mid + '\'' +
                ", fault_type='" + fault_type + '\'' +
                ", fault_reason='" + fault_reason + '\'' +
                ", fault_desc='" + fault_desc + '\'' +
                ", fault_imgs='" + fault_imgs + '\'' +
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

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getFault_type() {
        return fault_type;
    }

    public void setFault_type(String fault_type) {
        this.fault_type = fault_type;
    }

    public String getFault_reason() {
        return fault_reason;
    }

    public void setFault_reason(String fault_reason) {
        this.fault_reason = fault_reason;
    }

    public String getFault_desc() {
        return fault_desc;
    }

    public void setFault_desc(String fault_desc) {
        this.fault_desc = fault_desc;
    }

    public String getFault_imgs() {
        return fault_imgs;
    }

    public void setFault_imgs(String fault_imgs) {
        this.fault_imgs = fault_imgs;
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
