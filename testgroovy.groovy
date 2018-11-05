def numTasks = 0

planManager.allPlans.each { plan ->
  plan.stages.each { stage -> 
    stage.jobs.each { job -> 
      numTasks += job.taskDefinitions.count { task ->
        task.pluginKey.startsWith('com.company.task.id')
      }
    }  
  }
}

println("Number of tasks used in all plans: $numTasks")

def x = 5
println("The count is: $x")
x ++
println("The count is: $x")
