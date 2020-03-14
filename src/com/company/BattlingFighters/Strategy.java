package com.company.BattlingFighters;

public enum Strategy {

  AGGRESSIVE("Aggressive"),
  DEFENCIVE("Defencive"),
  BALANCED("Balanced");

  String strategy;

  Strategy(String strategy){
    this.strategy = strategy;
  }

  @Override
  public String toString() {
    return strategy;
  }
}
