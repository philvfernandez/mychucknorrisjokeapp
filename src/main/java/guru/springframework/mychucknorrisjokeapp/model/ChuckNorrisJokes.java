package guru.springframework.mychucknorrisjokeapp.model;

public class ChuckNorrisJokes {
    String joketext;

    public String getJoketext() {
        return joketext;
    }

    public void setJoketext(String joketext) {
        this.joketext = joketext;
    }

    @Override
    public String toString() {
        return "ChuckNorrisJokes{" +
                "joketext='" + joketext + '\'' +
                '}';
    }
}
