//TYLER SCOTT WALLACE
public class creditCardCompanyClass {

    private String name = null;
    private String address = null;
    private int yearOfBirth = 0;
    private double amtDue = 0.0;
    private double minPayment = 0.0;

    //The default constructor is the no-argument constructor automatically generated unless you define another constructor.
    // Any uninitialised fields will be set to their default values.
    // In reguards to meaning the following two hold the same exact value so not sure which you prefer as i remember you taking off points
    // last time i left it blank.

    creditCardCompanyClass()
    {


    }

    /*creditCardCompanyClass(){
        super();
        this.name = null;
        this.address = null;
        this.yearOfBirth = 0;
        this.amtDue = 0.0;
        this.minPayment = 0.0;
        }*/


    public double calcMinPayment(double amtDue){
        double minPayment = 0.0;

        if ((amtDue * .20) > 25){
            minPayment = (amtDue * .20);
        }
        else {
            minPayment = 25.00;
        }
        return minPayment;
    }
}
