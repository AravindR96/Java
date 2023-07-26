package Com.Hibernate.BasicsOfHibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RegisterationUser {
	@Id
	private int registerNo;
	private  String name;
	private String Dept;
	public int getRegisterNo() {
		return registerNo;
	}
	public void setRegisterNo(int registerNo) {
		this.registerNo = registerNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}

}
