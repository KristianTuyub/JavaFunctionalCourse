package codesignal;

public class CenturyFromYear {

    public static void main(String[] args) {
        System.out.println(centuryFromYear(1991));
    }

    static int centuryFromYear(int year) {
        StringBuilder centuryString = new StringBuilder("" + year);

        int endIndex = getEndIndex(centuryString);

        String comparativeYear;
        int century = 1;

        if(endIndex == 0) {
            return century;
        } else {
            comparativeYear = centuryString.substring(0, endIndex);
        }

        century = Integer.parseInt(comparativeYear);

        comparativeYear += "00";

        return (year > Integer.parseInt(comparativeYear)) ? ++century : century;
    }

    static int getEndIndex(StringBuilder strBuilder) {
        int length = strBuilder.length();

        return length == 1 || length == 2 ? 0 : length == 3 ? 1 : 2;
    }

}
