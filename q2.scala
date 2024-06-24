object q2 {
    def main(args : Array[String]) = {

        var a:Int = 2; var b:Int = 3; var c:Int = 4; var d:Int = 5
        var k:Float = 4.3f; var g:Float = 4.0f

        printf("--b * a + c * d-- = %d\n",{b -= 1; b * a + c * d})
        d -= 1

        printf("a++ = %d\n",a)
        a += 1

        printf("-2 * (g - k) + c = %.2f\n",-2 * (g - k) + c)

        printf("c = c++ = %d\n",c)
        c += 1

        printf("++c * a++ = %d\n",{c += 1; c * a})
        a += 1
    }
}