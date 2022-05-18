package basics
fun main(args: Array<String>){
    val horas = IntArray(60)
    val minutos = IntArray(60)
    val segundos = IntArray(60)
    val clear:String = "\b\b\b\b\b\b\b\b"

    for (hora in 0 .. horas.size-1){
        for(minuto in 0 .. minutos.size-1){
            for(segundo in 0 .. segundos.size-1){

                //support with java libraries
                System.out.printf("%02d:%02d:%02d",hora, minuto, segundo)
                Thread.sleep(1000)
                print(clear)
            }
        }
    }
}