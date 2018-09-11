package liubetskyi.serhii.kotlinfilemanager

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FilesListFragment : Fragment() {

    companion object {
        private const val ARG_PATH: String = "liubetskyi.serhii.kotlinfilemanager.fileslist.path"
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}