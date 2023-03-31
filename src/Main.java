import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Chek Peopledb = new Chek();
        Peopledb.Chek("F:\\.shortcut-targets-by-id\\0B9wojQeziltQXzFGanh3WmUtNVE\\Production and project managment\\Maxim\\DB2022\\DB\\DBPeoples\\", "PeopleDB.odb","CopyBackUp","F:\\.shortcut-targets-by-id\\0B9wojQeziltQXzFGanh3WmUtNVE\\Production and project managment\\Maxim\\DB2022\\DB\\DBPeoples\\CopyBackUp");

        Chek Systemdb = new Chek();
        Systemdb.Chek("F:\\.shortcut-targets-by-id\\0B9wojQeziltQXzFGanh3WmUtNVE\\Production and project managment\\Maxim\\DB2022\\DB\\DBSystems\\", "SystemDB.odb","CopyBackUp","F:\\.shortcut-targets-by-id\\0B9wojQeziltQXzFGanh3WmUtNVE\\Production and project managment\\Maxim\\DB2022\\DB\\DBSystems\\CopyBackUp");

        Chek Tooldb = new Chek();
        Tooldb.Chek("F:\\.shortcut-targets-by-id\\0B9wojQeziltQXzFGanh3WmUtNVE\\Production and project managment\\Maxim\\DB2022\\DB\\DBTools\\", "ToolsDB.odb","CopyBackUp","F:\\.shortcut-targets-by-id\\0B9wojQeziltQXzFGanh3WmUtNVE\\Production and project managment\\Maxim\\DB2022\\DB\\DBTools\\CopyBackUp");
    }
}
