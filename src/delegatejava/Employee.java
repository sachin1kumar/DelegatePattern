package delegatejava;

public class Employee implements OnBench, Allocates {

    OnBenchImpl onBench;
    AllocatesImpl allocatesImpl;

    Employee(OnBenchImpl onBench, AllocatesImpl allocatesImpl){
        this.onBench = onBench;
        this.allocatesImpl = allocatesImpl;
    }

    @Override
    public void benchEmployee() {
        onBench.benchEmployee();
    }

    @Override
    public void allocatedEmployee() {
        allocatesImpl.allocatedEmployee();
    }
}
