package riskcontrol.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import riskcontrol.service.IssueManageService;

@Controller
public class IssueAction  extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IssueManageService issueManageService;
	
}
