package com.app.model;

public class Employee {
	private int eid;
	private String ename;
	public Employee() {
		super();
	}

	public Employee(int eid, String ename, String email, String password, String address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.password = password;
		this.address = address;
	}

	private String email;
	private String password;
	private String address;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", password=" + password
				+ ", address=" + address + "]";
	}

}
