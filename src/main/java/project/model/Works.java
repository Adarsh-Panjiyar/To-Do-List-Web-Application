package project.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Works {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String work;
	private String description;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;           // e.g. 2025-01-20
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime startTime;      // e.g. 13:00
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime endTime;        // e.g. 14:00
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	
	public Works(int id, String work, String description, LocalDate date, LocalTime startTime, LocalTime endTime) {
		super();
		this.id = id;
		this.work = work;
		this.description = description;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public Works() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Works [id=" + id + ", work=" + work + ", description=" + description + ", date=" + date + ", startTime="
				+ startTime + ", endTime=" + endTime + "]";
	}

	
	
	

}
