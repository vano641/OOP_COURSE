import java.util.ArrayList;
import java.util.List;

/**
 * task1_main 
 * 1) Реальизуйте класс "Product" содержащий данный о товаре и
 *    класс VendingMachine содержащий в себе методы:
 *      initProducts(List<Product>) - сохраняющий в себе список исходных продуктов
 *      getProduct(String name) - который возвращает товар по его названию
 */
public class task1_main {
    public static void main(String[] args) {

        task1_Product milk = new task1_Product(); // ИНИЦИАЛИЗИРУЕМ ПРОДУКТЫ(ОБЪЕКТЫ) КЛАССА task1_Product 
        milk.name = "Молоко Пискаревское"; // присваиваем значения полям класса
        milk.price = 60;

//        System.out.println(milk); // по умолчанию вызывается toString => task1_Product@28a418fc
//        System.out.println(milk.toString()); // и распечатывается ерунда => task1_Product@28a418fc
//        System.out.println(milk.getInfo()); // чтобы это иправить нужно в Классе task_Product
        // описать метод форматированного вывода => name: Молоко Пискаревское; price: 60
        // или мы можем переопределить метод toString

        task1_Product water = new task1_Product();
        water.name = "Святой Источник";
        water.price = 30;

        task1_Product snikers = new task1_Product();
        snikers.name = "Сникерс";
        snikers.price = 80; 

        List<task1_Product> ProductList = new ArrayList<>(); // добавляем объекты в список
        ProductList.add(milk);
        ProductList.add(water);
        ProductList.add(snikers);
        System.out.println(ProductList); // [name: Молоко Пискаревское => price: 60, name: Святой Источник => price: 30, name: Сникерс => price: 80]

// ИНИЦИАЛИЗИРУЕМ ОБЬЕКТ (ТОРГОВЫЙ АВТОМАТ) КЛАССА task1_VendingMachine
        task1_VendingMachine vendingList = new task1_VendingMachine();
        vendingList.productList = ProductList; // заполняем Поля класса значениями
        vendingList.money = 0;

// Вызываем метод getProduct класса task1_VendingMachine
        var get = task1_VendingMachine.getProduct("Сникерс");
        System.out.println(get); // name: Сникерс; price: 80

// Вызываем тетод initProduct класса task1_VendingMachine
        var init = task1_VendingMachine.initProduct();
        System.out.println(init); //[Молоко Пискаревское, Святой Источник, Сникерс]
    }

    
}