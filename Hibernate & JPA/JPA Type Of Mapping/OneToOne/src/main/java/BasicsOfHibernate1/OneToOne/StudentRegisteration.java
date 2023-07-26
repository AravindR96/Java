package BasicsOfHibernate1.OneToOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="Student_Regi")
public class StudentRegisteration {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="regiNo")
	private int registerNo;
	@Column(name ="StudentName")
	private String name;
	@Column(name ="department")
	private String Dept;
	@OneToOne
	private BusRouteDetails busroute;
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
	public BusRouteDetails getBusroute() {
		return busroute;
	}
	public void setBusroute(BusRouteDetails busroute) {
		this.busroute = busroute;
	}

}
