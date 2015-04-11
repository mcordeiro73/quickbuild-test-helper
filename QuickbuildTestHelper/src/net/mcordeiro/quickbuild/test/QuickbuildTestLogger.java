package net.mcordeiro.quickbuild.test;

import java.util.logging.Level;

import org.slf4j.Logger;
import org.slf4j.Marker;

public class QuickbuildTestLogger implements Logger {

	private final java.util.logging.Logger logger;

	private QuickbuildTestLogger(java.util.logging.Logger logger) {
		super();
		this.logger = logger;
	}
	
	public static QuickbuildTestLogger getLogger(String name) {
		return new QuickbuildTestLogger(java.util.logging.Logger.getLogger(name));
	}
	
	public static QuickbuildTestLogger getAnonymousLogger() {
		return new QuickbuildTestLogger(java.util.logging.Logger.getAnonymousLogger());
	}

	@Override
	public void debug(String arg0) {
		logger.log(Level.FINE, arg0);
	}

	@Override
	public void debug(String arg0, Object arg1) {
		logger.log(Level.FINE, arg0);
	}

	@Override
	public void debug(String arg0, Object... arg1) {
		logger.log(Level.FINE, arg0);
	}

	@Override
	public void debug(String arg0, Throwable arg1) {
		logger.log(Level.FINE, arg0, arg1);
	}

	@Override
	public void debug(Marker arg0, String arg1) {
		logger.log(Level.FINE, arg1);
	}

	@Override
	public void debug(String arg0, Object arg1, Object arg2) {
		logger.log(Level.FINE, arg0);
	}

	@Override
	public void debug(Marker arg0, String arg1, Object arg2) {
		logger.log(Level.FINE, arg1);
	}

	@Override
	public void debug(Marker arg0, String arg1, Object... arg2) {
		logger.log(Level.FINE, arg1);
	}

	@Override
	public void debug(Marker arg0, String arg1, Throwable arg2) {
		logger.log(Level.FINE, arg1, arg2);
	}

	@Override
	public void debug(Marker arg0, String arg1, Object arg2, Object arg3) {
		logger.log(Level.FINE, arg1);
	}

	@Override
	public void error(String arg0) {
		logger.log(Level.SEVERE, arg0);

	}

	@Override
	public void error(String arg0, Object arg1) {
		logger.log(Level.SEVERE, arg0);
	}

	@Override
	public void error(String arg0, Object... arg1) {
		logger.log(Level.SEVERE, arg0);
	}

	@Override
	public void error(String arg0, Throwable arg1) {
		logger.log(Level.SEVERE, arg0, arg1);
	}

	@Override
	public void error(Marker arg0, String arg1) {
		logger.log(Level.SEVERE, arg1);
	}

	@Override
	public void error(String arg0, Object arg1, Object arg2) {
		logger.log(Level.SEVERE, arg0);
	}

	@Override
	public void error(Marker arg0, String arg1, Object arg2) {
		logger.log(Level.SEVERE, arg1);
	}

	@Override
	public void error(Marker arg0, String arg1, Object... arg2) {
		logger.log(Level.SEVERE, arg1);
	}

	@Override
	public void error(Marker arg0, String arg1, Throwable arg2) {
		logger.log(Level.SEVERE, arg1, arg2);
	}

	@Override
	public void error(Marker arg0, String arg1, Object arg2, Object arg3) {
		logger.log(Level.SEVERE, arg1);
	}

	@Override
	public String getName() {
		return logger.getName();
	}

	@Override
	public void info(String arg0) {
		logger.log(Level.INFO, arg0);
	}

	@Override
	public void info(String arg0, Object arg1) {
		logger.log(Level.INFO, arg0);
	}

	@Override
	public void info(String arg0, Object... arg1) {
		logger.log(Level.INFO, arg0);
	}

	@Override
	public void info(String arg0, Throwable arg1) {
		logger.log(Level.INFO, arg0, arg1);
	}

	@Override
	public void info(Marker arg0, String arg1) {
		logger.log(Level.INFO, arg1);
	}

	@Override
	public void info(String arg0, Object arg1, Object arg2) {
		logger.log(Level.INFO, arg0);
	}

	@Override
	public void info(Marker arg0, String arg1, Object arg2) {
		logger.log(Level.INFO, arg1);
	}

