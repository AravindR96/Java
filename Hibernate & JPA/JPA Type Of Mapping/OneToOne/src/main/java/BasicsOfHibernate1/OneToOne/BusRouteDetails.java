package BasicsOfHibernate1.OneToOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="bus_route")
public class BusRouteDetails {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name ="bus_number")
	private int busNo;
     @Column(name="bus_details")
	private String BusRoute;
	public int getBusNo() {
		return busNo;
	}
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public String getBusRoute() {
		return BusRoute;
	}
	public void setBusRoute(String busRoute) {
		BusRoute = busRoute;
	}
	

}
