package Patterns.fasada;

import java.io.File;

public class Main {

    //Prosty interface dla skomplikowanego procesu
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }

}