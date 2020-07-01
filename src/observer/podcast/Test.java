package observer.podcast;

import junit.framework.TestCase;

public class Test extends TestCase {
    public void test(){
        PodcastA podcast = new PodcastA();
        IObserver student = new Student(podcast);
        podcast.add(student);

        //預設節目是英文廣播
        podcast.notifyObservers();

        //節目變為今年流行歌
        podcast.name = "今年流行歌";

        podcast.notifyObservers();
    }
}
