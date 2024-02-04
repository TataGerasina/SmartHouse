package ru.netology.SmartHouse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetNumberRadioStation() {
        Radio cond = new Radio();

        cond.setCurrentNumberRadioStation(5);

        int expected = 5;
        int actual = cond.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextNumberRadioStation(){
        Radio cond = new Radio();

        cond.setNextStation(4);

        int expected = 5;
        int actual = cond.getNextStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume() { // выставить громкость
        Radio cond = new Radio();

        cond.setCurrentVolume(80);

        int expected = 80;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() { // выставить макс громкость
        Radio cond = new Radio();

        cond.setToMaxVolume();

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldSetToMinVolume() { // выставить мин громкость
        Radio cond = new Radio();

        cond.setToMinVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() { //увеличить громкость
        Radio cond = new Radio();
        cond.setCurrentVolume(98);

        cond.increaseVolume();

        int expected = 99;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolume() { // уменьшить громкость
        Radio cond = new Radio();
        cond.setCurrentVolume(36);

        cond.decreaseVolume();

        int expected = 35;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() { // не выставлять громкость больше макс громкости
        Radio cond = new Radio();

        cond.setCurrentVolume(200);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldNotSetVolumeAboveMin() { // не выставлять громкость меньше мининума, если это возможно:-)
        Radio cond = new Radio();

        cond.setCurrentVolume(-20);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
}
