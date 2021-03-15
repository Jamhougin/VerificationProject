package cm;

import java.math.BigDecimal;

public class StaffRate extends Reduction{
    public BigDecimal reduction(BigDecimal amount){
        BigDecimal maxFullRate = new BigDecimal(16.00);

        if(amount.compareTo(maxFullRate)<=0){
            return amount;
        }
        else {
            return maxFullRate;
        }
    }
}
