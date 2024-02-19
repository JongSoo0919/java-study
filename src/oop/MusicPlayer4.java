package oop;

/**
 * 객체 지향 프로그래밍 - 데이터를 가진 객체가 본인의 데이터를 수정할 수 있도록
 */
public class MusicPlayer4 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        //음악 플레이어 켜기
        musicPlayer.on();
        //볼륨 증가
        musicPlayer.volumeUp();
        //볼륨 증가
        musicPlayer.volumeUp();
        //볼륨 감소
        musicPlayer.volumeDown();
        //상태 확인
        musicPlayer.showStatus();
        //음악 플레이어 종료
        musicPlayer.off();
    }
}
