package org.assignment.tlt;

import java.lang.reflect.*;

interface EmployeeService {
    void performDuties();
}

class RealEmployee implements EmployeeService {
    public void performDuties() {
        System.out.println("Performing employee duties.");
    }
}

class LoggingInvocationHandler implements InvocationHandler {
    private final Object target;

    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Method called: " + method.getName());
        return method.invoke(target, args);
    }
}

public class Q_125_DynamicProxy {
    public static void main(String[] args) {
        EmployeeService realEmployee = new RealEmployee();
        EmployeeService proxyInstance = (EmployeeService) Proxy.newProxyInstance(
                EmployeeService.class.getClassLoader(),
                new Class[]{EmployeeService.class},
                new LoggingInvocationHandler(realEmployee)
        );

        proxyInstance.performDuties();
    }
}
