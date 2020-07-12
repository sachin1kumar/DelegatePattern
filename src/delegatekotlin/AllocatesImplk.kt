package delegatekotlin

class AllocatesImplK : Allocates {
    override fun allocatedEmployee() {
        println("Allocated Employee")
    }
}