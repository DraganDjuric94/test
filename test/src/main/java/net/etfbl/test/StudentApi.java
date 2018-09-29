
package net.etfbl.test;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.etfbl.test.dao.StudentDAO;
import net.etfbl.test.dto.Student;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/student")
public class StudentApi {
 
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudents() {
        Student st = StudentDAO.read(3);
        System.out.println(st);
        return st;
    }
}
