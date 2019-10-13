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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "customer")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@NotBlank(message="Username is not empty")
	@Size(min=1,message="Username is required")
	@Column(name = "username")
	private String username;

	@NotBlank(message="Password is not empty")
	@Size(min=1,message="Password is required")
	@Column(name = "password")
	private String password;

	@NotNull
	@Pattern(regexp="^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$", message="Email is invalid")
	@Column(name = "email")
	private String email;

	@NotNull(message="Telephone is required")
	@Pattern(regexp="^[0-9\\+]{1,}[0-9\\-]{3,15}$", message="Phone is invalid")
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
