//take to cli arguments (will be read as string by default), convert to integer and display the summation

def res = 0
for (i = 0; i < args.size();i++) {
	res+= Integer.parseInt(args[i])
}

println "the numbers are" + args
println "the summation is: " + res