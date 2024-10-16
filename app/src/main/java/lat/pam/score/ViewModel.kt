package lat.pam.score

import androidx. lifecycle.ViewModel

class ViewModel : ViewModel() {
    var num= 7
    fun increase() {
        num++
    }
}