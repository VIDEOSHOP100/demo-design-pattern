package observer.podcast;

public class Student implements IObserver {

    PodcastA observer;

    public Student(PodcastA observer){
        this.observer = observer;
    }

    @Override
    public void update() {
        System.out.println("聽了" + observer.getName());
    }
}
