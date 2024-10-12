import java.util.ArrayList;
import java.util.List;

/**
 * task1_VendingMachine в этом классе нужно создать 2 метода getProduct и initProduct
 */
public class task1_VendingMachine {
// поля класса:
    static List<task1_Product> productList; // тороговый автомат должен содержать в себе список продуктов 
    static Integer money; // количество денег в автомате.

    public static task1_Product getProduct(String name){ // на вход принимается Название продукта
        for (task1_Product product : productList) {
            if (product.name.equals(name)) { // если в коллекции найден введенный продукт
            money += product.price; // добавим к общему количеству денег Стоимость данного продукта
            return product; // возвращаем требуемый продукт
            }
        }
        return null;// продукт не найден
    }

// метод возвращает Список Названий продуктов. 
    static List<String> initProduct(){
        List<String> productsName = new ArrayList<>(); // список Названий продуктов типа String
        for (task1_Product i : productList) { 
            productsName.add(i.name); // добавляем в список только Название (поле name  класса task1_Product)
        }
        return productsName;
    }
}