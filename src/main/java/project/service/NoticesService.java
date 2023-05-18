package project.service;

import project.entity.Notices;
import project.mapper.NoticesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  消息通知服务类
 * </p>
 *
 */
@Service
@Transactional
public class NoticesService {
    @Resource
    private NoticesMapper noticesMapper;

    /**发出通知消息*/
    public Integer insertNotices(Notices notices){
        return noticesMapper.insertNotices(notices);
    }
    /**用户已读通知消息*/
    public Integer updateNoticesById(String id){
        return noticesMapper.updateNoticesById(id);
    }
    /**查询前10条通知*/
    public List<Notices> queryNotices(String userid){
        return noticesMapper.queryNotices(userid);
    }
    /**取消新通知标志*/
    public Integer CancelLatest(String userid){
        return noticesMapper.CancelLatest(userid);
    }
    /**分页查询用户所有通知消息*/
    public List<Notices> queryAllNotices(Integer page, Integer count, String userid){
        return noticesMapper.queryAllNotices(page,count,userid);
    }
    /**查询用户所有通知消息的数量*/
    public Integer queryNoticesCount(String userid){
        return noticesMapper.queryNoticesCount(userid);
    }
}
