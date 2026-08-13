            package p000;

            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class OlllloIl implements Function1 {
                public OOo0lO I00iOIl;
                public float I00iiI;
                public ArrayList I00iiO;
                public ArrayList I00iio;
                public OiOoi1OOoOO I00ilI0I1;
                public O1iOIoOiO0 I00ilO0;
                public int I00io1l;
                public ArrayList I00ioIO;
                public int I00l0I0l0lO1;
                public int I00l0OO0IO;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             OOo0lO oOo0lO = this.I00iOIl;
/* 3 */             float f = this.I00iiI;
/* 5 */             ArrayList arrayList = this.I00iiO;
/* 7 */             ArrayList arrayList2 = this.I00iio;
/* 9 */             OiOoi1OOoOO oiOoi1OOoOO = this.I00ilI0I1;
/* 11 */            O1iOIoOiO0 o1iOIoOiO0 = this.I00ilO0;
/* 13 */            int i = this.I00io1l;
/* 15 */            ArrayList arrayList3 = this.I00ioIO;
/* 17 */            int i2 = this.I00l0I0l0lO1;
/* 19 */            int i3 = this.I00l0OO0IO;
/* 21 */            OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 23 */            oOo0lO.I00iOIl = f;
/* 25 */            int size = arrayList.size();
/* 31 */            for (int i4 = 0; i4 < size; i4++) {
/* 45 */                OO11o0IO.I000iOII(oO11o0IO, (OO1I0001000i) arrayList.get(i4), oO11o0IO.I00l0OO0IO(oOo0lO.I00iOIl), 0);
                        oOo0lO.I00iOIl += ((Olll1Oi) arrayList3.get(i4)).I00000oOI;
                    }
/* 64 */            int size2 = arrayList2.size();
/* 69 */            for (int i5 = 0; i5 < size2; i5++) {
/* 75 */                OO1I0001000i oO1I0001000i = (OO1I0001000i) arrayList2.get(i5);
/* 102 */               OO11o0IO.I000iOII(oO11o0IO, oO1I0001000i, Math.max(0, (oO11o0IO.I00l0OO0IO(((Olll1Oi) arrayList3.get(i2)).I00000oOI) - oO1I0001000i.I00iOIl) / 2), i3 - oO1I0001000i.I00iiI);
                    }
/* 108 */           OiOl01il10lO oiOl01il10lO = oiOoi1OOoOO.I00000oIO;
/* 110 */           Integer num = oiOoi1OOoOO.I0000O;
/* 112 */           if (num == null || num.intValue() != i2) {
/* 125 */               oiOoi1OOoOO.I0000O = Integer.valueOf(i2);
/* 131 */               Olll1Oi olll1Oi = (Olll1Oi) IOOi0Ool1i.I00II0oii1o(i2, arrayList3);
/* 133 */               if (olll1Oi != null) {
/* 139 */                   Olll1Oi olll1Oi2 = (Olll1Oi) IOOi0Ool1i.I00Io1o110i(arrayList3);
/* 150 */                   int iI00l0OO0IO = o1iOIoOiO0.I00l0OO0IO(olll1Oi2.I00000oIO + olll1Oi2.I00000oOI) + i;
/* 157 */                   int iI000II = iI00l0OO0IO - oiOl01il10lO.I0001Ioi1lo.I000II();
/* 176 */                   int iI00l0OO0IO2 = o1iOIoOiO0.I00l0OO0IO(olll1Oi.I00000oIO) - ((iI000II / 2) - (o1iOIoOiO0.I00l0OO0IO(olll1Oi.I00000oOI) / 2));
/* 177 */                   int i6 = iI00l0OO0IO - iI000II;
/* 178 */                   if (i6 < 0) {
/* 180 */                       i6 = 0;
                            }
/* 181 */                   int iI0000Il00O = lIiioliIlo.I0000Il00O(iI00l0OO0IO2, 0, i6);
/* 191 */                   if (oiOl01il10lO.I00000oIO.I000II() != iI0000Il00O) {
/* 203 */                       iOi1II01i0.I0000O(oiOoi1OOoOO.I00000oOI, null, null, new I1oO0ooi001(oiOoi1OOoOO, iI0000Il00O, null, 7), 3);
                            }
                        }
                    }
/* 206 */           return OoiIlOl1iI.I00000oIO;
                }
            }
