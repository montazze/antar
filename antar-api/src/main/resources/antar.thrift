namespace java com.github.khannedy.antar.api

enum AntarMessageType {

    HTTP_NOTIFICATION,
    EMAIL

}

struct AntarHttpNotificationMessage {

}

struct AntarEmailMessage {

}

struct AntarRequestMessage {

    1: required string messageId;
    2: required string ownerId;
    3: required AntarMessageType type;

}

struct AntarResponseMessage {

    1: required string code;
    2: required string message;

}

service AntarService {

    bool ping();
    AntarResponseMessage send(1: AntarRequestMessage request);

}