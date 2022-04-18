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

        radio.increaseStation(8);

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseStationNegativeTest() {

        Radio radio = new Radio();

        radio.increaseStation(11);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseStationPositiveTest() {

        Radio radio = new Radio();

        radio.decreaseStation(2);

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseStationNegativeTest() {

        Radio radio = new Radio();

        radio.decreaseStation(-1);

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumePositiveTest() {

        Radio radio = new Radio();

        radio.increaseVolume(8);

        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeNegativeTest() {

        Radio radio = new Radio();

        radio.increaseVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumePositiveTest() {

        Radio radio = new Radio();

        radio.decreaseVolume(2);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeNegativeTest() {

        Radio radio = new Radio();

        radio.decreaseVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}