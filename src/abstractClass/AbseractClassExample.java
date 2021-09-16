package abstractClass;

abstract class Player{ // abstractClass
    boolean pause;
    int currentPos;

    Player() {
        pause = false;
        currentPos = 0;
    }

    abstract void play(int pos); // abstractMethod
    abstract void stop();  // abstractMethod
}

abstract class AudioPlayer extends Player{

    abstract String showlyric();

}

class MP3Player extends AudioPlayer {
    @Override
    void play(int pos) { } // general method

    @Override
    void stop() { } // general method

    @Override
    String showlyric() { return "lyricString"; } // general method
}

public class AbseractClassExample {
    public static void main(String[] args) {

        AudioPlayer ipod  = new MP3Player(); // upcasting

        //
        // AudioPlayer samsungPlayer = new AudioPlayer(); // compile error
    }
}