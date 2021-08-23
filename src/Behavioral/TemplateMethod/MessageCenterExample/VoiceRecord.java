package Behavioral.TemplateMethod.MessageCenterExample;

import java.time.LocalDateTime;

public class VoiceRecord {
    private int id;
    private LocalDateTime localDateTime;
    private Byte [] callData;

    public VoiceRecord(int id, LocalDateTime localDateTime) {
        this.id = id;
        this.localDateTime = localDateTime;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
