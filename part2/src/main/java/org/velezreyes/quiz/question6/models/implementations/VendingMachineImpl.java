package org.velezreyes.quiz.question6.models.implementations;

import org.velezreyes.quiz.question6.models.Drink;
import org.velezreyes.quiz.question6.models.VendingMachine;
import org.velezreyes.quiz.question6.exceptions.NotEnoughMoneyException;
import org.velezreyes.quiz.question6.exceptions.UnknownDrinkException;


public class VendingMachineImpl implements VendingMachine {
  private double money;

  public VendingMachineImpl() {
      this.money = 0;
  }

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }

  @Override
  public void insertQuarter() {
    this.money += 0.25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    Drink drink = createDrink(name);

    if (this.money < drink.getPrice()) {
      throw new NotEnoughMoneyException();
    }

    return drink;
  }

  private Drink createDrink(String name) throws UnknownDrinkException {
    if (name.equals("ScottCola")) {
      Drink drink = new DrinkImpl(name);

      drink.setFizzy(true);
      drink.setPrice(0.45);

      return drink;
    } else if (name.equals("KarenTea")) {
      Drink drink = new DrinkImpl(name);

      drink.setFizzy(false);
      drink.setPrice(1.0);

      return drink;
    }

    throw new UnknownDrinkException();
  }
}
