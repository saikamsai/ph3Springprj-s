package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.beans.Feedback;
import com.service.FeedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	
	@RequestMapping(value="storeFeedback",consumes=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.POST)
	public String storeFeeedback(@RequestBody Feedback f) {
		return feedbackService.storeFeedback(f);
	}
}
