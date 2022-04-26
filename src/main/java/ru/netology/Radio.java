package ru.netology;

public class Radio {

    public int currentStation;                                     // Текущая радиостанция
    public int currentVolume;                                      // Текущая громкость
    private int minStation = 0;                                    // Минимальная радиостанция
    private int maxStation = 9;                                    // Максимальная радиостанция
    private int minVolume = 0;                                     // Минимальная громкость
    private int maxVolume = 10;                                    //Максимальная Громкость

    public int getCurrentStation() {                               // Геттер текущей радиостанции
        return currentStation;                                     // Возвращаем значение текущей радиостанции
    }


    public void setCurrentStation(int currentStation) {           // Сеттер текущей радиостанции
        if (currentStation < minStation) {                        // Устанавливаем минимальное значение
            return;
        }
        if (currentStation > maxStation) {                        // Устанавливаем максимальное значение
            return;
        }
        this.currentStation = currentStation;                    // Присваиваем значение текущей радиостанции
    }

    public int getCurrentVolume() {                              // Геттер текущей громкости

        return currentVolume;                                    // Возвращаем значение текущей громкости
    }

    public void setCurrentVolume(int currentVolume) {            // Сеттер текущей громкости
        this.currentVolume = currentVolume;                      // Присваиваем значение текущей громкости
    }

    public void increaseStation() {                              //Метод на увеличение номера радиостанции
        this.currentStation = currentStation + 1;                // Увеличиваем текущую радиостанцию на единицу, но проверяя условия
        if (currentStation == 10) {                              // Если текущая станция > максимальной
            this.currentStation = minStation;                    // То станция становится равна минимальной
        }
    }

    public void decreaseStation() {                              //Метод на уменьшение номера радиостанции
        this.currentStation = currentStation - 1;                // Уменьшаем текущую радиостанцию на единицу, но проверяя условия
        if (currentStation == -1) {                              // Если текущая станция < минимальной
            this.currentStation = maxStation;                    // То станция становится равна максимальной
        }
    }

    public void increaseVolume() {                               // Метод на увеличение громкости
        this.currentVolume = currentVolume + 1;                  // Увеличиваем текущую громкость на единицу, но проверяя условия
        if (currentVolume >= maxVolume) {                        // Если текущая громкость >= максимальной
            this.currentVolume = maxVolume;                      // То громкость остается максимальной
        }
    }

    public void decreaseVolume() {                               // Метод на уменьшение громкости
        this.currentVolume = currentVolume - 1;                  // Уменьшаем текущую громкость на единицу, но проверяя условия
        if (currentVolume <= minVolume) {                        // Если текущая громкость <= минимальной
            this.currentVolume = minVolume;                      // То громкость остается минимальной
        }
    }
}
