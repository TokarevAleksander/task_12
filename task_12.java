public class task_12 {
    public static void main(String[] args) {
        String inputString = "I like Java!!!";

        if (inputString.contains("Java")) {
            System.out.println("Строка содержит подстроку 'Java'.");
        } else {
            System.out.println("Строка не содержит подстроку 'Java'.");
        }

        if (inputString.startsWith("I like")) {
            System.out.println("Строка начинается с подстроки 'I like'.");
        } else {
            System.out.println("Строка не начинается с подстроки 'I like'.");
        }

        if (inputString.endsWith("!!!")) {
            System.out.println("Строка заканчивается подстрокой '!!!'.");
        } else {
            System.out.println("Строка не заканчивается подстрокой '!!!'.");
        }

        if (inputString.contains("Java") && inputString.startsWith("I like") && inputString.endsWith("!!!")) {
            String upperCaseString = inputString.toUpperCase();
            System.out.println("Строка в верхнем регистре: " + upperCaseString);
        }

        String modifiedString = inputString.replace('a', 'o');
        String substringJovo = modifiedString.substring(7, 11);
        System.out.println("Подстрока 'Jovo': " + substringJovo);
    }
}