


public class BasicConcessions  implements Concessions {
}
    protected Car car;
    private int basicPercent = Integer.parseInt("concessions.basic");

    public BasicConcessions() {
    }

    public BasicConcessions(Car car) {
        this.car = car;
    }

    @Override
    public void discountUp() {
        car.setDiscount(car.getDiscount() + basicPercent);
    }

    @Override
    public void discountDown() {
        car.setDiscount(car.getDiscount() - basicPercent);
    }
}