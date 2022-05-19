package com.company;

public class Warlock extends Character{
    //Warlock constructor inherits character class
    Warlock(String name, int lvl, int hp, int mana){
        super(name, lvl, hp, mana);
    }
    //Warlock Skills method class
    // Warlock skill no.1 with damage and mana reduction upon cast
    public void shadowSphere (Character enemyCharacter, Character name){
        int damagePoints = 35;
        int manaDecrease = 40;
        System.out.println(super.characterName + " Casts shadowSphere (-40 Mana) " + enemyCharacter.characterName + " Damage done(-35hp)");
        damageTarget(enemyCharacter, damagePoints, manaDecrease, name);
    }

    //Warlock Skill no. 2 Self-heal(Health Points Increase)
    public void healingOrb () {
        super.healthPoints += 50;
        System.out.println(super.characterName + " Health restored + 50hp");
    }

    //Warlock skill no.3 with damage and mana reduction upon cast
    public void meteorBolt (Character enemyCharacter, Character name){
        int damagePoints = 40;
        int manaDecrease = 20;
        System.out.println(super.characterName + " Casts meteorBolt (-20 Mana) " + enemyCharacter.characterName + " Damage done(-40hp)");
        damageTarget(enemyCharacter, damagePoints, manaDecrease, name);
    }

}
