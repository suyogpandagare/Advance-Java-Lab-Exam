package study.jparest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.jparest.entity.Planner;
import study.jparest.repository.Repository;

@RestController
@RequestMapping(path = "/plan")
public class Controller {

	@Autowired
	Repository repo;
	
	@PostMapping("/addplan")
	public String addPlan(@RequestBody Planner p)
	{
		Planner pl = new Planner(p.getId(), p.getDate(), p.getTaskInfo(), p.getIsDone());
		repo.save(pl);
		
		return "Plan Added Successfully";
	}
	
	@GetMapping("/allplans")
	public List<Planner> showAllPlans()
	{
		List<Planner> list = repo.findAll();
		
		return list;
	}
	
}
