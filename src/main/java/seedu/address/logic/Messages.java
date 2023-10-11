package seedu.address.logic;

import seedu.address.model.person.Email;

/**
 * Utility class with some useful static properties and methods related to
 * user-facing messages.
 *
 * //NOTE this class can probably be absorbed into other related classes.
 */
public class Messages {
    public static final String MESSAGE_UNKNOWN_COMMAND = "Unknown command";
    public static final String MESSAGE_INVALID_COMMAND_FORMAT = "Invalid command format!\n%s";
    public static final String MESSAGE_INVALID_PERSON_DISPLAYED_INDEX = "The person index provided is invalid";
    public static final String MESSAGE_PERSONS_LISTED_OVERVIEW = "%d persons listed!";
    public static final String MESSAGE_DUPLICATE_FIELDS =
                "Multiple values specified for the following single-valued field(s): ";

    public static final String MESSAGE_EMPTY_WORD_PARAMETER = "Word parameter cannot be empty";
    public static final String MESSAGE_SINGLE_WORD_EXPECTED = "Word parameter should be a single word";

    // Messages associated with various Commands
    public static final String MESSAGE_ADD_COMMAND_SUCCESS = "New person added: %1$s";
    public static final String MESSAGE_COMMAND_DUPLICATE_PERSON = "This person already exists in ConText";
    public static final String MESSAGE_CLEAR_COMMAND_SUCCESS = "Address book has been cleared!";
    public static final String MESSAGE_DELETE_COMMAND_SUCCESS = "Deleted Person: %1$s";
    public static final String MESSAGE_EDIT_COMMAND_SUCCESS = "Edited Person: %1$s";
    public static final String MESSAGE_EDIT_COMMAND_NOT_EDITED = "At least one field to edit must be provided.";
    public static final String MESSAGE_HELP_COMMAND_SHOW_HELP = "Opened help window.";
    public static final String MESSAGE_LIST_COMMAND_SUCCESS = "Listed all persons";
    // Exception message
    public static final String FILE_OPS_ERROR_FORMAT = "Could not save data due to the following error: %s";
    public static final String FILE_OPS_PERMISSION_ERROR_FORMAT =
            "Could not save data to file %s due to insufficient permissions to write to the file or the folder.";
    public static final String MESSAGE_Duplicate_Person_Exception = "Operation would result in duplicate persons";
    // Messages associated with Attributes constraints 
    public static final String MESSAGE_NAME_CONSTRAINTS = 
            "Names should only contain alphanumeric characters and spaces, and it should not be blank";
    public static final String MESSAGE_PHONE_CONSTRAINTS = "Phone numbers should only contain numbers, and it should be at least 3 digits long";
    public static final String MESSAGE_EMAIL_CONSTRAINTS = "Emails should be of the format local-part@domain "
            + "and adhere to the following constraints:\n"
            + "1. The local-part should only contain alphanumeric characters and these special characters, excluding "
            + "the parentheses, (" + Email.SPECIAL_CHARACTERS + "). The local-part may not start or end with any special "
            + "characters.\n"
            + "2. This is followed by a '@' and then a domain name. The domain name is made up of domain labels "
            + "separated by periods.\n"
            + "The domain name must:\n"
            + "    - end with a domain label at least 2 characters long\n"
            + "    - have each domain label start and end with alphanumeric characters\n"
            + "    - have each domain label consist of alphanumeric characters, separated only by hyphens, if any.";
    // alphanumeric and special characters
    public static final String MESSAGE_TAG_CONSTRAINTS = "Tags names should be alphanumeric";
    // Messages associated with Storage
    public static final String MESSAGE_FIELD_MISSING = "Person's %s field is missing!";
    public static final String MESSAGE_CONTAIN_DUPLICATE_PERSON = "Persons list contains duplicate person(s).";
}
