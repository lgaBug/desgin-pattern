package com.lga.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy {

    public JDKDynamicProxy() {
    }

    public Object createProxy(Object proxyObj) {
        Class[] interfaces = proxyObj.getClass().getInterfaces();
        DynamicProxyHandler handler = new DynamicProxyHandler(proxyObj);
        return Proxy.newProxyInstance(proxyObj.getClass().getClassLoader(), interfaces, handler);
    }

    private class DynamicProxyHandler implements InvocationHandler {
        private Object proxyObj;

        public DynamicProxyHandler(Object proxyObj) {
            this.proxyObj = proxyObj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("start proxy ...");
            Object result = method.invoke(proxyObj, args);
            System.out.println("end proxy....");
            return result;
        }
    }

    public static void main(String[] args) {
        JDKDynamicProxy jdkDynamicProxy = new JDKDynamicProxy();
        IUserService userService = (IUserService) jdkDynamicProxy.createProxy(new UserService());
        userService.login();
    }
}
