package Email;

import java.util.regex.Pattern;

public class EmailCheck {

        public boolean checkEmail(String text) {

            String emailRegex = "^[a-zA-Z][a-zA-Z0-9.]*[A-Za-z0-9]@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]{2,})+$";

            Pattern pattern = Pattern.compile(emailRegex);

            return pattern.matcher(text).matches();
        }

        public static void main(String[] args) {
            EmailCheck emailChecker = new EmailCheck();
            System.out.println(emailChecker.checkEmail("jakson.ok353@ex.ua")); // true
            System.out.println(emailChecker.checkEmail("invalid_email@")); // false
        }
    }
