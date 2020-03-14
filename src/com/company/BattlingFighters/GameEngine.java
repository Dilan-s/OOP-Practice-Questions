package com.company.BattlingFighters;

public class GameEngine {

  private final Fighter fighter1;
  private final Fighter fighter2;

  public GameEngine(Fighter fighter1, Fighter fighter2) {
    this.fighter1 = fighter1;
    this.fighter2 = fighter2;
  }

  public void simulateBattle() {
    System.out.println("At start of battle, stats are:");
    System.out.println(fighter1);
    System.out.println(fighter2);
    System.out.println("------------------------------");
    while (!fighter1.isDead() && !fighter2.isDead()) {
      int fighter1attack = fighter1.calculateAttackScore();
      int fighter2attack = fighter2.calculateAttackScore();
      StringBuilder res = new StringBuilder();
      if (fighter1attack == fighter2attack) {
        res.append(fighter1.getName());
        res.append(" draws with ");
        res.append(fighter2.getName());
        System.out.println(res);
      } else {
        if (fighter1attack > fighter2attack) {
          res.append(fighter1.getName());
          res.append(" hits ");
          res.append(fighter2.getName());
          fighter2.takeDamage(fighter1.calculateDamage());
        } else {
          res.append(fighter2.getName());
          res.append(" hits ");
          res.append(fighter1.getName());
          fighter1.takeDamage(fighter2.calculateDamage());
        }
        res.append(", stats are:");
        System.out.println(res);
        System.out.println(fighter1);
        System.out.println(fighter2);
      }
      System.out.println("------------------------------");
    }
    StringBuilder result = new StringBuilder();
    result.append("End of battle, ");
    if (fighter1.isDead()){
      result.append(fighter2);
    } else {
      result.append(fighter1);
    }
    result.append(" wins!");
    System.out.println(result);
  }

}
