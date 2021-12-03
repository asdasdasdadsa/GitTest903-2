fun main() {
    println("Hello!")
    println("Первое изменение до применения Fork")
    println("Второе изменение (выполнено после операции Fork)")
    val mc = MyClass()
    mc.doAction()
}