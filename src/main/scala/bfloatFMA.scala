package hardfloat
import chisel3._

object bfloatFMA extends App {
    chisel3.Driver.execute(args, () => new MulAddRecFN(8, 8))
}
