package com.bignerdranch.android.testonline;

/**
 * Created by ASUS on 2022/4/21.
 */


        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;

        import java.util.ArrayList;
        import java.util.List;


//连接数据库，并从数据库中获取所需数据
public class DBService {
//    private SQLiteDatabase db;
//    //在构造函数中打开指定数据库，并把它的引用指向db
//    public DBService(){
//        db=SQLiteDatabase.openDatabase("/data/data/com.bignerdranch.android.testonline/databases/question.db" +
//                "",null,SQLiteDatabase.OPEN_READWRITE);
//    }
//    //获取数据库中的问题
//    public List<Question>  getQuestion(){
//        List<Question>  list=new ArrayList<Question> ();
//  /*
//    Cursor是结果集游标，用于对结果集进行随机访问,其实Cursor与JDBC中的ResultSet作用很相似。
//    rawQuery()方法的第一个参数为select语句；第二个参数为select语句中占位符参数的值，如果select语句没有使用占位符，该参数可以设置为null。*/
//        Cursor cursor =db.rawQuery("select * from question",null);
//        if(cursor.getCount()==0){
//            cursor.moveToFirst();//将cursor移动到第一个光标上
//            int count=cursor.getCount();
//            //将cursor中的每一条记录生成一个question对象，并将该question对象添加到list中
//            for(int i=0;i<count;i++){
//                cursor.moveToPosition(i);
//                Question question =new Question();
//                question.ID=cursor.getInt(cursor.getColumnIndex("ID"));
//                question.question=cursor.getString(cursor.getColumnIndex("question"));
//                question.answerA=cursor.getString(cursor.getColumnIndex("answerA"));
//                question.answerB=cursor.getString(cursor.getColumnIndex("answerB"));
//                question.answerC=cursor.getString(cursor.getColumnIndex("answerC"));
//                question.answerD=cursor.getString(cursor.getColumnIndex("answerD"));
//                question.answer=cursor.getInt(cursor.getColumnIndex("answer"));
//
//                question.explaination=cursor.getString(cursor.getColumnIndex("explanation"));
//                //表示没有选择任何选项
//                question.selectedAnswer=-1;
//                list.add(question);
//            }
//        }
//        return list;
//    }

}
