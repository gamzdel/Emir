package JavaSessions;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class CompareResultSet 
{
	
	public boolean compareResultSets(ResultSet resultSet1, ResultSet resultSet2) throws SQLException
	{
        while (resultSet1.next())
        {
            resultSet2.next();
            ResultSetMetaData resultSetMetaData = resultSet1.getMetaData();
            int count = resultSetMetaData.getColumnCount();
            for (int i = 1; i <= count; i++)
            {
                if (!resultSet1.getObject(i).equals(resultSet2.getObject(i))) 
                {
                    return false;
                }
            }
        }
        return true;
    }

}
