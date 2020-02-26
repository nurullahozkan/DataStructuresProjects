/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders6_lab;

import static java.lang.System.exit;
//import java.util.Stack;

/**
 *
 * @author Nurullah
 */
public class Postfix {
   public static int islem(char input) { 
		switch (input) { 
			case '+': 
				return 1; 
			case '-': 
				return 1; 
			case '*': 
				return 1; 
			case '^': 
				return 1; 
			case '%': 
				return 1; 
			case '/': 
				return 1; 
			case '(': 
				return 1; 
		} 
		return 0; 
	} 


	public static int harfler(char input) { 
		if (input >= 65 && input <= 90
				|| input >= 97 && input <= 122) { 
			return 1; 
		} 
		return 0; 
	} 

        
	public static int girisPostfix(char input) { 
		switch (input) { 
			case '+': 
			case '-': 
				return 2; 
			case '*': 
			case '%': 
			case '/': 
				return 4; 
			case '^': 
				return 5; 
			case '(': 
				return 0; 
		} 
		return 0; 
	} 


// Stackten çıkış 
	public static int cikisPostfix(char input) { 
		switch (input) { 
			case '+': 
			case '-': 
				return 1; 
			case '*': 
			case '%': 
			case '/': 
				return 3; 
			case '^': 
				return 6; 
			case '(': 
				return 100; 
		} 
		return 0; 
	} 

//infix postfix dönüştüren fonk.
	public static void inToPost(char[] input) { 
		Stack s = new Stack(input.length); 

		// girişler null olmadığı sürece 
		int i = 0; 
		while (input.length!=i) { 

			// girilen karakter işlem isde
			if (harfler(input[i]) == 1) { 
				System.out.printf("%c", input[i]); 
			} // girilen harf ise
			else if (islem(input[i]) == 1) { 
				if (s.empty() 
						|| cikisPostfix(input[i]) > girisPostfix((char)s.dizi[s.stackpointer])) { 
					s.push(input[i]); 
				} else { 
					while (!s.empty() 
							&& cikisPostfix(input[i]) < girisPostfix((char)s.dizi[s.stackpointer])) { 
						System.out.printf("%c", (char)s.dizi[s.stackpointer]); 
						s.pop(); 
					} 
					s.push(input[i]); 
				} 
			} // kapalı parantez koşulu
			else if (input[i] == ')') { 
				while ((char)s.dizi[s.stackpointer] != '(') { 
					System.out.printf("%c", (char)s.dizi[s.stackpointer]); 
					s.pop(); 

					// kapalı parantez yok ise
					if (s.empty()) { 
						System.out.println("Yanlış Girdi!!!"); 
						exit(1); 
					} 
				} 

				// paranteze kadar pop et
				s.pop(); 
			} 
			i++; 
		} 

		// işlemleri pop et
		while (!s.empty()) { 
			if ((char)s.dizi[s.stackpointer] == '(') { 
				System.out.println("Yanlış girdi!!!"); 
				exit(1); 
			} 
			System.out.printf("%c", (char)s.dizi[s.stackpointer]); 
			s.pop(); 
		} 
	} 

	public static void main(String[] args) { 
		char input[] = "((a+b)/g+(d-c)*f)+l*k".toCharArray(); 
		inToPost(input); 
	} 
}
