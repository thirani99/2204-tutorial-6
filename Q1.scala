
object CeasarCipher extends App{

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size
	val inputText = scala.io.StdIn.readLine("Secret Message: ")


	val e = encryption(inputText, shift)
    println("Encrypted message = " + e)

    val  d = decryption(inputText, shift)
    println("Decrypted message = " + d)



def  encryption(text : String, shift : Int): String ={
	val outputText = inputText.map( (c: Char) => {
		val x = alphabet.indexOf(c.toUpper)

		if (x == -1){
			c
		}
		else{
			alphabet((x + shift) % alphabet.size)
			}
	});
    return outputText
}

def   decryption(text : String, shift : Int): String ={
	val outputText = inputText.map( (c: Char) => {
		val x = alphabet.indexOf(c.toUpper)

		if (x == -1){
			c
		}
		else{
			alphabet((x - shift) % alphabet.size)
			}
	});
  return outputText
}



}
