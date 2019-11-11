// This file was generated by Mendix Modeler 7.23.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package environmentvariables.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the EnvironmentVariables module
	public static boolean aSu_EnvironmentVariables(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "EnvironmentVariables.ASu_EnvironmentVariables", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String sUB_EnvironmentLetterGet(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.String)Core.execute(context, "EnvironmentVariables.SUB_EnvironmentLetterGet", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static environmentvariables.proxies.EnvironmentVariables sUB_EnvironmentVariables_Create(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "EnvironmentVariables.SUB_EnvironmentVariables_Create", params);
			return result == null ? null : environmentvariables.proxies.EnvironmentVariables.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}