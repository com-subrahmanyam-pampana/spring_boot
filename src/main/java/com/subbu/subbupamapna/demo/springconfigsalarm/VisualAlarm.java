package com.subbu.subbupamapna.demo.springconfigsalarm;

public class VisualAlarm implements Alarm {
	@Override
	public void activate() {
		System.out.println("Visual Alarm activated");
	}

	@Override
	public void deactivate() {
		System.out.println("Visual Alarm activated");
	}
}
