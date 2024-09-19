package com.sabran.mobileappspoli.model

import com.sabran.mobileappspoli.R

data class GaleriModel(
    val gambar1 : Int
)
object Mocklist {
    fun getModel() : List<GaleriModel> {
        val itemModel1 = GaleriModel(
            R.drawable.galeri1,
        )
        val itemModel2 = GaleriModel(
            R.drawable.galeri2,
        )
        val itemModel3 = GaleriModel(
            R.drawable.galeri3,
        )
        val itemModel4 = GaleriModel(
            R.drawable.galeri4,
        )
        val itemModel5 = GaleriModel(
            R.drawable.galeri5,
        )
        val itemModel6 = GaleriModel(
            R.drawable.galeri6,
        )

        val itemList: ArrayList<GaleriModel> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)

        return itemList
    }

}


