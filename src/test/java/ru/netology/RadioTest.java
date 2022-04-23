package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void SetCurrentStationPositiveTest() {

        Radio radio = new Radio();

        radio.currentStation = 4;
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void SetCurrentStationNegativeTestWithLowerStation() {

        Radio radio = new Radio();

        radio.currentStation = 5;
        radio.setCurrentStation(-1);

        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void SetCurrentStationNegativeTestWithHigherStation() {

        Radio radio = new Radio();

        radio.currentStation = 5;
        radio.setCurrentStation(10);

        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseStationPositiveTest() {

        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.increaseStation();
        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseStationBorderTest() {

        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.increaseStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseStationPositiveTest() {

        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.decreaseStation();
        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseStationBorderTest() {

        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.decreaseStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumePositiveTest() {

        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeBorderTest() {

        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumePositiveTest() {

        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeBorderTest() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}