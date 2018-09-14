package liubetskyi.serhii.kotlinfilemanager

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FilesListFragment : Fragment() {

    companion object {
        private const val ARG_PATH: String = "liubetskyi.serhii.kotlinfilemanager.fileslist.path"
        fun build(block: Builder.() -> Unit) { Builder().apply(block).build() }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_files_list, container, false)
    }

    class Builder {
        var path: String = ""

        fun build(): FilesListFragment {
            val fragment = FilesListFragment()
            val args = Bundle()
            args.putString(ARG_PATH, path)
            fragment.arguments = args;
            return fragment
        }
    }
}