package com.myworkings;

public final class ImmutableExample {
	private String pancard;

	public String getPancard() {
		return pancard;
	}

	public ImmutableExample(String pancard) {
		this.pancard = pancard;
	}

	public static void main(String[] args) {
		ImmutableExample example=new ImmutableExample("KO");
		String name=example.getPancard();
		System.out.println(name);

	}
}
