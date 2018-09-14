package org.csu.workmaster_v1;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongodbFileTest {
    public static MongoClient mongoClient = new MongoClient("127.0.0.1",27017);//单例
    public static DB db = mongoClient.getDB("FileDonow");
    //单例即可，创建多个实例并无影响，内部间接使用了mongoClient作为通讯支撑
    public static GridFS gridFS = new GridFS(db);//可以指定bucket名字，默认值为“fs”
    @Test
    public void uploadnew() throws Exception{

        FileInputStream inputStream = new FileInputStream(new File("E:/nodevars.bat"));
        GridFSInputFile inputFile = gridFS.createFile(inputStream);
        //inputFile.setFilename("web-all.log");
        //inputFile.setContentType("text/plain");
        inputFile.save();
        ObjectId fileId = (ObjectId)inputFile.getId();//此ID，在客户端生成
        System.out.println(fileId.toHexString());//此字符串ID，可供application使用
    }
    @Test
    public void download() throws Exception{
        GridFSDBFile file = gridFS.find(new ObjectId("5b99ef7a76bbbb32cc7e3d6a"));
        //file.writeTo(new File("E:/nodevars.bat"));
        //此外还可以使用inputstream方式
        BufferedInputStream inputStream = new BufferedInputStream(file.getInputStream(),1024);
        OutputStream outputStream = new FileOutputStream(new File("test.jar"));
        byte[] bytes = new byte[1024];
        while (true) {
            int count = inputStream.read(bytes);
            if(count < 1024) {
                break;
            }
            outputStream.write(bytes,0,count);
        }
        inputStream.close();
        outputStream.close();
    }
    @Test
    public void upload() throws Exception {
        // 获取文件流
        File file = new File("E:/redisclient-win32.x86_64.2.0.jar");
        InputStream in = new FileInputStream(file);
        // 创建一个容器，传入一个`MongoDatabase`类实例db
        GridFSBucket bucket = GridFSBuckets.create(mongoDatabase());
        // 上传
        ObjectId fileId = bucket.uploadFromStream(UUID.randomUUID().toString(), in);
        System.out.println("上传完成。 文件ID："+fileId);
    }
    public MongoDatabase mongoDatabase() throws Exception{
        MongoClient mongoClient = new MongoClient("127.0.0.1", 27017);
        return mongoClient.getDatabase("FileDonow");
    }


}
