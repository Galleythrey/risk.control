package riskcontrol.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import riskcontrol.dao.IssueDao;
import riskcontrol.model.Issue;
import riskcontrol.service.IssueManageService;

@Service
public class IssueManageServiceImpl implements IssueManageService{
	
	@Autowired
	private IssueDao issueDao;

	public void save(Issue issue) {
		issue.setId(issueDao.newID()+1);
		issueDao.save(issue);
	}

	public Issue find(int id) {
		return issueDao.find(id);
	}

	public List<Issue> findAll() {
		return issueDao.findAll();
	}

	public List<Issue> findTrack(String traker) {
		return issueDao.findTrack(traker);
	}

	@Override
	public List<Issue> findCommit(String commiter) {
		return issueDao.findCommit(commiter);
	}

}
