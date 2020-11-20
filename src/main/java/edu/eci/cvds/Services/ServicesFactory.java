package edu.eci.cvds.Services;

import com.google.inject.Injector;

import edu.eci.cvds.sampleprj.ElementoDAO;
import edu.eci.cvds.sampleprj.UserDAO;
import edu.eci.cvds.sampleprj.mybatis.MyBatisElementoDAO;
import edu.eci.cvds.sampleprj.mybatis.MyBatisUserDao;
import edu.eci.cvds.view.BasePageBean;
import edu.eci.cvds.view.LoginBean;
import edu.eci.cvds.Auth.*;
import edu.eci.cvds.Services.impl.ElementoServicesImpl;
import edu.eci.cvds.Services.impl.EquipoServicesImpl;
import edu.eci.cvds.Services.impl.UserServicesImpl;
import org.mybatis.guice.XMLMyBatisModule;

import java.util.Optional;

import static com.google.inject.Guice.createInjector;

public class ServicesFactory {

    private static ServicesFactory instance= new ServicesFactory();

    private static Optional<Injector> optInjector=Optional.empty();


    private Injector myBatisInjector(final String env, final String pathResource) {
        return createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                setEnvironmentId(env);
                setClassPathResource(pathResource);
                bind(UserDAO.class).to(MyBatisUserDao.class);
                bind(ElementoDAO.class).to(MyBatisElementoDAO.class);
                bind(ElementoServices.class).to(ElementoServicesImpl.class);
                bind(EquipoServices.class).to(EquipoServicesImpl.class);
                bind(UserServices.class).to(UserServicesImpl.class);
                bind(SessionLogger.class).to(ShiroSession.class);
                bind(BasePageBean.class).to(LoginBean.class);
            }
        });
    }
    public SessionLogger getLoginServices(){
        if (!optInjector.isPresent()) {
            optInjector = Optional.of(myBatisInjector("development","mybatis-config.xml"));
        }

        return optInjector.get().getInstance(SessionLogger.class);
    }

    public static ServicesFactory getInstance(){
        return instance;
    }
    public UserServices getUserServices(){
        if (!optInjector.isPresent()) {
            optInjector = Optional.of(myBatisInjector("development","mybatis-config.xml"));
        }

        return optInjector.get().getInstance(UserServices.class);
    }
    public ElementoServices getElementoServices(){
        if(!optInjector.isPresent()){
            optInjector=Optional.of(myBatisInjector("development","mybatis-config.xml"));
        }
        return optInjector.get().getInstance(ElementoServices.class);
    }
    public EquipoServices getEquipoServices(){
        if(!optInjector.isPresent()){
            optInjector=Optional.of(myBatisInjector("development","mybatis-config.xml"));
        }
        return optInjector.get().getInstance(EquipoServices.class);
    }
}
