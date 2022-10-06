package com.tai.service;

import com.tai.pojo.Account;

import java.io.IOException;

public interface AccountService {
    int SUCCESS=0;
    int ACCOUT_NOT_EXIST=1;
    int BALANCE_NOT_ENOUGH =2;
    int ERROR=3;
    int show(Account accIn, Account accOut) throws IOException;
}
