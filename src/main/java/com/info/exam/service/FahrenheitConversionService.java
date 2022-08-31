package com.info.exam.service;

import org.springframework.stereotype.Service;

@Service
public class FahrenheitConversionService {

   public float fahrenheitConversion(float fahrenheit) {
      float celsius = ((fahrenheit - 32) * 5) / 9;
      System.out.println("Temperature in celsius is: " + celsius);
      return celsius;
   }

}
