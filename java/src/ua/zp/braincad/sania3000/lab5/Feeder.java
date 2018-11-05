package ua.zp.braincad.sania3000.lab5;

public class Feeder {                        //Кормушка
    private int feedCapacity;                //вместительность корма
    private int feed;
    public Feeder(int feedCapacity,int feed){
        this.feedCapacity=feedCapacity;
        this.feed=feed;
    }
    public void fillFeder(){
        if (getFeed()<getFeedCapacity()){
            System.out.println("Насыпаем корм");
        }
    }

    public int getFeedCapacity () {
        return feedCapacity;
    }

    public void setFeedCapacity ( int feedCapacity ) {
        this.feedCapacity = feedCapacity;
    }

    public int getFeed () {
        return feed;
    }

    public void setFeed ( int feed ) {
        this.feed = feed;
    }
}

