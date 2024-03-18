package ru.netology.SmartHouse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RadioTest {
<<<<<<< HEAD
    @Test
    public void shouldSetCurrentStationLessThanMin() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(-2);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMoreThanMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(84);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStation8() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStation9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
=======

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

>>>>>>> 6997475adb6f6434dd2c83598cb8cf4add11a0e7
        Assertions.assertEquals(expected, actual);
    }
    @Test
<<<<<<< HEAD
    public void shouldSetCurrentVolumeLessThanMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-50);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMoreThanMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(120);
=======
    public void shouldBoundaryValuesStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBoundaryValues1Station() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBoundaryValues2Station() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLessThanMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-6);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMoreThanMaxStation() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(14);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxCurrentStation() { // выставить макс номер станцию
        Radio radio = new Radio();

        radio.setToMaxCurrentStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinCurrentStation() { // выставить мин номер станцию
        Radio radio = new Radio();

        radio.setToMinCurrentStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.setNextStation();

        int expected = 8;
        int actual = radio.getNextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setNextStation();

        int expected = 1;
        int actual = radio.getNextStation();

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void shouldNextStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.setToMinCurrentStation();

        int expected = 0;
        int actual = radio.getNextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation3() {
        Radio radio = new Radio();
        radio.setCurrentStation(55);

        radio.setToMaxCurrentStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation4() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        radio.setToMinCurrentStation();

        int expected = 0;
        int actual = radio.getNextStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStation5() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.setNextStation();

        int expected = 2;
        int actual = radio.getNextStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.setPrevStation(6);

        int expected = 5;
        int actual = radio.getPrevStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setToMaxCurrentStation();

        int expected = 9;
        int actual = radio.getToMaxCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSetPrevStation2() {
        Radio radio = new Radio();

        radio.setPrevStation(1);

        int expected = 0;
        int actual = radio.getPrevStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume() { // выставить громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(80);
        int expected = 80;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() { // выставить макс громкость
        Radio radio = new Radio();
        radio.setToMaxVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume1() { // выставить макс громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(105);
        int expected = 100;
        int actual = radio.getToMaxVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() { // выставить мин громкость
        Radio radio = new Radio();
        radio.setToMinVolume();
>>>>>>> 6997475adb6f6434dd2c83598cb8cf4add11a0e7
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
<<<<<<< HEAD
    public void shouldSetVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
=======
    public void shouldIncreaseVolume() { //увеличить громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume1() { //увеличить громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume2() { //увеличить громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getToMaxVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() { // уменьшить громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume1() { // уменьшить громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume2() { // уменьшить громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.decreaseVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume3() { // уменьшить громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getToMinVolume();
>>>>>>> 6997475adb6f6434dd2c83598cb8cf4add11a0e7
        Assertions.assertEquals(expected, actual);
    }
    @Test
<<<<<<< HEAD
    public void shouldSetVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
=======
    public void shouldNotSetVolumeAboveMax() { // не выставлять громкость больше макс громкости
        Radio radio = new Radio();
        radio.setCurrentVolume(200);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeNext100() { // не выставлять громкость больше макс громкости
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setToMaxVolume();


>>>>>>> 6997475adb6f6434dd2c83598cb8cf4add11a0e7
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
<<<<<<< HEAD
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStation3() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevStation5() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetDecreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetDecreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(78);
        radio.decreaseVolume();
        int expected = 77;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetDecreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.decreaseVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
=======
    public void shouldNotSetVolumeAboveMin() { // не выставлять громкость меньше мининума, если это возможно:-)
        Radio radio = new Radio();
        radio.setCurrentVolume(-20);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
>>>>>>> 6997475adb6f6434dd2c83598cb8cf4add11a0e7
