package com.josh.java.conversion;

public class NumberSystemConversion {

	public static void main(String[] args) {
		/*
		 * Binary to Decimal Conversion using .parseInt().
		 */
		String binary = "1001";
		int dec = Integer.parseInt(binary, 2);
		System.out.println("Decimal representation of 1001 is: " + dec);
		/*
		 * Decimal to Binary Conversion Using .toBinaryString().
		 */
		String binary1 = Integer.toBinaryString(dec);
		System.out.println("Binary representation of " + dec + "is : " + binary1);
		System.out.println("Binary representation of 100258 : " + Integer.toBinaryString(100258));
		/*
		 * Binary to Octal Conversion by converting the binary to decimal,
		 * then converting decimal to Octal using .toOctalString().
		 */
		String binary2 = "10101";
		int dec1 = Integer.parseInt(binary2, 2);
		String octal = Integer.toOctalString(dec1);
		System.out.println("Octal representation of 10101 is : " + octal);
		/*
		 * Decimal to HexaDecimal conversion Using .toHexString().
		 */
		int dec2 = 465;
		String hexadec = Integer.toHexString(dec2);
		System.out.println("Hexa decimal representation of 465 is : " + hexadec);
		/*
		 * HexaDecimal to Decimal conversion Using .parseInt().
		 */
		String hexa = "6F";
		int dec3 = Integer.parseInt(hexa, 16);
		System.out.println("Decimal representation of 6F is : " + dec3);
		/*
		 * Decimal to Octal Conversion Using .toOctalString()
		 */
		int dec4 = 945;
		String octadec = Integer.toOctalString(dec4);
		System.out.println("Octal representation of 945 is : " + octadec);
		/*
		 * Octal to Decimal conversion Using .parseInt().
		 */
		String octanum = "573";
		int dec5 = Integer.parseInt(octanum, 8);
		System.out.println("Decimal representation of 573 is:" + dec5);

	}
}
