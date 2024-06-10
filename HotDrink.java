// Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды),
// сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа
// ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)

// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int
// температура.
// � Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
// перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
// соответствующий имени, объему и температуре
// � В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
// воспроизвести логику заложенную в программе


package less1;

import static less1.HotDrink;
import static less1.HotDrinkVendingMachine;

public class HotDrink extends Product  {

    private int temperature = 0;


    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
               "name='" + super.getName() + '\'' +
               "temperture='" + this.temperature + '\'' +
               ", volume=" + super.getVolume() +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotDrink)) {
            return false;
        }

        HotDrink that = (HotDrink) o;

        return super.getName().equalsIgnoreCase(that.getName())
               && super.getVolume() == that.getVolume()
               && getTemperature() == that.getTemperature();
    }
}
