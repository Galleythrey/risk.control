package riskcontrol.service;

import java.util.List;

import riskcontrol.model.Issue;

public interface IssueManageService {
	public void save(Issue issue);
	public Issue find(int id);
	public List<Issue> findAll();
	public List<Issue> findTrack(String traker);
	public List<Issue> findCommit(String commiter);
}
