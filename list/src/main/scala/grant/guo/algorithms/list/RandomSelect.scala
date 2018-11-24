package grant.guo.algorithms.list

object RandomSelect extends App {
  /**
    *  Generate the combinations of K distinct objects chosen from the N elements of a list.
    * @param k
    */
  private def flatMapSublists[A,B](ls: List[A])(f: (List[A]) => List[B]): List[B] =
    ls match {
      case Nil => Nil
      case sublist@(_ :: tail) => f(sublist) ::: flatMapSublists(tail)(f)
    }

  def combinations[A](n: Int, ls: List[A]): List[List[A]] =
    if (n == 0) List(Nil)
    else
      flatMapSublists(ls) { sl =>
      combinations(n - 1, sl.tail) map {sl.head :: _}
    }
  println(combinations(3, List('a, 'b, 'c, 'd, 'e, 'f)))


  /**
    *
    * In how many ways can a group of 9 people work in 3 disjoint subgroups
    * of 2, 3 and 4 persons?  Write a function that generates all the
    * possibilities.
    * scala> group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
    * res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David, Evi), List(Flip, Gary, Hugo, Ida)), ...
    *
    * @param ls
    * @tparam A
    * @return
    */
  def group[A](ls: List[A]): List[List[List[A]]] = {
    ???
  }

}
