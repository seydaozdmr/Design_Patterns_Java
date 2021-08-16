package Structural.Proxy.YoutubeDownloadLib;

import java.util.List;

public class ProxyYoutubeClass implements ThirdPartyYoutubeLib{
    ThirdPartyYoutubeClass thirdPartyYoutubeClass;

    public ProxyYoutubeClass(ThirdPartyYoutubeClass thirdPartyYoutubeClass) {
        this.thirdPartyYoutubeClass = thirdPartyYoutubeClass;
    }

    @Override
    public List<Video> listVideos() {
        return thirdPartyYoutubeClass.listVideos();
    }

    @Override
    public String getVideoInfo(int id) {
        //burada loglama yapılabilir.
        return thirdPartyYoutubeClass.getVideoInfo(id);
    }

    @Override
    public Video downloadVideo(int id) {
        return thirdPartyYoutubeClass.downloadVideo(id);
    }
}
