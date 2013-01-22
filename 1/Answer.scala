
/**
 * 1 - Multiples of 3 and 5
 * http://projecteuler.net/problem=1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we 
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author Michael E. Cotterell <mepcotterell@gmail.com>
 */
object Answer extends App {

  import scala.language.postfixOps

  val sum = (1 until 100) filter ( n => n % 3 == 0 || n % 5 == 0 ) sum

  println("the sum is %d".format(sum))

} // Answer

