            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public abstract class iOillilIolO {
                public static final IIllII I00000oIO(String str, String str2, I1l0i11iIiI i1l0i11iIiI) {
/* 5 */             ArrayList arrayListI000OiO = IOOi1I.I000OiO(str);
/* 9 */             if (str2 != null) {
/* 11 */                arrayListI000OiO.add(str2);
                    }
/* 16 */            IIllII iIllII = new IIllII();
/* 19 */            iIllII.I00000oIO = arrayListI000OiO;
/* 21 */            iIllII.I00000oOI = i1l0i11iIiI;
/* 31 */            lII1OI11o1I.I00000oIO("Camera ID set cannot be empty.", !arrayListI000OiO.isEmpty());
/* 34 */            VarHandle.storeStoreFence();
/* 98 */            return iIllII;
                }
            }
