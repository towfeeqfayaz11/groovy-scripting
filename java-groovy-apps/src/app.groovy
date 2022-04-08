

println "this is main running"

def update(num){
    println "this is reusable from update $num"
    println "this is reusable from update"+$num
    println("this is reusable from update" + $num)
}

def getData(int appdata){
    println "this is getData "+appdata
    return 1001+appdata
}

data = 100
data2=200
num1 = 300

update(data)
update( data)
update(num1)
x = getData( 101)
println "$x"

