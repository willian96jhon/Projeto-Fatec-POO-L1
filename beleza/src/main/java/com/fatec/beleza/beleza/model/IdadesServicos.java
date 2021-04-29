package com.fatec.beleza.beleza.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IdadesServicos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMedias;
	private int media=0;
	private int mediaM=0;
	private int mediaH=0;
	private ArrayList<String> servicosM;
	private ArrayList<String> servicosF;
	
	
	public int getMediaM() {
		return mediaM;
	}
	public void setMediaM(int mediaM) {
		this.mediaM = mediaM;
	}
	public int getMediaH() {
		return mediaH;
	}
	public void setMediaH(int mediaH) {
		this.mediaH = mediaH;
	}
	public ArrayList<String> getServicosM() {
		return servicosM;
	}
	public void setServicosM(ArrayList<String> servicosM) {
		this.servicosM = servicosM;
	}
	public ArrayList<String> getServicosF() {
		return servicosF;
	}
	public void setServicosF(ArrayList<String> servicosF) {
		this.servicosF = servicosF;
	}
	public int getMedia() {
		return media;
	}
	public void setMedia(int media) {
		this.media = media;
	}
	public Long getIdMedias() {
		return idMedias;
	}
	public void setIdMedias(Long idMedias) {
		this.idMedias = idMedias;
	}
	
	

}
