            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            
/* 13 */    public final class O0IiIOO extends IOo0i1 {
                public O0IiIOO(IOIOo1o iOIOo1o) {
/* 3 */             O0Ii1li1lo o0Ii1li1lo = new O0Ii1li1lo();
/* 6 */             o0Ii1li1lo.I00000oIO = iOIOo1o;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            super(o0Ii1li1lo);
                }

                @Override
                public final O0iIl1 I00000oIO(OI0010oo1o oI0010oo1o) {
                    O0iIl1 o0iIl1I00000oOI;
/* 3 */             OoOI1i1i.I00iiI.getClass();
/* 6 */             OoOI1i1i ooOI1i1i = OoOI1i1i.I00iiO;
/* 8 */             O0i1lI0o1io o0i1lI0o1ioI0000O = oI0010oo1o.I0000O();
/* 12 */            o0i1lI0o1ioI0000O.getClass();
/* 21 */            OI000ilOol oI000ilOolI000OiO = o0i1lI0o1ioI0000O.I000OiO(OlIllOO11lOl.I00O0i0ii.I000OOo1O());
/* 27 */            Object obj = this.I00000oIO;
/* 30 */            O0Ii1oOl01 o0Ii1oOl01 = (O0Ii1oOl01) obj;
/* 34 */            if (o0Ii1oOl01 instanceof O0Ii1O0ioiiI) {
/* 38 */                o0iIl1I00000oOI = ((O0Ii1O0ioiiI) obj).I00000oIO;
                    } else {
/* 43 */                if (!(o0Ii1oOl01 instanceof O0Ii1li1lo)) {
/* 115 */                   I000II.I00000oIO();
/* 118 */                   return null;
                        }
/* 47 */                IOIOo1o iOIOo1o = ((O0Ii1li1lo) obj).I00000oIO;
/* 49 */                IOIOill iOIOill = iOIOo1o.I00000oIO;
/* 51 */                int i = iOIOo1o.I00000oOI;
/* 53 */                OI000ilOol oI000ilOolI00000oIO = ilOOOOloO.I00000oIO(oI0010oo1o, iOIOill);
/* 57 */                if (oI000ilOolI00000oIO == null) {
/* 73 */                    o0iIl1I00000oOI = Il0ooiloI.I00000oOI(Il0ooO1IO.I00iio, iOIOill.toString(), String.valueOf(i));
                        } else {
/* 82 */                    O0iIl1 o0iIl1I000O01llI0 = lOoliOIOlIO0.I000O01llI0(oI000ilOolI00000oIO.I00Ol10());
/* 87 */                    for (int i2 = 0; i2 < i; i2++) {
/* 89 */                        O0i1lI0o1io o0i1lI0o1ioI0000O2 = oI0010oo1o.I0000O();
/* 93 */                        Ooo0Ioii0o0 ooo0Ioii0o0 = Ooo0Ioii0o0.I00iiO;
/* 95 */                        o0iIl1I000O01llI0 = o0i1lI0o1ioI0000O2.I000O01llI0(o0iIl1I000O01llI0);
                            }
/* 102 */                   o0iIl1I00000oOI = o0iIl1I000O01llI0;
                        }
                    }
/* 110 */           return l0loOIIo0iOo.I00000oOI(ooOI1i1i, oI000ilOolI000OiO, Collections.singletonList(new OlIo1I(o0iIl1I00000oOI)));
                }

/* 14 */        public O0IiIOO(IOIOill iOIOill, int i) {
/* 15 */            this(new IOIOo1o(iOIOill, i));
                }
            }
