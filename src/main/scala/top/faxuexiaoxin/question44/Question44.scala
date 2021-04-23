package top.faxuexiaoxin.question44

import java.util.Objects

class Question44 {
    def isMatch(s: String, p: String): Boolean = {
        //如果 s 和 p 同时为"" "" 那么匹配成功

        if(Objects.isNull(s) || Objects.isNull(p)){
            return false
        }

        if(s.isEmpty && p.isEmpty){
            return true
        }else if (s.isEmpty && !p.isEmpty){
            for(i<-p if !i.equals('*')){
                return false
            }
            return true
        }else if(!s.isEmpty && p.isEmpty){
            return false
        }else{
            if(p(0).equals('?') || p(0).equals(s(0))){
                return isMatch(s.substring(1),p.substring(1))
            }

            if(p(0).equals('*')){
                return isMatch(s.substring(1),p) || isMatch(s,p.substring(1)) || isMatch(s.substring(1),p.substring(1))
            }

            if(!p(0).equals(s(0))){
                return false
            }
        }
        false
    }
}
