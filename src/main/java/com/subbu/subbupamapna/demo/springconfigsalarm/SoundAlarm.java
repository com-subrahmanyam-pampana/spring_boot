package com.subbu.subbupamapna.demo.springconfigsalarm;

public class SoundAlarm implements Alarm {

	@Override
	public void activate() {
		
		
		System.out.println("Sound Alarm activated");
		
	}

	@Override
	public void deactivate() {
		
		
		System.out.println("Sound Alarm deactivated");
		
	}

}
