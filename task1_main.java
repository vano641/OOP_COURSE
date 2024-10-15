/**
 * task1_main 
 * 1) Реальизуйте класс "Product" содержащий данный о товаре и
 *    класс VendingMachine содержащий в себе методы:
 *      initProducts(List<Product>) - сохраняющий в себе список исходных продуктов
 *      getProduct(String name) - который возвращает товар по его названию
 * 2) Реализуйте конструкторы, get/set методы, постройте логику VendingMachine на основе
 * кода сделанного в Пункте 1.
 */
public class task1_main {
    public static void main(String[] args) {

// С клиентского Файла(task_main) запускаем все программы по очереди

        task1_VendingMachine.productList = task1_VendingMachine.initProduct(); // Инициализация спика товаров
        task1_VendingMachine.money = 0; // изначальное кол-во денег в автомате

// Совершаем покупки и сохраняем сумму денег в автомате

        var VendingList = task1_VendingMachine.getProduct("Каравай");
        System.out.println(VendingList); // name: Каравай => price: 45

        var VendingList1 = task1_VendingMachine.getProduct("Антоновка");
        System.out.println(VendingList1); // name: Антоновка => price: 20

        var money = task1_VendingMachine.getMoney();
        System.out.println(money); // 65

        var PList = task1_VendingMachine.getProductList();
        System.out.println(PList); // [name: Пискаревское => price: 50, name: Антоновка => price: 20, name: Каравай => price: 45]
    }
}