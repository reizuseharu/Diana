package com.reizu.diana.dagger
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

interface Heater {
    fun on()
    fun off()
}

interface Pump {
    fun pump()
}

@Module
class PumpModule {
    @Provides
    fun providePump(): Pump = object : Pump {
        override fun pump() = println("=> => pumping => =>")
    }
}

@Module(includes = [PumpModule::class])
class DripCoffeeModule() {
    @Provides fun provideHeater(): Heater = object : Heater {
        override fun on() = println("~ ~ ~ heating ~ ~ ~")
        override fun off() {}
    }
}

class CoffeeMaker
@Inject constructor(val heater: dagger.Lazy<Heater>,
                    val pump: Pump) {
    init {
        heater.get().on()
        pump.pump()
        println(" [_]P coffee! [_]P")
        heater.get().off()
    }
}

@Singleton
@Component(modules = [DripCoffeeModule::class])
interface CoffeeShop {
    fun maker(): CoffeeMaker
}

fun main() {
    val coffeeShop = DaggerCoffeeShop.create()
    coffeeShop.maker()
}
