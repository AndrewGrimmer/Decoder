package decoder;
import java.util.Scanner; //imports scanner

public class Decoder {

	public static void main(String[] args) {
	
		String userInput;
		String encrypt; 
		String decode;
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Would you like to ENCRYPT or DECODE a message? ");
		userInput = input.nextLine();
			
			if (userInput.equals("encrypt")) {
				System.out.print("What message would you like to encrpyt?: ");
				encrypt = input.nextLine();
				
				char[] encryptArray = encrypt.toCharArray();
				
				for (int i=  0; i<encryptArray.length; i++) {
					switch (encryptArray[i]) {
						case 'a': encryptArray[i] = 'm'; break;
						case 'b': encryptArray[i] = 'g'; break;
						case 'c': encryptArray[i] = 'l'; break;
						case 'd': encryptArray[i] = 'p'; break;
						case 'e': encryptArray[i] = 'x'; break;
						case 'f': encryptArray[i] = 'b'; break;
						case 'g': encryptArray[i] = 'v'; break;
						case 'h': encryptArray[i] = 'e'; break;
						case 'i': encryptArray[i] = 'r'; break;
						case 'j': encryptArray[i] = 'a'; break;
						case 'k': encryptArray[i] = 'y'; break;
						case 'l': encryptArray[i] = 'q'; break;
						case 'm': encryptArray[i] = 'i'; break;
						case 'n': encryptArray[i] = 'w'; break;
						case 'o': encryptArray[i] = 'f'; break;
						case 'p': encryptArray[i] = 'k'; break;
						case 'q': encryptArray[i] = 'c'; break;
						case 'r': encryptArray[i] = 'n'; break;
						case 's': encryptArray[i] = 'o'; break;
						case 't': encryptArray[i] = 'h'; break;
						case 'u': encryptArray[i] = 't'; break;
						case 'v': encryptArray[i] = 'd'; break;
						case 'w': encryptArray[i] = 'j'; break;
						case 'x': encryptArray[i] = 'z'; break;
						case 'y': encryptArray[i] = 'u'; break;
						case 'z': encryptArray[i] = 's'; break;
						
					}
				}
					System.out.print(encryptArray);
				
				
			} else if (userInput.equals("decode")) {
				System.out.print("What message would you like to decode?: ");
				decode = input.nextLine();
				
				char[] decodeArray = decode.toCharArray();
				
				for (int j = 0; j<decodeArray.length; j++) {
					switch (decodeArray[j]) {
						case 'a': decodeArray[j] = 'j'; break;
						case 'b': decodeArray[j] = 'f'; break;
						case 'c': decodeArray[j] = 'q'; break;
						case 'd': decodeArray[j] = 'v'; break;
						case 'e': decodeArray[j] = 'h'; break;
						case 'f': decodeArray[j] = 'o'; break;
						case 'g': decodeArray[j] = 'b'; break;
						case 'h': decodeArray[j] = 't'; break;
						case 'i': decodeArray[j] = 'm'; break;
						case 'j': decodeArray[j] = 'w'; break;
						case 'k': decodeArray[j] = 'p'; break;
						case 'l': decodeArray[j] = 'c'; break;
						case 'm': decodeArray[j] = 'a'; break;
						case 'n': decodeArray[j] = 'r'; break;
						case 'o': decodeArray[j] = 's'; break;
						case 'p': decodeArray[j] = 'd'; break;
						case 'q': decodeArray[j] = 'l'; break;
						case 'r': decodeArray[j] = 'i'; break;
						case 's': decodeArray[j] = 'z'; break;
						case 't': decodeArray[j] = 'u'; break;
						case 'u': decodeArray[j] = 'y'; break;
						case 'v': decodeArray[j] = 'g'; break;
						case 'w': decodeArray[j] = 'n'; break;
						case 'x': decodeArray[j] = 'e'; break;
						case 'y': decodeArray[j] = 'k'; break;
						case 'z': decodeArray[j] = 'x'; break;
					}
				}
				System.out.print(decodeArray);
				
			} else {
				System.out.println("Unrecognized command");
			}
		
		input.close(); 
		
	}

}
