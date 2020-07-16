package observer;

public class NewsDBRecorder implements NewsListener {

    @Override
    public void newsPublished(String news) {
        System.out.println("Adding " + news + " in DB");
    }
}
