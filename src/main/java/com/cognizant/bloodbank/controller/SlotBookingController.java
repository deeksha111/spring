package com.cognizant.bloodbank.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.bloodbank.model.Hospitals;
import com.cognizant.bloodbank.model.SlotBooking;
import com.cognizant.bloodbank.service.SlotBookingService;

@RestController
public class SlotBookingController {
                
                @Autowired
                SlotBookingService slotBookingService;
                
/*           @GetMapping("/hospitals/{pincode}")
                public List<Hospitals> getHospitals(@PathVariable int pincode){
                                return slotBookingService.getHospitals(pincode);
                                
                }
                */
                
                @GetMapping("/hospitals/{pincode}")
                public List<String> getHospitals(@PathVariable int pincode){
                                return slotBookingService.donors(pincode);
                }
                
                @PostMapping("/slot")
                public void postSlot(@RequestBody SlotBooking slotBooking){
                                slotBookingService.postSlot(slotBooking);
                }
                
                @GetMapping("/hospitalid/{name}/{pincode}")
                public int getHospitalId(@PathVariable String name,@PathVariable int pincode){
                                return slotBookingService.hospitalId(name, pincode);
                }
                

}

