package access;

/***
 * 스피커 객체, 볼륨은 100을 넘어가면 안된다.
 */
public class Speaker {
    int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("최대 음량으로 100을 넘길 수 없음.");
            return;
        }

        volume += 10;
        System.out.println("음량을 10 증가합니다.");
    }

    void volumeDown () {
        volume -= 10;
        System.out.println("volume 다운 호출");
    }

    void showVolume() {
        System.out.println("현재음량 "+volume);
    }
}
