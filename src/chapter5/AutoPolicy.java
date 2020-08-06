package chapter5;

public class AutoPolicy
{
    private int accountNumber;
    private String makeAndModel;
    private String state;

    // constructor
    public AutoPolicy(int accountNumber, String makeAndModel, String state)
    {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }
    //sets the account Number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
      // return the account number
    public int getAccountNumber() {
        return accountNumber;
    }
     //set make and model
     public void setMakeAndModel(String makeAndModel) {
         this.makeAndModel = makeAndModel;
     }
     // return make and model
    public String getMakeAndModel() {
        return makeAndModel;
    }
    // set the state
    public void setState(String state) {
        this.state = state;
    }
    // return the state
    public String getState() {
        return state;
    }
    // predicate method return whether the state has no fault insurance
   public boolean isNoFaultState()
   {
       boolean nofaultState;
       //determine whether state ha no-fault insurance
       switch (getState()) //get Autopolicy object's state abbreviation
       {
           case "MA": case "NJ":  case "NY": case "PA":
               nofaultState = true;
               break;
              default:
               nofaultState = false;
               break;
       }
       return nofaultState;
   }
}
