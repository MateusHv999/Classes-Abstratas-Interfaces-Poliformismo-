//Atividade 1

fun main(){
    val carro = Carro()
    carro.longVelocity = 10
    carro.longAcceleration = 5
    carro.model = "Impala"

    println(carro.velocidadeAtual())

    carro.aumentarVelocidade()
    carro.reduzirVelocidade()

    carro.printTotal() // A Velocidade do nosso veículo Impala é : 0, a aceleração é 5
}

abstract class Veiculo( var longVelocity : Int,
                        var longAcceleration : Int,
                        var model : String){

    abstract fun aumentarVelocidade() :Int

    abstract fun reduzirVelocidade() : Int

    abstract fun velocidadeAtual() : Int

    abstract fun printTotal()
}

class Carro: Veiculo(0, 0, ""){

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

    override fun velocidadeAtual(): Int {
        return this.longVelocity
    }

    override fun printTotal() {
        println("A Velocidade do nosso veículo ${model} é : ${longVelocity}, a aceleração é ${longAcceleration}")
    }
}

class Moto: Veiculo(0, 5, ""){

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

    override fun velocidadeAtual(): Int {
        return this.longVelocity
    }

    override fun printTotal() {
        println("A Velocidade do nosso ${model} é : ${longVelocity}, a aceleração é ${longAcceleration}")
    }
}
// Fim da atividade 1




