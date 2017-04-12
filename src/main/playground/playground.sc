object worksheet_playground {

  println("Hello world")

  val x = 1

  println(x)

  def hello(name: String): String = {
    s"Hello, ${name}"
  }

  hello("junjie")

  def add(x: Int, y: Double) = x + y

  add(1, 2)

  val alist = List("alice", "bob", "cathy")

  for {
    s <- alist // generator
  } println(s)

  for {
    s <- alist // filter
    if (s.length > 3)
  } println(s)

  val result_for = for {
    s <- alist
    s1 = s.toUpperCase() //variable binding
    if (s1 != "")
  } yield (s1) //generate new collection

  try {
    Integer.parseInt("dog")
  } catch {
    case _ => 0
  } finally {
    println("always be printed")
  }

  val code = 1
  val result_match = code match {
    case 1 => "one"
    case 2 => "two"
    case _ => "others"
  }

  def bar(x: Int, y: => Int): Int = 1

  def loop(): Int = loop

  bar(1, loop)

  //  bar(loop, 1)

  (x: Int, y: Int) => x + y

}