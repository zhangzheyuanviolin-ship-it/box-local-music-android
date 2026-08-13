            package p000;

            import android.os.Trace;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class O0llioI1 {
                public final Function1 I00000oIO;
                public final IoIlOo1o0IIl I00000oOI;
                public I1ii1l10IO I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;

                public O0llioI1(Function1 function1) {
/* 9 */             IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(22, false);
/* 12 */            long[] jArr = OiO10oio.I00000oIO;
/* 19 */            ioIlOo1o0IIl.I00iiI = new OI10I1IoI0Ol();
/* 21 */            VarHandle.storeStoreFence();
/* 24 */            this.I00000oOI = ioIlOo1o0IIl;
/* 27 */            this.I0000O = -1;
/* 29 */            this.I0000oI00 = -1;
/* 31 */            this.I00000oIO = function1;
                }

                public final O0llilIO0 I00000oIO(int i, long j, boolean z, Function1 function1) {
/* 1 */             I1ii1l10IO i1ii1l10IO = this.I0000Il00O;
/* 3 */             if (i1ii1l10IO == null) {
/* 88 */                return Iio1II1oIOo.I00000oIO;
                    }
/* 9 */             OOI1lioOOo0 oOI1lioOOo0 = (OOI1lioOOo0) i1ii1l10IO.I0000O;
/* 11 */            boolean z2 = oOI1lioOOo0 instanceof I0oo0lloI;
/* 15 */            OOI1io1Ioo oOI1io1Ioo = new OOI1io1Ioo(i1ii1l10IO, i, this.I00000oOI, function1);
/* 22 */            oOI1io1Ioo.I0000O = IOo0oO11ll1O.I00000oIO(j);
/* 24 */            if (!z2) {
/* 78 */                oOI1lioOOo0.I00000oIO(oOI1io1Ioo);
                    } else if (z) {
/* 29 */                I0oo0lloI i0oo0lloI = (I0oo0lloI) oOI1lioOOo0;
/* 38 */                i0oo0lloI.I00iiI.add(new OOIl01(1, oOI1io1Ioo));
/* 43 */                if (!i0oo0lloI.I00iiO) {
/* 45 */                    i0oo0lloI.I00iiO = true;
/* 49 */                    i0oo0lloI.I00iOIl.post(i0oo0lloI);
                        }
                    } else {
/* 53 */                I0oo0lloI i0oo0lloI2 = (I0oo0lloI) oOI1lioOOo0;
/* 63 */                i0oo0lloI2.I00iiI.add(new OOIl01(0, oOI1io1Ioo));
/* 68 */                if (!i0oo0lloI2.I00iiO) {
/* 70 */                    i0oo0lloI2.I00iiO = true;
/* 74 */                    i0oo0lloI2.I00iOIl.post(i0oo0lloI2);
                        }
                    }
/* 84 */            Trace.setCounter("compose:lazy:schedule_prefetch:index", i);
/* 87 */            return oOI1io1Ioo;
                }
            }
