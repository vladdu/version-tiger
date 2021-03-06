package com.inventage.tools.versiontiger.strategy;

import com.inventage.tools.versiontiger.MavenVersion;
import com.inventage.tools.versiontiger.internal.impl.VersioningImpl;

public class SetVersionManuallyStrategy extends AbstractVersioningStrategy {

	@Override
	public MavenVersion apply(MavenVersion version) {
		return new VersioningImpl().createMavenVersion(getData());
	}

	@Override
	public String toString() {
		return "Set version manually";
	}

	@Override
	public boolean requiresDataInput() {
		return true;
	}
	
	@Override
	protected String getData() {
		return (String) super.getData();
	}

}
