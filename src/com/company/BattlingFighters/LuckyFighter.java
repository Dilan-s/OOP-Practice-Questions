package com.company.BattlingFighters;

public class LuckyFighter extends Fighter {

  private Strategy strategy;
  private int luck;
  private int affect;

  public LuckyFighter(String name, String type, int skill, int stamina, int luck,
      Strategy strategy) {
    super(name, type, skill, stamina);
    this.luck = luck;
    this.strategy = strategy;
  }

  public int getAffect() {
    return affect;
  }

  public void testLuckAttack() {
    rollDice();
    int diceRoll1 = diceRoll;
    rollDice();
    int diceRoll2 = diceRoll;
    if (diceRoll1 + diceRoll2 <= luck) {
      switch (strategy) {
        case BALANCED:
          balancedLuckyAttack();
          break;
        case DEFENCIVE:
          defenciveLuckyAttack();
          break;
        case AGGRESSIVE:
          aggressiveLuckyAttack();
          break;
      }
    } else {
      affect = -1;
    }
    luck--;
  }

  public void testLuckDefence() {
    int diceRoll1 = rng.nextInt(6) + 1;
    int diceRoll2 = rng.nextInt(6) + 1;
    if (diceRoll1 + diceRoll2 <= luck) {
      switch (strategy) {
        case BALANCED:
          balancedLuckyDefence();
          break;
        case DEFENCIVE:
          defenciveLuckyDefence();
          break;
        case AGGRESSIVE:
          aggressiveLuckyDefence();
          break;
      }
    } else {
      affect = -1;
    }
    luck--;
  }

  private void balancedLuckyAttack() {
    int choice = rng.nextInt(2);
    if (choice == 0) {
      affect = 1;
    } else {
      affect = 0;
      luck++;
    }
  }

  private void defenciveLuckyAttack() {
    int choice = rng.nextInt(10);
    if (choice == 0) {
      affect = 1;
    } else {
      affect = 0;
      luck++;
    }
  }


  private void aggressiveLuckyAttack() {
    int choice = rng.nextInt(10);
    if (choice != 0) {
      affect = 1;
    } else {
      affect = 0;
      luck++;
    }
  }

  private void balancedLuckyDefence() {
    int choice = rng.nextInt(2);
    if (choice == 0) {
      affect = 1;
    } else {
      affect = 0;
      luck++;
    }
  }

  private void defenciveLuckyDefence() {
    int choice = rng.nextInt(10);
    if (choice != 0) {
      affect = 1;
    } else {
      affect = 0;
      luck++;
    }
  }

  private void aggressiveLuckyDefence() {
    int choice = rng.nextInt(10);
    if (choice == 0) {
      affect = 1;
    } else {
      affect = 0;
      luck++;
    }
  }

  @Override
  public void takeDamage(int damage) {
    int test = rng.nextInt(2);
    if (test == 0) {
      testLuckDefence();
    }
    if (affect == 1) {
      damage += damage;
    } else if (affect == -1) {
      damage--;
    }
    stamina -= damage;
    if (stamina < 0) {
      stamina = 0;
    }
  }

  @Override
  public int calculateDamage() {
    int test = rng.nextInt(2);
    if (test == 0) {
      testLuckAttack();
    }
    int damage = 2;
    if (affect == 1) {
      damage += damage;
    } else if (affect == -1) {
      damage--;
    }
    return damage;

  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    res.append(name);
    res.append(" - ");
    res.append(strategy);
    res.append(' ');
    res.append(type);
    res.append(" - ");
    res.append("skill: ");
    res.append(skill);
    res.append(" - ");
    res.append("stamina: ");
    res.append(stamina);
    res.append(" - ");
    res.append("luck : ");
    res.append(luck);
    return res.toString();
  }
}
