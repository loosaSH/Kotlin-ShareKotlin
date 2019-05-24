//package net.loosash.sharekotlin.demo
//
//import kotlin.properties.ReadOnlyProperty
//import kotlin.reflect.KProperty
//
//class KTDelegate {
//
//}
//
//
//class ResourceDelegate<T> : ReadOnlyProperty<API, T> {
//    override fun getValue(thisRef: API, property: KProperty<*>): T {
//        return 1 as T
//    }
//}
//
//class ResourceLoader<T>(id: T) {
//    operator fun provideDelegate(
//        thisRef: API,
//        prop: KProperty<*>
//    ): ReadOnlyProperty<API, T> {
//        checkProperty(thisRef, prop.name)
//        // 创建委托
//        return ResourceDelegate()
//    }
//
//    private fun checkProperty(thisRef: API, name: String) {
//        println("do check")
//    }
//
//    private operator fun getValue(t: T?, property: KProperty<T?>): T {
//        return 2 as T
//    }
//
//
//
//}
//
//class API {
//    fun getDoor(id: Int): ResourceLoader<Int> {
//        return ResourceLoader(id)
//    }
//
////    val image by bindResource(1)
////    val text by bindResource(2)
//}
//
//
//fun main() {
//    val api = API()
//
//    val image by api.getDoor(2)
//
////    myUI.image
//}