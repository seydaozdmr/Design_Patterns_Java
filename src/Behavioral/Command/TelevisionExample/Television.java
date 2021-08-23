package Behavioral.Command.TelevisionExample;

public class Television {
    private boolean on;
    private int channel;
    private int volume;

    public Television() {
        this.on=false;
    }

    public void turn(){
        if(this.on==false){
            this.on=true;
        }else{
            this.on=false;
        }
    }

    public void changeChanelUp(){
        this.channel+=1;
    }

    public void changeChanelDown(){
        this.channel-=1;
    }

    public void changeVolumeUp(){
        this.volume+=3;
    }

    public void changeVolumeDown(){
        this.volume-=3;
    }

    public void printStatus(){
        System.out.println("Television is : "+(on?"on":"off")+ " channel is :"+channel+ " volume is  :"+volume);
    }
}
