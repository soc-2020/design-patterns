package observer;

public class NewsLog implements NewsListener {

    @Override
    public void newsPublished(String news) {
        System.out.println("Adding " + news + " in the Log file");
    }
}
