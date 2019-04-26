package hardfloat
import chisel3._

object fp16FMA extends App {
    chisel3.Driver.execute(args, () => new MulAddRecFN(5, 11))
}
