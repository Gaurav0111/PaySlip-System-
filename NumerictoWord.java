import java.math.BigInteger;

public class NumerictoWord {

    static String wording(int num) {
        String str = "";
        switch (num) {
            case 1:
                str = "one ";
                break;
            case 2:
                str = "two ";
                break;
            case 3:
                str = "three ";
                break;
            case 4:
                str = "four ";
                break;
            case 5:
                str = "five ";
                break;
            case 6:
                str = "six ";
                break;
            case 7:
                str = "seven ";
                break;
            case 8:
                str = "eight ";
                break;
            case 9:
                str = "nine ";
                break;
            case 10:
                str = "ten ";
                break;
            case 11:
                str = "eleven ";
                break;
            case 12:
                str = "twelve ";
                break;
            case 13:
                str = "thirteen ";
                break;
            case 14:
                str = "fourteen ";
                break;
            case 15:
                str = "fiveteen ";
                break;
            case 16:
                str = "sixteen ";
                break;
            case 17:
                str = "seventeen ";
                break;
            case 18:
                str = "eightsteen ";
                break;
            case 19:
                str = "nineteen ";
                break;
            case 20:
                str = "twenty ";
                break;
            case 30:
                str = "thirty ";
                break;
            case 40:
                str = "fourty ";
                break;
            case 50:
                str = "fifty ";
                break;
            case 60:
                str = "sixty ";
                break;
            case 70:
                str = "seventy ";
                break;
            case 80:
                str = "eighty ";
                break;
            case 90:
                str = "ninety ";
                break;
            default:
                // str = "  ";
                break;
        }
        return str;
    }

    static String convert(int num, String str, int count, int cpy) {
        if (num == 0) {
            return "";
        }
        count += 1;
        str = convert(num / 10, str, count, cpy);
        if (count % 2 != 0 && count > 3) {
            if (num % 10 == 1) {
                String str1 = wording(((num % 10) * 10) + (cpy / (int) Math.pow(10, count - 2)) % 10);
                str += str1;
            } else {
                String str1 = wording((num % 10) * 10);
                str += str1;
            }
        } 
        else if (count % 2 == 0 && count > 3 && (num/10)%10 == 1 ) {
                if (count == 10) {
                    str += "Arab ";
                } else if (count == 8) {
                    str += "crore ";
                } else if (count == 6) {
                    str += "lakh ";
                } else if (count == 4) {
                    str += "thousand ";
                }
        } 
        else if (count == 2) {
            if (num % 10 == 1) {
                String str1 = wording(((num % 10) * 10) + (cpy % 10));
                str += str1;
            } else {
                String str1 = wording((num % 10) * 10);
                str += str1;
            }
        } else if (count == 1) {
            if ((cpy % 100) / 10 != 1) {
                String str1 = wording((num % 10));
                str += str1;
            }
        } else {
            if (count == 10) {
                String str1 = wording(num % 10);
                str += str1;
                if(str1!=""){
                    str += "Arab ";
                }
            } else if (count == 8) {
                String str1 = wording(num % 10);
                str += str1;
                if(str1!=""){
                    str += "crore ";
                }
            } else if (count == 6) {
                String str1 = wording(num % 10);
                str += str1;
                if(str1!=""){
                    str += "lakh ";
                }
            } else if (count == 4) {
                String str1 = wording(num % 10);
                str += str1;
                if(str1!=""){
                    str += "thousand ";
                }
            } else if (count == 3) {
                String str1 = wording(num % 10);
                str += str1;
                if(str1!=""){
                    str += "hundered ";
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        int num = 5000000;
        long num1 = 7894561278987453754L;
        BigInteger num2 = new BigInteger("9874563654256546513213218498432131351684363869843861123654789");
        System.out.println(convert(num, "", 0, num) + "only");
    }
}