import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Webcrawler> bots = new ArrayList<>();
        bots.add(new Webcrawler("https://abcnews.go.com", 1));
        bots.add(new Webcrawler("https://www.npr.org", 2));
        bots.add(new Webcrawler("https://www.nytimes.com", 3));
        
        for(Webcrawler w: bots){
            try{
                w.getThread().join();;
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
