package riskcontrol.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "issues")
public class Issue implements Serializable {

	@Id
	private int id;
	private String project;
	private String content;
	private String possibility;
	private String seriousnes;
	private String triger;
	private String committer;
	private String tracker;
	
	
	public int getId() {
		return id;
	}
	public void setId(int iid) {
		this.id = iid;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPossibility() {
		return possibility;
	}
	public void setPossibility(String possibility) {
		this.possibility = possibility;
	}
	public String getSeriousnes() {
		return seriousnes;
	}
	public void setSeriousnes(String seriousnes) {
		this.seriousnes = seriousnes;
	}
	public String getTriger() {
		return triger;
	}
	public void setTriger(String triger) {
		this.triger = triger;
	}
	public String getCommitter() {
		return committer;
	}
	public void setCommitter(String committer) {
		this.committer = committer;
	}
	public String getTracker() {
		return tracker;
	}
	public void setTracker(String tracker) {
		this.tracker = tracker;
	}
	
}