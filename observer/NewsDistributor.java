package observer;

public class NewsDistributor implements NewsListener {

    @Override
    public void newsPublished(String news) {
        System.out.println("Sending " + news + " on the Web");
    }
}
