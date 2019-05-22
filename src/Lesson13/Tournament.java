package Lesson13;

import Interfaces.CollectionUtils;

import java.security.KeyStore;
import java.util.*;

public class Tournament {
    private String nameTournir;
    private HashMap<String, Integer> teams = new HashMap<>();

    public Tournament() {
    }

    public Tournament(String name) {
        this.nameTournir = name;
    }

    public String getNameTournir() {
        return nameTournir;
    }

    public void setNameTournir(String nameTournir) {
        this.nameTournir = nameTournir;
    }

    public void addTeam(String nameTeam, int points) {
        if (teams.containsKey(nameTeam)) {
            int currentPoints = teams.get(nameTeam);
            teams.put(nameTeam, points + currentPoints);
        } else {
            teams.put(nameTeam, points);
        }
    }

    public void printTeam() {
        for (String key : teams.keySet()) {
            System.out.println(key + ": " + teams.get(key));

        }
    }

    public void PrintWinner() {
        int maxValue = 0;
        String vinnerName = "";
        for (String key : teams.keySet()) {

            if (teams.get(key) > maxValue) {
                maxValue = teams.get(key);
                vinnerName = key;
            }
        }
        System.out.println("Победитель: " + vinnerName + ", баллов - " + maxValue);
    }

    public void printLoser() {
        int minValue = Integer.MIN_VALUE;
        String vinnerName = "";
        for (String key : teams.keySet()) {

            if (teams.get(key) < minValue) {
                minValue = teams.get(key);
                vinnerName = key;
            }
        }
        System.out.println("Проигравший: " + vinnerName + ", баллов - " + minValue);
    }



    // Упорядочиваем по баллам


    public void printSortTable() {
        String[][] strings = new String[teams.size()][2];

        // Заполняем массив данными из teams:

        int k = 0;
        for (String key : teams.keySet()) {
            strings[k][0] = key;
            strings[k][1] = teams.get(key).toString();
            k++;
        }

        // Сортируем массив методом выбора по значению

        String tmpKey = "";
        String tmpValue = "";

        for (int left = 0; left < strings.length; left++) {
            int minInd = left;
            for (int i = left; i < strings.length; i++) {
                if (Integer.parseInt(strings[i][1]) > Integer.parseInt(strings[minInd][1])) {
                    minInd = i;
                }
            }

            tmpKey = strings[left][0];
            tmpValue = strings[left][1];

            strings[left][0] = strings[minInd][0];
            strings[left][1] = strings[minInd][1];

            strings[minInd][0] = tmpKey;
            strings[minInd][1] = tmpValue;
        }

        //Выводим на печать

        System.out.println("Рейтинг команд:");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i][0] + ": " + strings[i][1]);
        }

    }







    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tournament that = (Tournament) o;

        if (nameTournir != null ? !nameTournir.equals(that.nameTournir) : that.nameTournir != null) return false;
        return teams != null ? teams.equals(that.teams) : that.teams == null;
    }

    @Override
    public int hashCode() {
        int result = nameTournir != null ? nameTournir.hashCode() : 0;
        result = 31 * result + (teams != null ? teams.hashCode() : 0);
        return result;
    }
}
