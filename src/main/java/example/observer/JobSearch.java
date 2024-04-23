package example.observer;

public class JobSearch {

    public static void main(String[] args) {
        var jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        var firstSubscriber = new Subscriber("Ivan Ivanov");
        var secondSubscriber = new Subscriber("Ivan Petrov");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java position");
    }
}
