package com.hotel.reservation.system.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.hotel.reservation.system.model.SearchHotelModel;
import com.hotel.reservation.system.service.HotelReservationService;

@Controller
@RequestMapping("/hotel")
public class HotelReservationController {

	@Autowired
	private HotelReservationService service;
	
	@RequestMapping(path = "/search", method = RequestMethod.GET)
	public String searchHotel(Model model) {
		Map<Integer, String> city = this.service.getCity();
		model.addAttribute("city", city);
		model.addAttribute("searchHotel", new SearchHotelModel());
		return "search-hotel";
	}
	
	@RequestMapping(path = "/loadHotelsByCity/{cityId}", method = RequestMethod.GET)
	@ResponseBody
	public String getHotels(@PathVariable("cityId") Integer cityId) {
		Gson gson = new Gson();
		Map<Integer, String> hotel = this.service.findHotel(cityId);
		return gson.toJson(hotel);
	}
	
	@RequestMapping(path = "/checkAvailability", method = RequestMethod.POST)
	public String checkAvailability(@ModelAttribute("searchHotel") SearchHotelModel model) {
		System.out.println("City Id = " + model.getCityId());
		System.out.println("Hotel Id = " + model.getHotelId());
		System.out.println("Date = " + model.getDate());
		return "";
	}
}
