import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {

    @Test
    public void shouldAddMovieIfNoMovies() {
        AfishaManager manager = new AfishaManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovieIfOneMovie() {
        AfishaManager manager = new AfishaManager();
        manager.addMovie("Star Wars 1");

        String[] expected = {"Star Wars 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovies() {
        AfishaManager manager = new AfishaManager();
        manager.addMovie("Star Wars 1");
        manager.addMovie("Star Wars 2");
        manager.addMovie("Star Wars 3");

        String[] expected = {"Star Wars 1", "Star Wars 2", "Star Wars 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindLastIfAboveLimit() {
        AfishaManager manager = new AfishaManager();
        manager.addMovie("Star Wars 1");
        manager.addMovie("Star Wars 2");
        manager.addMovie("Star Wars 3");
        manager.addMovie("Star Wars 4");
        manager.addMovie("Star Wars 5");
        manager.addMovie("Star Wars 6");


        String[] expected = {"Star Wars 6", "Star Wars 5", "Star Wars 4", "Star Wars 3", "Star Wars 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLessLimit() {
        AfishaManager manager = new AfishaManager();
        manager.addMovie("Star Wars 1");
        manager.addMovie("Star Wars 2");
        manager.addMovie("Star Wars 3");

        String[] expected = {"Star Wars 3", "Star Wars 2", "Star Wars 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
