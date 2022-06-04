
@main def hello: Unit = 
  println("Hello world!")

val r = requests.get(
    "https://dummyapi.io/data/v1/user",
    headers = Map("app-id" -> "629b90236a0e9b1442e4b14e")
)

val parsed = ujson.read(r)
val p = println(parsed.render(indent = 4)) 

