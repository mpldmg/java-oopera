public class MusicalShow extends Show{
    private Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, Person musicAuthor,String librettoText) {
        super(title, duration, director);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(Person musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public void getLibrettoText() {
        System.out.println(librettoText);
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }
}
