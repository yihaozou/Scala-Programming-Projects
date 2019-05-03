
case class AppContext(message: String)
implicit val myAppCtx: AppContext = AppContext("implicit world")

def greeting(prefix: String)(implicit appCtx: AppContext): String =
  prefix + appCtx.message

println(greeting("hello "))



