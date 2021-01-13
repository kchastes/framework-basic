package chaste.core.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author KChaste Sun
 */
@Component
public class BlockedListNotifier{

    /**
     * 用注解还可以返回别的事件 异步则不支持. 需要手动使用Application...添加事件可
     * 可以使用Order注解排序.
     * @param event 监听的事件
     */
    @EventListener
    @Async
    public void onApplicationEvent(BlockedListEvent event) {
        System.out.println(event.getSource());
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(event.getAddress());
        System.out.println(event.getContent());
    }

}
