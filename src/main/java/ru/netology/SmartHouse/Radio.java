package ru.netology.SmartHouse;

public class Radio {
    public int currentNumberRadioStation;

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int newCurrentNumberRadioStation) {
        if (newCurrentNumberRadioStation < 0) {
            return;
        }
        if (newCurrentNumberRadioStation > 9) {
            return;
        }
        currentNumberRadioStation = newCurrentNumberRadioStation;
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) { // установить
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
    }

    public int nextStation;

    public int getNextStation() {
        return nextStation;
    }
    public void setNextStation(int newNextStation) {
        if (newNextStation < 0) {
            return;
        }
        if (newNextStation > 9) {
            return;
        }
        nextStation = newNextStation + 1;
    }
}







