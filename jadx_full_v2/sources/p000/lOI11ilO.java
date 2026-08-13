            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class lOI11ilO {
                public static O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, float f, OiI111I oiI111I, long j, int i) {
/* 10 */            boolean z = Iil1010O.I00000oOI(f, 0.0f) > 0;
/* 11 */            long j2 = Io10Oi10I.I00000oIO;
/* 15 */            if ((i & 16) != 0) {
/* 17 */                j = j2;
                    }
/* 22 */            if (Iil1010O.I00000oOI(f, 0.0f) <= 0 && !z) {
/* 27 */                return o1ooiI111i;
                    }
/* 30 */            OioOIIiIi oioOIIiIi = new OioOIIiIi();
/* 33 */            oioOIIiIi.I00000oIO = f;
/* 35 */            oioOIIiIi.I00000oOI = oiI111I;
/* 37 */            oioOIIiIi.I0000Il00O = z;
/* 39 */            oioOIIiIi.I0000O = j2;
/* 41 */            oioOIIiIi.I0000oI00 = j;
/* 43 */            VarHandle.storeStoreFence();
/* 46 */            return o1ooiI111i.I0000O(oioOIIiIi);
                }
            }
