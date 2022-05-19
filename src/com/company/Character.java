package com.company;

public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 180;

    /**
     * two Constructors
     * Non Parameterized Constructor
     */

    Character(){
        System.out.println("null");
    }

    /**
     * Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(String name, int lvl, int hp, int mana) {
        characterName = name;
        level = lvl;
        healthPoints = hp;
        manaPoints = mana;
    }

    /**
     * Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void displayName() {
        System.out.println("Character Initialized : " + characterName);
    }

    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter, int damagePoints, int manaDecrease, Character name) {
        /**
         * Deduct health points from enemy character
         */
        // + deduct character manaPoints
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("enemy character HP Left = " + enemyCharacter.healthPoints);
        name.manaPoints = name.manaPoints - manaDecrease;

        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */

        // + Level Up Character
        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("Character " + enemyCharacter.characterName + " defeated.");
            name.level += 10;
            System.out.println(name.characterName + " Level up!!");
        }
    }

    //Level up Method
    public void levelUp(Character name) {
        name.level += 10;
        System.out.println(name.characterName + " Level Up");

    }

    //method on displaying current character details
    public void displayDetails() {
        System.out.println("Wizard : " + characterName);
        System.out.println("HealthPoints : " + healthPoints);
        System.out.println("Mana Points : " + manaPoints);
        System.out.println("Level : " + level);
        System.out.print("\n");
    }
}
