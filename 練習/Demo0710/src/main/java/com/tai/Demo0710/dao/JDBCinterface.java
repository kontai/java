package com.tai.Demo0710.dao;

import com.tai.Demo0710.User.User;

/**
 * @author kontai
 */
 interface JDBCinterface {
     User chekUser(String username, String password);
}
