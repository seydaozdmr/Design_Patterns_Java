package Callback;

import java.util.Optional;

public abstract class Task {

    final void executeWith(Callback callback){
        execute();
        //eğer callback null değilse call methodunu çalıştır.
        Optional.ofNullable(callback).ifPresent(Callback::call);
    }

    public abstract void execute();
}
