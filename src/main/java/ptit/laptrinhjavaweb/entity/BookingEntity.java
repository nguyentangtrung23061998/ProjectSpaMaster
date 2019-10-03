package ptit.laptrinhjavaweb.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class BookingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;

	@Column(name = "bookingdate")
	private String bookingDate;

	@Column(name = "minutes")
	private Integer minutes;

	@Column(name = "starttime")
	private String startTime;

	@Column(name = "endtime")
	private String endTime;

	@Column(name = "createddate")
	private Timestamp createdDate;

	@Column(name = "modifieddate")
	private Timestamp modifieddate;

	@Column(name = "createdby")
	private String createdBy;

	@Column(name = "modifiedby")
	private String modifiedBy;

	@ManyToOne
	@JoinColumn(name = "storeid")
	private StoreEntity store;

	@ManyToOne
	@JoinColumn(name = "serviceid")
	private ServiceEntity service;

	@ManyToOne
	@JoinColumn(name = "customerid")
	private CustomerEntity customer;

	@ManyToOne
	@JoinColumn(name="bookingstatusid")
	private BookingStatusEntity bookingStatus;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Integer getMinutes() {
		return minutes;
	}

	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	public StoreEntity getStore() {
		return store;
	}

	public void setStore(StoreEntity store) {
		this.store = store;
	}

	public ServiceEntity getService() {
		return service;
	}

	public void setService(ServiceEntity service) {
		this.service = service;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	
	
	public BookingStatusEntity getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(BookingStatusEntity bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public BookingEntity() {
	}

	public BookingEntity(String bookingDate, Integer minutes, String startTime, String endTime,
			Timestamp createdDate, Timestamp modifieddate, String createdBy, String modifiedBy, StoreEntity store,
			ServiceEntity service, CustomerEntity customer, BookingStatusEntity bookingStatus) {
		this.bookingDate = bookingDate;
		this.minutes = minutes;
		this.startTime = startTime;
		this.endTime = endTime;
		this.createdDate = createdDate;
		this.modifieddate = modifieddate;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.store = store;
		this.service = service;
		this.customer = customer;
		this.bookingStatus = bookingStatus;
	}

	@Override
	public String toString() {
		return "BookingEntity [id=" + id + ", bookingDate=" + bookingDate + ", minutes=" + minutes + ", startTime="
				+ startTime + ", endTime=" + endTime + ", createdDate=" + createdDate + ", modifieddate=" + modifieddate
				+ ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy + ", store=" + store + ", service="
				+ service + ", customer=" + customer + ", bookingStatus=" + bookingStatus + "]";
	}

	
}
