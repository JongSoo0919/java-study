package oop;

/**
 * 객체 지향적 뮤직 플레이어
 */
public class MusicPlayer2 {
    public static void main(String[] args) {
        MusicPlayerData musicPlayerData = new MusicPlayerData();

        //음악 플레이어 켜기
        musicPlayerData.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        //볼륨 증가
        musicPlayerData.volume++;
        System.out.println("음악 플레이어 볼륨 : "+musicPlayerData.volume);

        //볼륨 증가
        musicPlayerData.volume++;
        System.out.println("음악 플레이어 볼륨 : "+musicPlayerData.volume);

        //볼륨 감소
        musicPlayerData.volume--;
        System.out.println("음악 플레이어 볼륨 : " + musicPlayerData.volume);

        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (musicPlayerData.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + musicPlayerData.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        //음악 플레이어 종료
        musicPlayerData.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
