/*
 * BEFORE RUNNING:
 * ---------------
 * 1. If not already done, enable the Google Sheets API
 *    and check the quota for your project at
 *    https://console.developers.google.com/apis/api/sheets
 * 2. Install the Java client library on Maven or Gradle. Check installation
 *    instructions at https://github.com/google/google-api-java-client.
 *    On other build systems, you can add the jar files to your project from
 *    https://developers.google.com/resources/api-libraries/download/sheets/v4/java
 */
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.UpdateValuesResponse;
import com.google.api.services.sheets.v4.model.ValueRange;
import java.io.IOException;
import java.security.GeneralSecurityException;
//один класс - один файл
public class SheetsExample { //что это????????
  public static void main(String... args) throws IOException, GeneralSecurityException { //тоже?????
    // The ID of the spreadsheet to update.
    String spreadsheetId = "1Oi0XJ2Sdct3HbU_gbpxgPNUb7nXjadmC7PCiXZFkUps"; // TODO: Update placeholder value.

    // The A1 notation of the values to update.
    String range = "RawResponses!A2"; // TODO: Update placeholder value.

    // How the input data should be interpreted.
    String valueInputOption = "1"; // TODO: Update placeholder value.

    // TODO: Assign values to desired fields of `requestBody`. All existing
    // fields will be replaced:
    ValueRange requestBody = new ValueRange(); //тоже????

    Sheets sheetsService = createSheetsService(); //тоже???
    Sheets.Spreadsheets.Values.Update request = //тоже????
        sheetsService.spreadsheets().values().update(spreadsheetId, range, requestBody);
    request.setValueInputOption(valueInputOption);

    UpdateValuesResponse response = request.execute();

    // TODO: Change code below to process the `response` object:
    System.out.println(response);
  }

  public static Sheets createSheetsService() throws IOException, GeneralSecurityException {
    NetHttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
    JsonFactory jsonFactory = JacksonFactory.getDefaultInstance();

    // TODO: Change placeholder below to generate authentication credentials. See
    // https://developers.google.com/sheets/quickstart/java#step_3_set_up_the_sample
    //
    // Authorize using one of the following scopes:
    //   "https://www.googleapis.com/auth/drive"
    //   "https://www.googleapis.com/auth/drive.file"
    //   "https://www.googleapis.com/auth/spreadsheets"
    Credential credential = SheetsQuickstart.getCredentials(httpTransport);

    return new Sheets.Builder(httpTransport, jsonFactory, credential)
        .setApplicationName("Google-SheetsSample/0.1")
        .build();
  }
}