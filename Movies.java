package entertainmentsystem2;

public class Movies extends Entertainment implements AgeSpecifier {

    private String movieName, movieSummary, year;
    private static int movieCount = 0;

    public Movies() {
    }

    public Movies(String movieName, String movieSummary, String year, int Age) {
        super(Age);
        this.movieName = movieName;
        this.movieSummary = movieSummary;
        this.year = year;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieSummary() {
        return movieSummary;
    }

    public void setMovieSummary(String movieSummary) {
        this.movieSummary = movieSummary;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public static int getMovieCount() {
        return movieCount;
    }

    public String rating(int a) {
        return "Metacritic Rating: " + a + "/100";
    }

    public String rating(double a) {
        return "IMDB Rating: " + a + "/10";
    }

    String ratingIMDB = null;
    String ratingMetacritic = null;

    @Override
    public void AgeSpecifier(int Age) {

        if (Age >= 24) {
            setMovieName("Mad Max: Fury Road");
            setMovieSummary("A woman rebels against a tyrannical ruler in \n"
                    + "\tpost apocalyptic Australia in search for her home-land with the help of \n" + ""
                    + "\ta group of female prisoners, a psychotic worshipper, and a drifter named Max.");
            setYear("(2015)");
            ratingIMDB = rating(8.1);
            ratingMetacritic = rating(90);
            movieCount++;

        } else if (Age >= 18 && Age < 24) {
            setMovieName("The Imitation Game");
            setMovieSummary("During World War II, mathematician Alan Turing \n"
                    + "\ttries to crack the enigma code with help from fellow mathematicians.");
            setYear("(2014)");
            ratingIMDB = rating(8.1);
            ratingMetacritic = rating(73);
            movieCount++;

        } else if (Age < 18 && Age >= 12) {
            setMovieName("The Call");
            setMovieSummary("When a veteran 911 operator takes a life-altering call from a \n"
                    + "\tteenage girl who has just been abducted, she realizes that she must confront a killer \n"
                    + "\tfrom her past in order to save the girl's life.");
            setYear("2013");
            ratingIMDB = rating(6.7);
            ratingMetacritic = rating(51);
            movieCount++;

        } else if (Age < 12 && Age >= 7) {
            setMovieName("Me and Earl and the Dying Girl");
            setMovieSummary("High schooler Greg, who spends most of \n"
                    + "\this time making parodies of classic movies with his co-worker Earl, finds his outlook \n"
                    + "\tforever altered after befriending a classmate who has just been diagnosed with cancer.");
            setYear("(2015)");
            ratingIMDB = rating(7.8);
            ratingMetacritic = rating(74);
            movieCount++;

        } else if (Age < 7 && Age > 4) {
            setMovieName("Frozen");
            setMovieSummary("When the newly crowned Queen Elsa accidentally uses her power to turn things \n"
                    + "\tinto ice to curse her home in infinite winter, her sister, Anna, teams up with a mountain man, his\n"
                    + "\tplayful reindeer, and a snowman to change the weather condition.");
            setYear("(2013)");
            ratingIMDB = rating(7.6);
            ratingMetacritic = rating(74);
            movieCount++;

        } else if (Age <= 4 && Age >= 0) {
            setMovieName("Maleficent");
            setMovieSummary("A vengeful fairy is driven to curse an infant princess, only \n"
                    + "\tto discover that the child may be the one person who can restore peace to their troubled land.");
            setYear("(2014)");
            ratingIMDB = rating(7.0);
            ratingMetacritic = rating(56);
            movieCount++;
        }
    }

    @Override
    public String toString() {
        return "\nThe Movie that is suitable for you is:\n" + "\nMovie Name: " + getMovieName() + "\nSummary: " + getMovieSummary() + "\nYear released: " + getYear() + "\n" + ratingIMDB + "\n" + ratingMetacritic + "\n";
    }

}