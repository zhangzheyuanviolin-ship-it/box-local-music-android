            package p000;

            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class Ilio1l00 implements Function1 {
                public int I00iOIl;
                public List I00iiI;
                public List I00iiO;
                public O1iOIoOiO0 I00iio;
                public float I00ilI0I1;
                public OO1I0001000i I00ilO0;

                @Override
                public final Object invoke(Object obj) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             List list = this.I00iiI;
/* 7 */             List list2 = this.I00iiO;
/* 9 */             O1iOIoOiO0 o1iOIoOiO0 = this.I00iio;
/* 11 */            float f = this.I00ilI0I1;
/* 13 */            OO1I0001000i oO1I0001000i = this.I00ilO0;
/* 17 */            OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 19 */            int i2 = 0;
/* 20 */            int i3 = 0;
/* 21 */            while (i2 < i) {
/* 27 */                OO1I0001000i oO1I0001000i2 = (OO1I0001000i) list.get(i2);
/* 33 */                OO1I0001000i oO1I0001000i3 = (OO1I0001000i) list2.get(i2);
/* 47 */                int iI00l0OO0IO = o1iOIoOiO0.I00l0OO0IO(f) + Math.max(oO1I0001000i2.I00iiI, oO1I0001000i3.I00iiI);
/* 77 */                int i4 = i;
/* 89 */                long jRound = (Math.round(0.0f) & 4294967295L) | (Math.round((1.0f + (o1iOIoOiO0.getLayoutDirection() == O0iOOoiioO.I00iOIl ? 1.0f : -1.0f)) * 0.0f) << 32);
/* 97 */                OO11o0IO.I000iOII(oO11o0IO, oO1I0001000i2, (int) (jRound >> 32), ((int) (jRound & 4294967295L)) + i3);
/* 102 */               OO11o0IO.I000iOII(oO11o0IO, oO1I0001000i3, oO1I0001000i.I00iOIl, i3);
/* 105 */               i3 += iI00l0OO0IO;
/* 106 */               i2++;
/* 108 */               i = i4;
/* 110 */               list = list;
                    }
/* 113 */           return OoiIlOl1iI.I00000oIO;
                }
            }
