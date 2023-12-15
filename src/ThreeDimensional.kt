interface ThreeDimensional: TwoDimensional {
    fun calculateVolume(): Double

    override fun calculateArea(): Double {
        TODO("Not yet implemented")
    }
}