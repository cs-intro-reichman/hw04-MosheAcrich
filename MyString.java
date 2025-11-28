public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String finalString = "";
        for(int i = 0; i < str.length(); i++){
            char a = str.charAt(i);
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                 a = (char) (str.charAt(i) + 32);
            }
            finalString = finalString +a;
        }
        // Replace the following statement with your code
        return finalString;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {


    // si str2 es más largo que str1, imposible que esté contenido
    if (str2.length() > str1.length()) return false;

    // recorremos todos los posibles inicios
    for (int i = 0; i <= str1.length() - str2.length(); i++) {

        boolean match = true;

        // verificar si desde esta posición todas las letras coinciden
        for (int j = 0; j < str2.length(); j++) {
            if (str1.charAt(i + j) != str2.charAt(j)) {
                match = false;
                break;
            }
        }

        if (match == true) {
            return true;
            } // encontramos una coincidencia
    }

    return false; // no se encontró

    }
    }
    

