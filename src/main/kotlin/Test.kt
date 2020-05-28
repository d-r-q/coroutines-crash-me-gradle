
suspend fun cloneStorage() {
    suspend fun copyNs(from: MutableMap<Any, Any>, to: MutableMap<Any, Any>) {
        from.forEach {
            to.put(it, from.get(it)!!)
        }
        from.forEach {
            copyNs(from, to)
        }
    }
    copyNs(hashMapOf(), hashMapOf())
}
