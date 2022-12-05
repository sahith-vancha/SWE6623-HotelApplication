package com.ksu.hotel;
import org.springframework.http.MediaType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import com.ksu.hotel.dao.BookingRepository;
import com.ksu.hotel.dao.CustomerRepository;
import com.ksu.hotel.model.Booking;
import com.ksu.hotel.model.Customer;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class HotelReservationAppication {
	   @Autowired
	    private CustomerRepository customerrepository;
	   
	   @Autowired
	   private BookingRepository bookingrepository;
	   

	    @PostMapping("/register")
	    public String register(@RequestBody Customer customer) {
	    	customerrepository.save(customer);
	    	return "Hi "+customer.getName()+". You have registered";
	        
	    }
	    @PostMapping("/booking")
	    public String register(@RequestBody Booking booking) {
	    	bookingrepository.save(booking);
	    	return "You have succesfully reserved your booking";
	        
	    }
	    @CrossOrigin(origins = "http://localhost:4200")
	    @GetMapping("/findBooking/{customerId}")
	    public List<Booking> findBooking(@PathVariable int customerId) {
	        return bookingrepository.findByCustomerId(customerId);
	    }
	    @CrossOrigin(origins = "http://localhost:4200")
	    @DeleteMapping("/delete/{bookingId}")
	    public String cancelRegistration(@PathVariable int bookingId) {
	        bookingrepository.deleteById(bookingId);
	        return "You have succesfully cancelled your reservation";
	    }
	public static void main(String[] args) {
		SpringApplication.run(HotelReservationAppication.class, args);
	}

}