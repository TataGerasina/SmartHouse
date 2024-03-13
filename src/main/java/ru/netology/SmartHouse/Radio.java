package ru.netology.SmartHouse;

public class Radio {
    private int currentStation;
    private final int minStation;
    private final int maxStation;
    private int currentVolume;
    private final int minVolume;
    private final int maxVolume;


    public Radio() {
        this.minStation = 0;
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

    public void setCurrentStation(int newCurrentStation) {  //установить номер станции в пределах от 0 до 9
        if (newCurrentStation >= 0) {
            currentStation = newCurrentStation;
            if (newCurrentStation > 9) {
                currentStation = minStation;
            }
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {  //установить уровень громкости в пределах от 0 до 100
        if (newCurrentVolume >= 0) {
            currentVolume = newCurrentVolume;
            if (newCurrentVolume > 100) {
                currentVolume = 0;
            }
        }
    }

    public void next(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation < 9) {
            currentStation = newCurrentStation + 1;
        }
        if (newCurrentStation == 9) {
            currentStation = minStation;
        }
    }

    public void prev(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation > 0) {
            currentStation = newCurrentStation - 1;
        }
        if (newCurrentStation == 0) {
            currentStation = maxStation;
        }
    }


    public void increaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume < 100) {
            currentVolume = newCurrentVolume + 1;
        }
        if (newCurrentVolume == 100) {
            currentVolume = minVolume;
        }
    }

    public void decreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume > 0) {
            currentVolume = newCurrentVolume - 1;
        }
        if (newCurrentVolume == 0) {
            currentVolume = maxVolume;
        }
    }
}
