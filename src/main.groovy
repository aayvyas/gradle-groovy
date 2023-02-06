println "Hello, World!"


List evens = []
// Taking x
def evenTillX = { x -> 
    
    List evensCalc = (0..x).collect { i ->
        if(i % 2==0){
            // pushing i to evens List
            evens << i
        }
    }
    return evens
}

evenTillX(10)

println evens






