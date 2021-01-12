package com.listener.test2;

public class Bclass implements Runnable {
	private Listener listener;
	private int i = 0;

	Bclass(Listener l) {
		this.listener = l;
		this.listener.startListener("메롱이당 ㅋㅋㅋ 요이땅~~~");
	}

	public void run() {
		while (true) {
			this.i++;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			this.listener.runListener(i + "--나지금 돌고 있니~ ㅋㅋㅋㅋ");
		}
	}

}