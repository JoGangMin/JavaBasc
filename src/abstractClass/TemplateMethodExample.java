package abstractClass;

// 추상 클레스 선생님
abstract class Teacher{
    final public void startClass(){
        enterClassRoom();
        attendanceCheck();
        teach();
        leaveClassRoom();
    }
    // 공통 메서드
    public void enterClassRoom(){
        System.out.println("선생님이 강의실로 들어옵니다.");
    }

    public void attendanceCheck(){
        System.out.println("선생님이 출석을 부릅니다.");
    }

    public void leaveClassRoom(){
        System.out.println("선생님이 강의실을 나갑니다.");
    }

    // 추상 메서드드
   abstract void teach();
}

// 국어 선생님
class KoreanTeacher extends Teacher{
    private String courseName;
    @Override
    void teach() {
        System.out.println("선생님이 국어를 수업합니다.");
    }
}

// 수항 선생님
class MathTeacher extends Teacher {
    @Override
    void teach() {
        System.out.println("선생님이 수학를 수업합니다.");
    }
}

// 영어 선생님
class EnglishTeacher extends Teacher{
    @Override
    void teach() {
        System.out.println("선생님이 영어를 수업합니다.");
    }
}

public class TemplateMethodExample {
    public static void main(String[] args) {

        KoreanTeacher koreanTeacher = new KoreanTeacher();
        MathTeacher mathTeacher = new MathTeacher();
        EnglishTeacher englishTeacher = new EnglishTeacher();

        koreanTeacher.startClass();
        mathTeacher.startClass();
        englishTeacher.startClass();
    }
}
