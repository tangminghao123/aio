package com.kidoneself.aio.log.event;

import com.kidoneself.aio.log.model.OptLogDTO;
import org.springframework.context.ApplicationEvent;

/**
 * 日志事件
 * @author pangu 7333791@qq.com
 * @since 2020-7-15
 */
public class LogEvent extends ApplicationEvent {

    public LogEvent(OptLogDTO optLogDTOForm) {
        super(optLogDTOForm);
    }

}

