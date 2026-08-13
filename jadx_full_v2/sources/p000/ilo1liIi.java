            package p000;

            import java.util.List;
            
            public final class ilo1liIi extends iloOil0O1 {
                @Override
                public final List I00000oIO(Object obj, long j) {
/* 5 */             iliiiioo iliiiiooVar = (iliiiioo) l00iIli.I000II(obj, j);
/* 12 */            if (((iilOi0ioo1) iliiiiooVar).I00iOIl) {
/* 37 */                return iliiiiooVar;
                    }
/* 14 */            int size = iliiiiooVar.size();
/* 24 */            iliiiioo iliiiiooVarZzd = iliiiiooVar.zzd(size == 0 ? 10 : size + size);
/* 28 */            l00iIli.I000OiO(obj, j, iliiiiooVarZzd);
/* 37 */            return iliiiiooVarZzd;
                }

                @Override
                public final void I00000oOI(long j, Object obj) {
/* 7 */             iilOi0ioo1 iiloi0ioo1 = (iilOi0ioo1) ((iliiiioo) l00iIli.I000II(obj, j));
/* 11 */            if (iiloi0ioo1.I00iOIl) {
/* 14 */                iiloi0ioo1.I00iOIl = false;
                    }
                }

                @Override
                public final void I0000Il00O(Object obj, long j, Object obj2) {
/* 5 */             iliiiioo iliiiiooVarZzd = (iliiiioo) l00iIli.I000II(obj, j);
/* 11 */            iliiiioo iliiiiooVar = (iliiiioo) l00iIli.I000II(obj2, j);
/* 13 */            int size = iliiiiooVarZzd.size();
/* 17 */            int size2 = iliiiiooVar.size();
/* 21 */            if (size > 0 && size2 > 0) {
/* 30 */                if (!((iilOi0ioo1) iliiiiooVarZzd).I00iOIl) {
/* 33 */                    iliiiiooVarZzd = iliiiiooVarZzd.zzd(size2 + size);
                        }
/* 37 */                iliiiiooVarZzd.addAll(iliiiiooVar);
                    }
/* 40 */            if (size > 0) {
/* 43 */                iliiiiooVar = iliiiiooVarZzd;
                    }
/* 44 */            l00iIli.I000OiO(obj, j, iliiiiooVar);
                }
            }
