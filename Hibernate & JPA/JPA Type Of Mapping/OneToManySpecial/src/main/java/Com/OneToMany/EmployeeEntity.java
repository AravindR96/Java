package Com.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeEntity {
@Id
private int eid;
private String ename;
@Override
public String toString() {
	return "EmployeeEntity [eid=" + eid + ", ename=" + ename + "]";
}
public EmployeeEntity() {
	super();
	
}
public EmployeeEntity(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
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


}
