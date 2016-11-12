package riskcontrol.dao;

import java.util.List;

import riskcontrol.model.Issue;
import vo.SummaryVO;

public interface IssueDao {
	public void save(Issue issue);
	public Issue find(int id);
	public int newID();
	public List<Issue> findAll();
	public List<Issue> findTrack(String traker);
	public List<Issue> findCommit(String commiter);
	public SummaryVO summary();
}
