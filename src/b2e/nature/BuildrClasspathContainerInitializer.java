package b2e.nature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.ClasspathContainerInitializer;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

public class BuildrClasspathContainerInitializer extends ClasspathContainerInitializer {

	@Override
	public void initialize(IPath containerPath, IJavaProject project) throws CoreException {
		BuildrClasspathContainer container = new BuildrClasspathContainer(project);
		JavaCore.setClasspathContainer(containerPath, new IJavaProject[] {project},
				new IClasspathContainer[] {container}, null);
	}

}
