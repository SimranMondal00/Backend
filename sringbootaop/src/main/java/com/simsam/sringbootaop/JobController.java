package com.simsam.sringbootaop;

import com.simsam.sringbootaop.model.JobPost;
import com.simsam.sringbootaop.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class JobController {
    @Autowired
    private JobService services;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
        return services.getAllJobs();
    }
    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return services.getJob(postId);
    }
    @PostMapping("jobPost")
    public void addJob(@RequestBody JobPost jobPost){
        services.addJob(jobPost);
    }
    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        services.updateJob(jobPost);
        return services.getJob(jobPost.getPostId());
    }
    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId){
        services.deleteJob(postId);
        return "Delete";
    }
}