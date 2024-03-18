public class Roman {
    private static final String[] ROMA_NUMBER = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVII", "XXIX",
            "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXXVIII", "XXXIX",
            "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLIII", "XLIX",
            "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX",
            "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX",
            "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX",
            "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX",
            "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCII", "XCVIII", "XCIX"};


    public int converterFromRomanToArabic(String operand) {
        int arabicNumber = 0;

        for (int i = 0; i < ROMA_NUMBER.length; i++) {
            if (ROMA_NUMBER[i].equals(operand)) {
                arabicNumber = i;
                break;
            }
        }
        return arabicNumber;
    }


    public boolean checkRomanNumbers(String num) {

        for (String s : ROMA_NUMBER) {
            if (s.equals(num))
                return true;
        }
        return false;
    }

    public String fromArabicToRoman(int num) {
        String numberRoma = null;

        for (int i = 0; i < ROMA_NUMBER.length; i++) {
            if (i == num) {
                numberRoma = ROMA_NUMBER[i];
                break;
            }
        }
        return numberRoma;
    }
}

