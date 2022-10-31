public class CricketScore {
    public void score (int x){
        System.out.println("Sri Lanka :- "+ x);
    }
    public void score (int a , int b){
        System.out.println("Indian :- "+ a);
        System.out.println("Australia :- "+ b);
    }

    public static void main(String[] args) {
        CricketScore c = new CricketScore();
        c.score(247);
        c.score(200 ,224);
    }
}
