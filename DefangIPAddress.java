public class DefangIPAddress {
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");

        // StringBuilder result = new StringBuilder();

        // for (char c : address.toCharArray()) {
        // if (c == '.') {
        // result.append("[.]");
        // } else {
        // result.append(c);
        // }
        // }

        // return result.toString();
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
}
