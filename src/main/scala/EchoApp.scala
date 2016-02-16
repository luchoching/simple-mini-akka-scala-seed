import akka.actor.{PoisonPill, Props, ActorSystem, Actor}

class Echoer extends Actor {
  def receive = {
    case m:String =>
      println(m)
  }
}

object EchoApp extends App {
  val system = ActorSystem("echosystem")
  val echoer = system.actorOf(Props[Echoer], "echoer")

  echoer ! "Hello!"
  echoer ! PoisonPill
  system.terminate
}