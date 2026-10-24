public class Actor extends Person {

    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return (this.hashCode() == obj.hashCode());
    }

    @Override
    public int hashCode() {
        int superHash = 123 * 654 * 196;
        if (getSurname() != null && getName() != null && getHeight() != 0) {
            superHash = superHash + getSurname().hashCode() + getName().hashCode() + getHeight();
        }
        return superHash;
    }

    @Override
    public String toString() {
        String fullName = "";
        if (getGender().equals(Gender.MALE)) {
            fullName += "Актер ";
        } else {
            fullName += "Актриса ";
        }
        return fullName + getName() + " " + getSurname() + " | Рост (" + getHeight() + ") см.";
    }
}
