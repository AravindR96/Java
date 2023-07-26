package Com.ManyToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class EmployeeEntity {
	@Id
	private int eid;
	private String ename;
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="dId_fk")
	private DepartmentEntity department;
	public EmployeeEntity(int eid, String ename, DepartmentEntity department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.department = department;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [eid=" + eid + ", ename=" + ename + ", department=" + department + "]";
	}
	public EmployeeEntity() {
		super();
	
	}
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
	public DepartmentEntity getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentEntity department) {
		this.department = department;
	}
	
}
