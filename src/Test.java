import AdapterPattern.*;
import CommandPattern.*;
import CommandPattern.Command.*;
import DecoratePattern.decorateOrder.Meal.*;
import DecoratePattern.decorateOrder.Order.ChildSet;
import DecoratePattern.decorateOrder.Order.FullSet;
import DecoratePattern.decorateOrder.Order.Order;
import FacadePattern.*;
import FactoryPattern.FactoryMethod.NYPizzaStore;
import FactoryPattern.FactoryMethod.PizzaStore;
import FactoryPattern.Pizza.PizzaType;
import FactoryPattern.SimpleFactory.ChicagoPizzaFactory;
import FactoryPattern.SimpleFactory.SimplePizzaFactory;
import FactoryPattern.SimpleFactory.SimplePizzaStore;
import ObserverPattern.*;
import SingletonPattern.SingletonExample5;
import StrategyPattern.OnlineCalculator;
import StrategyPattern.Strategy.*;
import TemplateMethodPattern.CaffeineBeverage;
import TemplateMethodPattern.CaffeineBeverageLambda;
import TemplateMethodPattern.Coffee;
import TemplateMethodPattern.Tea;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Test {
    public static void main(String args[]) throws Exception {
        singletonTest();
    }

    //策略模式範例
    private static void strategyTest(){
        //將計算機實例化
        OnlineCalculator onlineCalculator = new OnlineCalculator();
        //使用基本的四則運算
        onlineCalculator.setNumber(10);
        onlineCalculator.setStrategy(new Add());
        System.out.println(onlineCalculator.execute(20));//10+20=30
        onlineCalculator.setStrategy(new Multyply());
        System.out.println(onlineCalculator.execute(20));//30*20=600
        //使用額外擴充的演算法
        onlineCalculator.setNumber(2);
        onlineCalculator.setStrategy(new NthPower());
        System.out.println(onlineCalculator.execute(10));//2^10=1024
        onlineCalculator.setNumber(1);
        onlineCalculator.setStrategy(new CycleIncrease());
        System.out.println(onlineCalculator.execute(100));//1+2+3+...+100=5050

        //java7
        onlineCalculator.setStrategy(new Calculate() {
            @Override
            public float calculate(float a, float b) {
                return a-b;
            }
        });
        System.out.println(onlineCalculator.execute(50));

        //lambda
        onlineCalculator.setStrategy((float a, float b) -> 2*a+b);
        System.out.println(onlineCalculator.execute(100));
    }

    //觀察者模式範例
    private static void observerTest(){
        //java內建的Observable
        Observable observable = new MyObservable();
        Observer observer = ((Observable o, Object arg) -> System.out.println(arg));
        observable.addObserver(observer);
        ((MyObservable) observable).setChanged(true);
        observable.notifyObservers("test\n");

        //自己客製化Observable
        IObservable game = new GameManager();//遊戲(被觀察者)
        IObserver playerA = new GamePlayer(game, "playerA");//新增一個玩家A(觀察者)
        IObserver playerB = new GamePlayer(game, "playerB");//新增一個玩家B(觀察者)
        game.add(playerA);//將玩家A加入名單
        game.add(playerB);//將玩家B加入名單
        ((GameManager) game).setAnnouncement("經驗加倍活動即將開始\n");//更新遊戲資訊

        //lambda
        IObservableLambda observableLambda = new IObservableLambda() {};
        observableLambda.add(() -> System.out.println("資訊已更新，請至官網查閱"));
        observableLambda.add(() -> System.out.println("租用期已到，請至門市續約"));
        observableLambda.nofityAllObserver();
    }

    //裝飾者模式範例
    private static void decorateTest(){
        //將主餐,飲料裝飾到兒童餐裡
        Order childSet = new ChildSet();
        childSet = new MainMeal(childSet);
        childSet = new Beverage(childSet);
        System.out.println(childSet.getDescription() + "\ncost: " + childSet.getCost());
        //將沙拉,湯品,主餐,飲料,甜點裝飾到全餐裡
        Order fullSet = new FullSet();
        fullSet = new Salad(fullSet);
        fullSet = new Soup(fullSet);
        fullSet = new MainMeal(fullSet);
        fullSet = new Beverage(fullSet);
        fullSet = new Dessert(fullSet);
        System.out.println(fullSet.getDescription() + "\ncost: " + fullSet.getCost());
    }

    //工廠模式範例
    private static void factoryTest(){
        //簡單工廠
        SimplePizzaFactory simplePizzaFactory = new ChicagoPizzaFactory();
        SimplePizzaStore simplePizzaStore = new SimplePizzaStore(simplePizzaFactory);
        simplePizzaStore.orderPizza(PizzaType.Barbecue);
        System.out.println();
        //工廠方法
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza(PizzaType.Hawaii);
        System.out.println();
        //抽象工廠
        FactoryPattern.AbstractFactory.PizzaStore.PizzaStore abstractPizzaStore
                = new FactoryPattern.AbstractFactory.PizzaStore.ChicagoPizzaStore();
        abstractPizzaStore.orderPizza(PizzaType.Hawaii);
    }

    //獨體模式反序列化測試
    private static void singletonTest() throws Exception {
        //取得 SingletonExample5 的實例並將變數設為5(初始值為0)
        SingletonExample5 singletonObject = SingletonExample5.getInstance();
        singletonObject.setNum(5);
        //將 SingletonExample5 的實例轉為 ByteArrayOutputStream
        ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(SingletonExample5.getInstance());
        objectOutputStream.close();
        //若沒有在 readResolve() 中 return 當前實例，則修改變數不會修改到已被序列化的物件，因為已是不同的實例了
        singletonObject.setNum(10);
        //將剛才的 ByteArrayOutputStream 轉回 SingletonExample5 的實例
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        SingletonExample5 deSerialized = (SingletonExample5) objectInputStream.readObject();
        System.out.println(deSerialized.getNum());
    }

    //命令模式
    private static void commandTest(){
        //簡易遙控器一次只能記憶一種功能，寫入新功能後就無法使用上一個功能
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        TV tv = new TV();
        //將這台TV的開關功能寫入簡易遙控器
        simpleRemoteControl.setCommand(tv::on);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setCommand(tv::off);
        simpleRemoteControl.buttonWasPressed();
        System.out.println();
        //TVOnCommand 實作了Command介面，並且可以設定不同的TV
        TVOnCommand tvOn = new TVOnCommand(tv);
        simpleRemoteControl.setCommand(tvOn);
        simpleRemoteControl.buttonWasPressed();
        System.out.println();
        //將各種指令輸入到萬用遙控器
        RemoteControl remoteControl = new RemoteControl();
        Light myLight = new Light("living room's light");
        AirCon myAirCon = new AirCon("living room's airCon");
        TV myTV = new TV("living room's TV");
        Command lightOnCommand = new LightOnCommand(myLight);
        Command lightOffCommand = new LightOffCommand(myLight);
        Command airConOnCommand = new AirConOnCommand(myAirCon);
        Command airConOffCommand = new AirConOffCommand(myAirCon);
        Command tvOnCommand = new TVOnCommand(myTV);
        Command tvOffCommand = new TVOffCommand(myTV);
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, airConOnCommand, airConOffCommand);
        remoteControl.setCommand(2, tvOnCommand, tvOffCommand);
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(1);
        remoteControl.offButtonWasPushed(2);
        System.out.println();
        //加入指令巨集
        Command[] commandsOn = {lightOnCommand, airConOnCommand, tvOnCommand};
        Command[] commandsOff = {tvOffCommand, airConOffCommand, lightOffCommand};
        MacroCommand macroOn = new MacroCommand(commandsOn);
        MacroCommand macroOff = new MacroCommand(commandsOff);
        remoteControl.setCommand(3, macroOn, macroOff);
        remoteControl.onButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();
    }

    //轉接器模式
    private static void adapterTest(){
        Bicycle bicycle = new OldBicycle();
        Motorcycle motorcycle = new Honda();
        Motorcycle bike = new MotorcycleAdapter(bicycle);

        List<Motorcycle> motorcycles = Arrays.asList(motorcycle, bike);
        motorcycles.forEach(Test::testMotorcycle);
    }

    private static void testMotorcycle(Motorcycle motorcycle){
        motorcycle.accelerator();
        motorcycle.drive();
    }

    //表象模式
    private static void facadeTest(){
        //租了一片DVD要看電影，但是需要自己操作以下設備
        Amplifier amplifier = new Amplifier();//音響
        DvdPlayer dvdPlayer = new DvdPlayer();//DVD播放器
        Projector projector = new Projector();//投影機
        Screen screen = new Screen();//螢幕
        TheaterLights theaterLights = new TheaterLights();//燈光
        //將已流程化的操作步驟交由另一個控制器實行
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier,
                dvdPlayer, projector, screen, theaterLights);//家庭劇院的外觀(表象)
        //使用者透過表象模式一鍵完成了播放電影時所有設備的操作，但是需要微調時依然可以自行操作
        homeTheaterFacade.watchMovie("action movie");
        amplifier.setVolume(7);//開始播放時覺得聲音太小自行調整
        homeTheaterFacade.endMovie();
    }

    //樣板方法模式
    private static void templateMethodTest(){
        //咖啡 和 茶 套用 咖啡因飲料的樣板
        CaffeineBeverage coffee = new Coffee("黑咖啡");
        coffee.prepareRecipe("咖啡拿鐵");
        CaffeineBeverage tea = new Tea("紅茶");
        tea.prepareRecipe("檸檬紅茶");
        //lambda
        System.out.println("lambda");
        new CaffeineBeverageLambda().prepareRecipe("咖啡拿鐵", "黑咖啡",
                "加牛奶", (String condiments) -> {System.out.println(condiments);});
        new CaffeineBeverageLambda().prepareRecipe("檸檬紅茶", "紅茶",
                "加檸檬", System.out::println);
    }

    //反覆器(迭代器)模式
    private static void iteratorTest(){

    }

    //合成模式
    private static void compositeTest(){

    }

    //狀態模式
    private static void stateTest(){

    }

    //代理人模式
    private static void proxyTest(){

    }

}
