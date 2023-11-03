package MusicPlayer; // Add this package declaration

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private final List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public void printAllSongs() {
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    public void printSongsOverPlays(int playCount) {
        for (Song song : songs) {
            if (song.getPlayCount() > playCount) {
                System.out.println(song);
            }
        }
    }

    public static void main(String[] args) {
        Main musicPlayer = new Main();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\nMusic Player Menu:");
            System.out.println("1. Add a Song");
            System.out.println("2. Remove a Song");
            System.out.println("3. Print All Songs");
            System.out.println("4. Print Songs with More than a Certain Number of Plays");
            System.out.println("5. Exit");

            int choice;
            while (true) {
                System.out.println("Select an option:");
                if (!in.hasNextInt()) { // If the next input from the Scanner object "in" is not an integer
                    System.out.println("Error: Enter a number");
                    in.next();  // Discard last input and try again
                } else {
                    choice = in.nextInt();
                    break;
                }
            }

            switch (choice) {
                case 1:
                    in.nextLine();
                    System.out.println("Enter the artist's name: ");
                    String artist = in.nextLine();

                    System.out.println("Enter the song title: ");
                    String title = in.nextLine();

                    Song newSong = new Song(artist, title);
                    musicPlayer.addSong(newSong);
                    break;

                case 2:
                    if (musicPlayer.songs.isEmpty()) {
                        System.out.println("No songs to remove.");
                    } else {
                        System.out.println("Select a song to remove:");
                        for (int i = 0; i < musicPlayer.songs.size(); i++) {
                            System.out.println((i + 1) + ". " + musicPlayer.songs.get(i));
                        }
                        int songIndex = in.nextInt();
                        in.nextLine(); // Consume the newline character

                        if (songIndex >= 1 && songIndex <= musicPlayer.songs.size()) {
                            musicPlayer.removeSong(musicPlayer.songs.get(songIndex - 1));
                            System.out.println("Song removed.");
                        } else {
                            System.out.println("Invalid selection.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nAll Songs:");
                    musicPlayer.printAllSongs();
                    break;

                case 4:
                    System.out.print("Enter the minimum play count: ");
                    int playCount = in.nextInt();
                    in.nextLine(); // Consume the newline character

                    System.out.println("\nSongs with more than " + playCount + " play(s):");
                    musicPlayer.printSongsOverPlays(playCount);
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    in.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }
}
