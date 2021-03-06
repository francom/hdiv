/**
 * Copyright 2005-2015 hdiv.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hdiv.validator;

/**
 * Contains the result of a {@link EditableDataValidationProvider} invoke.
 * 
 * @since HDIV 2.1.10
 */
public class EditableDataValidationResult {

	/**
	 * Constant valid result.
	 */
	public static final EditableDataValidationResult VALID = new EditableDataValidationResult(true);

	/**
	 * Validation result. True if validation is success.
	 */
	protected boolean valid;

	/**
	 * If the validation isn't success, contains the identifier of the validation that rejects the value.
	 */
	protected String validationId;

	protected EditableDataValidationResult(boolean valid) {
		this.valid = valid;
	}

	public EditableDataValidationResult(boolean valid, String validationId) {
		this.valid = valid;
		this.validationId = validationId;
	}

	public boolean isValid() {
		return valid;
	}

	public String getValidationId() {
		return validationId;
	}

}
