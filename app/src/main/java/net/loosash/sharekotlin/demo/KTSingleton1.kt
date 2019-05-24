package net.loosash.sharekotlin.demo

object KTSingleton1


class JavaSingleton2 {

    companion object {
        @Volatile
        private var INSTANCE: JavaSingleton2? = null

        val instance: JavaSingleton2?
            get() {
                if (INSTANCE == null) {
                    synchronized(JavaSingleton2::class.java) {
                        if (INSTANCE == null) {
                            INSTANCE = JavaSingleton2()
                        }
                    }
                }
                return INSTANCE
            }
    }
}