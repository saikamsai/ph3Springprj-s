package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.Feedback;
import com.dao.FeedbackDao;

@Service
public class FeedbackService {
	
	@Autowired
	FeedbackDao feedbackDao;
	
	public String storeFeedback(Feedback f) {
		if(feedbackDao.storeFeedback(f)>0) {
			return "Feedback stored";
		}else {
			return "Feedback did not store";
		}
	}
}
