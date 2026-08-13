            package p000;

            import com.google.android.play.core.assetpacks.bs;
            import java.lang.invoke.VarHandle;
            
            public abstract class liO11il {
                public static i0OOioi1OiOi I00000oIO(bs bsVar) {
/* 1 */             String str = bsVar.I00000oIO;
/* 3 */             int i = bsVar.I00000oOI;
/* 5 */             int i2 = bsVar.I0000Il00O;
/* 7 */             long j = bsVar.I0000O;
/* 9 */             long j2 = bsVar.I0000oI00;
/* 23 */            int iRint = (int) Math.rint(bsVar.I0001Ioi1lo * 100.0d);
/* 24 */            i0OOioi1OiOi i0ooioi1oioi = new i0OOioi1OiOi();
/* 27 */            if (str == null) {
/* 47 */                IOOlIIilOl0.I000II("Null name");
/* 50 */                return null;
                    }
/* 29 */            i0ooioi1oioi.I00000oIO = str;
/* 31 */            i0ooioi1oioi.I00000oOI = i;
/* 33 */            i0ooioi1oioi.I0000Il00O = i2;
/* 35 */            i0ooioi1oioi.I0000O = j;
/* 37 */            i0ooioi1oioi.I0000oI00 = j2;
/* 39 */            i0ooioi1oioi.I0001Ioi1lo = iRint;
/* 41 */            VarHandle.storeStoreFence();
/* 44 */            return i0ooioi1oioi;
                }
            }
