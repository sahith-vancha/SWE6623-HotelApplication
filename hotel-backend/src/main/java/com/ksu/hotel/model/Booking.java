package com.ksu.hotel.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="booking")
public class Booking {
    @Id
    @GeneratedValue
    private int bookingId;
    private int customerId;
    private Date checkIn;
    private Date checkOut;
    private int guests;
    private String hotel;
    private String roomType;
    public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	private double price;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	public int getGuests() {
		return guests;
	}
	public void setGuests(int guests) {
		this.guests = guests;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
    
    

}
