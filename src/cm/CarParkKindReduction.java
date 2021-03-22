package cm;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class CarParkKindReduction {
    int round = 2;
    public BigDecimal carParkKindReduction(BigDecimal charge, CarParkKind kind){
        switch (kind) {
            case VISITOR -> {
                VisitorRate visReduction = new VisitorRate();
                charge = visReduction.reduction(charge).setScale(round, RoundingMode.HALF_UP);
            }
            case STUDENT -> {
                StudentRate stuReduction = new StudentRate();
                charge = stuReduction.reduction(charge).setScale(round, RoundingMode.HALF_UP);
            }
            case STAFF -> {
                StaffRate staReduction = new StaffRate();
                charge = staReduction.reduction(charge).setScale(round, RoundingMode.HALF_UP);
            }
            case MANAGEMENT -> {
                ManagementRate manReduction = new ManagementRate();
                charge = manReduction.reduction(charge).setScale(round, RoundingMode.HALF_UP);
            }
            default -> throw new IllegalStateException("Unexpected value: " + kind);
        }

        return charge;
    }
}
