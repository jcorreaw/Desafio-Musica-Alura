package application;

import model.Music;
import model.MyFavorite;
import model.Podcast;

public class Program {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Forever");
        myMusic.setSinger("Kiss");

        for (int i = 0; i < 1000; i++) {
            myMusic.reproduce();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Bolha Dev");
        myPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            myPodcast.reproduce();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        MyFavorite favorite = new MyFavorite();
        favorite.includes(myPodcast);
        favorite.includes(myMusic);


    }
}
