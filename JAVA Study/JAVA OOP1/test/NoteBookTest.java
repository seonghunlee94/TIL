/*package com.edu.oop.test;

  import com.edu.oop.NoteBook;

public class NoteBookTest {

	public static void main(String[] args) {
		NoteBook nb = new NoteBook();
		
		nb.brandName = "LG Gram";
		nb.price = 350000;
		
		nb.printInfo();
		
	}

}
*/

package com.edu.oop.test;

import com.edu.oop.NoteBook;

public class NoteBookTest {

	public static void main(String[] args) {
		//1. NoteBook 클래스 객체를 생성 == NoteBook 멤버를 메모리에 올림
		NoteBook nb = new NoteBook();
		
		//2. 멤버에 접근
		nb.brandName = "LG Gram";
		nb.price = 170;
		
		nb.printInfo();

	}
}
