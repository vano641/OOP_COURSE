public class task1_BottleOfWater extends task1_Product {
// Класс БутылкаВоды - Наследник класса Продукт
    
    // Приватное поле класса - обьем бутылки
    private int volume;
    // конструктор
    public task1_BottleOfWater(String name, int price){
        super(name, price);
    }

    // конструктор который также принимает объем
    public task1_BottleOfWater(String name, int price, int volume) {
        super(name, price);
        this.volume = volume;
    }
// геттер
    public int getVolume() {
        return this.volume;
    }
// сеттер
    public void setVolume(int volume) {
        this.volume = volume;
    }


    
}
