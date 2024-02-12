package com.FindMyGymTrainer.Dto;

public class CustomerDto {

    protected int id;
    protected String fName;
    protected String lName;
    protected String email;
    protected long phNo;
    protected int package_id;
    protected String date;
    protected String feeStatus;
    protected int trainer_id;
    protected String password;


    public CustomerDto(){

    }

    public CustomerDto(int id, String fName, String lName, String email, long phNo, int package_id, String date, String feeStatus, int trainer_id, String password) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phNo = phNo;
        this.package_id = package_id;
        this.date = date;
        this.feeStatus = feeStatus;
        this.trainer_id = trainer_id;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhNo() {
        return phNo;
    }

    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }

    public int getPackage_id() {
        return package_id;
    }

    public void setPackage_id(int package_id) {
        this.package_id = package_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFeeStatus() {
        return feeStatus;
    }

    public void setFeeStatus(String feeStatus) {
        this.feeStatus = feeStatus;
    }

    public int getTrainer_id() {
        return trainer_id;
    }

    public void setTrainer_id(int trainer_id) {
        this.trainer_id = trainer_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", phNo=" + phNo +
                ", package_id=" + package_id +
                ", date='" + date + '\'' +
                ", feeStatus='" + feeStatus + '\'' +
                ", trainer_id=" + trainer_id +
                ", password='" + password + '\'' +
                '}';
    }

}
