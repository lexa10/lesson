public class SaleConcessions extends BasicConcessions {
    private int sale = Integer.parseInt(System.getProperty("concessions.sale"));

    public SaleConcessions(Car car) {
        super.car = car;
    }

    public void sale() {
        car.setDiscount(sale);
    }
}
