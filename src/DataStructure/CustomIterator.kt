package DataStructure

import DataStructure.Node.CustomNode
import FunctionModules.DataStructure.DataStructureType

class CustomIterator(private val start : CustomNode?) : Iterator<Any?>{
    private var initVal : CustomNode? = null
    override fun hasNext(): Boolean {
        if(start == null){
            return false
        }
        return initVal?.nextNode == null
    }

    override fun next(): Any? {
        initVal = if(initVal == null){
            start
        }else{
            initVal?.nextNode
        }
        return initVal?.nodeValue
    }
}