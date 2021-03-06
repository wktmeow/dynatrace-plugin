/***************************************************
 * Dynatrace Jenkins Plugin

 Copyright (c) 2008-2016, DYNATRACE LLC
 All rights reserved.

 Redistribution and use in source and binary forms, with or without modification,
 are permitted provided that the following conditions are met:

 * Redistributions of source code must retain the above copyright notice,
 this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice,
 this list of conditions and the following disclaimer in the documentation
 and/or other materials provided with the distribution.
 * Neither the name of the dynaTrace software nor the names of its contributors
 may be used to endorse or promote products derived from this software without
 specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
 BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
 DAMAGE.
 */
package com.dynatrace.jenkins.dashboard.model_2_0_0;

import com.dynatrace.jenkins.dashboard.Messages;

/**
 * Created by krzysztof.necel on 2016-04-04.
 */
public enum TestCategory {

	UNIT("unit"),
	UI_DRIVEN("uidriven"),
	PERFORMANCE("performance"),
	WEB_API("webapi");

	private final String id;

	TestCategory(final String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		switch (this) {
			case UNIT:
				return Messages.TestCategory_UNIT();
			case UI_DRIVEN:
				return Messages.TestCategory_UI_DRIVEN();
			case PERFORMANCE:
				return Messages.TestCategory_PERFORMANCE();
			case WEB_API:
				return Messages.TestCategory_WEB_API();
		}
		return null;
	}

	public static TestCategory fromString(String id) {
		for (TestCategory testCategory : TestCategory.values()) {
			if (testCategory.id.equalsIgnoreCase(id)) {
				return testCategory;
			}
		}
		throw new IllegalArgumentException(String.format("Unrecognized test category: %s", id));
	}
}
