package com.sco.design.mediator;

public class N0CPU extends N0Colleague{
	public N0CPU(N0Mediator mediator) {
		super(mediator);
	}
	
	private String videoData = "";
	
	private String soundData = "";

	public String getVideoData() {
		return videoData;
	}

	public String getSoundData() {
		return soundData;
	}
	
	public void executeData(String data){
		String[] ss = data.split(",");
		this.videoData = ss[0];
		this.soundData = ss[1];
		this.getMediator().changed(this);
	}

}
