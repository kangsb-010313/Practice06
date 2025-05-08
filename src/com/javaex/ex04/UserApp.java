package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] uArray = new User[3];
		
		User uc = new Customer("jws", "j1234", "정우성", 1000);
		User uc02 = new Customer("yjs", "y2345", "이효리", 2000);
		User ue = new Employee("master", "m7788", "운영자", 5000000);
		
		uArray[0] = uc;
		uArray[1] = uc02;
		uArray[2] = ue;
		
		for(int i=0; i<uArray.length; i++) {
			uArray[i].showInfo();
		}

		System.out.println(ue.getName() + "의 월급은 " + (((Employee)uArray[2]).getSalary()) + "원 입니다.");
		
	}

}
