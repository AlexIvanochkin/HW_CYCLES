package ru.netology.services;

    public class RestServices {
        public int RestServices(int income, int expenses, int threshold) {

            int money = 0;// деньги
            int capital = 0; //сбережения
            //int z = 1; //месяцы

            for (int i = 1; i < 12; i++) {
                if (money >= threshold) {
                    capital++;
                    money = (money - expenses) / 3;
                } else {

                    money = money + income - expenses ;
                }
            }
            return capital;
        }
    }