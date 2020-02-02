package entertainmentsystem2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class EntertainmentSystem2 {

    public static void main(String[] args) throws IOException {

        //creating the files
        String fileName = "UserInfo.txt";
        String movies = "MoviesList.txt";
        String shows = "ShowsList.txt";
        String books = "BooksList.txt";

        //creating the files' objects
        File fileToWrite = new File(fileName);
        File m = new File(movies);
        File s = new File(shows);
        File b = new File(books);

        //creating files writing objects
        FileWriter output = new FileWriter(fileToWrite, true);
        FileWriter output1 = new FileWriter(m);
        FileWriter output2 = new FileWriter(s);
        FileWriter output3 = new FileWriter(b);

        //GUI
        String un = JOptionPane.showInputDialog("**WELCOME TO THE ENTERTAINMENT SYSTEM PROGRAM**\nPlease Enter a username:");
        String name = un;
        String email = JOptionPane.showInputDialog("Please Enter your Email:");
        String e = email;
        String age1 = JOptionPane.showInputDialog("Please Enter your age:");
        Integer age = Integer.parseInt(age1);

        //ArrayList to store the user's data
        ArrayList<String> user = new ArrayList<>();
        user.add(name);
        user.add(e);
        user.add(Integer.toString(age));

        //creating super class object
        Entertainment ent1 = new Entertainment();
        ent1.setAge(age);

        //creatingg inheriting classes objects
        Movies movie1 = new Movies();
        TvShows show1 = new TvShows();
        Books book = new Books();

        //creating array of tuype Entertainment (polymorphism)
        Entertainment[] list = new Entertainment[3];

        //while loop to quit the program
        int r = 0;
        while (r == 0) {

            String x = JOptionPane.showInputDialog("Please specify whether you want a 1. movie 2. tv show 3. book (enter either 1, 2, or 3):");
            Integer choice = Integer.parseInt(x);

            if (choice == 1) {
                movie1.AgeSpecifier(age);
                list[0] = movie1;
                JOptionPane.showMessageDialog(null, list[0]);
            } else if (choice == 2) {
                show1.AgeSpecifier(age);
                list[1] = show1;
                JOptionPane.showMessageDialog(null, list[1]);
            } else if (choice == 3) {
                book.AgeSpecifier(age);
                list[2] = book;
                JOptionPane.showMessageDialog(null, list[2]);
            } else {
                JOptionPane.showMessageDialog(null, "ERROR; Please enter either 1, 2, or 3");

            }

            int z = 0;
            while (z == 0) {
                String y = JOptionPane.showInputDialog("Do you want to exit? type yes or no");

                if (y.equalsIgnoreCase("yes")) {
                    JOptionPane.showMessageDialog(null, "Thank you ..\n\nNumber of movies shown: " + Movies.getMovieCount()
                            + "\nNumber of shows shown: " + TvShows.getShowCount()
                            + "\nNumber of books shown: " + Books.getBookCount());
                    System.exit(0);

                } else if (y.equalsIgnoreCase("no")) {
                    r = 0;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR : Enter only yes or no ");
                }
                z = 0;
            }
        }

        //linked list to store the movies names in a file
        LinkedList<String> moviesList = new LinkedList<>();
        moviesList.add("The Movies Used in The Program:");
        moviesList.add("Mad Max: Fury Road");
        moviesList.add("The Imitation Game");
        moviesList.add("The Call");
        moviesList.add("Me and Earl and the Dying Girl");
        moviesList.add("Frozen");
        moviesList.add("Maleficent");

        //linked list to store the tv shows names in a file
        LinkedList<String> showsList = new LinkedList<>();
        showsList.add("The Tv Shows Used in The Program:");
        showsList.add("Fargo");
        showsList.add("Mr. Robot");
        showsList.add("The 100");
        showsList.add("Girl Meets World");
        showsList.add("Teen Titans Go!");
        showsList.add("The Muppets");

        //linked list to store the books names in a file
        LinkedList<String> booksList = new LinkedList<>();
        booksList.add("The Books Used in The Program:");
        booksList.add("The Girl on The Train");
        booksList.add("The Martian");
        booksList.add("The Fault in Our Stars");
        booksList.add("Wonder");
        booksList.add("Little Red Writing");
        booksList.add("Maple and The Willow Together");

        //writing the user's data for future reference 
        output.write("**User Information** \n\nUsername: " + user.get(0)
                + "\nEmail: " + user.get(1) + "\nAge: " + user.get(2) + "\n");

        //writing the movies, tv shows, books in a file
        output1.write(moviesList.toString());
        output2.write(showsList.toString());
        output3.write(booksList.toString());
        
        //closing the file writing objects
        output.close();
        output1.close();
        output2.close();
        output3.close();
    }
}
