package com.example.admin.designpatterns.abstract_factory;

import com.example.admin.designpatterns.factory.ISender;

/**
 * @author Diana
 * @date 2017/6/20
 */

public interface IProvider {

    ISender produce();
}
