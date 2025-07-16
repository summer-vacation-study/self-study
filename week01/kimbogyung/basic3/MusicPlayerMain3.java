public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        off(data);
    }
    static void on(MusicPlayerData data) {
        data.On = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: "  + data.volume);
    }

    static void print(MusicPlayerData data) {
        if (data.On == true) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        }
    }

    static void off(MusicPlayerData data) {
        data.On = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
}
