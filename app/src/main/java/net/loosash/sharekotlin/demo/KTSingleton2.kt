package net.loosash.sharekotlin.demo

class KTSingleton2 private constructor() {

    companion object {
        @Volatile
        private var instance: KTSingleton2? = null
            get() {
                if (field == null) {
                    field = KTSingleton2()
                }
                return field
            }
        @Synchronized
        fun get(): KTSingleton2 {
            return instance!!
        }
    }
}


//class JavaSingleton2 {
//    companion object {
//
//        @Volatile
//        private var INSTANCE: JavaSingleton2? = null
//
//        val instance: JavaSingleton2?
//            get() {
//                if (INSTANCE == null) {
//                    synchronized(JavaSingleton2::class.java) {
//                        if (INSTANCE == null) {
//                            INSTANCE = JavaSingleton2()
//                        }
//                    }
//                }
//                return INSTANCE
//            }
//    }
//}

