package com.capgemini.gke.demogke.service.impl;

import com.capgemini.gke.demogke.service.IFibonacciService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

@Service
public class FibonacciService implements IFibonacciService {
  
  private final List<BigInteger> base = List.of(BigInteger.valueOf(0), BigInteger.valueOf(1), BigInteger.valueOf(2));

  @Override
  public List<BigInteger> getOrderByCount(Integer cnt) {
    List<BigInteger> response = new LinkedList<>();
    if(cnt<=base.size()){
      for(int i=0; i<cnt; i++){
        response.add(base.get(i));
      }
      return response;
    }
    response.addAll(base);
    for(int i=0; i<cnt; i++)
    {
      response.add(this.getNextValue(response.get(response.size()-1), response.get(response.size()-2)));
    }
    return response;
  }
  
  private BigInteger getNextValue(final BigInteger current, final BigInteger previous){
    return current.add(previous);
  }
}
