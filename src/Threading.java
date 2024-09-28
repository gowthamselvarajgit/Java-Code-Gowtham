class Batsman extends Thread{
    public void run(){
        for(int start = 0; start < 10; start += 1){
            System.out.println("Batsman is Batting");
            try {
                Thread.sleep(1);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Bowler extends Thread{
    public void run(){
        for(int start = 0; start < 10; start += 1){
            System.out.println("Bowler is Bowling");
            try {
                Thread.sleep(1);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Threading {
    public static void main(String[] args) {
        Batsman dhoni = new Batsman();
        Bowler bumrah = new Bowler();

        dhoni.start();
        try {
            Thread.sleep(1);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        bumrah.start();
    }
}
