package com.example.production_mes.pojo;

public class equip_fault_report {
    private String id;
    private String equip_id;
    private String equip_no;
    private String equip_type;
    private String equip_loc;
    private String fault_desc;
    private String status;
    private String report_person;
    private String assign_time;
    private String maintenance_worker;
    private String create_by;
    private String create_date;
    private String update_by;
    private String update_date;
    private String remarks;
    private String del_flag;

    @Override
    public String toString() {
        return "equip_fault_report{" +
                "id='" + id + '\'' +
                ", equip_id='" + equip_id + '\'' +
                ", equip_no='" + equip_no + '\'' +
                ", equip_type='" + equip_type + '\'' +
                ", equip_loc='" + equip_loc + '\'' +
                ", fault_desc='" + fault_desc + '\'' +
                ", status='" + status + '\'' +
                ", report_person='" + report_person + '\'' +
                ", assign_time='" + assign_time + '\'' +
                ", maintenance_worker='" + maintenance_worker + '\'' +
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

    public String getEquip_id() {
        return equip_id;
    }

    public void setEquip_id(String equip_id) {
        this.equip_id = equip_id;
    }

    public String getEquip_no() {
        return equip_no;
    }

    public void setEquip_no(String equip_no) {
        this.equip_no = equip_no;
    }

    public String getEquip_type() {
        return equip_type;
    }

    public void setEquip_type(String equip_type) {
        this.equip_type = equip_type;
    }

    public String getEquip_loc() {
        return equip_loc;
    }

    public void setEquip_loc(String equip_loc) {
        this.equip_loc = equip_loc;
    }

    public String getFault_desc() {
        return fault_desc;
    }

    public void setFault_desc(String fault_desc) {
        this.fault_desc = fault_desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReport_person() {
        return report_person;
    }

    public void setReport_person(String report_person) {
        this.report_person = report_person;
    }

    public String getAssign_time() {
        return assign_time;
    }

    public void setAssign_time(String assign_time) {
        this.assign_time = assign_time;
    }

    public String getMaintenance_worker() {
        return maintenance_worker;
    }

    public void setMaintenance_worker(String maintenance_worker) {
        this.maintenance_worker = maintenance_worker;
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
