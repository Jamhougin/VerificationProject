package cm;

import java.math.BigDecimal;

public class ManagementRate extends Reduction{
    public BigDecimal reduction(BigDecimal amount){
        BigDecimal minFullRate = new BigDecimal(3.00);

        if(amount.compareTo(minFullRate)<=0){
            return minFullRate;
        }
        else {
            return amount;
        }
    }
}
