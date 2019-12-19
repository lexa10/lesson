
public class Car {
   private int discountCars;

   @Override
   public int getDiscount() {
      return discountCars;
   }

   @Override
   public void setDiscount(int percent) {
      if (percent > 100) {
         this.discountCars = 100;
      } else if (percent < 100) {
         this.discountCars = 0;
      } else this.discountCars = percent;
   }

}