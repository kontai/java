package com.tai.service;

import com.tai.pojo.People;

import java.io.IOException;
import java.util.List;

public interface PerpleService {
    List<People> show() throws IOException;
}
