/**
 * task1_main 
 * 1) Реальизуйте класс "Product" содержащий данный о товаре и
 *    класс VendingMachine содержащий в себе методы:
 *      initProducts(List<Product>) - сохраняющий в себе список исходных продуктов
 *      getProduct(String name) - который возвращает товар по его названию
 * 2) Реализуйте конструкторы, get/set методы, постройте логику VendingMachine на основе
 * кода сделанного в Пункте 1.
 * 3) Сделайте класс Product абстрактным, создайте несколько наследников (например: БутылкаВоды),
 * сделайте интерфейсом VendingMachine и реализуйте класс какого-то одного типа VendingMachine
 * (пример: ПродающийБутылкиВодыАвтомат). 
 */
public class task1_main {
    public static void main(String[] args) {

// С клиентского Файла(task_main) запускаем все программы по очереди

        task1_VendingMachine.productList = task1_VendingMachine.initProduct(); // Инициализация спика товаров
        task1_VendingMachine.money = 0; // изначальное кол-во денег в автомате

// Совершаем покупки и сохраняем сумму денег в автомате

        var VendingList = task1_VendingMachine.getProduct("Кока-Кола");
        System.out.println(VendingList); // name: Кока-Кола => price: 120 => volume: 1 

        var VendingList1 = task1_VendingMachine.getProduct("Квас");
        System.out.println(VendingList1); // name: Квас => price: 70 => volume: 3

        var money = task1_VendingMachine.getMoney();
        System.out.println(money); // 190

        var PList = task1_VendingMachine.getProductList();
        System.out.println(PList); // [name: Кока-Кола => price: 120 => volume: 1 , name: Святой Источник => price: 37 => volume: 2 ,
        // name: Квас => price: 70 => volume: 3 ]

        var ProdVolume = task1_VendingMachine.getVolume("Святой Источник");
        System.out.println(ProdVolume); // 2
    }
}