
package ru.netology.SmartHouse;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private final int maxStation;
    private int minVolume;
    private int maxVolume;

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }

    public Radio() {
        this.maxStation = 9;
        this.minVolume = 0;
        this.maxVolume = 100;
    }

    public int getCurrentStation() { // вывести номер текущей станции
        return currentStation;
    }

    public int getCurrentVolume() { // вывести уровень громкости
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {  //установить номер станции в пределах от 0 до 9
        if (currentStation < minVolume) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {  //установить уровень громкости в пределах от 0 до 100
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }
}