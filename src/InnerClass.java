class Legend{
    int num = 0;

    public void showLegend(){
        System.out.println("In Legend Show");
    }
    static class InsideLegend{
        public void showInsideLegend(){
            System.out.println("In Inside Legend");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Legend obj = new Legend();
        obj.showLegend();

//        Legend.InsideLegend objInner = obj.new InsideLegend();
//        objInner.showInsideLegend();
           Legend.InsideLegend objInner = new Legend.InsideLegend();
           objInner.showInsideLegend();
    }
}
