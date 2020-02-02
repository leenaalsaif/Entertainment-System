
package entertainmentsystem2;

public class TvShows extends Entertainment implements AgeSpecifier {

    private String showName, showSummary, year;
    private static int ShowCount = 0;

    public TvShows() {
    }

    public TvShows(String showName, String showSummary, String year, int Age) {
        super(Age);
        this.showName = showName;
        this.showSummary = showSummary;
        this.year = year;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getShowSummary() {
        return showSummary;
    }

    public void setShowSummary(String showSummary) {
        this.showSummary = showSummary;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public static int getShowCount() {
        return ShowCount;
    }

    public String rating(int a) {
        return "Metacritic Score: " + a + "/100";
    }

    public String rating(double a) {
        return "IMDB Rating: " + a + "/10";
    }

    String ratingIMDB = null;
    String ratingMetacritic = null;

    @Override
    public void AgeSpecifier(int Age) {

        if (Age >= 24) {
            setShowName("Fargo");
            setShowSummary("Various chronicles of deception, intrigue and murder \n"
                    + "\tin and around frozen Minnesota. Yet all of these tales mysteriously lead back \n"
                    + "\tone way or another to Fargo, North Dakota");
            setYear("(2014-)");
            ratingIMDB = rating(9.0);
            ratingMetacritic = rating(85);
            ShowCount++;

        } else if (Age >= 18 && Age < 24) {
            setShowName("Mr. Robot");
            setShowSummary("Follows a young computer programmer who\n"
                    + "\tsuffers from social anxiety disorder and forms connections through \n"
                    + "\thacking. He's recruited by a mysterious anarchist, who calls himself Mr. Robot.");
            setYear("(2015-)");
            ratingIMDB = rating(8.8);
            ratingMetacritic = rating(79);
            ShowCount++;

        } else if (Age < 18 && Age >= 12) {
            setShowName("The 100");
            setShowSummary("Set 97 years after a nuclear war has destroyed civilization, when a spaceship housing \n"
                    + "\thumanity's lone survivors sends 100 juvenile delinquents back to Earth in hopes of \n\tpossibly re-populating the planet.");
            setYear("(2013-)");
            ratingIMDB = rating(7.9);
            ratingMetacritic = rating(63);
            ShowCount++;

        } else if (Age < 12 && Age >= 7) {
            setShowName("Girl Meets World");
            setShowSummary("More than a decade after \"Boy Meets World (1993)\", \n"
                    + "\tCory and Topanga Matthews are married and have two children. Their daughter, Riley, faces ln\n"
                    + "\tlife lessons through her family, friends, and school--where her father is her history teacher--\n"
                    + "\tas her parents did when they were younger.");
            setYear("(2014-)");
            ratingIMDB = rating(7.1);
            ratingMetacritic = rating(64);
            ShowCount++;

        } else if (Age < 7 && Age > 4) {
            setShowName("Teen Titans Go!");
            setShowSummary("Superhero roommates Robin, Cyborg, Starfire, Raven and Beast\n"
                    + "\tBoy love saving the day, but what happens when they're done fighting crime?");
            setYear("(2013-)");
            ratingIMDB = rating(5.3);
            ratingMetacritic = rating(49);
            ShowCount++;

        } else if (Age <= 4 && Age >= 0) {
            setShowName("The Muppets");
            setShowSummary("Jim Henson's loveable puppets return to the small screen in this \n"
                    + "\tmockumentary-style series that follows their personal and professional lives.");
            setYear("(2013-)");
            ratingIMDB = rating(7.6);
            ratingMetacritic = rating(62);
            ShowCount++;
        }
    }

    @Override
    public String toString() {
        return "\nThe Tv Show that is suitable for you is:\n" + "\nShow Name: " + getShowName() + "\nSummary: " + getShowSummary() + "\nYear released:" + getYear() + "\n" + ratingIMDB + "\n" + ratingMetacritic + "\n";
    }
}