            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIl00ilIo implements Oli01I0I01 {
                public OioOIi1o0I I00000oIO;
                public OloooOlO10oI I00000oOI;
                public boolean I0000Il00O;
                public boolean I0000O;
                public float I0000oI00;
                public IlIoO1ilo1 I0001Ioi1lo;
                public float I000II;

                @Override
                public final void I00000oIO(Oi0iOio oi0iOio) {
/* 1 */             OioOIi1o0I oioOIi1o0I = this.I00000oIO;
/* 3 */             OloooOlO10oI oloooOlO10oI = this.I00000oOI;
/* 5 */             boolean z = this.I0000Il00O;
/* 7 */             boolean z2 = this.I0000O;
/* 9 */             float f = this.I0000oI00;
/* 11 */            I110IiI0o1Il i110IiI0o1Il = this.I0001Ioi1lo;
/* 13 */            float f2 = this.I000II;
/* 15 */            oi0iOio.I000OiO(oioOIi1o0I);
/* 23 */            oi0iOio.I0000Il00O(oloooOlO10oI.I00000oIO(z, z2, false));
/* 30 */            lOi10iiOi.I00000oIO(oi0iOio, f, oloooOlO10oI.I0000O(z, z2, false));
/* 37 */            OI10lO0l oI10lO0l = oi0iOio.I00iiI.I00oli.I0000Il00O;
/* 51 */            if ((((OI10l00) Ol1l1lI1Ili.I0010o(oI10lO0l.I00iOIl, oI10lO0l)).I0000Il00O & 4) != 0) {
/* 55 */                OIl0Iiooo1ol oIl0Iiooo1ol = new OIl0Iiooo1ol();
/* 58 */                oIl0Iiooo1ol.I00iOIl = oi0iOio;
/* 60 */                oIl0Iiooo1ol.I00iiI = oloooOlO10oI;
/* 62 */                oIl0Iiooo1ol.I00iiO = z;
/* 64 */                oIl0Iiooo1ol.I00iio = z2;
/* 66 */                oIl0Iiooo1ol.I00ilI0I1 = f2;
/* 68 */                VarHandle.storeStoreFence();
/* 71 */                oi0iOio.I00000oOI(i110IiI0o1Il, i110IiI0o1Il, oIl0Iiooo1ol);
                    }
                }
            }
