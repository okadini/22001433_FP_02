object q1 {
    def main(args : Array[String]) = {

        var k = 2
        var i = 2
        var j = 2
        var m = 5
        var n = 5
        var f = 12.0f
        var g = 4.0f
        var c = 'X'

        printf("k + 12 * m = %d\n",k + 12 * m)
        printf("m / j = %d\n",m / j)
        printf("n %% j = %d\n",n % j)
        printf("m / j * j = %d\n",m / j * j)
        printf("f + 10 * 5 + g = %.2f\n",f + 10 * 5 + g)
        printf("++i * n = %d\n",{i += 1 ; i * n})
    }
}


