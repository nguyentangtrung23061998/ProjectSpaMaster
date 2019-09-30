package ptit.laptrinhjavaweb.dto;

public class ServiceDTO extends AbstractDTO{
	
	private String nameService;
	private Integer minutes;
	private double prices;
	private String description;
	
	public String getNameService() {
		return nameService;
	}
	public void setNameService(String nameService) {
		this.nameService = nameService;
	}
	public Integer getMinutes() {
		return minutes;
	}
	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}
	public double getPrices() {
		return prices;
	}
	public void setPrices(double prices) {
		this.prices = prices;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
