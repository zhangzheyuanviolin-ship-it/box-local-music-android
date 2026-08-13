            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class II11o0IIO implements Function1 {
                public I1ii1o0 I00iOIl;
                public float I00iiI;
                public OIio1O0ll0I I00iiO;
                public III11l1I I00iio;
                public IllOOo00lI I00ilI0I1;
                public OOo0IO I00ilO0;
                public long I00io1l;
                public I0ol0lI I00ioIO;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             I1ii1o0 i1ii1o0 = this.I00iOIl;
/* 3 */             float f = this.I00iiI;
/* 5 */             OIio1O0ll0I oIio1O0ll0I = this.I00iiO;
/* 7 */             III11l1I iII11l1I = this.I00iio;
/* 9 */             IllOOo00lI illOOo00lI = this.I00ilI0I1;
/* 11 */            OOo0IO oOo0IO = this.I00ilO0;
/* 13 */            long j = this.I00io1l;
/* 15 */            I0ol0lI i0ol0lI = this.I00ioIO;
/* 17 */            IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 29 */            float fFloatValue = Float.valueOf(((Oli0o0o1) i1ii1o0.I00iiO).I00iOIl).floatValue();
/* 36 */            if (fFloatValue < 0.0f) {
/* 38 */                fFloatValue = 0.0f;
                    }
/* 44 */            if (2.0f * fFloatValue > f) {
/* 54 */                IilloIOOO0i.I00OIo(iilloIOOO0i, oIio1O0ll0I.I00000oIO, iII11l1I, 0.0f, null, null, 60);
                    } else {
/* 62 */                Io10IOI io10IOI = (Io10IOI) illOOo00lI.invoke();
/* 65 */                io10IOI.I000O01llI0(1);
/* 68 */                float f2 = oOo0IO.I00000oIO;
/* 70 */                float f3 = oOo0IO.I00000oOI;
/* 80 */                ((IIOOoll) iilloIOOO0i.I00iiI().I00iiI).I00i0oil(f2, f3);
                        try {
/* 86 */                    II11o10OOl0 iI11o10OOl0 = new II11o10OOl0(0);
/* 89 */                    iI11o10OOl0.I00iiO = oOo0IO;
/* 91 */                    iI11o10OOl0.I00iio = oIio1O0ll0I;
/* 93 */                    iI11o10OOl0.I00ilI0I1 = iII11l1I;
/* 95 */                    iI11o10OOl0.I00iiI = fFloatValue;
/* 97 */                    iI11o10OOl0.I00ilO0 = i0ol0lI;
/* 99 */                    VarHandle.storeStoreFence();
/* 102 */                   iilloIOOO0i.I000lI(j, io10IOI, iI11o10OOl0);
/* 105 */                   illII1oO.I00000oIO(iilloIOOO0i, io10IOI);
                        } finally {
/* 136 */                   ((IIOOoll) iilloIOOO0i.I00iiI().I00iiI).I00i0oil(-f2, -f3);
                        }
                    }
/* 121 */           return OoiIlOl1iI.I00000oIO;
                }
            }
