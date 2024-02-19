package oop;

public class MusicPlayer {
    private int volume;
    private boolean isOn;

    public void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    public void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    public void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨 : "+volume);
    }
    public void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨 : "+volume);
    }
    public void showStatus() {
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
