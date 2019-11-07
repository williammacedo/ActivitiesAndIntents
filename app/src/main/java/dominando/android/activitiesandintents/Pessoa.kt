package dominando.android.activitiesandintents

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pessoa(var nome: String, var idade: Int) : Parcelable