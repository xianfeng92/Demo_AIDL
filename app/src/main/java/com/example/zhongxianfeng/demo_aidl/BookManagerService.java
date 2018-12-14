package com.example.zhongxianfeng.demo_aidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import java.util.ArrayList;
import java.util.List;

public class BookManagerService extends Service {

    private ArrayList<Book> list;

    IBookManager.Stub mBinder = new IBookManager.Stub() {
        @Override
        public List<Book> getBook() throws RemoteException {
            return list;
        }

        @Override
        public void addBook(Book book) throws RemoteException {
            if (list == null){
                list = new ArrayList<>();
            }
            list.add(book);
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}
