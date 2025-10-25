package observerptrn;

public class ObservserDemo {
    public static void main( String[] args ) {
        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register(new Gates());
        sensorSystem.register(new Lighting());
        // adapt Surveillance to AlarmListener using a dynamic proxy
        AlarmListener surveillanceAdapter = (AlarmListener) java.lang.reflect.Proxy.newProxyInstance(
            AlarmListener.class.getClassLoader(),
            new Class<?>[]{AlarmListener.class},
            (proxy, method, methodArgs) -> {
                try {
                    java.lang.reflect.Method m = Surveillance.class.getMethod(method.getName(), method.getParameterTypes());
                    return m.invoke(new Surveillance(), methodArgs);
                } catch (NoSuchMethodException e) {
                    // Surveillance doesn't implement this method; ignore and return null
                    return null;
                }
            });
        sensorSystem.register(surveillanceAdapter);
        sensorSystem.soundTheAlarm();
    }
}
/*public class ObservserDemo {
    public static void main( String[] args ) {
        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register(new Gates());
        sensorSystem.register(new Lighting());
        sensorSystem.register(new Surveillance());
        sensorSystem.soundTheAlarm();
    }
} */