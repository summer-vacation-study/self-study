public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        data.On = true;
        System.out.println("음악 플레이어를 시작");

        data.volume++;
        System.out.println("음악 플레이어 볼륨:  " + data.volume);
        data.volume++;
        System.out.println("음악 플레이어 볼륨:  " + data.volume);
        data.volume--;
        System.out.println("음악 플레이어 볼륨:   " + data.volume);

        System.out.println("음악 플레이어 상태 확인");
        if (data.On == true) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
