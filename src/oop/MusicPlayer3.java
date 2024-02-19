package oop;

/**
 * 절차 지향적 뮤직 플레이어 - 메서드 추출
 */
public class MusicPlayer3 {
    public static void main(String[] args) {
        MusicPlayerData musicPlayerData = new MusicPlayerData();
        //음악 플레이어 켜기
        playerOn(musicPlayerData);
        //볼륨 증가
        System.out.println(volumeUp(musicPlayerData));
        //볼륨 증가
        System.out.println(volumeUp(musicPlayerData));
        //볼륨 감소
        System.out.println(volumeDown(musicPlayerData));
        //상태 확인
        statePrint(musicPlayerData);
        //음악 플레이어 종료
        playerOff(musicPlayerData);
    }
    public static void playerOn (MusicPlayerData musicPlayer){
        System.out.println("음악 플레이어를 시작합니다.");
        musicPlayer.isOn = true;
    }
    public static void playerOff (MusicPlayerData musicPlayer){
        System.out.println("음악 플레이어를 종료합니다.");
        musicPlayer.isOn = false;
    }
    public static String volumeUp (MusicPlayerData musicPlayer){
        musicPlayer.volume++;
        return volumePrint(musicPlayer);
    }

    public static String volumeDown (MusicPlayerData musicPlayer){
        musicPlayer.volume--;
        return volumePrint(musicPlayer);
    }

    public static String volumePrint (MusicPlayerData musicPlayer){
        return "음악 플레이어 볼륨 : " + musicPlayer.volume;
    }

    public static void statePrint (MusicPlayerData musicPlayer){
        System.out.println("음악 플레이어 상태 확인");
        System.out.println("음악 플레이어" + (musicPlayer.isOn ? "ON" : "OFF") + ", 볼륨 : " + musicPlayer.volume);
    }
}
