public class operators {
    public static void main(String args[]){
        //ARITHMATIC
        //Operator	Name	Description	Example	Try it
        //+	Addition	Adds together two values	x + y
        //-	Subtraction	Subtracts one value from another	x - y
        //*	Multiplication	Multiplies two values	x * y
        ///	Division	Divides one value by another	x / y
        //%	Modulus	Returns the division remainder	x % y
        //++	Increment	Increases the value of a variable by 1	++x
        //--	Decrement	Decreases the value of a variable by 1	--x
        int a = 1 + 2;
        int myValue = 10;

        // myValue = myValue + 10;
        myValue += 10;

        System.out.println("Value is " + myValue);

        // myValue = myValue - 10;
        myValue -= 10;

        System.out.println("New Value " + myValue);

        //myValue=myValue*10;
        myValue *= 10;
        System.out.println(myValue);


        //myValue=myValue/10;
        myValue /= 10;
        System.out.println("New Value: " + myValue);

        myValue = 10 % 3; // Remainder when 10 is divided by 3
        System.out.println(myValue);


        //myValue=myValue + 1;
        myValue++;
        System.out.println(myValue);


        //myValue=myValue - 1;
        myValue--;
        System.out.println(myValue);
        //ASSIGMENT
        //A list of all assignment operators:
        //
        //Operator	Example	Same As	Try it
        // =	x = 5	x = 5
        // +=	x += 3	x = x + 3
        //-=	x -= 3	x = x - 3
        //*=	x *= 3	x = x * 3
        ///=	x /= 3	x = x / 3
        //%=	x %= 3	x = x % 3
        //&=	x &= 3	x = x & 3
        //|=	x |= 3	x = x | 3
        //^=	x ^= 3	x = x ^ 3
        //>>=	x >>= 3	x = x >> 3
        //<<=	x <<= 3	x = x << 3
        //COMPARISON
        int x = 5;
        int y = 3;
        System.out.println(x > y); // returns true, because 5 is higher than 3
        //Operator	Name	Example	Try it
        //==	Equal to	x == y
        //!=	Not equal	x != y
        //>	Greater than	x > y
        //<	Less than	x < y
        //>=	Greater than or equal to	x >= y
        //<=	Less than or equal to	x <= y
        //LOGICAL
        //Operator	Name	Description	Example	Try it
        //&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
        //|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
        //!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)
        int bodyTemp = 97;

        if (bodyTemp >= 97) {
            System.out.println("You have fever");
        }

        int g = 50;
        int b = 70;

        if ((g <= 58) & (b <= 75)) {
            System.out.println("All good");
        }
        int c = 90;
        int d = 100;

        if ((c >= 90) || (d < 100)) {
            System.out.println("It's all good");
        }

        boolean isItSunday = false;

        if (!isItSunday) {
            System.out.println("It is not a Sunday");
        }
        //terinaryoperator
        boolean isMarch = false;

        boolean isNoofDay31 = isMarch ? true : false;
        isMarch = true;

        if (!isNoofDay31) {
            System.out.println("Days are not 31");
        }

        int heightOfTruck = 50;

        boolean TruckAllowed = heightOfTruck == 50 ? true : false;

        if(TruckAllowed) {
            System.out.println("You can cross the bridge");
        }

    }
}
