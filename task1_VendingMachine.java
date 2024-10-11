import java.util.ArrayList;
import java.util.List;

/**
 * task1_VendingMachine в этом классе нужно создать 2 метода getProduct и initProduct
 */
public class task1_VendingMachine {
// поля класса:
    List<task1_Product> productList; // тороговый автомат должен содержать в себе список продуктов 
    Integer money; // количество денег в автомате.

    public task1_Product getProduct(String name){ // на вход принимается Название продукта
        for (task1_Product product : productList) { // если в коллекции найден введенный продукт
            money += product.price; // добавим к общему количеству денег Стоимость данного продукта
            return product; // возвращаем требуемый продукт
        }
        return null;// продукт не найден
    }
// метод возвращает изначальное количество продуктов    
    List<task1_Product> initProduct(){
        List<task1_Product> products = new ArrayList<>(); // список продуктов
        products.add(new task1_Product()); // добавляем продукты
        products.add(new task1_Product());
        products.add(new task1_Product());
        return products; // возвращаем список продуктов
    }
}