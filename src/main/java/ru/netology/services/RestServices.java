package ru.netology.services;

    public class RestServices {
        public int RestServices(int income, int expenses, int threshold) {

            int x = 0;// деньги
            int y = 0; //сбережения
            //int z = 1; //месяцы

            for (int z = 1; z < 12; z++) {
                if (x >= threshold) {
                    y++;
                    x = (x - expenses) / 3;
                } else {

                    x = x + income - expenses ;
                }
            }
            return y;
        }
    }