public class Word {
    String hebrew;
    String english;

    public Word(String heb, String eng) {
        this.hebrew = heb;
        this.english = eng;
    }

    // get set hebrew
    public String getHebrew() {
        return this.hebrew;
    }

    public void setHebrew(String heb) {
        this.hebrew = heb;
    }

    // get set english
    public String getEnglish() {
        return this.english;
    }

    public void setEnglish(String eng) {
        this.english = eng;
    }


    // to string as "dog(eng) : dog(heb)"
    public String toString() {
        return this.english + " : " + this.hebrew;
    }
}
