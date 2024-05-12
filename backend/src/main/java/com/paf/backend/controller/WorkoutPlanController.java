package com.paf.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paf.backend.entity.WorkoutPlan;
import com.paf.backend.service.WorkoutPlanService;

@CrossOrigin
@RestController
@RequestMapping("/api/workout-plans")

public class WorkoutPlanController {

    @Autowired
    private WorkoutPlanService workoutPlanService;

    @GetMapping
    public List<WorkoutPlan> getAllWorkoutPlans() {
        return workoutPlanService.getAllWorkoutPlans();
    }
    
    @GetMapping("/{userId}")
    public List<WorkoutPlan> getWorkoutPlansByUserId(@PathVariable String userId) {
        return workoutPlanService.getWorkoutPlansByUserId(userId);
    }

    @PostMapping
    public WorkoutPlan createWorkoutPlan(@RequestBody WorkoutPlan workoutPlan) {
        return workoutPlanService.createWorkoutPlan(workoutPlan);
    }

    @PutMapping("/{id}")
    public void updateWorkoutPlan(@PathVariable String id, @RequestBody WorkoutPlan updatedWorkoutPlan) {
        workoutPlanService.updateWorkoutPlan(id, updatedWorkoutPlan);
    }

    @DeleteMapping("/{id}")
    public void deleteWorkoutPlan(@PathVariable String id) {
        workoutPlanService.deleteWorkoutPlan(id);
    }
    
} 
