package ren.solid.ganhuoio;

import android.test.AndroidTestCase;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import okhttp3.ResponseBody;
import ren.solid.ganhuoio.api.PictureService;
import ren.solid.ganhuoio.model.bean.RandomPictureBean;
import ren.solid.library.SolidApplication;
import ren.solid.library.rx.retrofit.ObservableProvider;
import ren.solid.library.rx.retrofit.factory.ServiceFactory;
import ren.solid.library.rx.retrofit.service.BaseService;
import ren.solid.library.rx.retrofit.subscriber.DownLoadSubscribe;
import ren.solid.library.utils.FileUtils;
import rx.Subscriber;

/**
 * Created by _SOLID
 * Date:2016/7/27
 * Time:16:02
 */
public class AndroidTest extends AndroidTestCase {

    String TAG = "AndroidTest";

    public void testDownLoad() {
        String url = "https://codeload.github.com/burgessjp/GanHuoIO/zip/master";
        BaseService downLoadService = ServiceFactory.getInstance().createService(BaseService.class);
        downLoadService.download(url).subscribe(new DownLoadSubscribe("gankio.zip") {
            @Override
            public void onCompleted(File file) {
                Log.e(TAG, "下载完成：" + file.getAbsolutePath());
            }

            @Override
            public void onProgress(double progress, long downloadSize, long totalSize) {
                Log.e(TAG, "progress:" + progress + " downloadSize:" + downloadSize + " totalSize:" + totalSize);
            }
        });
    }


