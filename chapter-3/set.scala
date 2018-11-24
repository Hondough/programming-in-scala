var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))
jetSet = jetSet.map(n => n + " Co.")
println(jetSet.mkString(", "))