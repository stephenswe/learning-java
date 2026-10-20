
class Computer{


    public void playMusic()
    {
        System.out.println("Playing music...");
    }

    public String getMyPen(int cost){
        if(cost >= 10)
            return "pen";
        else
            return "Nothing";
    }

}


class Demo{

    public static void main(String a[])
    
    {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMyPen(1);
        System.out.println(str);


    }
}