            package p000;

            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            
            public final class IiIIi1ii111 extends OIio0oloI1I {
                public final int I00000oIO;
                public Long I00000oOI;
                public IOoOloI0iI I0000Il00O;
                public Object I0000O;

                public IiIIi1ii111(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Long I00000oIO() {
                    switch (this.I00000oIO) {
                    }
/* 6 */             return this.I00000oOI;
                }

                @Override
                public final IOoOloI0iI I00000oOI() {
                    switch (this.I00000oIO) {
                    }
/* 6 */             return this.I0000Il00O;
                }

                public final IIIoloiiI1 I0000O() {
                    switch (this.I00000oIO) {
                        case 0:
/* 36 */                    return (IIIoloiiI1) this.I0000O;
                        default:
/* 8 */                     InputStream inputStream = (InputStream) this.I0000O;
/* 10 */                    IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 12 */                    Ii1oo1ooill0 ii1oo1ooill0 = Ii1oo1ooill0.I00iiI;
/* 14 */                    int i = IIIiioi.I00000oIO;
/* 18 */                    int i2 = O0I0ooIlIiO0.I00000oIO;
/* 22 */                    Ioo00OOI0II ioo00OOI0II = new Ioo00OOI0II();
/* 25 */                    ioo00OOI0II.I00iOIl = inputStream;
/* 27 */                    VarHandle.storeStoreFence();
/* 30 */                    return new OOlI10o1ol(ioo00OOI0II, ii1oo1ooill0);
                    }
                }
            }
