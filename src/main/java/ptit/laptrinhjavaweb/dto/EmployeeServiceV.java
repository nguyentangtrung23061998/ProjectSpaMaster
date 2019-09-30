package ptit.laptrinhjavaweb.dto;

import java.sql.Timestamp;

public class EmployeeServiceV {
	private Integer id;
	private String nameService;
	private String fullNameEmployee;
	private String pathImage;
	private Timestamp createdDate;
	private Timestamp modifieddate;
	private String createdBy;
	private String modifiedBy;
	
	public EmployeeServiceV() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameService() {
		return nameService;
	}

	public void setNameService(String nameService) {
		this.nameService = nameService;
	}

	public String getFullNameEmployee() {
		return fullNameEmployee;
	}

	public void setFullNameEmployee(String fullNameEmployee) {
		this.fullNameEmployee = fullNameEmployee;
	}

	public String getPathImage() {
		return pathImage;
	}

	public void setPathImage(String pathImage) {
		this.pathImage = pathImage;
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
	
	
}
