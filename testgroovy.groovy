def numTasks = 0

println("Number of tasks used in all plans: $planManager")
planManager.allPlans.each { plan ->
  plan.stages.each { stage -> 
    stage.jobs.each { job -> 
      numTasks++
        println("Number of tasks used in all plans: $numTasks")
    }  
  }
}

println("Number of tasks used in all plans: $numTasks")

def x = 5
println("The count is: $x")
x ++
println("The count is: $x")