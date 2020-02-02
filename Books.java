/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entertainmentsystem2;

public class Books extends Entertainment {

    private String bookName, bookSummary, year;
    private static int bookCount = 0;

    public Books() {
    }

    public Books(String bookName, String bookSummary, String year, int Age) {
        super(Age);
        this.bookName = bookName;
        this.bookSummary = bookSummary;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookSummary() {
        return bookSummary;
    }

    public void setBookSummary(String bookSummary) {
        this.bookSummary = bookSummary;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public static int getBookCount() {
        return bookCount;
    }

    public void AgeSpecifier(int Age) {

        if (Age >= 24) {
            setBookName("The Girl on The Train");
            setBookSummary("Rachel catches the same commuter train every morning, she's\n"
                    + "\tShe's even started to feel like she knows the people who live in one of the houses,\n" + ""
                    + "\tnow everything's changed. Now Rachel has a chance to become a part of the lives she's /n"
                    + "only watched from afar.");
            setYear("(2014)");
            bookCount++;
        } else if (Age >= 18 && Age < 24) {
            setBookName("The Martian");
            setBookSummary("During a manned mission to Mars, Astronaut Mark Watney is \n"
                    + "\tpresumed dead after a fierce storm and left behind by his crew. \n"
                    + "\tBut Watney has survived and finds himself stranded and alone on the hostile planet."
                    + "\tAnd he must find his way home.");
            setYear("(2014)");
            bookCount++;
        } else if (Age < 18 && Age >= 12) {
            setBookName("The Fault in Our Stars");
            setBookSummary("Two teenage cancer patients begin a life-affirming \n"
                    + "\tjourney to visit a reclusive author in Amsterdam.");
            setYear("2012");
            bookCount++;
        } else if (Age < 12 && Age >= 7) {
            setBookName("Wonder");
            setBookSummary("Born with a terrible facial abnormality, Auggie has been home-schooled \n"
                    + "\tby his parents his whole life, in an attempt to protect him from the cruelty of \n"
                    + "the outside world. Now, for the first time, he's being sent to a real school, and he's dreading it.");
            setYear("(2015)");
            bookCount++;
        } else if (Age < 7 && Age > 4) {
            setBookName("Little Red Writing");
            setBookSummary("A brave, little red pencil finds her way through the many perils of writing a story,\n"
                    + " faces a ravenous pencil sharpener (the Wolf 3000)... and saves the day.");
            setYear("(2013)");
            bookCount++;
        } else if (Age <= 4 && Age >= 0) {
            setBookName("Maple and The Willow Together");
            setBookSummary("Maple and Willow do everything together. But it’s not always sunshine and rainbows,\n"
                    + "\tbecause sometimes big sisters can be bossy—and sometimes little sisters can be frustrating\n"
                    + "\tand even the best of friends need a break from each other.. at least until they can no longer bear to be apart.\n");
            setYear("(2014)");
            bookCount++;
        }
    }

    @Override
    public String toString() {
        return "\nThe book that is suitable for you is:\n" + "\nBook Name: " + getBookName() + "\nSummary: " + getBookSummary() + "\nYear released: " + getYear() + "\n";
    }

}