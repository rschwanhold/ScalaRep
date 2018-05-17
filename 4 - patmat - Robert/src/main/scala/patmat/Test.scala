package patmat

/**
  * Created by Robert on 14.06.2017.
  */
object Test extends App{
  println(Huffman.times("sdsdsdjkfkjckj".toList))
  println(Huffman.weight(Huffman.createCodeTree("abababcccccc".toList)))
  println(Huffman.encode(Huffman.frenchCode)(Huffman.decode(Huffman.frenchCode, Huffman.secret))  )
}
