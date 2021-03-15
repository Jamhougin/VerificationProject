package cm;

import java.math.BigDecimal;

public class VisitorRate {
    public BigDecimal reduction(BigDecimal amount){
        BigDecimal freeRate = new BigDecimal(8.00);
        BigDecimal reduction = new BigDecimal(0.50);

        if(amount.compareTo(freeRate)<=0){
            return new BigDecimal(0.00);
        }
        else {
            return ((amount.subtract(freeRate)).multiply(reduction));
        }
    }
}
