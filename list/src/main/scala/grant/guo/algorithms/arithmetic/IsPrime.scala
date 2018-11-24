package grant.guo.algorithms.arithmetic


object IsPrime extends App {

  // A fairly naive implementation for primality testing is simply: a number is
  // prime if it it not divisible by any prime number less than or equal to its
  // square root

  implicit class IntWrapper(v:Int){

    lazy val primes = Stream.cons(2, Stream.from(3, 2) filter { _.isPrime })
    def isPrime():Boolean = {
      (v > 1) && (primes takeWhile { _ <= Math.sqrt(v) } forall { v % _ != 0 })
    }
  }

  println(7.isPrime())
  println(23.isPrime())
  println(22.isPrime())
  println(177.isPrime())

}
