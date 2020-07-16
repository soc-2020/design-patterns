package observer;

import java.util.ArrayList;

public class NewsFeed {

    private ArrayList<NewsListener> observers;

    public NewsFeed() {
        observers = new ArrayList<>();
    }

    public void register(NewsListener observer) {
        observers.add(observer);
    }

    public void unregister(NewsListener observer) {
        observers.remove(observer);
    }

    public void distribute(String newsItem) {
        for(NewsListener observer : observers) {
            observer.newsPublished(newsItem);
        }

    }


}
