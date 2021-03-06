package StudentManagerNewArr.factory;

import StudentManagerNewArr.dao.BaseDao;
import StudentManagerNewArr.dao.SystemDao;

public class  DaoFactory {
    public static BaseDao DaoFactory() {
        return new SystemDao();
    }
}
