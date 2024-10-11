import java.util.List;
// АвтоматПродающий Бутылки воды имплементирует VendingMachine
public class task1_BOWVendingMachine implements task1_VendingMachine {

    private final List<task1_Product> productList; // поле со смписком продука

    private int money;
    // конструктор
    public task1_BOWVendingMachine(List<task1_Product> productList) {
        this.productList = productList;
    }
    @Override
    public task1_Product getProduct(String name) {
            for (task1_Product product : productList) { 
                if (product.getName().equals(name)) {
                money += product.getPrice();
                return product;
                }
            }
            return null;
    }
}
