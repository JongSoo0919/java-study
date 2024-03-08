package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        System.out.println("스피커의 볼륨 직접 접근");
        speaker.volume = 200;
        speaker.showVolume();
    }
}
