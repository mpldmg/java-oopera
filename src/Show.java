import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;

    ArrayList<Actor> actors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public void showActors() {
        System.out.println("Списов актеров: ");
        for (Actor actor : actors) {
            System.out.println(actor);
        }
    }

    public void showDirector() {
        System.out.println(director);
    }

    public void changeActor(Actor actor1, Actor actor2) {
        if (actor1.equals(actor2)) {
            System.out.println("Актеры одинаковы, укажите других актеров");
        } else if (((actor1.getName()).equals(actor2.getName())) ||
                ((actor1.getSurname()).equals(actor2.getSurname())) ||
                        ((actor1.getHeight()) == (actor2.getHeight()))) {
            System.out.println("Актеры одинаковы, укажите других актеров");
        } else {
            actors.remove(actor1);
            actors.add(actor2);
        }
        System.out.println("Актеры заменены!!!");
        showActors();
    }

    public void changeActor(Actor lastActor, String surnameFirstActor) {

        System.out.println("Актеры заменены!!!");
        showActors();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
