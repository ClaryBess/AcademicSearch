package com.example.demo.service;


import com.example.demo.bean.Message;
import com.example.demo.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageSevice {

    @Autowired
    MessageMapper messageMapper;

//    展示学者私信列表，查看发送的消息
    public List<Message> getMessageByFrom(Integer from){
        return messageMapper.getMessageByFrom(from);
    }

//    展示我的私信列表，查看接受的消息
    public List<Message> getMessageByTo(Integer to){
        return messageMapper.getMessageByTo(to);
    }

//    展示私信内容
    public Message getMessageById(Integer id){
        return messageMapper.getMessageById(id);
    }


//    发送私信
//    public int sendMessage(Message message){
//
//    }

//    删除消息
    public int deleteMessageById(Integer id){
        return messageMapper.deleteMessageById(id);
    }
}

