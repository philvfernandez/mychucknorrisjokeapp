package guru.springframework.mychucknorrisjokeapp;

import guru.springframework.mychucknorrisjokeapp.service.ChuckNorrisJokesService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyChuckNorrisJokeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyChuckNorrisJokeAppApplication.class, args);
		ChuckNorrisJokesService cnj = new ChuckNorrisJokesService();
		int i = 0;

		while(i++ < 6) {
			String joke = cnj.getRandomJokes();
			System.out.println(joke);
			if(i == 5) break;
		}
		System.exit(1);
	}

}
