import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by jacobye on 12/04/2017.
  */
object WordCount {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("wordcount")
    val sc = new SparkContext(conf)

    val input = sc.textFile("/Users/jacobye/Code/scala-tutorial/resource/xiamiSong.txt")

    val lines = input.flatMap(line => line.split(" "))

    val count = lines.map(word => (word, 1)).reduceByKey{case (x, y) => x + y}

    val output = count.saveAsTextFile("/Users/jacobye/Code/scala-tutorial/resource/xiamiCount")
  }
}
