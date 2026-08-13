            package p000;

            import java.util.ArrayList;
            
            public abstract class lOliOi11oo1 {
                public static final long I00000oIO(Oo0iil0o0oI oo0iil0o0oI, int i, boolean z, boolean z2) {
/* 1 */             OI0OIIiOi oI0OIIiOi = oo0iil0o0oI.I00000oOI;
/* 3 */             long j = oo0iil0o0oI.I0000Il00O;
/* 11 */            if (oI0OIIiOi.I0000O(i) >= oI0OIIiOi.I0001Ioi1lo) {
/* 13 */                return 9205357640488583168L;
                    }
/* 48 */            boolean z3 = oo0iil0o0oI.I00000oIO(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == oo0iil0o0oI.I000OOo1O(i);
/* 49 */            oI0OIIiOi.I000l1(i);
/* 60 */            int length = ((I1111OO10i) oI0OIIiOi.I00000oIO.I00iiI).I00iiI.length();
/* 64 */            ArrayList arrayList = oI0OIIiOi.I000O01llI0;
/* 81 */            OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(i == length ? IOOi1I.I000II(arrayList) : l1i1Il1il1.I00000oIO(i, arrayList));
/* 83 */            I0oilIol11i i0oilIol11i = oIoiIo0o1O.I00000oIO;
/* 85 */            int iI0000O = oIoiIo0o1O.I0000O(i);
/* 89 */            Oo0iOioO oo0iOioO = i0oilIol11i.I0000Il00O;
/* 143 */           return (Float.floatToRawIntBits(lIiioliIlo.I00000oOI(z3 ? oo0iOioO.I000OOo1O(iI0000O, false) : oo0iOioO.I000OiO(iI0000O, false), 0.0f, (int) (j >> 32))) << 32) | (Float.floatToRawIntBits(lIiioliIlo.I00000oOI(oI0OIIiOi.I00000oOI(r3), 0.0f, (int) (j & 4294967295L))) & 4294967295L);
                }
            }
