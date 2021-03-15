package cm;

import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Assert;

public class HallJamesTestTask3 {

    /////Rate() method test
    @Test()
    public void test1Rate() throws IllegalArgumentException {
        //Partitioned Test -> reducedRate <= normalRate

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,7));
        reducedPeriods.add(new Period(9,10));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(10,17));

        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test()
    public void test2Rate() throws IllegalArgumentException {
        //Partitioned Test -> reducedRate <= normalRate

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,7));
        reducedPeriods.add(new Period(9,10));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(10,17));

        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3Rate() throws IllegalArgumentException {
        //Partitioned Test -> reducedRate <= normalRate

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(0);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,7));
        reducedPeriods.add(new Period(9,10));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(10,17));

        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test()
    public void test4Rate() throws IllegalArgumentException {
        //Partitioned Test -> 0 ≤ normalRate

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,7));
        reducedPeriods.add(new Period(9,10));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(10,17));

        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test5Rate() throws IllegalArgumentException {
        //Partitioned Test -> 0 ≤ normalRate
        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = null;
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,7));
        reducedPeriods.add(new Period(9,10));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(10,17));


        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test()
    public void test6Rate() throws IllegalArgumentException {
        //Partitioned Test -> 0 ≤ reducedRate

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,7));
        reducedPeriods.add(new Period(9,10));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(10,17));


        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test7Rate() throws IllegalArgumentException {
        //Partitioned Test -> 0 ≤ reducedRate

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(0);
        BigDecimal reducedRate = null;
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,7));
        reducedPeriods.add(new Period(9,10));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(10,17));


        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test8Rate() throws IllegalArgumentException {
        //Partitioned Test -> 0 ≤ normalRate, reducedRate ≤ normalRate

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(-1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,7));
        reducedPeriods.add(new Period(9,10));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(10,17));


        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test9Rate() throws IllegalArgumentException {
        //Partitioned Test -> 0 ≤ reducedRate

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(0);
        BigDecimal reducedRate = new BigDecimal(-1);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,7));
        reducedPeriods.add(new Period(9,10));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(10,17));

        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test()
    public void test10Rate() throws IllegalArgumentException {
        //Partitioned Test -> reducedPeriods must not overlap normalPeriods

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,7));
        reducedPeriods.add(new Period(9,10));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(10,17));

        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test()
    public void test11Rate() throws IllegalArgumentException {
        //Partitioned Test -> reducedPeriods must not overlap normalPeriods

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<>();

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(10,17));

        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test()
    public void test12Rate() throws IllegalArgumentException {
        //Partitioned Test -> reducedPeriods must not overlap normalPeriods

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,7));
        reducedPeriods.add(new Period(9,10));
        ArrayList<Period> normalPeriods = new ArrayList<>();

        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test13Rate() throws IllegalArgumentException {
        //Partitioned Test -> reducedPeriods must not overlap normalPeriods

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,7));
        reducedPeriods.add(new Period(9,11));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(10,17));

        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test14Rate() throws IllegalArgumentException {
        //Partitioned Test -> reducedPeriods must not overlap normalPeriods

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,7));
        reducedPeriods.add(new Period(9,10));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(6,9));
        normalPeriods.add(new Period(10,17));

        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test()
    public void test15Rate() throws IllegalArgumentException {
        //Partitioned Test -> normalPeriods must not overlap normalPeriods

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,7));
        reducedPeriods.add(new Period(9,10));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(10,17));

        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test()
    public void test16Rate() throws IllegalArgumentException {
        //Partitioned Test -> normalPeriods must not overlap normalPeriods

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,7));
        reducedPeriods.add(new Period(9,10));
        ArrayList<Period> normalPeriods = new ArrayList<>();

        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test17Rate() throws IllegalArgumentException {
        //Partitioned Test -> normalPeriods must not overlap normalPeriods

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,7));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,11));
        normalPeriods.add(new Period(10,17));

        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test()
    public void test18Rate() throws IllegalArgumentException {
        //Partitioned Test -> reducedPeriods must not overlap reducedPeriods

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,7));
        reducedPeriods.add(new Period(9,10));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(10,17));

        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test()
    public void test19Rate() throws IllegalArgumentException {
        //Partitioned Test -> reducedPeriods must not overlap reducedPeriods

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<>();

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(10,17));

        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test20Rate() throws IllegalArgumentException {
        //Partitioned Test -> reducedPeriods must not overlap reducedPeriods

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,9));
        reducedPeriods.add(new Period(8,10));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10,17));

        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test21Rate() throws IllegalArgumentException {
        //Partitioned Test -> Periods cannot be Null

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = null;

        ArrayList<Period> normalPeriods = null;


        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test22Rate() throws IllegalArgumentException {
        //Partitioned Test -> Periods cannot be Null

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<>();

        ArrayList<Period> normalPeriods = null;


        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test23Rate() throws IllegalArgumentException {
        //Partitioned Test -> Periods cannot be Null

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = null;

        ArrayList<Period> normalPeriods = new ArrayList<>();


        Rate testRate = new Rate(parkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test24Rate() throws IllegalArgumentException {
        //Partitioned Test -> reducedPeriods must not overlap normalPeriods

        CarParkKind parkKind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6,9));
        reducedPeriods.add(new Period(8,10));
        reducedPeriods.add(new Period(9,11));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(11,12));

        Rate testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }

    ////Calculate tests

    //Return Rate class to prevent repetition
    private Rate testRateMethodStaff(){
        //Partitioned Test -> 0 ≤ startHour
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(9,11));
        reducedPeriods.add(new Period(17,19));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(11,17));
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
        return rate;
    }

    private Rate testRateMethodStudent(){
        //Partitioned Test -> 0 ≤ startHour
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(9,11));
        reducedPeriods.add(new Period(17,19));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(11,17));
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
        return rate;
    }

    private Rate testRateMethodManagement(){
        //Partitioned Test -> 0 ≤ startHour
        CarParkKind kind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(9,11));
        reducedPeriods.add(new Period(17,19));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(11,17));
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
        return rate;
    }

    private Rate testRateMethodVisitor(){
        //Partitioned Test -> 0 ≤ startHour
        CarParkKind kind = CarParkKind.VISITOR;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(9,11));
        reducedPeriods.add(new Period(17,19));
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(7,9));
        normalPeriods.add(new Period(11,17));
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
        return rate;
    }

    @Test()
    public void test1Calculate() throws IllegalArgumentException {
        //Partitioned Test -> 0 ≤ startHour
        Rate rate = testRateMethodStaff();

        Period per = new Period(0,24);

        BigDecimal outputExpected = new BigDecimal(16.00);

        Assert.assertEquals(outputExpected, rate.calculate(per));
    }

    @Test()
    public void test2Calculate() throws IllegalArgumentException {
        //Partitioned Test -> startHour ≤ 24
        Rate rate = testRateMethodStaff();

        Period per = new Period(23,24);

        BigDecimal outputExpected = new BigDecimal(0);

        Assert.assertEquals(outputExpected, rate.calculate(per));
    }

    @Test()
    public void test3Calculate() throws IllegalArgumentException {
        //Partitioned Test -> 0 ≤ endHour
        Rate rate = testRateMethodStaff();

        Period per = new Period(0,1);

        BigDecimal outputExpected = new BigDecimal(0);

        Assert.assertEquals(outputExpected, rate.calculate(per));
    }

    @Test()
    public void test4Calculate() throws IllegalArgumentException {
        //Partitioned Test -> endHour ≤ 24
        Rate rate = testRateMethodStaff();

        Period per = new Period(0,24);

        BigDecimal outputExpected = new BigDecimal(16.00);

        Assert.assertEquals(outputExpected, rate.calculate(per));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test5Calculate() throws IllegalArgumentException {
        //Partitioned Test -> 0 ≤ startHour
        Rate rate = testRateMethodStaff();

        Period per = new Period(-1,24);

        BigDecimal outputExpected = new BigDecimal(16.00);

        Assert.assertEquals(outputExpected, rate.calculate(per));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test6Calculate() throws IllegalArgumentException {
        //Partitioned Test -> startHour ≤ 24
        Rate rate = testRateMethodStaff();

        Period per = new Period(25,24);

        BigDecimal outputExpected = new BigDecimal(16.00);

        Assert.assertEquals(outputExpected, rate.calculate(per));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test7Calculate() throws IllegalArgumentException {
        //Partitioned Test -> 0 ≤ endHour
        Rate rate = testRateMethodStaff();

        Period per = new Period(0,-1);

        BigDecimal outputExpected = new BigDecimal(16.00);

        Assert.assertEquals(outputExpected, rate.calculate(per));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test8Calculate() throws IllegalArgumentException {
        //Partitioned Test -> endHour ≤ 24
        Rate rate = testRateMethodStaff();

        Period per = new Period(0,25);

        BigDecimal outputExpected = new BigDecimal(16.00);

        Assert.assertEquals(outputExpected, rate.calculate(per));
    }

    @Test()
    public void test9Calculate() throws IllegalArgumentException {
        //Partitioned Test -> startHour < endHour
        Rate rate = testRateMethodStaff();

        Period per = new Period(11,12);

        BigDecimal outputExpected = new BigDecimal(10.00);

        Assert.assertEquals(outputExpected, rate.calculate(per));
    }

    @Test()
    public void test10Calculate() throws IllegalArgumentException {
        //Partitioned Test -> startHour < endHour
        Rate rate = testRateMethodStaff();

        Period per = new Period(0,24);

        BigDecimal outputExpected = new BigDecimal(16.00);

        Assert.assertEquals(outputExpected, rate.calculate(per));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test11Calculate() throws IllegalArgumentException {
        //Partitioned Test -> startHour < endHour
        Rate rate = testRateMethodStaff();

        Period per = new Period(11,11);

        BigDecimal outputExpected = new BigDecimal(16.00);

        Assert.assertEquals(outputExpected, rate.calculate(per));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test12Calculate() throws IllegalArgumentException {
        //Partitioned Test -> startHour < endHour
        Rate rate = testRateMethodStaff();

        Period per = new Period(12,11);

        BigDecimal outputExpected = new BigDecimal(16.00);

        Assert.assertEquals(outputExpected, rate.calculate(per));
    }

    @Test()
    public void test13Calculate() throws IllegalArgumentException {
        //Partitioned Test -> startHour < endHour
        Rate rate = testRateMethodStudent();

        Period per = new Period(0,24);

        BigDecimal outputExpected = new BigDecimal(76.38);

        Assert.assertEquals(outputExpected, rate.calculate(per));
    }
}
