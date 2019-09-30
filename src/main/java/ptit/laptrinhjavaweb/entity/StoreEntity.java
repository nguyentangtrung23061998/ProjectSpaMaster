package ptit.laptrinhjavaweb.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "store")
public class StoreEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "createddate")
	private Timestamp createdDate;

	@Column(name = "modifieddate")
	private Timestamp modifieddate;

	@Column(name = "createdby")
	private String createdBy;

	@Column(name = "modifiedby")
	private String modifiedBy;

	@Column(name = "address")
	private String address;

	@Column(name = "description")
	private String description;

	@Column(name = "opentime")
	private Integer openTime;

	@Column(name = "closetime")
	private Integer closeTime;

	@OneToMany(mappedBy="store")
	List<EmployeeEntity> employees;
	
	@OneToMany(mappedBy="store")
	List<BookingEntity> booking;
	
	public StoreEntity() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getModifieddate() {
		return modifieddate;
	}

	public void setModifieddate(Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Integer openTime) {
		this.openTime = openTime;
	}

	public Integer getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(Integer closeTime) {
		this.closeTime = closeTime;
	}

	public List<EmployeeEntity> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeEntity> employees) {
		this.employees = employees;
	}
	
	public List<BookingEntity> getBooking() {
		return booking;
	}

	public void setBooking(List<BookingEntity> booking) {
		this.booking = booking;
	}

	public void addEmployee(EmployeeEntity tempStore) {
		if(employees == null) {
			employees = new ArrayList<>();
		}
		employees.add(tempStore);
		tempStore.setStore(this);
	}
	
	public void addBooking(BookingEntity tempStore) {
		if(booking == null) {
			booking = new ArrayList<>();
		}
		booking.add(tempStore);
		tempStore.setStore(this);
	}

//	@Override
//	public String toString() {
//		return "StoreEntity [id=" + id + ", createdDate=" + createdDate + ", modifieddate=" + modifieddate
//				+ ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy + ", address=" + address + ", description="
//				+ description + ", openTime=" + openTime + ", closeTime=" + closeTime + "]";
//	}

}
