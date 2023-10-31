package org.velezreyes.quiz.question6.models;


public interface Drink {
  public String getName();
  public void setFizzy(boolean isFizzy);
  public boolean isFizzy();
  public void setPrice(double price);
  public double getPrice();
}