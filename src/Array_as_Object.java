class CricketTeam{
    int JerseyNumber;
    String Name;
    int HighestScore;
}
public class Array_as_Object {
    public static void main(String[] args) {
        CricketTeam Player1 = new CricketTeam();
        Player1.JerseyNumber = 26;
        Player1.Name= "Gowtham";
        Player1.HighestScore = 200;

        CricketTeam Player2 = new CricketTeam();
        Player2.JerseyNumber = 40;
        Player2.Name= "Mahima";
        Player2.HighestScore = 201;

        CricketTeam Player3 = new CricketTeam();
        Player3.JerseyNumber = 4026;
        Player3.Name= "Papa";
        Player3.HighestScore = 300;
 
        CricketTeam[] Players = new CricketTeam[3];
        Players[0] = Player1;
        Players[1] = Player2;
        Players[2] = Player3;

        for(int Index = 0; Index < Players.length; Index += 1){
            System.out.println(Players[Index].Name + Players[Index].JerseyNumber + Players[Index].HighestScore);
        }
    }
}
