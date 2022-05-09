package firstjava;

import java.util.Arrays;

/**
 * 명령 프롬프트 예제
 */
public class ParameterSample {
    /**
     * 프로그램 시작시 호출
     * @param args 명령줄인수
     */
    public static void main(String[] args) {
        // 인수내용 표시 (배열은 직접 표시가 안되므로 Arrays 메소드를 사용함)
        System.out.println(Arrays.toString(args));
    }
}
/*
 public 이 아닌 외부 클래스
 여러 개의 외부 클래스를 하나의 파일로 정의할 수 있음을 보여줌
*/
class Dummy {
}