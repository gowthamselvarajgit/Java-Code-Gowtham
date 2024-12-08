package OOPsPillar;
class XYZCompany{
    private int budget;
    private int profit;
    private String bond;
    XYZCompany(int budget, int profit, String bond){
        this.budget = budget;
        this.profit = profit;
        this.bond = bond;
    }
    public void setBudget(int budget){
        this.budget = budget;
    }
    public void setProfit(int profit){
        this.profit = profit;
    }
    public void setBond(String bond) {
        this.bond = bond;
    }
    public int getBudget(){
        return budget;
    }
    public int getProfit(){
        return profit;
    }
    public String getBond() {
        return bond;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        XYZCompany obj = new XYZCompany(200000, 10000,"Mutual Fund");

        obj.setBudget(900000);
    }
}
