package b2e.nature;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.ClasspathVariableInitializer;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public class M2RepoClasspathVariableInitializer extends ClasspathVariableInitializer {

	  public void initialize(String variable) {
		  
		  try {
			JavaCore.setClasspathVariable(variable, 
					new Path("/home/hb/.m2/repository"), new NullProgressMonitor());
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
	  }

}
