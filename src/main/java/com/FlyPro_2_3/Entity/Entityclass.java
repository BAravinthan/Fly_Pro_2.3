package com.FlyPro_2_3.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="flypro2_3_table")
public class Entityclass {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="fp_id")
private long p_id;
public long getP_id() {
	return p_id;
}
public void setP_id(long p_id) {
	this.p_id = p_id;
}
public String getP_fname() {
	return p_fname;
}
public void setP_fname(String p_fname) {
	this.p_fname = p_fname;
}
public String getP_lname() {
	return p_lname;
}
public void setP_lname(String p_lname) {
	this.p_lname = p_lname;
}
public String getP_phone_number() {
	return p_phone_number;
}
public void setP_phone_number(String p_phone_number) {
	this.p_phone_number = p_phone_number;
}
public String getP_email_id() {
	return p_email_id;
}
public void setP_email_id(String p_email_id) {
	this.p_email_id = p_email_id;
}
public String getP_password() {
	return p_password;
}
public void setP_password(String p_password) {
	this.p_password = p_password;
}
public String getP_c_password() {
	return p_c_password;
}
public void setP_c_password(String p_c_password) {
	this.p_c_password = p_c_password;
}
@Column(name="fp_fname")
private String p_fname ;
@Column(name="fp_lname")
private String p_lname;
@Column(name="fp_phone_number")
private String p_phone_number;
@Column(name="fp_email_id")
private String p_email_id;
@Column(name="fp_password")
private String p_password;
@Column(name="fp_c_password")
private String p_c_password;

}
