/*
 * My-Wine-Cellar, copyright 2019
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 */

package info.mywinecellar.util;

public class Regex {

    /**
     * Private
     */
    private Regex() {
    }

    /** ALPHANUMERIC_SPACES_HYPHEN_PERIOD: Definition */
    public static final String ALPHANUMERIC_SPACES_HYPHEN_PERIOD_PATTERN = "^[a-zA-Z0-9\\s.\\-]+$";
    /** ALPHANUMERIC_SPACES_HYPHEN_PERIOD: Message */
    public static final String ALPHANUMERIC_SPACES_HYPHEN_PERIOD_MESSAGE = "This field cannot be empty! This field can include English alphabet characters, numbers, spaces, periods, and hyphens";

    /** NUMERIC: Definition */
    public static final String NUMERIC_PATTERN = "[0-9]+";
    /** NUMERIC: Message */
    public static final String NUMERIC_MESSAGE = "This field cannot be empty! Must be valid digits 0-9";

    /** EMAIL: Definition */
    public static final String EMAIL_PATTERN = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";

}
