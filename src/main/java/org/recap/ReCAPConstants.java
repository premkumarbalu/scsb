
package org.recap;

/**
 * Created by premkb on 19/8/16.
 */
public class ReCAPConstants {

    public static final String FAILURE = "Failure";
    public static final String SUCCESS = "Success";

    public static final String DATE_OF_DEACCESSION = "DateOfDeAccession";
    public static final String OWNING_INSTITUTION = "OwningInstitution";
    public static final String BARCODE = "Barcode";
    public static final String OWNING_INSTITUTION_BIB_ID = "OwningInstitutionBibId";
    public static final String TITLE = "Title";
    public static final String COLLECTION_GROUP_CODE = "CollectionGroupCode";
    public static final String STATUS = "Status";
    public static final String REASON_FOR_FAILURE = "ReasonForFailure";

    public static final String ITEM_BARCDE_DOESNOT_EXIST = "Item Barcode doesn't exist in SCSB database.";
    public static final String CUSTOMER_CODE_DOESNOT_EXIST = "Customer Code doesn't exist in SCSB database.";
    public static final String REQUESTED_ITEM_DEACCESSIONED = "The requested item has already been DeAccessioned.";

    public static final String FS_DE_ACCESSION_SUMMARY_REPORT_Q = "scsbactivemq:queue:fsDeAccessionSummaryReportQ";
    public static final String FTP_DE_ACCESSION_SUMMARY_REPORT_Q = "scsbactivemq:queue:ftpDeAccessionSummaryReportQ";

    public static final String FS_DE_ACCESSION_SUMMARY_REPORT_ID = "fsDeAccessionSummaryReportQ";
    public static final String FTP_DE_ACCESSION_SUMMARY_REPORT_ID = "ftpDeAccessionSummaryReportQ";

    public static final String DATE_FORMAT_FOR_FILE_NAME = "ddMMMyyyyHHmmss";
    public static final String DEACCESSION_SUMMARY_REPORT = "DeAccession_Summary_Report";
    public static final String DEACCESSION_REPORT = "DeAccession_Report";
    public static final String FILE_SYSTEM = "FileSystem";
    public static final String FTP = "FTP";

    public static final String ERROR_DESCRIPTION = "ErrorDescription";
    public static final String OWNING_INSTITUTION_HOLDINGS_ID = "OwningInstitutionHoldingsId";

    public static final String LOCAL_ITEM_ID = "LocalItemId";
    public static final String ITEM_BARCODE = "ItemBarcode";
    public static final String CUSTOMER_CODE = "CustomerCode";
    public static final String COLLECTION_GROUP_DESIGNATION = "CollectionGroupDesignation";
    public static final String CREATE_DATE_ITEM = "CreateDateItem";
    public static final String LAST_UPDATED_DATE_ITEM = "LastUpdatedDateItem";

    public static final String COLUMBIA = "CUL";
    public static final String PRINCETON = "PUL";
    public static final String NYPL = "NYPL";

    public static final String RESPONSE_DATE = "Date";

    public static final String REGEX_FOR_EMAIL_ADDRESS = "^[A-Za-z0-9+_.-]+@(.+)$";
    public static final String INVALID_REQUEST_INSTITUTION = "Please enter valid Institution PUL/CUL/NYPL for requestingInstitution";
    public static final String INVALID_EMAIL_ADDRESS = "Please enter valid emailAddress";
    public static final String START_PAGE_AND_END_PAGE_REQUIRED = "Startpage and endpage information is required for the request type EDD";
    public static final String INVALID_PAGE_NUMBER = "Page number should starts with 1";
    public static final String INVALID_END_PAGE = "End page should not be 0 and less than or equal to start page";
    public static final String DELIVERY_LOCATION_REQUIRED = "Delivery Location is required for request type Recall/hold/retrieval";
    public static final String EMPTY_PATRON_BARCODE = "Patron barcode should not be null or empty.Please enter the valid patron barcode";
    public static final String INVALID_REQUEST_TYPE = "Please enter the valid request type";
    public static final String RETRIEVAL = "Retrieval";
    public static final String HOLD = "Hold";
    public static final String RECALL = "Recall";
    public static final String EDD_REQUEST = "EDD";
    public static final String BORROW_DIRECT = "Borrow Direct";
    public static final String PHYSICAL_REQUEST = "Physical";
    public static final String VALID_REQUEST = "All request parameters are valid.Patron is eligible to raise a request";
    public static final String VALID_PATRON = "Patron validated successfully.";
    public static final String AVAILABLE = "Available";

    // Retrieval,EDD, Hold, Recall, Borrow Direct
    public static final String REQUEST_TYPE_RETRIEVAL="Retrieval";
    public static final String REQUEST_TYPE_EDD="EDD";
    public static final String REQUEST_TYPE_HOLD="Hold";
    public static final String REQUEST_TYPE_RECALL="Recall";
    public static final String REQUEST_TYPE_BORROW_DIRECT="Borrow Direct";

    // MQ URI
    public static final String REQUEST_ITEM_QUEUE = "scsbactivemq:queue:RequestItemQ";
    public static final String REQUEST_TYPE_QUEUE_HEADER = "RequestType";


    public static final String URL_REQUEST_ITEM_INFORMATION="requestItem/itemInformation";
    public static final String URL_REQUEST_ITEM_HOLD="requestItem/holdItem";
    public static final String URL_REQUEST_ITEM_RECALL="requestItem/recallItem";
    public static final String URL_REQUEST_ITEM_CREATEBIB="requestItem/createBib";

    public static final String DATADUMP_NO_RECORD = "There is no data to export.";
    public static final String DATADUMP_PROCESS_STARTED = "Export process has started and we will send an email notification upon completion";

    public static final String INVALID_SCSB_XML_FORMAT_MESSAGE = "Please provide valid SCSB xml format";
    public static final String INVALID_MARC_XML_FORMAT_MESSAGE = "Please provide valid Marc xml format";
    public static final String SUBMIT_COLLECTION_INTERNAL_ERROR = "Internal error occured during submit collection";


}
