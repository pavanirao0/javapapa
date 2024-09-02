public class variable {
    public static void main (String args[]){
        int value1 =20;
        int value2= 30*4;
        int value3 = 90-23;
        int sum;
        System.out.println(sum =value1+value2+value3);
        int maxRange = Integer.MAX_VALUE;
        int minRange = Integer.MIN_VALUE;
        byte maxValue = Byte.MAX_VALUE;
        byte minValue = Byte.MIN_VALUE;
        System.out.println("Byte Max Value is " + maxValue);
        System.out.println("Byte Min Value is " + minValue);
        short maxVal = Short.MAX_VALUE;
        short minVal = Short.MIN_VALUE;
        System.out.println(maxVal);
        System.out.println(minVal);

        long maxValue1 = Long.MAX_VALUE;
        long minValue2 = Long.MIN_VALUE;
        System.out.println(maxValue1);
        System.out.println(minValue2);

        short myValue = 32761;
        long veryLongValue = 21474836471234L;
        System.out.println(veryLongValue);


        byte newByteValue = maxValue;
        byte newByteValue2 = (byte) (maxValue/2);
        System.out.println(newByteValue2);

        short newValue = (short) (myValue/2);
        System.out.println(newValue);
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
        int number1 = 10;
        byte number2 = 15 ;
        short number3 =5 ;

        long longSum =1000*(number1+number2+number3);
        System.out.println(longSum);

        short shortsum = (short) (1000*(number1+number2+number3));
        System.out.println(shortsum);
        float floatMaxValue = Float.MAX_VALUE;
        float floatMinValue =Float.MIN_VALUE;

        System.out.println(floatMaxValue);
        System.out.println(floatMinValue);

        double doubleMaxValue =Double.MAX_VALUE;
        double doubleMinValue = Double.MIN_VALUE;
        System.out.println(doubleMaxValue);
        System.out.println(doubleMinValue);
        //Calculate the quantity of petrol and diesel in a budget of 1546.12 Rs according to respective prices 84.11, 74.91
        float petrolf = 1546.12f/84.11f;
        float dieself = 1546.12f*74.91f;
        double petrold =1546.12d/84.11d;
        System.out.println(petrolf);
        System.out.println(petrold);
        float petrol_quantity, diesel_quantity;
        Double petrol_quantity1, diesel_quantity1;
        float petrol_prices = 74.91f;
        float diesel_prices = 84.11f;
        float wallet_balance = 1546.12f;
        petrol_quantity = wallet_balance / petrol_prices;
        diesel_quantity = wallet_balance / diesel_prices;
        Double petrol_prices1 = 74.91;
        Double diesel_prices1 = 84.11;
        Double wallet_balance1 = 1546.12;
        petrol_quantity1 = wallet_balance1 / petrol_prices1;
        diesel_quantity1 = wallet_balance1 / diesel_prices1;

        System.out.println ("The quantity of petrol that we can buy in " +wallet_balance + " is " + petrol_quantity);
        System.out.println ("The quantity of petrol that we can buy in " +wallet_balance + " is " + diesel_quantity);
        System.out.println ("The quantity of petrol that we can buy in " +wallet_balance1 + " is " + petrol_quantity1);
        System.out.println ("The quantity of petrol that we can buy in " +wallet_balance1 + " is " + diesel_quantity1);
        char myChar = 'A';
        System.out.println(myChar);
        char myChar1 ='1';
        System.out.println(myChar1);

        char myUniChar1 ='\u013f';
        System.out.println(myUniChar1);
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        String rtxt = "Hello World";
        System.out.println(rtxt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(rtxt.toLowerCase());   // Outputs "hello world"
        String ptxt = "Please locate where 'locate' occurs!";
        System.out.println(ptxt.indexOf("locate")); // Outputs 7
        //Java counts positions from zero.
        //0 is the first position in a string, 1 is the second, 2 is the third ...
        //Method	Description	Return Type
        //charAt()	Returns the character at the specified index (position)	char
        //codePointAt()	Returns the Unicode of the character at the specified index	int
        //codePointBefore()	Returns the Unicode of the character before the specified index	int
        //codePointCount()	Returns the number of Unicode values found in a string.	int
        //compareTo()	Compares two strings lexicographically	int
        //compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	int
        //concat()	Appends a string to the end of another string	String
        //contains()	Checks whether a string contains a sequence of characters	boolean
        //contentEquals()	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer	boolean
        //copyValueOf()	Returns a String that represents the characters of the character array	String
        //endsWith()	Checks whether a string ends with the specified character(s)	boolean
        //equals()	Compares two strings. Returns true if the strings are equal, and false if not	boolean
        //equalsIgnoreCase()	Compares two strings, ignoring case considerations	boolean
        //format()	Returns a formatted string using the specified locale, format string, and arguments	String
        //getBytes()	Converts a string into an array of bytes	byte[]
        //getChars()	Copies characters from a string to an array of chars	void
        //hashCode()	Returns the hash code of a string	int
        //indexOf()	Returns the position of the first found occurrence of specified characters in a string	int
        //intern()	Returns the canonical representation for the string object	String
        //isEmpty()	Checks whether a string is empty or not	boolean
        //join()	Joins one or more strings with a specified separator	String
        //lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string	int
        //length()	Returns the length of a specified string	int
        //matches()	Searches a string for a match against a regular expression, and returns the matches	boolean
        //offsetByCodePoints()	Returns the index within this String that is offset from the given index by codePointOffset code points	int
        //regionMatches()	Tests if two string regions are equal	boolean
        //replace()	Searches a string for a specified value, and returns a new string where the specified values are replaced	String
        //replaceAll()	Replaces each substring of this string that matches the given regular expression with the given replacement	String
        //replaceFirst()	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	String
        //split()	Splits a string into an array of substrings	String[]
        //startsWith()	Checks whether a string starts with specified characters	boolean
        //subSequence()	Returns a new character sequence that is a subsequence of this sequence	CharSequence
        //substring()	Returns a new string which is the substring of a specified string	String
        //toCharArray()	Converts this string to a new character array	char[]
        //toLowerCase()	Converts a string to lower case letters	String
        //toString()	Returns the value of a String object	String
        //toUpperCase()	Converts a string to upper case letters	String
        //trim()	Removes whitespace from both ends of a string	String
        //valueOf()	Returns the string representation of the specified value	String
        String myStr = "Hello";
        int result = myStr.codePointAt(3);
        System.out.println(result);











    }
        }

