package org.example;

// 결합을 끊을 수가 있다.
import org.example.password.RandomPasswordGenerator;

public class User {
    private  String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
        // as-is
//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();

        // to-be
        String password =  passwordGenerator.generatePassword();
        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if(password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
