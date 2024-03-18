package ru.netology.SmartHouse;
public class Radio {
    private int currentStation;
<<<<<<< HEAD
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
    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }
    public void prev() {
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
=======
    private int nextStation;
    private int prevStation;
    private int minStation;
    private int maxStation;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;

    public Radio() {
        this.minStation = 0;
        this.maxStation = 9;
        this.minVolume = 0;
        this.maxVolume = 100;
    }

    public Radio(int stationCount) {
        this.maxStation = stationCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    public int getNextStation() {
        return nextStation;
    }

    public void setNextStation() {

        if (currentStation >= minStation) {
            this.nextStation = currentStation + 1;
        }
    }

    public int getPrevStation() {
        return prevStation;
    }

    public void setPrevStation(int currentStation) {

        if (currentStation <= maxStation) {
            this.prevStation = currentStation - 1;
        }
    }

    public int getToMaxCurrentStation() {
        return currentStation;
    }

    public void setToMaxCurrentStation() {
        currentStation = maxStation;
}

public void setToMinCurrentStation() {
    currentStation = 0;
}

public int getCurrentVolume() {
    return currentVolume;
}

public void setCurrentVolume(int currentVolume) { // установить
    if (currentVolume < 0) {
        return;
    }
    if (currentVolume > maxVolume) {
        return;
    }
    this.currentVolume = currentVolume;
}

public int getToMaxVolume() {
    return maxVolume;
}

public void setToMaxVolume() {
    currentVolume = maxVolume;
}

public int getToMinVolume() {
    return minVolume;
}

public void setToMinVolume() {
    currentVolume = 0;
}

public void increaseVolume() {
    if (currentVolume < maxVolume) {
        currentVolume = currentVolume + 1;
    }
}

public void decreaseVolume() {
    if (currentVolume > minVolume) {
        currentVolume--;
    }
}
}
>>>>>>> 6997475adb6f6434dd2c83598cb8cf4add11a0e7
