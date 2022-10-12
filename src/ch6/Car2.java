package ch6;

public class Car2 {
    Tirei[] tireis = new Tirei[4];

    public Car2() {
        for(int i = 0; i < tireis.length; ++i) {
            tireis[i] = new HankookTire();
        }
    }

    void run() {
        for(Tirei item : tireis) {
            item.roll();
        }
    }
}
