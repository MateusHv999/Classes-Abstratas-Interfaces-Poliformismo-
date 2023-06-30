fun main(){
    val carro = Carro()
    val moto = Moto()

    carro.model ="Impala"
    moto.model = "Kawasaki"

    carro.longVelocity = 10
    carro.longAcceleration = 3

    moto.longVelocity = 20

    carro.aumentarVelocidade()
    moto.aumentarVelocidade()

    moto.printTotal() // A Velocidade do nosso veículo Kawasaki é : 25, a aceleração é 5
    carro.printTotal() // A Velocidade do nosso veículo Impala é : 13, a aceleração é 3

}

interface Veiculo{
    var longVelocity : Int
    var longAcceleration : Int
    var model : String

     fun aumentarVelocidade() :Int

     fun reduzirVelocidade() : Int

     fun velocidadeAtual() : Int{
         return this.longVelocity
     }

     fun printTotal(){
         println("A Velocidade do nosso veículo ${model} é : ${longVelocity}, a aceleração é ${longAcceleration}")
     }
}


class Carro : Veiculo{
    override var longVelocity : Int = 0
    override var longAcceleration : Int = 0
    override var model : String = ""

    override fun aumentarVelocidade(): Int {
        longVelocity = longAcceleration + longVelocity
        return longVelocity
    }

    override fun reduzirVelocidade(): Int {
        longVelocity = longAcceleration - longVelocity
        if(longVelocity < 0){
            longVelocity = 0
        }
        return longVelocity
    }
}

class Moto : Veiculo{
    override var longVelocity : Int = 0
    override var longAcceleration : Int = 5
    override var model : String = ""

    override fun aumentarVelocidade(): Int {
        longVelocity = longAcceleration + longVelocity
        return longVelocity
    }

    override fun reduzirVelocidade(): Int {
        longVelocity = longAcceleration - longVelocity
        if(longVelocity < 0){
            longVelocity = 0
        }
        return longVelocity
    }
}
