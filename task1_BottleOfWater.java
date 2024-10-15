/**
 * Класс Бутфлка Воды, наследник от Продукта
 */
public class task1_BottleOfWater extends task1_Product{

    public task1_BottleOfWater(String name, int price, Integer volume) {
        super(name, price);
        this.volume = volume;   
    }
/**
 * поле Класса Бутялка Воды
 */
    private Integer volume;


    public Integer getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("name: %s => price: %d => volume: %d ", name, price, volume);
    }     
}
