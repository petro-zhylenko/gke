package com.capgemini.gke.demogke.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/fibonacci")
public interface IFibonacciController {
  
  @GetMapping("/{cnt}")
  List<BigInteger> getOrder(@PathVariable("cnt") @Valid @NotNull(message = "Cann't be null") @Min(value = 1, message = "Must be more than 1") Integer cnt);
  
}
