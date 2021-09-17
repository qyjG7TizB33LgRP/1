package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponType("Холодное оружие");
        bossWeapon.setWeaponName("name");

        Boss boss = new Boss();
        boss.setLive(250);
        boss.setDamage(25);
        boss.setName("Аид");
        boss.setWeapon(bossWeapon);

        System.out.println("Тип оружие босса: " + boss.getWeapon().getWeaponType());
        System.out.println("Название оружие босса: " + bossWeapon.getWeaponName());



    }
}
