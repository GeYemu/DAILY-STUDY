public interface Television {
    void turnOn();
}

public class SamsungTV implements Television {
    public void turnOn() {
        System.out.println("Samsung TV turns on with a welcome screen.");
    }
}

public class LgTV implements Television {
    public void turnOn() {
        System.out.println("LG TV turns on with a quick start.");
    }
}

public class RemoteControl {
    public void activate(Television tv) {
        tv.turnOn();  // 多态的使用：不关心电视的具体品牌
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Television samsung = new SamsungTV();
        Television lg = new LgTV();

        remote.activate(samsung);  // 输出: Samsung TV turns on with a welcome screen.
        remote.activate(lg);       // 输出: LG TV turns on with a quick start.
    }
}
