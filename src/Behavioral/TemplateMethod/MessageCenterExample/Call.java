package Behavioral.TemplateMethod.MessageCenterExample;

import java.time.LocalDateTime;

public class Call {
    private int id;
    private LocalDateTime localDateTime;
    private VoiceRecord voiceRecord;

    public Call(int id, LocalDateTime localDateTime) {
        this.id = id;
        this.localDateTime = localDateTime;
    }

    public void setVoiceRecord(VoiceRecord voiceRecord) {
        this.voiceRecord = voiceRecord;
    }

    public VoiceRecord getVoiceRecord() {
        return voiceRecord;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
