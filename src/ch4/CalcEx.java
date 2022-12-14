package ch4;

public class CalcEx {
    // 정적 맴버
    public static int sNum1;
    public static int sNum2;
    public static int sResult;
    
    // 일반 맴버
    public int iNum1;
    public int iNum2;
    public int iResult;

    // 정적 맴버는 일반 맴버를 사용할 수 없음
    // 정적 맴버가 동작하는 순간에 일반 맴버가 메모리에 등록되지 않았을 수 있기 때문에 사용할 수 없음
    // 정적 맴버는 정적 맴버만 사용이 가능함
    public static int sSum() {
        sResult = sNum1 + sNum2;
        return sResult;
    }

    // 일반 맴버는 정적 맴버에 접근이 가능하다.
    // 일반 맴버는 객체 생성 후 사용하는 것이기 때문에 언제든지 정적 맴버에 접근이 가능함
    public int iSum() {
        iResult = iNum1 +iNum2;
        return iResult;
    }

    public static int abs(int a) {
        if(a > 0) {
            return a;
        }
        else {
            return -a;
        }
    }

    public static int max(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static int min(int a, int b) {
        if(a > b) {
            return b;
        }
        else {
            return a;
        }
    }
}
