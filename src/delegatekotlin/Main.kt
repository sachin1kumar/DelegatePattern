package delegatekotlin


fun main() {
    val employee = Employee(OnBenchImplK(),AllocatesImplK())
    employee.benchEmployee()
    employee.allocatedEmployee()
}