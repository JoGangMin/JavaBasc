package Interface;

/*
인스타그램의 프로필 사진을 조회하는 프로그램을 인터페이스를 이용하여 구현해보자
 */

public class InterfaceExample {
    public static void main(String[] args) {
        Profile userKim = new GeneralUser("김씨");
        Profile userHo = new BusinessUser("호박씨");

        System.out.println("유저의 프로필 사진을 출력합니다.");

        userKim.showProfilePhoto();
        userHo.showProfilePhoto();
    }
}

class GeneralUser extends UserAbstract implements Profile{
    public GeneralUser(String userName) {
        super(userName, "General");
    }

    @Override
    public void showProfilePhoto() {
        System.out.printf("%s 계정 %s 님의  프로필 사진 출력%n",getUserType(),userName);
    }
}

class BusinessUser extends UserAbstract implements Profile{

    public BusinessUser(String userName) {
        super(userName, "Business");
    }

    @Override
    public void showProfilePhoto() {
        System.out.printf("%s 계정 %s 님의 프로필 사진 출력%n",getUserType(),userName);
    }
}

abstract class UserAbstract{
    public final String userName;
    private String userType;

    UserAbstract(String userName, String userType){
            this.userName = userName;
            this.userType = userType;
    }

    public String getUserType(){
        return this.userType;
    }
}
// BusinessUser, GeneralUser를 사용하는 클레스와 User클레스를 연결하기
interface Profile{
    void showProfilePhoto();
}
