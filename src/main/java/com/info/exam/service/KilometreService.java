package com.info.exam.service;

import org.springframework.stereotype.Service;

@Service
public class KilometreService {

   public static float MILES = 0.621371F;

   public float kilometreConversion(int kilometre) {
      float miles = MILES * kilometre;
      return miles;
   }

}
