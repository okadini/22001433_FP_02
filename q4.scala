object q4 {
    def main(args : Array[String]) = {

        val fixedCost = 500

        def attendee_count(ticketPrice:Int):Int = 120 + (15-ticketPrice) / 5 * 20

        def income(ticketPrice:Int):Double = ticketPrice * attendee_count(ticketPrice)

        def cost(ticketPrice:Int):Double = fixedCost + 3 * attendee_count(ticketPrice)

        def profit(ticketPrice:Int):Double = income(ticketPrice) - cost(ticketPrice)

        //printf("Ticket Price = Rs. 5    Profit = Rs. %.2f\n",profit(5))
        printf("Ticket Price = Rs. 10   Profit = Rs. %.2f\n",profit(10))
        printf("Ticket Price = Rs. 15   Profit = Rs. %.2f\n",profit(15))
        printf("Ticket Price = Rs. 20   Profit = Rs. %.2f\n",profit(20))
        printf("Ticket Price = Rs. 25   Profit = Rs. %.2f\n",profit(25))
        printf("Ticket Price = Rs. 30   Profit = Rs. %.2f\n",profit(30))
        printf("Ticket Price = Rs. 35   Profit = Rs. %.2f\n",profit(35))
        printf("Ticket Price = Rs. 40   Profit = Rs. %.2f\n",profit(40))
    }
}