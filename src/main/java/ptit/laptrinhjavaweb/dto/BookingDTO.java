package ptit.laptrinhjavaweb.dto;

import java.sql.Timestamp;

public class BookingDTO extends AbstractDTO{
	
	private Timestamp bookingDate;
	private Integer minutes;
	private Integer prices;
	private Integer discount;
	private Integer startTime;
	private Integer endTime;
	
	public Timestamp getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Timestamp bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Integer getMinutes() {
		return minutes;
	}
	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}
	public Integer getPrices() {
		return prices;
	}
	public void setPrices(Integer prices) {
		this.prices = prices;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public Integer getStartTime() {
		return startTime;
	}
	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}
	public Integer getEndTime() {
		return endTime;
	}
	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}
	
	
	
}
