package com.saop.SpringAop;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.saop.SpringAop.aspect.PaymentAspect;
import com.saop.SpringAop.services.PaymentServiceImpl;

@Configurable
@ComponentScan( basePackages =  "com.saop.SpringAop")
@EnableAspectJAutoProxy
public class Config {}
