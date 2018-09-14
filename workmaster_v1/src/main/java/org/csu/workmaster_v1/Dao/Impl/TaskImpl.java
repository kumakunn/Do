package org.csu.workmaster_v1.Dao.Impl;

import com.mongodb.Mongo;
import org.csu.workmaster_v1.Dao.TaskDao;
import org.csu.workmaster_v1.Entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
public class TaskImpl implements TaskDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 创建对象
     *
     * @param task
     */
    @Override
    public void saveTask(Task task) {
        mongoTemplate.save(task);
    }

    /**
     * 根据任务名查询对象
     *
     * @param taskName
     * @return
     */
    @Override
    public Task findTaskByTaskName(String taskName) {
        Query query = new Query(Criteria.where("taskName").is(taskName));
        Task task = mongoTemplate.findOne(query , Task.class);
        return task;
    }

    /**
     * 更新任务对象
     *
     * @param task
     */
    @Override
    public void updateTask(Task task) {
        Query query = new Query(Criteria.where("taskId").is(task.getTaskId()));
        Update update = new Update().set("taskName", task.getTaskName()).set("taskContent", task.getTaskContent()).set("time", task.getTime());
        //更新查询返回结果集的第一条
        mongoTemplate.updateFirst(query,update,Task.class);
    }

    /**
     * 删除对象
     * @param taskId
     */
    @Override
    public void deleteTaskById(Long taskId) {
        Query query = new Query(Criteria.where("taskId").is(taskId));
        mongoTemplate.remove(query,Task.class);
    }
}
