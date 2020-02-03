/**
 * Copyright (C) 2020, George Suaridze
 */
package org.example;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 *
 * @author George Suaridze
 *
 */
public final class ExamplePlugin extends Plugin
{
    public static final String PLUGIN_ID = "org.example"; //$NON-NLS-1$

    private static ExamplePlugin plugin;

    /**
     * Returns the shared plug-in instance.
     *
     * @return the shared plug-in instance never {@code null} if plug-in is started
     */
    public static ExamplePlugin getDefault()
    {
        return plugin;
    }

    /**
     * Writes an info status message to the plug-in log.
     *
     * @param message the message to write, cannot be {@code null}
     */
    public static void logInfo(String message)
    {
        getDefault().getLog().log(new Status(IStatus.INFO, PLUGIN_ID, 0, message, null));
    }

    @Override
    public void start(BundleContext context) throws Exception
    {
        super.start(context);
        plugin = this;
        logInfo("Example plugin started"); //$NON-NLS-1$
    }

    @Override
    public void stop(BundleContext context) throws Exception
    {
        super.stop(context);
        plugin = null;
    }
}
