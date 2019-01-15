package com.tinytongtong.thinkinjavapractice.test.copy;

public class Asian {
	private String skin;
	Person person;

	public Asian(String skin, Person person) {
		super();
		this.skin = skin;
		this.person = person;
	}

	public Asian(Asian asian) {
		this(asian.skin, asian.person);
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	@Override
	public String toString() {
		return "Asian [skin=" + skin + ", person=" + person + "]";
	}
	
}
