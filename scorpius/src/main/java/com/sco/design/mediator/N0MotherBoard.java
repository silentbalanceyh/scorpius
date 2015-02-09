package com.sco.design.mediator;

public class N0MotherBoard implements N0Mediator{
	private N0CDDriver cdDriver = null;
	
	private N0CPU cpu = null;
	
	private N0VideoCard videoCard = null;
	
	private N0SoundCard soundCard = null;

	public void setCdDriver(N0CDDriver cdDriver) {
		this.cdDriver = cdDriver;
	}

	public void setCpu(N0CPU cpu) {
		this.cpu = cpu;
	}

	public void setVideoCard(N0VideoCard videoCard) {
		this.videoCard = videoCard;
	}

	public void setSoundCard(N0SoundCard soundCard) {
		this.soundCard = soundCard;
	}
	
	public void changed(N0Colleague colleague){
		if( colleague == cdDriver){
			this.opeCDDriverReadData((N0CDDriver)colleague);
		}else if( colleague == cpu){
			this.opeCPU((N0CPU)colleague);
		}
	}
	
	private void opeCDDriverReadData(N0CDDriver cd){
		String data = cd.getData();
		this.cpu.executeData(data);
	}
	
	private void opeCPU(N0CPU cpu){
		String videoData = cpu.getVideoData();
		String soundData = cpu.getSoundData();
		this.videoCard.showData(videoData);
		this.soundCard.soundData(soundData);
	}
}
