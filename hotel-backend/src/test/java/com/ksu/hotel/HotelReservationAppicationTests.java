package com.ksu.hotel;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class HotelReservationAppicationTests {
	
        @Autowired
        ObjectMapper objectmapper;
        @Autowired
        MockMvc mockmvc;
		@Test
		void contextLoads() {
		}
	   @Test
	   public void getBookingTest() throws Exception {
		 
	   }
	   @Test
	   public void saveBookingTest() throws Exception {
		 
	   }
	   @Test
	   public void saveCustomerTest() throws Exception {
		 
	   }
	   @Test
	   public void cancelBookingTest() throws Exception {
		 
	   }@Test
	   public void savePaymentTest() throws Exception {
		 
	   }
       
}
