package org.velezreyes.quiz.question6.models;

import org.velezreyes.quiz.question6.exceptions.NotEnoughMoneyException;
import org.velezreyes.quiz.question6.exceptions.UnknownDrinkException;


public interface VendingMachine {
  public void insertQuarter();
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException;
}