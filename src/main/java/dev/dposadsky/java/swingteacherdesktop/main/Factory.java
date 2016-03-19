/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.dposadsky.java.swingteacherdesktop.main;

import dev.dposadsky.java.swingteacherdesktop.controllers.AuthPaneController;
import dev.dposadsky.java.swingteacherdesktop.controllers.RegistrationPaneController;
import dev.dposadsky.java.swingteacherdesktop.dao.CompletedTaskDao;
import dev.dposadsky.java.swingteacherdesktop.dao.DocumentationDao;
import dev.dposadsky.java.swingteacherdesktop.dao.ErrorDao;
import dev.dposadsky.java.swingteacherdesktop.dao.KeywordDao;
import dev.dposadsky.java.swingteacherdesktop.dao.LessonDao;
import dev.dposadsky.java.swingteacherdesktop.dao.ShorthandDao;
import dev.dposadsky.java.swingteacherdesktop.dao.TaskDao;
import dev.dposadsky.java.swingteacherdesktop.dao.UserDao;
import dev.dposadsky.java.swingteacherdesktop.dao.impl.CompletedTaskDaoImpl;
import dev.dposadsky.java.swingteacherdesktop.dao.impl.DocumentationDaoImpl;
import dev.dposadsky.java.swingteacherdesktop.dao.impl.ErrorDaoImpl;
import dev.dposadsky.java.swingteacherdesktop.dao.impl.KeywordDaoImpl;
import dev.dposadsky.java.swingteacherdesktop.dao.impl.LessonDaoImpl;
import dev.dposadsky.java.swingteacherdesktop.dao.impl.ShorthandDaoImpl;
import dev.dposadsky.java.swingteacherdesktop.dao.impl.TaskDaoImpl;
import dev.dposadsky.java.swingteacherdesktop.dao.impl.UserDaoImpl;
import dev.dposadsky.java.swingteacherdesktop.tables.User;
import dev.dposadsky.java.swingteacherdesktop.views.AuthPane;
import dev.dposadsky.java.swingteacherdesktop.views.RegistrationPane;

/**
 *
 * @author DPosadsky
 */
public class Factory {
    
    public static Factory instance = new Factory();
    
    AuthPaneController authPaneController;
    RegistrationPaneController registrationPaneController;
    
    AuthPane authPane;
    RegistrationPane registrationPane;
    
    public LessonDao lessonDao;
    public ShorthandDao shorthandDao;
    public TaskDao taskDao;
    public DocumentationDao documentationDao;
    public ErrorDao errorDao;
    public KeywordDao keywordDao;
    public UserDao userDao;
    public CompletedTaskDao completedTaskDao;
    
    public User currentUser;
    
    private Factory() { }
    
    public static Factory getInstance() {
        return Factory.instance;    
    }
    
    public AuthPaneController getAuthPaneController() {
        if (authPaneController == null)
            authPaneController = new AuthPaneController();
        return authPaneController;
    }
    
    public RegistrationPaneController getRegistrationPaneController() {
        if (registrationPaneController == null)
            registrationPaneController = new RegistrationPaneController();
        return registrationPaneController;
    }
    
    public AuthPane getAuthPane() {
        if (authPane == null)
            authPane = new AuthPane();
        return authPane;
    }
    
    public RegistrationPane getRegistrationPane() {
        if (registrationPane == null) 
            registrationPane = new RegistrationPane();
        return registrationPane;
    }
    
    public LessonDao getLessonDao() {
        if (lessonDao == null) 
            lessonDao = new LessonDaoImpl();
        return lessonDao;
    }
    
    public ShorthandDao getShorthandDao() {
        if (shorthandDao == null) 
            shorthandDao = new ShorthandDaoImpl();
        return shorthandDao;
    }
    
    public TaskDao getTaskDao() {
        if (taskDao == null) 
            taskDao = new TaskDaoImpl();
        return taskDao;
    }
    
    public DocumentationDao getDocumentationDao() {
        if (documentationDao == null) 
            documentationDao = new DocumentationDaoImpl();
        return documentationDao;
    }
    
    public ErrorDao getErrorDao() {
        if (errorDao == null) 
            errorDao = new ErrorDaoImpl();
        return errorDao;
    }
    
    public KeywordDao getKeywordDao() {
        if (keywordDao == null) 
            keywordDao = new KeywordDaoImpl();
        return keywordDao;
    }
    
    public UserDao getUserDao() {
        if (userDao == null) 
            userDao = new UserDaoImpl();
        return userDao;
    }
    
    public CompletedTaskDao getCompletedTaskDao() {
        if (completedTaskDao == null) 
            completedTaskDao = new CompletedTaskDaoImpl();
        return completedTaskDao;
    }
    
    public User getCurrentUser() {
        if (currentUser == null) 
            currentUser = new User();
        return currentUser;
    }
    
    public void serCurrentUser(User user) {
        currentUser = user;
    }
}
