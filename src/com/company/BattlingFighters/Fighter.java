package com.company.BattlingFighters;

import java.util.Random;

public class Fighter {

  protected final String name;
  protected final String type;
  protected final int skill;
  protected int stamina;
  protected final Random rng;
  protected int diceRoll;

  public Fighter(String name, String type, int skill, int stamina) {
    assert skill < 18 && skill > 1;
    assert stamina < 24 && stamina > 1;
    this.name = name;
    this.type = type;
    this.skill = skill;
    this.stamina = stamina;
    this.rng = new Random();
    rollDice();
  }

  public String getName() {
    return name;
  }

  protected void rollDice() {
    diceRoll = rng.nextInt(6) + 1;
  }

  public void takeDamage(int damage) {
    stamina -= damage;
    if (stamina < 0) {
      stamina = 0;
    }
  }

  public int calculateAttackScore() {
    int attackScore = skill;
    for (int i = 0; i < 2; i++) {
      rollDice();
      attackScore += diceRoll;
    }
    return attackScore;
  }

  public int calculateDamage(){
    return 2;
  }

  public boolean isDead(){
    return stamina == 0;
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    res.append(name);
    res.append(" - ");
    res.append(type);
    res.append(" - ");
    res.append("skill: ");
    res.append(skill);
    res.append(" - ");
    res.append("stamina: ");
    res.append(stamina);
    return res.toString();
  }
}
