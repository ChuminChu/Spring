package javapractice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Mytest3 {
    @Test
    void stringf(){
        assertThat(isValidEmail("doraemon@gmail.com")).isTrue();
        assertThat(isValidEmail("doraemon")).isFalse();

        assertThat(isFemale("1234567")).isFalse();
        assertThat(isFemale("2345678")).isTrue();
        assertThat(isFemale("3456789")).isFalse();
        assertThat(isFemale("4567890")).isTrue();

        assertThat(isValidIdNumber("1234567")).isTrue();
        assertThat(isValidIdNumber("1abcd67")).isFalse();

        assertThat(toCameCase("snake_case")).isEqualTo("snakeCase");
        assertThat(toCameCase("product_name")).isEqualTo("productName");
        assertThat(toCameCase("created_at")).isEqualTo("createdAt");

        assertThat(isValidPhoneNumber("01012345678")).isTrue();
        assertThat(isValidPhoneNumber("010123456789")).isFalse();
        assertThat(isValidPhoneNumber("00012345678")).isFalse();
        assertThat(isValidPhoneNumber("010xxxx5678")).isFalse();

        assertThat(extractDomain("https://git-scm.com/book/en/v2")).isEqualTo("git-scm.com");
        assertThat(extractDomain("https://www.google.com/search?q=java")).isEqualTo("www.google.com");
        assertThat(extractDomain("https://www.op.gg/modes/aram/teemo/build?region=global&tier=all")).isEqualTo("www.op.gg");

        assertThat(powerPassword("a1@")).isFalse();
        assertThat(powerPassword("A1@")).isFalse();
        assertThat(powerPassword("Aa@")).isFalse();
        assertThat(powerPassword("Aa1")).isFalse();
        assertThat(powerPassword("Aa1@")).isTrue();


    }

    boolean isValidEmail(String a){
        return a.contains("@");
    }

    boolean isFemale(String a){
        /*
       char frist = a.charAt(0);
       if(frist == '2' || frist == '4'){
           return true;
       } return false;

         */
        return a.startsWith("2") || a.startsWith("4");
    }

    boolean isValidIdNumber(String str){
        //내가 받은 str에 숫자 있는지 찾아
        for(int i = 0; i < str.length(); i++){
            char a = str.charAt(i);
            if(!Character.isDigit(a)){ //숫자면- 아니면
                return false;
            }
        }
        return true; //다 돌고 나왔는데 다 숫자면 true
    }


    String toCameCase(String str){
        //일단 _를 찾아 - 어디에 있는지 찾아
        int a = str.indexOf("_");
        String str2 = str.substring(0,a); //_전까지 저장
        String str3 = str.substring(a+1);//뒤까지

        String str4 = str3.substring(0,1).toUpperCase();
        String str5 = str3.substring(1);

        return str2.concat(str4).concat(str5);
    }

    boolean isValidPhoneNumber(String str){
        /*
        if(str.length() == 11 && str.startsWith("010")){ //길이가 11이고 시작이 010이면
            for(int i = 0; i < 11; i++){//반복을 시작해라
                char c1 = str.charAt(i);//하나씩 뜯어봤을 때
                if(!Character.isDigit(c1)){ //숫자면- 아니면
                    return false;
                }
            }
            return true;
        }
        return false;

         */

        //유효하지 않는 것으로 활용해서 경우의 수를 줄여나간다.
        if(str.length() != 11){
            return false;
        }

        if(!str.startsWith("010")){
            return false;
        }

        for(int i = 0; i< str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }


    String extractDomain(String str){

        return str.substring(str.indexOf("/",8), str.indexOf("/",8));

    }

    //비밀번호 문자열이 최소 8자 이상, 대문자/소문자/숫자/특수문자를 각각 최소 1개 포함하는지 확인하여
    boolean powerPassword(String password) {
        //대문자를 판별하는 함수를 가지고 와서 활용
        if (!hasOneUpperCaseAtLeast(password)) {
            return false;
        }

        //소문자를 판별하는 함수를 가져와서 활용
        if (!hasOneLowerCaseAtLeast(password)) {
            return false;
        }

        //숫자를 판별하는 함수를 가져와서 활용
        if(!hasOneNumberAtLeast(password)){
            return false;
        }
        //특수문자를 판별하는 함수를 가져와서 활용
        if(!hasOneSpeacialAtLeast(password)){
            return false;
        }
        //4가지 조건이 다 만족하면
        return true;
    }
//            // 대문자
//            boolean hasUpperCase = false;
//            for (int i = 0; i < password.length(); i++) {
//                if (Character.isUpperCase(password.charAt(i))) {
//                    hasUpperCase = true;
//                }
//            }
//            if (!hasUpperCase) {
//                return false;
//            }
//
//            // 소문자
//            boolean hasLowerCase = false;
//            for (int i = 0; i < password.length(); i++) {
//                if (Character.isLowerCase(password.charAt(i))) {
//                    hasLowerCase = true;
//                }
//            }
//            if (!hasLowerCase) {
//                return false;
//            }
//
//            // 숫자
//            boolean hasDigit = false;
//            for (int i = 0; i < password.length(); i++) {
//                if (Character.isDigit(password.charAt(i))) {
//                    hasDigit = true;
//                }
//            }
//            if (!hasDigit) {
//                return false;
//            }
//
//            // 특수문자
//            String specialChars = "!@#$%^&*()";
//            boolean hasSpecialChar = false;
//            for (int i = 0; i < password.length(); i++) {
//                if (specialChars.contains(String.valueOf(password.charAt(i)))) {
//                    hasSpecialChar = true;
//                }
//            }
//            if (!hasSpecialChar) {
//                return false;
//            }
//
//            return true;
//        }

    //대문자를 판별하는 함수
    boolean hasOneUpperCaseAtLeast(String password) {
        boolean hasUpperCase = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                hasUpperCase = true;
            }
        }
        if (!hasUpperCase) {
            return false;
        }

        return true;
    }

    //소문자를 판별하는 함수
    boolean hasOneLowerCaseAtLeast(String password) {
        boolean hasLowerCase = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                hasLowerCase = true;
            }
        }
        if (!hasLowerCase) {
            return false;
        }
        return true;
    }

    //숫자를 판별하는 함수
    boolean hasOneNumberAtLeast(String password) {
        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
            }
        }
        if (!hasDigit) {
            return false;
        }
        return true;
    }

    //특수문자를 판별하는 함수
    boolean hasOneSpeacialAtLeast(String password) {
        String specialChars = "!@#$%^&*()";
            boolean hasSpecialChar = false;
            for (int i = 0; i < password.length(); i++) {
                if (specialChars.contains(String.valueOf(password.charAt(i)))) {
                    hasSpecialChar = true;
                }
            }
            if (!hasSpecialChar) {
                return false;
            }

            return true;
        }


}

