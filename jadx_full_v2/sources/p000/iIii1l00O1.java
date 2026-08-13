            package p000;

            import java.util.ArrayList;
            
            public interface iIii1l00O1 {
                static iO0iIIoO11 I0001Ioi1lo(iIii1l00O1 iiii1l00o1, iOO00I0O ioo00i0o, OillOo0 oillOo0, ArrayList arrayList) {
/* 1 */             String str = ioo00i0o.I00iOIl;
/* 8 */             if (iiii1l00o1.I000OOo1O(str)) {
/* 10 */                iO0iIIoO11 io0iiioo11I0000O = iiii1l00o1.I0000O(str);
/* 16 */                if (io0iiioo11I0000O instanceof iIIoIiOoOoiO) {
/* 20 */                    return ((iIIoIiOoOoiO) io0iiioo11I0000O).I00000oIO(oillOo0, arrayList);
                        }
/* 31 */                I000II.I000iOII(Oi010OO0.I00111O(str, " is not a function"));
/* 7 */                 return null;
                    }
/* 41 */            if ("hasOwnProperty".equals(str)) {
/* 44 */                ll00I0ii.I00000oIO("hasOwnProperty", 1, arrayList);
                        return iiii1l00o1.I000OOo1O(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzc()) ? iO0iIIoO11.I00i0oil : iO0iIIoO11.I00iIO;
                    }
/* 84 */            I000II.I000iOII(IIl001iO0Io.I000o00OoI0I("Object has no function ", str));
/* 7 */             return null;
                }

                iO0iIIoO11 I0000O(String str);

                void I0000oI00(String str, iO0iIIoO11 io0iiioo11);

                boolean I000OOo1O(String str);
            }
