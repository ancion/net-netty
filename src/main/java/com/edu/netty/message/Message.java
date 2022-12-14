package com.edu.netty.message;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public abstract class Message implements Serializable {


    public static Class<?> getMessageClass(int messageType) {
        return messageClasses.get(messageType);
    }

    private int sequenceId;

    private int messageType;

    public abstract int getMessageType();


    public static final int LOGIN_REQUEST_MESSAGE = 0;
    public static final int LOGIN_RESPONSE_MESSAGE = 1;
    public static final int CHAT_REQUEST_MESSAGE = 2;
    public static final int CHAT_RESPONSE_MESSAGE = 3;
    public static final int GROUP_CREATE_REQUEST_MESSAGE = 4;
    public static final int GROUP_CREATE_RESPONSE_MESSAGE = 5;
    public static final int GROUP_JOIN_REQUEST_MESSAGE = 6;
    public static final int GROUP_JOIN_RESPONSE_MESSAGE = 7;
    public static final int GROUP_QUIT_REQUEST_MESSAGE = 8;
    public static final int GROUP_QUIT_RESPONSE_MESSAGE = 9;
    public static final int GROUP_CHAT_REQUEST_MESSAGE = 10;
    public static final int GROUP_CHAT_RESPONSE_MESSAGE = 11;
    public static final int GROUP_MEMBER_REQUEST_MESSAGE = 12;
    public static final int GROUP_MEMBER_RESPONSE_MESSAGE = 13;
    public static final int PING_MESSAGE = 14;
    public static final int PONG_MESSAGE = 15;


    /**
     * 请求类型 byte 值
     */
    public static final int RPC_MESSAGE_TYPE_REQUEST = 101;

    /**
     * 响应类型 byte 值
     */
    public static final int RPC_MESSAGE_TYPE_RESPONSE = 102;

    private static final Map<Integer, Class<?>> messageClasses = new HashMap<>();

    static {
        messageClasses.put(LOGIN_REQUEST_MESSAGE, LoginRequestMessage.class);
        messageClasses.put(LOGIN_RESPONSE_MESSAGE, LoginResponseMessage.class);
        messageClasses.put(CHAT_REQUEST_MESSAGE, ChatRequestMessage.class);
        messageClasses.put(CHAT_RESPONSE_MESSAGE, ChatResponseMessage.class);
        messageClasses.put(GROUP_CREATE_REQUEST_MESSAGE, GroupCreateRequestMessage.class);
        messageClasses.put(GROUP_CREATE_RESPONSE_MESSAGE, GroupCreateResponseMessage.class);
        messageClasses.put(GROUP_JOIN_REQUEST_MESSAGE, GroupJoinRequestMessage.class);
        messageClasses.put(GROUP_JOIN_RESPONSE_MESSAGE, GroupJoinResponseMessage.class);
        messageClasses.put(GROUP_QUIT_REQUEST_MESSAGE, GroupQuitRequestMessage.class);
        messageClasses.put(GROUP_QUIT_RESPONSE_MESSAGE, GroupQuitResponseMessage.class);
        messageClasses.put(GROUP_CHAT_REQUEST_MESSAGE, GroupChatRequestMessage.class);
        messageClasses.put(GROUP_CHAT_RESPONSE_MESSAGE, GroupChatResponseMessage.class);
        messageClasses.put(GROUP_MEMBER_REQUEST_MESSAGE, GroupMemberRequestMessage.class);
        messageClasses.put(GROUP_MEMBER_RESPONSE_MESSAGE, GroupMemberResponseMessage.class);
        messageClasses.put(PING_MESSAGE, PingMessage.class);
        messageClasses.put(PONG_MESSAGE, PongMessage.class);
        messageClasses.put(RPC_MESSAGE_TYPE_REQUEST, RpcRequestMessage.class);
        messageClasses.put(RPC_MESSAGE_TYPE_RESPONSE, RpcResponseMessage.class);
    }
}
