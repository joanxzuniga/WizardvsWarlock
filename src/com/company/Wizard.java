package com.company;

public class Wizard extends Character{
    //Wizard constructor inherits character class
    Wizard(String name, int lvl, int hp, int mana) {
        super(name,lvl,hp,mana);
    }

    //Wizard Skill method class
    //Wizard skill no.1 with damage and mana reduction upon cast
    public void meteorBolt(Character enemyCharacter, Character name) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with meteorBolt (Damage - 55)");
        int damagePoints = 55;
        int manaDecrease = 35;
        damageTarget(enemyCharacter, damagePoints, manaDecrease, name);
    }

    //Wizard skill no.2 Self-heal(Health Points Increase)
    public void healingPool() {
        super.healthPoints += 50;
        System.out.println(super.characterName + " Health restored + 50hp");
    }

    //Wizard skill no.3 with damage and mana reduction upon cast
    public void shadowSphere(Character enemyCharacter, Character name) {
        int damagePoints = 35;
        int manaDecrease = 30;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with shadowSphere (Damage - 35)");
        damageTarget(enemyCharacter, damagePoints, manaDecrease, name);
    }
}
