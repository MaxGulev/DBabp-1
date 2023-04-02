import java.io.IOException;


public class MainProgram {

    public static void main(String[] args) throws IOException {

        Check Peopledb = new Check();
        Peopledb.Chek ("C:\\Users\\Zzz\\Desktop\\Работа Завод\\DBabp2022",
                "PeopleDB.odb",
                "CopyBackUp",
                "C:\\Users\\Zzz\\Desktop\\Работа Завод\\DBabp2022\\CopyBackUp",
                "PeopleDB.odb");

        Check PeopledbZIP = new Check();
        Peopledb.Chek ("C:\\Users\\Zzz\\Desktop\\Работа Завод\\DBabp2022",
                "PeopleDB.odb",
                "ZipFolder",
                "C:\\Users\\Zzz\\Desktop\\Работа Завод\\DBabp2022\\ZipFolder",
                "PeopleDB.odb");

        Check PeopledbZipFile = new Check();
        Peopledb.Chek ("C:\\Users\\Zzz\\Desktop\\Работа Завод\\DBabp2022\\ZipFolder",
                "PeopleDB.odb",
                " ",
                "C:\\Users\\Zzz\\Desktop\\Работа Завод\\DBabp2022\\ZipFolder",
                "PeopleDB.zip");

        /*Check Systemdb = new Check();
        Systemdb.Chek("F:\\.shortcut-targets-by-id\\0B9wojQeziltQXzFGanh3WmUtNVE\\Production and project managment\\Maxim\\DB2022\\DB\\DBSystems\\",
                "SystemDB.odb",
                "CopyBackUp",
                "F:\\.shortcut-targets-by-id\\0B9wojQeziltQXzFGanh3WmUtNVE\\Production and project managment\\Maxim\\DB2022\\DB\\DBSystems\\CopyBackUp",
                "SystemDB.zip");

        Check Tooldb = new Check();
        Tooldb.Chek("F:\\.shortcut-targets-by-id\\0B9wojQeziltQXzFGanh3WmUtNVE\\Production and project managment\\Maxim\\DB2022\\DB\\DBTools\\",
                "ToolsDB.odb",
                "CopyBackUp",
                "F:\\.shortcut-targets-by-id\\0B9wojQeziltQXzFGanh3WmUtNVE\\Production and project managment\\Maxim\\DB2022\\DB\\DBTools\\CopyBackUp",
                "ToolsDB.zip");*/
    }
}
