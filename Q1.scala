object CeasarCipher extends App{

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val encryption = (c:Char, key:Int, a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)
  val decryption = (c:Char, key:Int, a:String)=> a((a.indexOf(c.toUpper)-key)%a.size)
  val cipher = (algo:(Char,Int,String)=> Char, s:String, key:Int, a:String)=>s.map(algo(_,key,a))

  val inputText = scala.io.StdIn.readLine("Secret Message: ")

  val e = cipher(encryption,inputText,5,alphabet)
  println(e)
  val d = cipher(decryption,e,5,alphabet)
  println(d)
}
