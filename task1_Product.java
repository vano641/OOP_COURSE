/**
 * это класс task1_Product (Товар)
 */
public class task1_Product {
    
    String name;
    int price;

// метод форматированного вывода
    public String getInfo(){
        return String.format("name: %s => price: %d", name, price);
    }
// переопределение метода toString
    @Override
    public String toString() {
        return getInfo();
    }
}