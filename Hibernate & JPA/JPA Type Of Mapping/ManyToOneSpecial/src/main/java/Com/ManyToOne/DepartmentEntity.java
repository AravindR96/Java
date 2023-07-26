package Com.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DepartmentEntity {
	@Id
	private int did;
	private String dname;
	@Override
	public String toString() {
		return "DepartmentEntity [did=" + did + ", dname=" + dname + "]";
	}
	public DepartmentEntity() {
		super();
		
	}
	public DepartmentEntity(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	

}
