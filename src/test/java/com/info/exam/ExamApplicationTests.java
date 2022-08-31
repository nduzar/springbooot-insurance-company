package com.info.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.info.exam.service.DollarConversionService;
import com.info.exam.service.FahrenheitConversionService;
import com.info.exam.service.KilometreService;

import lombok.RequiredArgsConstructor;

@RunWith(SpringRunner.class)
@SpringBootTest
@RequiredArgsConstructor
class ExamApplicationTests {

   @Autowired
   DollarConversionService dollarConversionService;

   @Autowired
   FahrenheitConversionService fahrenheitConversionService;

   @Autowired
   KilometreService kilometreService;

   public static float RANDS_RATE = 16.84f;

   public static float MILES = 0.621371F;

   @Test
   void fahrenheitConversion() {
      Assertions.assertEquals(fahrenheitConversionService.fahrenheitConversion(32), 0);
   }

   @Test
   void dollarConversion() {
      Assertions.assertEquals(dollarConversionService.dollarConversion(1), RANDS_RATE);
   }

   @Test
   void kilometreConversion() {
      Assertions.assertEquals(kilometreService.kilometreConversion(1), MILES);
   }

}
