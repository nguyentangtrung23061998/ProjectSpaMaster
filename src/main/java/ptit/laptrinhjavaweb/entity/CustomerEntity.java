package ptit.laptrinhjavaweb.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.NotFound;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "customer")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@NotNull
	@Column(name = "username")
	private String username;

	@NotNull
	@Column(name = "password")
	private String password;

	@Column(name = "email")
	private String email;

	@Column(name = "telephone")
	private String telephone;

	@Column(name = "token")
	private String token;

	@Column(name = "createddate")
	private Timestamp createdDate;

	@Column(name = "modifieddate")
	private Timestamp modifieddate;

	@Column(name = "createdby")
	private String createdBy;

	@Column(name = "modifiedby")
	private String modifiedBy;

	@ManyToOne
	@JoinColumn(name = "storekeeperid")
	@JsonBackReference
	private StorekeeperEntity storekeeper;

	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
				CascadeType.REFRESH }, mappedBy = "customer",fetch=FetchType.EAGER)
	List<BookingEntity> booking;

//	@ManyToOne(fetch=FetchType.EAGER,cascade= {CascadeType.PERSIST,CascadeType.MERGE,
//			CascadeType.DETACH,CascadeType.REFRESH})
//	@JoinColumn(name="storekeeperid", nullable = false)
//	private StoreKeeperEntity storeKeeper;

	public CustomerEntity() {

	}

	public CustomerEntity(String username, String password, String email, String telephone, String token,
			Timestamp createdDate, Timestamp modifieddate, String createdBy, String modifiedBy,
			StorekeeperEntity storekeeper) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.telephone = telephone;
		this.token = token;
		this.createdDate = createdDate;
		this.modifieddate = modifieddate;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.storekeeper = storekeeper;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
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

	public StorekeeperEntity getStorekeeper() {
		return storekeeper;
	}

	public void setStorekeeper(StorekeeperEntity storekeeper) {
		this.storekeeper = storekeeper;
	}

	public List<BookingEntity> getBooking() {
		return booking;
	}

	public void setBooking(List<BookingEntity> booking) {
		this.booking = booking;
	}

	public void addBooking(BookingEntity tempCustomer) {
		if (booking == null) {
			booking = new ArrayList<>();
		}
		booking.add(tempCustomer);
		tempCustomer.setCustomer(this);
	}
}
