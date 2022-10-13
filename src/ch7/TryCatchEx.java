package ch7;

import java.io.*;
import java.util.Scanner;

public class TryCatchEx {
    public static void main(String[] args) {
        // NullPointerException 발생
        try {
            String data = null;
            System.out.println(data.toString());
        } catch (Exception e) {
            System.out.println("null인 데이터에서는 toString() 메서드를 사용할수 없습니다.");
        }

        try {
            String data1 = args[10];
            String data2 = args[20];

            System.out.println("args[10] : " + data1);
            System.out.println("args[20] : " + data2);
        } catch (Exception e) {
            System.out.println("배열의 최대 index 범위를 넘어서 접근하였습니다.");
        }

        try {
            String data1 = "100";
            String data2 = "a100";

            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;
            System.out.println(data1 + " + " + data2 + " = " + result);
        } catch (NullPointerException e) {
            System.out.println("null을 사용하여 진행할 수 없습니다.");
        }
        catch (NumberFormatException e) {
            // 예외처리를 하나로 모두 처리한다면 Exception을 사용
            // 지정한 예외 상황만 처리하고자 한다면 해당 예외클래스를 사용해야한다.
            // 하나의 try 구문에서 여러개의 지정된 예외처리를 하고자 하면 catch를 여러개 사용할 수 있다.
            System.out.println("정수로 변환할 수 없습니다.");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        catch (Exception e) {
            // Exception 클래스는 모든 예외 클래스의 최상위 클래스 이므로 여러개의 catch문을 사용할 경우 가장
            // 마지막에 입력되어야한다.
            System.out.println("알 수 없는 오류가 발생했습니다.");
        }

        System.out.println("\n");

        // finally : try ~ catch 구문에서 예외가 발생하던 발생하지 않던 무조건 실행되어야 하는 소스 코드를
        // 입력하는 구문을 finally라고 함, 주로 외부 리소스 사용 시 해당 리소스를 해제하기 위한 목적으로 많이 사용함
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("문자를 입력해주세요 : ");
            String data = scanner.nextLine();

            if(data.equals("")) {
                data = null;
            }

            System.out.println(data.toString());
            System.out.println("여기는 정상 실행 완료 후 실행되는 부분입니다.");
        } catch (NullPointerException e) {
            System.out.println("여기는 예외 발생 시 실행되는 부분입니다.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("여기는 무조건 실행되는 부분입니다.");
        }

        System.out.println("try ~ catch가 완료된 후 실행되는 부분입니다.");

        System.out.println("\n\n");

        File file = new File("D:\\test.txt");
        String str = "java file write test";

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(str);
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("파일 쓰기 사용 시 오류가 발생했습니다.");
        }

        System.out.println("파일 쓰기 완료");
        System.out.println("\n ----- 파일 읽기 시작 -----\n");

        FileReader fr = null;
        BufferedReader reader = null;

        try {
            fr = new FileReader("D:\\test.txt");
            reader = new BufferedReader(fr);
            String tmp;
            while((tmp = reader.readLine()) != null) {
                System.out.println(tmp);
            }
        } catch(FileNotFoundException ex) {

        } catch(IOException ex) {
            System.out.println("파일 사용시 오류가 발생했습니다.");
            System.out.println(ex.getMessage());
        } finally {
            try{
                if(reader != null)
                    reader.close();
                if(fr != null)
                    fr.close();
            } catch(IOException ex) {

            }
        }
    }
}
