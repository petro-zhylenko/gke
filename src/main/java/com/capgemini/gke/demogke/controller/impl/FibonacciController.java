package com.capgemini.gke.demogke.controller.impl;

import com.capgemini.gke.demogke.controller.IFibonacciController;
import com.capgemini.gke.demogke.service.IFibonacciService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FibonacciController implements IFibonacciController {
  private final IFibonacciService service;
  @Override
  public List<BigInteger> getOrder(@NonNull Integer cnt) {
    return service.getOrderByCount(cnt);
  }
}
