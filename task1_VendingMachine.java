import java.util.ArrayList;
import java.util.List;
/**
 * task1_VendingMachine
 */
public class task1_VendingMachine {

// Конструктор
    public task1_VendingMachine(List<task1_Product> productList, Integer money) {
        task1_VendingMachine.productList = productList;
        task1_VendingMachine.money = 0;
    }
// Поля класса    
    static List<task1_Product> productList;
    static Integer money;

// Метод инициализации продуктов
    public static List<task1_Product> initProduct(){
        List<task1_Product> list = new ArrayList<>();
        list.add(new task1_Product("Пискаревское", 50));
        list.add(new task1_Product("Антоновка", 20));
        list.add(new task1_Product("Каравай", 45));
        return list;
        }

// Метод вызова конкретного продукта по Названию (его цена падает в money)        
    public static task1_Product getProduct(String name){ // на вход принимается Название продукта
        for (task1_Product i : productList) { // если в коллекции найден введенный продукт
            if (i.getName().equals(name)) {
            money += i.getPrice();
            return i; // возвращаем требуемый продукт
            }
        }
        return null;
    }
    public static Integer getMoney(){
        return money;
    }
    public static List<task1_Product> getProductList(){
        return productList;
    }

}   
