public abstract class task1_Product { // Класс продукт Абстрактный
// конструктор из полей класса:
    public task1_Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

// поля класса приватные:
    private String name; // название продукта
    private int price; // цена продукта

// метод getName возвращает Название
    public String getName() {
        return this.name;
    }
// метод setName присваивает Название (Присваивает "значение" полю name в Классе task1_Product )
    public void setName(String name) {
        this.name = name;
    }
// возвращает Цену продукта
    public int getPrice() {
        return this.price;
    }
// Присваивает Цену продукту 
    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
            " name='" + getName() + "\'" +
            ", price=" + getPrice() +
            "}";
    }
    

}
