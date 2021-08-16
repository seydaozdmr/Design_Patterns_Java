package Structural.Proxy.YoutubeDownloadLib;

import java.util.ArrayList;
import java.util.List;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib{
    List<Video> videos=new ArrayList<>();

    public ThirdPartyYoutubeClass() {
        videos.add(new Video(1,"Komik kedi-1"));
        videos.add(new Video(2,"Köpekler"));
        videos.add(new Video(3,"Balinalar"));
    }

    @Override
    public List<Video> listVideos() {
        return videos;
    }

    @Override
    public String getVideoInfo(int id) {
        Video v=null;
        v = videos.stream().filter(elem-> elem.getId()==id).findFirst().get();
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(v.getId());
        stringBuilder.append("-");
        stringBuilder.append(v.getName());
        return stringBuilder.toString();
    }

    @Override
    public Video downloadVideo(int id) {
        Video v=null;
        v = videos.stream().filter(elem-> elem.getId()==id).findFirst().get();
        return v;
    }
}
