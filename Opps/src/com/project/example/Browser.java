package com.project.example;

interface Browser {
	void searchEngine();

	String govtWork(String s);
}

class Mozilla implements Browser {
	@Override
	public void searchEngine() {
		System.out.println("search mozilla fire fox");
	}

	@Override
	public String govtWork(String s) {
		return null;
	}

}

class Chrome implements Browser {
	@Override
	public String govtWork(String s) {
		if (s.equals("govtWork"))
			return "exicute your work";
		else
			return "use other browser";
	}

	@Override
	public void searchEngine() {
		System.out.println("you searched about chrome\n");
	}
}

class safari implements Browser {
	@Override
	public void searchEngine() {
		System.out.println("you search about safari\n" + "it is an apple browser");
	}

	@Override
	public String govtWork(String s) {
		return null;
	}

}