import java.util.ArrayList;
import java.util.List;

/**
 * task1_VendingMachine
 */
public class task1_VendingMachine {
// Конструктор класса
    public task1_VendingMachine() {
        this.productList = initProduct(); // Список продуктов берем из Метода initProduct()
        this.money = 0; // изначально количество денег на 0
    }

// поля класса приватые:
    private List<task1_Product> productList; // тороговый автомат должен содержать в себе список продуктов 
    private Integer money; // количество денег в автомате.

    public task1_Product getProduct(String name){ // на вход принимается Название продукта
        for (task1_Product product : productList) { // если в коллекции найден введенный продукт
            if (product.getName().equals(name)) {
            money += product.getPrice(); // добавим к общему количеству денег Стоимость данного продукта
            return product; // возвращаем требуемый продукт
            }
        }
        return null;// продукт не найден
    }
// метод Приватный(т.к используется только в конструкторе) возвращает список продуктов    
    private List<task1_Product> initProduct(){ // теперь у нас есть Конструктор класса task1_Product
    // мы можем добавить продукты в список
        List<task1_Product> products = new ArrayList<>(); // список продуктов
        products.add(new task1_Product("Молоко",100)); // добавляем продукты
        products.add(new task1_Product("Вода", 50));// с названием и ценой
        products.add(new task1_Product("Сухарики Кириешки", 30));
        return products; // возвращаем список продуктов
    }
}