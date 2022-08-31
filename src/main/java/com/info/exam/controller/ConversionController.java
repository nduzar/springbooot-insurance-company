package com.info.exam.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.exam.service.DollarConversionService;
import com.info.exam.service.FahrenheitConversionService;
import com.info.exam.service.KilometreService;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ConversionController {

   private final DollarConversionService dollarToRandsService;

   private final FahrenheitConversionService fahrenheitToCelsiusService;

   private final KilometreService mileToKilometreService;

   @GetMapping(value = "/dollarConversion")
   public ResponseEntity<?> dollarConversion(@PathVariable @NonNull int dollar) {
      return ResponseEntity.ok().body(dollarToRandsService.dollarConversion(dollar));
   }

   @GetMapping(value = "/fahrenheitConversion")
   public ResponseEntity<?> fahrenheitConversion(@PathVariable @NonNull float fahrenheit) {
      return ResponseEntity.ok().body(fahrenheitToCelsiusService.fahrenheitConversion(fahrenheit));
   }

   @GetMapping(value = "/kilometreConversion")
   public ResponseEntity<?> kilometreConversion(@PathVariable @NonNull int kilometre) {
      return ResponseEntity.ok().body(mileToKilometreService.kilometreConversion(kilometre));
   }

}