	@Override
	public void info(Marker arg0, String arg1, Object... arg2) {
		logger.log(Level.INFO, arg1);
	}

	@Override
	public void info(Marker arg0, String arg1, Throwable arg2) {
		logger.log(Level.INFO, arg1, arg2);
	}

	@Override
	public void info(Marker arg0, String arg1, Object arg2, Object arg3) {
		logger.log(Level.INFO, arg1);
	}

	@Override
	public boolean isDebugEnabled() {
		return logger.isLoggable(Level.FINE);
	}

	@Override
	public boolean isDebugEnabled(Marker arg0) {
		return logger.isLoggable(Level.FINE);
	}

	@Override
	public boolean isErrorEnabled() {
		return logger.isLoggable(Level.SEVERE);
	}

	@Override
	public boolean isErrorEnabled(Marker arg0) {
		return logger.isLoggable(Level.SEVERE);
	}

	@Override
	public boolean isInfoEnabled() {
		return logger.isLoggable(Level.INFO);
	}

	@Override
	public boolean isInfoEnabled(Marker arg0) {
		return logger.isLoggable(Level.INFO);
	}

	@Override
	public boolean isTraceEnabled() {
		return logger.isLoggable(Level.FINEST);
	}

	@Override
	public boolean isTraceEnabled(Marker arg0) {
		return logger.isLoggable(Level.FINEST);
	}

	@Override
	public boolean isWarnEnabled() {
		return logger.isLoggable(Level.WARNING);
	}

	@Override
	public boolean isWarnEnabled(Marker arg0) {
		return logger.isLoggable(Level.WARNING);
	}

	@Override
	public void trace(String arg0) {
		logger.log(Level.FINEST, arg0);
	}

	@Override
	public void trace(String arg0, Object arg1) {
		logger.log(Level.FINEST, arg0);
	}

	@Override
	public void trace(String arg0, Object... arg1) {
		logger.log(Level.FINEST, arg0);
	}

	@Override
	public void trace(String arg0, Throwable arg1) {
		logger.log(Level.FINEST, arg0, arg1);
	}

	@Override
	public void trace(Marker arg0, String arg1) {
		logger.log(Level.FINEST, arg1);
	}

	@Override
	public void trace(String arg0, Object arg1, Object arg2) {
		logger.log(Level.FINEST, arg0);
	}

	@Override
	public void trace(Marker arg0, String arg1, Object arg2) {
		logger.log(Level.FINEST, arg1);
	}

	@Override
	public void trace(Marker arg0, String arg1, Object... arg2) {
		logger.log(Level.FINEST, arg1);
	}

	@Override
	public void trace(Marker arg0, String arg1, Throwable arg2) {
		logger.log(Level.FINEST, arg1, arg2);
	}

	@Override
	public void trace(Marker arg0, String arg1, Object arg2, Object arg3) {
		logger.log(Level.FINEST, arg1);
	}

	@Override
	public void warn(String arg0) {
		logger.log(Level.WARNING, arg0);
	}

	@Override
	public void warn(String arg0, Object arg1) {
		logger.log(Level.WARNING, arg0);
	}

	@Override
	public void warn(String arg0, Object... arg1) {
		logger.log(Level.WARNING, arg0);
	}

	@Override
	public void warn(String arg0, Throwable arg1) {
		logger.log(Level.WARNING, arg0, arg1);
	}

	@Override
	public void warn(Marker arg0, String arg1) {
		logger.log(Level.WARNING, arg1);
	}

	@Override
	public void warn(String arg0, Object arg1, Object arg2) {
		logger.log(Level.WARNING, arg0);
	}

	@Override
	public void warn(Marker arg0, String arg1, Object arg2) {
		logger.log(Level.WARNING, arg1);
	}

	@Override
	public void warn(Marker arg0, String arg1, Object... arg2) {
		logger.log(Level.WARNING, arg1);
	}

	@Override
	public void warn(Marker arg0, String arg1, Throwable arg2) {
		logger.log(Level.WARNING, arg1, arg2);
	}

	@Override
	public void warn(Marker arg0, String arg1, Object arg2, Object arg3) {
		logger.log(Level.WARNING, arg1);
	}

}
