package com.company.BattlingFighters;

public class LuckyGameEngine {

  private final LuckyFighter fighter1;
  private final LuckyFighter fighter2;

  public LuckyGameEngine(LuckyFighter fighter1, LuckyFighter fighter2) {
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
        LuckyFighter f1, f2;
        if (fighter1attack > fighter2attack) {
          f1 = fighter1;
          f2 = fighter2;
        } else {
          f1 = fighter2;
          f2 = fighter1;
        }
        f2.takeDamage(f1.calculateDamage());
        if (f1.getAffect() == 1) {
          res.append(f1.getName());
          res.append(" tests luck... \n");
          res.append(f1.getName());
          res.append(" is lucky!\nThe hit is aggressive!\n");
        } else if (f1.getAffect() == -1) {
          res.append(f2.getName());
          res.append(" tests luck... \n");
          res.append(f2.getName());
          res.append(" is unlucky!\nThe hit is weak!\n");
        } else if (f2.getAffect() == 1) {
          res.append(f2.getName());
          res.append(" tests luck... \n");
          res.append(f2.getName());
          res.append(" is luck!\nThe hit is resisted!\n");
        } else if (f2.getAffect() == -1) {
          res.append(f2.getName());
          res.append(" tests luck... \n");
          res.append(f2.getName());
          res.append(" is luck!\nThe hit is more damaging!\n");
        }
        res.append(f1.getName());
        res.append(" hits ");
        res.append(f2.getName());
      }
      res.append(", stats are:");
      System.out.println(res);
      System.out.println(fighter1);
      System.out.println(fighter2);
      System.out.println("------------------------------");
    }

    StringBuilder result = new StringBuilder();
    result.append("End of battle, ");
    if (fighter1.isDead()) {
      result.append(fighter2);
    } else {
      result.append(fighter1);
    }
    result.append(" wins!");
    System.out.println(result);
  }

}
