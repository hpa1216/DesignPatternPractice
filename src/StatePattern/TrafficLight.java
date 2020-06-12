package StatePattern;

public class TrafficLight {
    private enum State {RED, GREEN, YELLOW}
    private State state = State.GREEN;
    private enum Power {ON, OFF}
    private Power power = Power.OFF;
    private Runnable runnable = new TrafficLightRunnable();
    private Thread thread;

    //開啟紅綠燈電源
    public void start(){
        if(power == Power.OFF){
            System.out.println("switch on");
            thread = new Thread(runnable);
            power = Power.ON;
            thread.start();
        }
    }

    //關閉紅綠燈電源
    public void stop(){
        if(power == Power.ON){
            power = Power.OFF;
            thread.interrupt();
            thread.stop();
            System.out.println("switch off");
        }
    }

    //每次使用此方法就會判斷現在是哪種燈號並執行相對應的動作
    private void change() {
        switch(state) {
            case RED:
                System.out.println("紅燈");
                sleep(3000);
                state = State.GREEN;
                break;
            case GREEN:
                System.out.println("綠燈");
                sleep(3000);
                state = State.YELLOW;
                break;
            case YELLOW:
                System.out.println("黃燈");
                sleep(1000);
                state = State.RED;
        }
    }

    private void sleep(int milliSecond) {
        try {
            Thread.sleep(milliSecond);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    //紅綠燈執行緒
    private class TrafficLightRunnable implements Runnable {
        @Override
        public void run() {
            while (power == Power.ON){
                change();
            }
        }
    }
}


/*
 * 這個範例展示了紅綠燈號狀態改變的方法，依照 綠->黃->紅 依序循環，
 * 可以用這種簡單直覺的方式來設計，是因為這個範例的狀態改變較單純無變化性，
 * 試想若是再增加幾種燈號，如可右轉或僅可左轉之類的綠燈燈號，那麼這個設計可能就不適用了。
 *
 * 這時就可以考慮讓每個狀態各自成為一個物件，負責自己該狀態的服務，並提供切換狀態的方法，
 * 也就是重構為狀態模式。
 *
 */
