fun main(){
    val fabrica = FabricaDeVeiculos()
    val listaDeVeiculos : MutableList<Veiculo> = mutableListOf()

    for(i in 1..50){

        val veiculo = fabrica.createVehicle(i % 2)
        listaDeVeiculos.add(veiculo)
    }
    listaDeVeiculos.forEach {
        veiculo ->
        veiculo.aumentarVelocidade()
        veiculo.printTotal()
    }
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
    override var longVelocity : Int = 10
    override var longAcceleration : Int = 3
    override var model : String = "Impala"

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
    override var longVelocity : Int = 20
    override var longAcceleration : Int = 5
    override var model : String = "Kawasaki"

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

class FabricaDeVeiculos{
    fun createVehicle(model: Int) : Veiculo {
        return when (model) {
            1 -> Carro()
            else -> Moto()
        }
    }
}
