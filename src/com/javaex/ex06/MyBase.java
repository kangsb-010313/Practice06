package com.javaex.ex06;

public class MyBase extends Base{

    //코드작성
	public void service(String state) {
		if(state.equals("낮")) {
			day();
		}else if(state.equals("오후")) {
			afternoon();
		}else {
			night();
		}
	}
    public void day() {
    	System.out.println("낮에는 열심히 수업듣자");
    }
    public void night() {
    	super.night();
    }
    public void afternoon() {   	
    	System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }

}
