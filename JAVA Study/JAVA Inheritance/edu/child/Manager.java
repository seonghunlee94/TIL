package com.edu.child;

import com.edu.parent.Employee;
import com.edu.util.MyDate;

/*
 * Employee의 자식 클래스..
 * 부모가 가진 모든 성질을 물려받고
 *         +
 * 자신만의 멤버를 추가..
 * ::
 * 상속에서 자식크래스
 * 필드 --> 자신만의 필드를 추가
 * 메소드 --> 부모가 물려준 기능을 자기에게 맞게 고쳐쓴다
 * (상속관계에 있는 2개의 클래스에서만 적용..오버라이딩)
 */
//부모 Employee로부터 확장된 자식 클래스 Manager를 선언
public class Manager extends Employee{

	private String dept;
	
	//이부분의 에러를 안나게 할려면 어떤 코드를 추가해야할까요????
	public Manager(String name,MyDate birthDate,double salary,String dept) {
		//super();//Employee();//null, null,0.0
		super(name, birthDate,salary);
		this.dept = dept;
	}	
	
	/*
		상속관계에 있는 2개의 클래스에서 method가 상속될때 일어나는 일
		Method Overring
		1 step. 부모가 가진 메소드를 그대로 물려받는다.
		2 step. 그걸 고친다
		
		부모가 가진 메소드를 물려받아서
		기능을 자식에게 맞게 다시 고쳐서 사용하는 것
		:
		기능이 바뀌었기 때문에 새로운 메소드가 만들어졌다고 생각해도 된다...
		메소드 재정의
		<Rule>
		1. 메소드 선언부는 모두 일치 - 이름, 인자값, 리턴타입.
		2. 메소드 구현부는 달라야 한다.- 기능이 달라진다.
		3. 서로다른 상속관계의 클래스에서 발생한다.
	 */
	public String getDetails() {
		return super.getDetails()+","+dept;
	}
	
	//자식만의 멤버로 새롭게 추가한 기능..오버라이딩과 상관없다.
	public void changeDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
}

























