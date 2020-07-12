package delegatekotlin

class Employee(onBench: OnBench, allocates: Allocates) : OnBench by onBench, Allocates by allocates