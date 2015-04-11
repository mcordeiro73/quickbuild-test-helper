package net.mcordeiro.quickbuild.test;

import java.util.logging.Level;
import java.util.logging.Logger;

import mockit.Mock;
import mockit.MockUp;

import org.mockito.Mockito;

import com.pmease.quickbuild.Context;
import com.pmease.quickbuild.model.Build;
import com.pmease.quickbuild.model.Configuration;

public class QuickbuildTestHelper {

	public static MockUp<Context> initMockContext(final Build build) {
		return new MockUp<Context>() {
			
			@Mock
			public Build get() {
				return build;
			}
			
			@Mock
			public Build getBuild() {
				return build;
			}
			
			@Mock
			public Configuration getConfiguration() {
				if(build != null) {
					try {
						return build.getConfiguration();
					} catch (Exception e) {
						Logger.getLogger(getClass().getName()).log(Level.WARNING, "Unable to get Configuration off Build object when building Mock Context.  Mocking out a new Configuration", e);
					}					
				}
				return Mockito.mock(Configuration.class);
			}
			
			@Mock
			public org.slf4j.Logger getLogger() {
				return QuickbuildTestLogger.getLogger(getClass().getName());
			}
		};
	}
}
