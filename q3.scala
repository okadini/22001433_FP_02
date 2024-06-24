object q3 {
    def main(args : Array[String]) = {
        
        def normal(nh:Int):Double = 250 * nh

        def overtime(oh:Int):Double = 85 * oh

        def income(nh:Int,oh:Int):Double = normal(nh) + overtime(oh)

        def tax(nh:Int,oh:Int):Double = 0.12 * income(nh,oh)

        def take_home_salary(nh:Int,oh:Int):Double = income(nh,oh) - tax(nh,oh)

        printf("Take home salary of an employee = Rs. %.2f\n",take_home_salary(40,30)) 
    }
}