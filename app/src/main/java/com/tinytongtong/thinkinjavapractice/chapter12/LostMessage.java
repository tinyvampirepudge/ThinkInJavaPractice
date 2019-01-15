package com.tinytongtong.thinkinjavapractice.chapter12;
/**
 * 异常丢失
 * @author tiny
 *
 */
public class LostMessage {
	
	void f() throws Exception{
		throw new VeryImportantException();
	}
	
	void dispose() throws Exception{
		throw new HoHumException();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			} finally {
				// TODO: handle finally clause
				lm.dispose();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}

class VeryImportantException extends Exception{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A very important exception";
	}
}

class HoHumException extends Exception{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A trivial exception";
	}
}
