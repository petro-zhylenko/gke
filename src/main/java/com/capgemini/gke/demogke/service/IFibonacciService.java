package com.capgemini.gke.demogke.service;

import java.math.BigInteger;
import java.util.List;

public interface IFibonacciService {
  
  List<BigInteger> getOrderByCount(Integer cnt);
  
}
