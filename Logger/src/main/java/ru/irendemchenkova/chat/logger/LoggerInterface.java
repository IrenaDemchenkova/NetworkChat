package ru.irendemchenkova.chat.logger;

import org.jetbrains.annotations.NotNull;
import ru.irendemchenkova.chat.logger.implementations.ClientLogger;
import ru.irendemchenkova.chat.logger.implementations.ServerLogger;

public interface LoggerInterface {
    @NotNull
    static LoggerBase getLogger(@NotNull LoggerType type) {
        return switch (type) {
            case CLIENT -> ClientLogger.createInstance();
            case SERVER -> ServerLogger.createInstance();
        };
    }
}
