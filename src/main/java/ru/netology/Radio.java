package ru.netology;

public class Radio {

    public int currentStation;  // Текущая радиостанция

    int maxStation = 9;
    int minStation = 0;

    public int getCurrentStation() {  // Геттер текущей радиостанции
        return currentStation;        // Возвращаем значение текущей радиостанции
    }

    public void setCurrentStation(int currentStation) {           // Сеттер текущей радиостанции
        if (currentStation < minStation) {                        // Устанавливаем минимальное значение
            return;
        }
        if (currentStation > maxStation) {                        // Устанавливаем максимальное значение
            return;
        }
        this.currentStation = currentStation;                    // Возвращаем значение текущей радиостанции
    }

    public void increaseStation(int currentStation) {            //Метод на увеличение номера радиостанции
        if (currentStation < maxStation) {                       // Устанавливаем условия попадания в границы
            this.currentStation = currentStation + 1;                                    // Если текущая станция меньше максимальной, то увеличиваем на единицу
        }
        if (currentStation >= maxStation){
            this.currentStation = minStation;                    // Если текущая станция равна максимальной, то устанавливаем минимальную радиостанцию
        }
    }

    public void decreaseStation(int currentStation) {            //Метод на уменьшение номера радиостанции
        if (currentStation > minStation) {                       // Устанавливаем условия попадания в границы
            this.currentStation = currentStation - 1;                                    // Если текущая станция больше минимальной, то уменьшаем на единицу
        }
        if (currentStation <= minStation){
            this.currentStation = maxStation;                    // Если текущая станция равна минимальной, то устанавливаем максимальную радиостанцию
        }
    }


    public int currentVolume;   // Текущая громкость

    public int getCurrentVolume() {   // Геттер текущей громкости

        return currentVolume;         // Возвращаем значение текущей громкости
    }

    public void increaseVolume(int currentVolume) {  // Метод на увеличение громкости
        final int maxVolume = 10;
        if (currentVolume < maxVolume) {   // Устанавливаем предельное значение не больше 10
            this.currentVolume = currentVolume + 1;               // При выполнении условия увеличиваем громкость на единицу
        }
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        }
    }

    public void decreaseVolume(int currentVolume) {  // Метод на уменьшение громкости
        final int minVolume = 0;
        if (currentVolume > minVolume) {    // Устанавливаем ограничение минимального значения громкости
            this.currentVolume = currentVolume - 1;               // При выполнении условия уменьшаем громкость на единицу
        }
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        }
    }
}