    public void testRetrofit() {
        PictureService pictureService = ServiceFactory.getInstance().createService(PictureService.class);
        pictureService.getRandomPicture("rand").subscribe(new Subscriber<RandomPictureBean>() {
            @Override
            public void onStart() {
                Log.e("AndroidTest", "onStart");
            }

            @Override
            public void onCompleted() {
                Log.e("AndroidTest", "onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                Log.e("AndroidTest", "onError:" + e);
            }

            @Override
            public void onNext(RandomPictureBean result) {
                Log.e("AndroidTest", "onNext:" + result.getP_mid());
            }
        });
    }


    public static String beanDATA = "{\n" +
            "      \"_id\": \"5791953f421aa90d36e96056\", \n" +
            "      \"createdAt\": \"2016-07-22T11:38:39.568Z\", \n" +
            "      \"desc\": \"PathMeasure\\u4e4b\\u8ff7\\u5f84\\u8ffd\\u8e2a\", \n" +
            "      \"publishedAt\": \"2016-07-25T11:43:57.769Z\", \n" +
            "      \"source\": \"web\", \n" +
            "      \"type\": \"Android\", \n" +
            "      \"url\": \"http://blog.csdn.net/eclipsexys/article/details/51992473\", \n" +
            "      \"used\": true, \n" +
            "      \"who\": \"xuyisheng\"\n" +
            "    }";
    public String data = "{\n" +
            "  \"error\": false, \n" +
            "  \"results\": [\n" +
            "    \"2016-07-27\", \n" +
            "    \"2016-07-26\", \n" +
            "    \"2016-07-25\", \n" +
            "    \"2016-07-22\", \n" +
            "    \"2016-07-20\", \n" +
            "    \"2016-07-19\", \n" +
            "    \"2016-07-18\", \n" +
            "    \"2016-07-15\", \n" +
            "    \"2016-07-14\", \n" +
            "    \"2016-07-13\", \n" +
            "    \"2016-07-12\", \n" +
            "    \"2016-07-11\", \n" +
            "    \"2016-07-08\", \n" +
            "    \"2016-07-07\", \n" +
            "    \"2016-07-06\", \n" +
            "    \"2016-07-05\", \n" +
            "    \"2016-07-04\", \n" +
            "    \"2016-07-01\", \n" +
            "    \"2016-06-30\", \n" +
            "    \"2016-06-29\", \n" +
            "    \"2016-06-28\", \n" +
            "    \"2016-06-27\", \n" +
            "    \"2016-06-24\", \n" +
            "    \"2016-06-23\", \n" +
            "    \"2016-06-22\", \n" +
            "    \"2016-06-21\", \n" +
            "    \"2016-06-20\", \n" +
            "    \"2016-06-17\", \n" +
            "    \"2016-06-16\", \n" +
            "    \"2016-06-15\", \n" +
            "    \"2016-06-14\", \n" +
            "    \"2016-06-13\", \n" +
            "    \"2016-06-12\", \n" +
            "    \"2016-06-08\", \n" +
            "    \"2016-06-07\", \n" +
            "    \"2016-06-06\", \n" +
            "    \"2016-06-03\", \n" +
            "    \"2016-06-02\", \n" +
            "    \"2016-06-01\", \n" +
            "    \"2016-05-31\", \n" +
            "    \"2016-05-30\", \n" +
            "    \"2016-05-27\", \n" +
            "    \"2016-05-26\", \n" +
            "    \"2016-05-25\", \n" +
            "    \"2016-05-24\", \n" +
            "    \"2016-05-23\", \n" +
            "    \"2016-05-20\", \n" +
            "    \"2016-05-19\", \n" +
            "    \"2016-05-18\", \n" +
            "    \"2016-05-17\", \n" +
            "    \"2016-05-16\", \n" +
            "    \"2016-05-13\", \n" +
            "    \"2016-05-12\", \n" +
            "    \"2016-05-11\", \n" +
            "    \"2016-05-10\", \n" +
            "    \"2016-05-09\", \n" +
            "    \"2016-05-06\", \n" +
            "    \"2016-05-05\", \n" +
            "    \"2016-05-04\", \n" +
            "    \"2016-05-03\", \n" +
            "    \"2016-04-29\", \n" +
            "    \"2016-04-28\", \n" +
            "    \"2016-04-27\", \n" +
            "    \"2016-04-26\", \n" +
            "    \"2016-04-25\", \n" +
            "    \"2016-04-22\", \n" +
            "    \"2016-04-21\", \n" +
            "    \"2016-04-20\", \n" +
            "    \"2016-04-19\", \n" +
            "    \"2016-04-18\", \n" +
            "    \"2016-04-15\", \n" +
            "    \"2016-04-14\", \n" +
            "    \"2016-04-13\", \n" +
            "    \"2016-04-12\", \n" +
            "    \"2016-04-11\", \n" +
            "    \"2016-04-08\", \n" +
            "    \"2016-04-07\", \n" +
            "    \"2016-04-06\", \n" +
            "    \"2016-04-05\", \n" +
            "    \"2016-04-01\", \n" +
            "    \"2016-03-31\", \n" +
            "    \"2016-03-30\", \n" +
            "    \"2016-03-29\", \n" +
            "    \"2016-03-28\", \n" +
            "    \"2016-03-25\", \n" +
            "    \"2016-03-24\", \n" +
            "    \"2016-03-23\", \n" +
            "    \"2016-03-22\", \n" +
            "    \"2016-03-21\", \n" +
            "    \"2016-03-18\", \n" +
            "    \"2016-03-17\", \n" +
            "    \"2016-03-16\", \n" +
            "    \"2016-03-15\", \n" +
            "    \"2016-03-14\", \n" +
            "    \"2016-03-11\", \n" +
            "    \"2016-03-10\", \n" +
            "    \"2016-03-09\", \n" +
            "    \"2016-03-08\", \n" +
            "    \"2016-03-07\", \n" +
            "    \"2016-03-04\", \n" +
            "    \"2016-03-03\", \n" +
            "    \"2016-03-02\", \n" +
            "    \"2016-03-01\", \n" +
            "    \"2016-02-29\", \n" +
            "    \"2016-02-26\", \n" +
            "    \"2016-02-25\", \n" +
            "    \"2016-02-24\", \n" +
            "    \"2016-02-23\", \n" +
            "    \"2016-02-22\", \n" +
            "    \"2016-02-19\", \n" +
            "    \"2016-02-18\", \n" +
            "    \"2016-02-17\", \n" +
            "    \"2016-02-16\", \n" +
            "    \"2016-02-15\", \n" +
            "    \"2016-02-04\", \n" +
            "    \"2016-02-03\", \n" +
            "    \"2016-02-02\", \n" +
            "    \"2016-02-01\", \n" +
            "    \"2016-01-29\", \n" +
            "    \"2016-01-28\", \n" +
            "    \"2016-01-27\", \n" +
            "    \"2016-01-26\", \n" +
            "    \"2016-01-25\", \n" +
            "    \"2016-01-22\", \n" +
            "    \"2016-01-21\", \n" +
            "    \"2016-01-20\", \n" +
            "    \"2016-01-19\", \n" +
            "    \"2016-01-18\", \n" +
            "    \"2016-01-15\", \n" +
            "    \"2016-01-14\", \n" +
            "    \"2016-01-13\", \n" +
            "    \"2016-01-12\", \n" +
            "    \"2016-01-11\", \n" +
            "    \"2016-01-08\", \n" +
            "    \"2016-01-07\", \n" +
            "    \"2016-01-06\", \n" +
            "    \"2016-01-05\", \n" +
            "    \"2016-01-04\", \n" +
            "    \"2015-12-31\", \n" +
            "    \"2015-12-30\", \n" +
            "    \"2015-12-29\", \n" +
            "    \"2015-12-28\", \n" +
            "    \"2015-12-25\", \n" +
            "    \"2015-12-24\", \n" +
            "    \"2015-12-23\", \n" +
            "    \"2015-12-22\", \n" +
            "    \"2015-12-21\", \n" +
            "    \"2015-12-18\", \n" +
            "    \"2015-12-17\", \n" +
            "    \"2015-12-16\", \n" +
            "    \"2015-12-15\", \n" +
            "    \"2015-12-14\", \n" +
            "    \"2015-12-11\", \n" +
            "    \"2015-12-10\", \n" +
            "    \"2015-12-09\", \n" +
            "    \"2015-12-08\", \n" +
            "    \"2015-12-07\", \n" +
            "    \"2015-12-04\", \n" +
            "    \"2015-12-03\", \n" +
            "    \"2015-12-02\", \n" +
            "    \"2015-12-01\", \n" +
            "    \"2015-11-30\", \n" +
            "    \"2015-11-27\", \n" +
            "    \"2015-11-26\", \n" +
            "    \"2015-11-25\", \n" +
            "    \"2015-11-24\", \n" +
            "    \"2015-11-23\", \n" +
            "    \"2015-11-20\", \n" +
            "    \"2015-11-19\", \n" +
            "    \"2015-11-18\", \n" +
            "    \"2015-11-17\", \n" +
            "    \"2015-11-16\", \n" +
            "    \"2015-11-13\", \n" +
            "    \"2015-11-12\", \n" +
            "    \"2015-11-11\", \n" +
            "    \"2015-11-10\", \n" +
            "    \"2015-11-09\", \n" +
            "    \"2015-11-06\", \n" +
            "    \"2015-11-05\", \n" +
            "    \"2015-11-04\", \n" +
            "    \"2015-11-03\", \n" +
            "    \"2015-11-02\", \n" +
            "    \"2015-10-30\", \n" +
            "    \"2015-10-29\", \n" +
            "    \"2015-10-28\", \n" +
            "    \"2015-10-27\", \n" +
            "    \"2015-10-26\", \n" +
            "    \"2015-10-23\", \n" +
            "    \"2015-10-22\", \n" +
            "    \"2015-10-21\", \n" +
            "    \"2015-10-20\", \n" +
            "    \"2015-10-19\", \n" +
            "    \"2015-10-16\", \n" +
            "    \"2015-10-15\", \n" +
            "    \"2015-10-14\", \n" +
            "    \"2015-10-13\", \n" +
            "    \"2015-10-12\", \n" +
            "    \"2015-10-10\", \n" +
            "    \"2015-10-09\", \n" +
            "    \"2015-10-08\", \n" +
            "    \"2015-09-30\", \n" +
            "    \"2015-09-29\", \n" +
            "    \"2015-09-28\", \n" +
            "    \"2015-09-25\", \n" +
            "    \"2015-09-24\", \n" +
            "    \"2015-09-23\", \n" +
            "    \"2015-09-22\", \n" +
            "    \"2015-09-21\", \n" +
            "    \"2015-09-18\", \n" +
            "    \"2015-09-17\", \n" +
            "    \"2015-09-16\", \n" +
            "    \"2015-09-15\", \n" +
            "    \"2015-09-14\", \n" +
            "    \"2015-09-11\", \n" +
            "    \"2015-09-10\", \n" +
            "    \"2015-09-09\", \n" +
            "    \"2015-09-08\", \n" +
            "    \"2015-09-07\", \n" +
            "    \"2015-09-06\", \n" +
            "    \"2015-09-01\", \n" +
            "    \"2015-08-31\", \n" +
            "    \"2015-08-28\", \n" +
            "    \"2015-08-27\", \n" +
            "    \"2015-08-26\", \n" +
            "    \"2015-08-25\", \n" +
            "    \"2015-08-24\", \n" +
            "    \"2015-08-21\", \n" +
            "    \"2015-08-20\", \n" +
            "    \"2015-08-19\", \n" +
            "    \"2015-08-18\", \n" +
            "    \"2015-08-17\", \n" +
            "    \"2015-08-14\", \n" +
            "    \"2015-08-13\", \n" +
            "    \"2015-08-12\", \n" +
            "    \"2015-08-11\", \n" +
            "    \"2015-08-10\", \n" +
            "    \"2015-08-07\", \n" +
            "    \"2015-08-06\", \n" +
            "    \"2015-08-05\", \n" +
            "    \"2015-08-03\", \n" +
            "    \"2015-07-31\", \n" +
            "    \"2015-07-30\", \n" +
            "    \"2015-07-29\", \n" +
            "    \"2015-07-28\", \n" +
            "    \"2015-07-27\", \n" +
            "    \"2015-07-24\", \n" +
            "    \"2015-07-23\", \n" +
            "    \"2015-07-22\", \n" +
            "    \"2015-07-21\", \n" +
            "    \"2015-07-20\", \n" +
            "    \"2015-07-17\", \n" +
            "    \"2015-07-16\", \n" +
            "    \"2015-07-15\", \n" +
            "    \"2015-07-14\", \n" +
            "    \"2015-07-13\", \n" +
            "    \"2015-07-10\", \n" +
            "    \"2015-07-09\", \n" +
            "    \"2015-07-08\", \n" +
            "    \"2015-07-07\", \n" +
            "    \"2015-07-03\", \n" +
            "    \"2015-07-02\", \n" +
            "    \"2015-07-01\", \n" +
            "    \"2015-06-30\", \n" +
            "    \"2015-06-29\", \n" +
            "    \"2015-06-26\", \n" +
            "    \"2015-06-19\", \n" +
            "    \"2015-06-18\", \n" +
            "    \"2015-06-17\", \n" +
            "    \"2015-06-16\", \n" +
            "    \"2015-06-15\", \n" +
            "    \"2015-06-12\", \n" +
            "    \"2015-06-11\", \n" +
            "    \"2015-06-10\", \n" +
            "    \"2015-06-09\", \n" +
            "    \"2015-06-05\", \n" +
            "    \"2015-06-04\", \n" +
            "    \"2015-06-03\", \n" +
            "    \"2015-06-02\", \n" +
            "    \"2015-05-29\", \n" +
            "    \"2015-05-28\", \n" +
            "    \"2015-05-27\", \n" +
            "    \"2015-05-26\", \n" +
            "    \"2015-05-25\", \n" +
            "    \"2015-05-22\", \n" +
            "    \"2015-05-21\", \n" +
            "    \"2015-05-20\", \n" +
            "    \"2015-05-19\", \n" +
            "    \"2015-05-18\"\n" +
            "  ]\n" +
            "}";

    public String data1 = "{\n" +
            "  \"error\": false, \n" +
            "  \"results\": [\n" +
            "    {\n" +
            "      \"_id\": \"5797458a421aa90d2fc94b5a\", \n" +
            "      \"createdAt\": \"2016-07-26T19:12:10.204Z\", \n" +
            "      \"desc\": \"Android OpenGL ES \\u4ece\\u5165\\u95e8\\u5230\\u5954\\u6e83  --\\u300aOpenGL ES \\u5e94\\u7528\\u5f00\\u53d1\\u5b9e\\u8df5\\u6307\\u5357\\u300b\\u8bfb\\u4e66\\u7b14\\u8bb0 \\uff0c \\u5b66\\u4e60\\u5982\\u4f55\\u5236\\u4f5c\\u4e00\\u4e2a\\u7b80\\u5355\\u7684 OpenGL \\u6e38\\u620f\\uff0c\\u7406\\u89e3\\u6700\\u57fa\\u672c\\u7684 OpenGL \\u77e5\\u8bc6\", \n" +
            "      \"publishedAt\": \"2016-07-27T11:27:16.610Z\", \n" +
            "      \"source\": \"web\", \n" +
            "      \"type\": \"Android\", \n" +
            "      \"url\": \"https://www.rogerblog.cn/2016/07/18/OpenGL-serise-No1/\", \n" +
            "      \"used\": true, \n" +
            "      \"who\": \"Roger\"\n" +
            "    }, \n" +
            "    {\n" +
            "      \"_id\": \"57962735421aa90d39e7094f\", \n" +
            "      \"createdAt\": \"2016-07-25T22:50:29.136Z\", \n" +
            "      \"desc\": \"Android\\uff1a\\u5b66\\u4e60AIDL\\uff0c\\u8fd9\\u4e00\\u7bc7\\u6587\\u7ae0\\u5c31\\u591f\\u4e86(\\u4e0b)\", \n" +
            "      \"publishedAt\": \"2016-07-26T10:30:11.357Z\", \n" +
            "      \"source\": \"web\", \n" +
            "      \"type\": \"Android\", \n" +
            "      \"url\": \"http://blog.csdn.net/luoyanglizi/article/details/52029091\", \n" +
            "      \"used\": true, \n" +
            "      \"who\": \"lypeer\"\n" +
            "    }, \n" +
            "    {\n" +
            "      \"_id\": \"5795fdbe421aa90d36e96079\", \n" +
            "      \"createdAt\": \"2016-07-25T19:53:34.386Z\", \n" +
            "      \"desc\": \"\\u4e00\\u4e2a\\u5229\\u7528RxJava\\u5728TextView\\u548cEditText\\u4e0a\\u6e32\\u67d3\\u7684markdown\\u89e3\\u6790\\u5668\\uff0c\\u652f\\u6301\\u5927\\u90e8\\u5206\\u8bed\\u6cd5\\u4ee5\\u53ca\\u90e8\\u5206\\u8bed\\u6cd5\\u5728EditText\\u4e0a\\u5b9e\\u65f6\\u9884\\u89c8\", \n" +
            "      \"publishedAt\": \"2016-07-26T10:30:11.357Z\", \n" +
            "      \"source\": \"web\", \n" +
            "      \"type\": \"Android\", \n" +
            "      \"url\": \"https://github.com/yydcdut/RxMarkdown\", \n" +
            "      \"used\": true, \n" +
            "      \"who\": \"yydcdut\"\n" +
            "    }, \n" +
            "    {\n" +
            "      \"_id\": \"5795cd9c421aa90d39e70948\", \n" +
            "      \"createdAt\": \"2016-07-25T16:28:12.741Z\", \n" +
            "      \"desc\": \"\\u9047\\u89c1 LoopBar \\u4eceCleveroad\\u3002\\u5728Android\\u73af\\u5883\\u4e2d\\u5bfc\\u822a\\u7684\\u65b0\\u65b9\\u6cd5\", \n" +
            "      \"publishedAt\": \"2016-07-26T10:30:11.357Z\", \n" +
            "      \"source\": \"web\", \n" +
            "      \"type\": \"Android\", \n" +
            "      \"url\": \"https://github.com/Cleveroad/LoopBar\", \n" +
            "      \"used\": true, \n" +
            "      \"who\": null\n" +
            "    }, \n" +
            "    {\n" +
            "      \"_id\": \"5795551c421aa90d39e7093b\", \n" +
            "      \"createdAt\": \"2016-07-25T07:54:04.930Z\", \n" +
            "      \"desc\": \"\\u7535\\u5f71\\u7968\\u5728\\u7ebf\\u9009\\u5ea7\", \n" +
            "      \"publishedAt\": \"2016-07-26T10:30:11.357Z\", \n" +
            "      \"source\": \"chrome\", \n" +
            "      \"type\": \"Android\", \n" +
            "      \"url\": \"https://github.com/qifengdeqingchen/SeatTable\", \n" +
            "      \"used\": true, \n" +
            "      \"who\": \"Jason\"\n" +
            "    }, \n" +
            "    {\n" +
            "      \"_id\": \"5794f758421aa90d36e96070\", \n" +
            "      \"createdAt\": \"2016-07-25T01:14:00.293Z\", \n" +
            "      \"desc\": \"\\u4e00\\u4e2a\\u6ed1\\u52a8\\u52a8\\u753b\\u7684textview\\uff08\\u66f4\\u597d\\u7684\\u663e\\u793a\\u6e29\\u5ea6\\uff0c\\u91d1\\u989d\\u7b49\\uff09\", \n" +
            "      \"publishedAt\": \"2016-07-26T10:30:11.357Z\", \n" +
            "      \"source\": \"chrome\", \n" +
            "      \"type\": \"Android\", \n" +
            "      \"url\": \"https://github.com/robinhood/ticker\", \n" +
            "      \"used\": true, \n" +
            "      \"who\": \"\\u6709\\u65f6\\u653e\\u7eb5\"\n" +
            "    }, \n" +
            "    {\n" +
            "      \"_id\": \"579300cb421aa90d2fc94b40\", \n" +
            "      \"createdAt\": \"2016-07-23T13:29:47.475Z\", \n" +
            "      \"desc\": \"Android Activity \\u751f\\u547d\\u5468\\u671f\\u662f\\u5982\\u4f55\\u5b9e\\u73b0\\u7684\", \n" +
            "      \"publishedAt\": \"2016-07-25T11:43:57.769Z\", \n" +
            "      \"source\": \"web\", \n" +
            "      \"type\": \"Android\", \n" +
            "      \"url\": \"http://www.woaitqs.cc/android/2016/07/19/how-activity-lifecircle-work.html\", \n" +
            "      \"used\": true, \n" +
            "      \"who\": \"tangqisen\"\n" +
            "    }, \n" +
            "    {\n" +
            "      \"_id\": \"5791953f421aa90d36e96056\", \n" +
            "      \"createdAt\": \"2016-07-22T11:38:39.568Z\", \n" +
            "      \"desc\": \"PathMeasure\\u4e4b\\u8ff7\\u5f84\\u8ffd\\u8e2a\", \n" +
            "      \"publishedAt\": \"2016-07-25T11:43:57.769Z\", \n" +
            "      \"source\": \"web\", \n" +
            "      \"type\": \"Android\", \n" +
            "      \"url\": \"http://blog.csdn.net/eclipsexys/article/details/51992473\", \n" +
            "      \"used\": true, \n" +
            "      \"who\": \"xuyisheng\"\n" +
            "    }, \n" +
            "    {\n" +
            "      \"_id\": \"579187f5421aa90d39e7091d\", \n" +
            "      \"createdAt\": \"2016-07-22T10:41:57.457Z\", \n" +
            "      \"desc\": \"\\u7ee7\\u627f\\u81ea UIVisualEffectsView \\u7684\\u652f\\u6301\\u52a8\\u6001\\u8c03\\u6574\\u6a21\\u7cca\\u5ea6\\u7684\\u5e93\", \n" +
            "      \"publishedAt\": \"2016-07-22T11:04:44.305Z\", \n" +
            "      \"source\": \"web\", \n" +
            "      \"type\": \"Android\", \n" +
            "      \"url\": \"https://github.com/ML-Works/Bluuur\", \n" +
            "      \"used\": true, \n" +
            "      \"who\": \"\\u4ee3\\u7801\\u5bb6\"\n" +
            "    }, \n" +
            "    {\n" +
            "      \"_id\": \"579186d2421aa90d39e7091c\", \n" +
            "      \"createdAt\": \"2016-07-22T10:37:06.397Z\", \n" +
            "      \"desc\": \"Stack Overflow\\u8981\\u505a\\u6587\\u6863\\u4e86\\uff0c\\u672a\\u6765\\u5c06\\u81ea\\u52a8\\u628a\\u5178\\u578b\\u95ee\\u9898\\u52a0\\u5165\\u6587\\u6863\\u3002\\uff08Android\\u7bc7\\uff09\", \n" +
            "      \"publishedAt\": \"2016-07-22T11:04:44.305Z\", \n" +
            "      \"source\": \"chrome\", \n" +
            "      \"type\": \"Android\", \n" +
            "      \"url\": \"http://stackoverflow.com/documentation/android/topics\", \n" +
            "      \"used\": true, \n" +
            "      \"who\": \"Dear\\u5b85\\u5b66\\u957f\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";
}
