package guru.springframework.mychucknorrisjokeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class ChuckNorrisJokes {

    public String getRandomJokes() {
        ChuckNorrisQuotes cnq = new ChuckNorrisQuotes();
        String joke = cnq.getRandomQuote();
        return joke;
    }
}
