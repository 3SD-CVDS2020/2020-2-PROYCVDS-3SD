package edu.eci.cvds.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import edu.eci.cvds.sampleprj.UserDAO;
import edu.eci.cvds.sampleprj.mybatis.MyBatisUserDao;
import edu.eci.cvds.view.BasePageBean;
import edu.eci.cvds.view.LoginBean;
import edu.eci.cvds.Auth.SessionLogger;
import edu.eci.cvds.Auth.ShiroSession;
//import edu.eci.cvds.Services.ServicesFactory;
import edu.eci.cvds.Services.UserServices;
import edu.eci.cvds.Services.impl.UserServicesImpl;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class GuiceContextListener implements ServletContextListener{

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.removeAttribute(Injector.class.getName());
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Injector injector = Guice.createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                install(JdbcHelper.PostgreSQL);
                setEnvironmentId("development");
                setClassPathResource("mybatis-config.xml");
                // TODO Add service class associated to Stub implementation
                bind(UserDAO.class).to(MyBatisUserDao.class);
                bind(UserServices.class).to(UserServicesImpl.class);
                bind(SessionLogger.class).to(ShiroSession.class);
            }
        });

        servletContextEvent.getServletContext().setAttribute(Injector.class.getName(), injector);
    }

}