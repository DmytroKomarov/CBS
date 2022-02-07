package com.JavaProfessional.Lesson01.AdditionalTask0101.ex_004_comparable.interface_comparable;

public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене/модели/цвету
    public int compareTo(Object o) {    // public int compareTo(Car o) {
        if ((this.speed - ((Car)o).speed) != 0) {
            return (this.speed - ((Car)o).speed);
        } else if ((this.price - ((Car) o).price) != 0) {
            return (this.price - ((Car) o).price);
        } else if (!this.model.equals(((Car) o).model)) {
            return this.model.compareTo(((Car) o).model);
        } else {
            return this.color.compareTo(((Car) o).color);
        }
    }

    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}