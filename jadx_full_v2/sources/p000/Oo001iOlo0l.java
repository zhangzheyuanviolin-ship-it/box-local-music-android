            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oo001iOlo0l implements Oli01I0I01 {
                public OioOIi1o0I I00000oIO;
                public OloooOlO10oI I00000oOI;
                public boolean I0000Il00O;
                public IlIoO1ilo1 I0000O;

                @Override
                public final void I00000oIO(Oi0iOio oi0iOio) {
/* 1 */             OioOIi1o0I oioOIi1o0I = this.I00000oIO;
/* 3 */             OloooOlO10oI oloooOlO10oI = this.I00000oOI;
/* 5 */             boolean z = this.I0000Il00O;
/* 7 */             I110IiI0o1Il i110IiI0o1Il = this.I0000O;
/* 9 */             oi0iOio.I000OiO(oioOIi1o0I);
/* 17 */            oi0iOio.I0000Il00O(oloooOlO10oI.I00000oIO(z, false, false));
/* 24 */            OI10lO0l oI10lO0l = oi0iOio.I00iiI.I00oli.I0000Il00O;
/* 38 */            if ((((OI10l00) Ol1l1lI1Ili.I0010o(oI10lO0l.I00iOIl, oI10lO0l)).I0000Il00O & 4) != 0) {
/* 43 */                Iiii11o0 iiii11o0 = new Iiii11o0(3);
/* 46 */                iiii11o0.I00iiO = oi0iOio;
/* 48 */                iiii11o0.I00iio = oloooOlO10oI;
/* 50 */                iiii11o0.I00iiI = z;
/* 52 */                VarHandle.storeStoreFence();
/* 55 */                oi0iOio.I00000oOI(i110IiI0o1Il, i110IiI0o1Il, iiii11o0);
                    }
                }
            }
