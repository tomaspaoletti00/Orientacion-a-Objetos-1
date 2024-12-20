package ar.edu.unlp.info.oo1.ejercicio10_jobScheduler;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected String strategy;

    public JobScheduler () {
        this.jobs = new ArrayList<>();
        this.strategy = "FIFO";
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public String getStrategy() {
        return this.strategy; 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public void setStrategy(String aStrategy) {
        this.strategy = aStrategy;
    }

    public JobDescription next() {
    	
    	if (jobs.isEmpty()) {
            return null;  // Retorna null si no hay trabajos
        }
    	
        JobDescription nextJob = null;

        switch (strategy) {
            case "FIFO":
                nextJob = jobs.get(0);
                break;

            case "LIFO":
                nextJob = jobs.get(jobs.size()-1);
                break;                
            case "HighestPriority":
                nextJob = jobs.stream()
                    .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                    .orElse(null);
                break;
            case "MostEffort":
                nextJob = jobs.stream()
                    .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                    .orElse(null);
                break;
        }
        
        if (nextJob != null) {
        	this.unschedule(nextJob);
        }
        return nextJob;
    }

}
