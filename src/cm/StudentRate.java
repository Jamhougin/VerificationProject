package cm;
import java.math.BigDecimal;

class StudentRate extends Reduction{
    public BigDecimal reduction(BigDecimal amount){
        BigDecimal maxFullRate = new BigDecimal(5.50);
        BigDecimal reduction = new BigDecimal(0.75);

        if(amount.compareTo(maxFullRate)<=0){
            return amount;
        }
        else {
            return ((amount.subtract(maxFullRate)).multiply(reduction)).add(maxFullRate);
        }
    }
}
