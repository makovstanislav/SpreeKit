
import com.google.auth.Credentials
import com.google.auth.oauth2.AccessToken



@main def hello: Unit = 
  println("Hello world!")


val r = requests.post(
  "https://accounts.google.com/o/oauth2/v2/auth", 
  verifySslCerts = true,
  params = Map(
    "client_id" -> "703224658148-97jh5abats4raf5tmpcspmhjfkqv3iq5.apps.googleusercontent.com",
    "redirect_uri" -> "http://localhost",
    "response_type" -> "code",
    "scope" -> "https://www.googleapis.com/auth/spreadsheets",
    "code_challenge" -> "nfIhIh_2FBdNEyQNOgQNJjnM5NTzX5V2hqkx4yYKp0A"
  )
)

val pr = println(r)


//val r = requests.get(
    // "https://dummyapi.io/data/v1/user",
    //headers = Map("app-id" -> "629b90236a0e9b1442e4b14e")
// )

// val parsed = ujson.read(r)
// val p = println(parsed.render(indent = 4)) 


// получение spree date из листа Aggregated
// val sheets_r = requests.get(
  //  "https://sheets.googleapis.com/v4/spreadsheets/1Oi0XJ2Sdct3HbU_gbpxgPNUb7nXjadmC7PCiXZFkUps/values/Aggregated!B2:B3",
  //  params = Map(
  //    "key" -> "AIzaSyAYu36Q1hf8je9rdi8o2Eb1_3iVssyXJXg"
  //  )
// )

// val sheets_parsed = ujson.read(sheets_r)
// val sheets_parsed_print = println(sheets_parsed.render(indent = 4)) 

// добавление spree date в лист RawResponses
// val sheets_post = requests.put(
  //  "https://sheets.googleapis.com/v4/spreadsheets/1Oi0XJ2Sdct3HbU_gbpxgPNUb7nXjadmC7PCiXZFkUps/values/aggregated!B4:B3",
  //  headers = Map(
  //    "key" -> "AIzaSyAYu36Q1hf8je9rdi8o2Eb1_3iVssyXJXg"
  //  ),
  //  data = ujson.Obj("ValueRange" -> "newParticipants").render()
// )

// удаление spree date из листа RawResponses
//       "key" -> "AIzaSyAYu36Q1hf8je9rdi8o2Eb1_3iVssyXJXg",

