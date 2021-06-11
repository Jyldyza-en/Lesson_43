package kg.tutorialapp.lesson_43

object Data {

    val items = listOf<Item>(
        Item(1, "Java", R.drawable.ic_baseline_face_24),
        Item(2, "Kotliвввввввввввввввввввввввввввввввввввn", R.drawable.ic_baseline_favorite_24),
        Item(3, "Dart", R.drawable.ic_android_black_24dp)
    )

    fun getLongListOfItems(): MutableList<Any> {
        val list = mutableListOf<Any>()
        for (i in 0..100){
            list.addAll(items)
            if(i % 3 == 0){
                list.add("https://www.udemy.com/topic/dart-programming-language/")
            }
        }
        return  list
    }
}