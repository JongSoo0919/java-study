package enumeration.test;

import java.util.ArrayList;
import java.util.List;

public enum AuthGrade {
    GUEST(1, "손님")
    ,LOGIN(2, "로그인 회원")
    ,ADMIN(3, "관리자")
    ;

    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getAuthByLevel(){
        List<String> authByLevel = new ArrayList<>();
        if(level > 0){
            authByLevel.add("메인화면");
        }
        if(level > 1) {
            authByLevel.add("이메일 관리 화면");
        }
        if (level > 2) {
            authByLevel.add("관리자 화면");
        }

        return authByLevel;
    }

    @Override
    public String toString() {
        return "grade="+name()+", level="+level+", 설명="+description;
    }


}
