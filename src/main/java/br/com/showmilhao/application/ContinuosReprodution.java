package br.com.showmilhao.application;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import br.com.showmilhao.util.LogUtil;
import javazoom.jl.player.Player;

public class ContinuosReprodution extends Thread {
	
	private String  fileMusic;
	private Boolean loop;
	
	public ContinuosReprodution(String fileMusic, Boolean loop) {
		this.fileMusic = fileMusic;
		this.loop = loop;
	}
	
	@Override
	public void run() {
		try {
			do {
				new Player(new BufferedInputStream(new FileInputStream(fileMusic)));
			} while (loop);
		} catch (Exception e) {
			LogUtil.getLogger(ContinuosReprodution.class).error(e.getCause().toString());
		}
	
		
		
		
	}
	

}
