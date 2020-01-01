package guru.springframework.mychucknorrisjokeapp;

import guru.springframework.mychucknorrisjokeapp.services.JokeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyChuckNorrisJokeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyChuckNorrisJokeAppApplication.class, args);
		JokeServiceImpl cnj = new JokeServiceImpl();
		int i = 0;

		while(i++ < 6) {
			String joke = cnj.getRandomJokes();
			System.out.println(joke);
			if(i == 5) break;
		}
		System.exit(1);
	}

}
