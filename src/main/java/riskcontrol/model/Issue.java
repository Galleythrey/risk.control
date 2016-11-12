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
	private String seriousness;
	private String triggerY;
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
	public String getSeriousness() {
		return seriousness;
	}
	public void setSeriousness(String seriousness) {
		this.seriousness = seriousness;
	}
	public String getTriggerY() {
		return triggerY;
	}
	public void setTriggerY(String triggerY) {
		this.triggerY = triggerY;
	}
	
}