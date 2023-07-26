package Com.OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

@Entity
public class CompanyEntity {
@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
private int companyId;
private String companyName;
@OneToMany(cascade = CascadeType.PERSIST)
@JoinTable(name = "employee_company",joinColumns = { @JoinColumn(name = "my_db_company_id")},
         inverseJoinColumns = { @JoinColumn(name = "my_db_employee_id", unique=true)})
private List<EmployeeEntity> employees;
@Override
public String toString() {
	return "CompanyEntity [companyId=" + companyId + ", companyName=" + companyName + ", employees=" + employees + "]";
}
public CompanyEntity() {
	super();

}
public CompanyEntity(int companyId, String companyName, List<EmployeeEntity> employees) {
	super();
	this.companyId = companyId;
	this.companyName = companyName;
	this.employees = employees;
}
public int getCompanyId() {
	return companyId;
}
public void setCompanyId(int companyId) {
	this.companyId = companyId;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public List<EmployeeEntity> getEmployees() {
	return employees;
}
public void setEmployees(List<EmployeeEntity> employees) {
	this.employees = employees;
}

}
