package com.info.exam.service;

import org.springframework.stereotype.Service;

@Service
public class DollarConversionService {

   public static float RANDS_RATE = 16.84f;

   public float dollarConversion(int dollar) {
      float rands = RANDS_RATE * dollar;
      System.out.println("South African Rand: " + rands);
      return rands;
   }

}
