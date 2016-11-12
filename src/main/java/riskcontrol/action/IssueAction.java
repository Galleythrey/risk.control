package riskcontrol.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import riskcontrol.model.Issue;
import riskcontrol.service.IssueManageService;

@Controller
public class IssueAction  extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IssueManageService issueManageService;
	private String project;
	private String content;
	private String possibility;
	private String seriousness;
	private String triggerY;
	private String tracker;
		
	public String execute() {
		request.setAttribute("allIssues", issueManageService.findAll());
		return SUCCESS;
	}
	public String trackList(){
		String user = (String)session.get("user");
		request.setAttribute("trackIssues", issueManageService.findTrack(user));
		request.setAttribute("commitIssues", issueManageService.findCommit(user));
		return SUCCESS;
	}
	
	public String createIssue(){
		String committer = (String)session.get("user");
		Issue issue = new Issue();
		issue.setCommitter(committer);
		issue.setContent(content);
		issue.setPossibility(possibility);
		issue.setProject(project);
		issue.setSeriousness(seriousness);
		issue.setTracker(tracker);
		issue.setTriggerY(triggerY);
		issueManageService.save(issue);
		return SUCCESS;
	}
	
	public String IssueDetail(){
		int issueId = Integer.valueOf(request.getParameter("id"));
		request.setAttribute("Issue", issueManageService.find(issueId));
		return SUCCESS;
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
	public String getTracker() {
		return tracker;
	}
	public void setTracker(String tracker) {
		this.tracker = tracker;
	}

}
