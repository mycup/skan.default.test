package com.listener.test2;

interface Listener {
	public void startListener(String log);

	public void runListener(String log);
}

class Test2 implements Listener {
	public synchronized void startListener(String log) {
		System.out.println("Bclass started:" + log);
	}

	public synchronized void runListener(String log) {
		System.out.println("Bclass running:" + log);
	}

	public Test2() {
		Bclass myb = new Bclass(this);
		Thread thread = new Thread(myb);
		thread.start();
	}

	public static void main(String[] args) {
		Test2 t2 = new Test2();
	}
}
