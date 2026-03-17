package org.example.jdbcTest1.doctorApp;

public class Doctor {
    private int id;
    private String doctorName;
    private Long doctorIdentityCode;
    private String referral;
    private int price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Long getDoctorIdentityCode() {
        return doctorIdentityCode;
    }

    public void setDoctorIdentityCode(Long doctorIdentityCode) {
        this.doctorIdentityCode = doctorIdentityCode;
    }

    public String getReferral() {
        return referral;
    }

    public void setReferral(String referral) {
        this.referral = referral;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", doctorName='" + doctorName + '\'' +
                ", doctorIdentityCode=" + doctorIdentityCode +
                ", referral='" + referral + '\'' +
                ", price=" + price +
                '}';
    }
}
