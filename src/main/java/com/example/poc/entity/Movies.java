package com.example.poc.entity;

public class Movies {

	private String name;
	private String actorName;
	private String directorName;
	
	
	public Movies(String name, String actorName, String directorName) {
		super();
		this.name = name;
		this.actorName = actorName;
		this.directorName = directorName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	@Override
	public String toString() {
		return "Movies [name=" + name + ", actorName=" + actorName + ", directorName=" + directorName + "]";
	}
	
	
}
