package Behavioral.TemplateMethod.MessageCenterExample;

import java.util.ArrayList;
import java.util.List;

public abstract class CallCenter {
    private List<Call> callList;
    private List<VoiceRecord> voiceRecordList;


    public CallCenter() {
        this.callList=new ArrayList<>();
        this.voiceRecordList=new ArrayList<>();
    }

    public abstract Call getCall();
    public abstract VoiceRecord getVoiceRecord();

    public void saveCall(Call call){
        this.callList.add(call);
        System.out.println("call saved");
    }

    public boolean verifyCallDataAndVoiceRecord(Call call,VoiceRecord voiceRecord) {
        if(call.getLocalDateTime()==voiceRecord.getLocalDateTime())
            return true;
        return false;
    }

    public void saveVoiceRecord(VoiceRecord voiceRecord){
        this.voiceRecordList.add(voiceRecord);
        System.out.println("voice record saved");

    }
    //template method;
    public void saveCall(){
        Call call=getCall();
        VoiceRecord voiceRecord=getVoiceRecord();

        if(verifyCallDataAndVoiceRecord(call,voiceRecord)){
            call.setVoiceRecord(voiceRecord);
            saveCall(call);
            saveVoiceRecord(voiceRecord);
        }

    }




}
