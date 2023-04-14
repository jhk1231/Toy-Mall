package com.store.api.module.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class ContactEntity extends BaseEntity {

    @Column(name = "phone", length = 14)
    private String phone;

    @Column(name = "tel1", length = 4)
    private String tel1;

    @Column(name = "tel2", length = 5)
    private String tel2;

    @Column(name = "tel3", length = 5)
    private String tel3;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getTel3() {
        return tel3;
    }

    public void setTel3(String tel3) {
        this.tel3 = tel3;
    }
}
