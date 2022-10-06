package com.tai.service;

import com.tai.pojo.Account;

import java.io.IOException;

public interface AccountService {
    Account show(String no, int pass) throws IOException;
}
