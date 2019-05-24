package net.loosash.sharekotlin.demo

class KTSingleton4 private constructor(private val property: Int) {


    companion object {
        @Volatile
        private var instance: KTSingleton4? = null

        fun getInstance(property: Int) =
            instance ?: synchronized(this) {
                instance
                    ?: KTSingleton4(property).also { instance = it }
            }
    }

}



