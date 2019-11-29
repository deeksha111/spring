package com.cognizant.bloodbank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.bloodbank.model.Hospitals;
import com.cognizant.bloodbank.model.SlotBooking;
import com.cognizant.bloodbank.repository.HospitalRepository;
import com.cognizant.bloodbank.repository.SlotBookingRepository;
@Service
public class SlotBookingService {

                
                @Autowired
                SlotBookingRepository slotBookingRepository;
                
                @Autowired
                HospitalRepository hospitalRepository;
                
                public List<String> getHospitals(int pincode){
                                return hospitalRepository.getHospitalList(pincode);
                                
                }
                
//            public List<String> donors(int pincode){
//                            List<String> hospitals=hospitalRepository.getHospitalList(pincode);
//                            List<String> hospitalname = new ArrayList<>();
//                            for (Hospitals h  : hospitals) {
//                                            hospitalname.add(h.getName());
//                                            
//                            }
//                            return hospitalname;
//            }
                public List<String> donors(int pincode){
                                List<String> hospitals=hospitalRepository.getHospitalList(pincode);
                                return hospitals;
                }

                public void postSlot(SlotBooking slotBooking)
                {
                                slotBookingRepository.save(slotBooking);
                
                }
                
                public int hospitalId(String name,int pincode){
                                return hospitalRepository.getHospitalId(name, pincode);
                }
                

}
