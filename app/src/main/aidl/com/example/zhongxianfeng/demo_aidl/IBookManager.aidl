// IBookManager.aidl
package com.example.zhongxianfeng.demo_aidl;

// Declare any non-default types here with import statements

import com.example.zhongxianfeng.demo_aidl.Book;

interface IBookManager {

    List<Book> getBook();
    void addBook(in Book book);
}
