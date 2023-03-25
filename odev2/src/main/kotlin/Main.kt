fun main(args: Array<String>) {


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

print("Bir sayı giriniz: ")
val sayi = readLine()!!.toInt()
var toplam = 0

for (i in 1 until sayi) {
    if (sayi % i == 0) {
        toplam += i
    }
}

if (toplam == sayi) {
    println("$sayi mükemmel bir sayıdır.")
} else {
    println("$sayi mükemmel bir sayı değildir.")
}
}