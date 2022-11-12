import java.util.StringTokenizer;

public class CheckPhoneNumber {
    public static void main(String[] args) {
        //  Number = "(###) ###-#### ";
        String number = "(475) 666-1999";
        StringTokenizer phoneNumber = new StringTokenizer(number);
        CheckPhoneNumber chekNumber = new CheckPhoneNumber(); // instance of the class
        System.out.println("My area code: " + chekNumber.P_areacode(phoneNumber)+ "\n"+"My exchange: " + chekNumber.P_exchange(phoneNumber)+ "\n"+ "My extension: " + chekNumber.P_extension(phoneNumber) );
    }


    public String P_areacode (StringTokenizer phoneNumber) {
        String P_areaCode = phoneNumber.nextToken("()");
        return P_areaCode;
    }
    public String P_exchange (StringTokenizer phoneNumber) {
        String P_exchange = phoneNumber.nextToken(")-");
        return P_exchange;
    }
    public String P_extension (StringTokenizer phoneNumber) {
        String P_extension = phoneNumber.nextToken();
        return P_extension;
    }
}
