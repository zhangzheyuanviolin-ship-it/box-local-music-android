            package p000;

            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            
            public final class Io1lOiII0 extends O0OIoll1 {
                public static final OOIOlI0lIO I0000oI00;

                static {
/* 5 */             IioIoO10iOiI iioIoO10iOiI = new IioIoO10iOiI(27);
/* 10 */            OOIOlI0lIO oOIOlI0lIO = new OOIOlI0lIO();
/* 13 */            oOIOlI0lIO.I00000oOI = iioIoO10iOiI;
/* 17 */            oOIOlI0lIO.I00000oIO = Io1lIilI1II.class;
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            I0000oI00 = oOIOlI0lIO;
                }

                public Io1lOiII0() {
/* 16 */            super(Io1lI0.class, new I0OO1oilIOl[]{new I0OO1oilIOl(10, O1O1I111l.class)});
                }

                public static O0OIol0o I000iOII(int i, int i2, Io1IOo0o10ol io1IOo0o10ol, int i3) {
/* 3 */             Io1lIll1 io1lIll1I001lllioOl = Io1lOi.I001lllioOl();
/* 7 */             Io1li1i011O io1li1i011OI001lllioOl = Io1lilII0O1.I001lllioOl();
/* 11 */            io1li1i011OI001lllioOl.I0000oI00();
/* 18 */            ((Io1lilII0O1) io1li1i011OI001lllioOl.I00iiI).I001lloI(io1IOo0o10ol);
/* 21 */            io1li1i011OI001lllioOl.I0000oI00();
/* 28 */            ((Io1lilII0O1) io1li1i011OI001lllioOl.I00iiI).I00II0Ol1O0l(i2);
/* 35 */            Io1lilII0O1 io1lilII0O1 = (Io1lilII0O1) io1li1i011OI001lllioOl.I00000oOI();
/* 37 */            io1lIll1I001lllioOl.I0000oI00();
/* 44 */            ((Io1lOi) io1lIll1I001lllioOl.I00iiI).I00II0oii1o(io1lilII0O1);
/* 47 */            io1lIll1I001lllioOl.I0000oI00();
/* 54 */            ((Io1lOi) io1lIll1I001lllioOl.I00iiI).I00II0Ol1O0l(i);
/* 63 */            return new O0OIol0o((Io1lOi) io1lIll1I001lllioOl.I00000oOI(), i3);
                }

                public static void I000l1(Io1lI0 io1lI0) {
/* 5 */             Oolo11o0IIio.I0000Il00O(io1lI0.I001lllioOl());
/* 18 */            if (io1lI0.I001l0I00().size() >= 16) {
/* 24 */                I000lI(io1lI0.I001lIiIIo1O());
                    } else {
/* 30 */                IioIoO10iOiI.I000oI1ioi("key too short");
                    }
                }

                public static void I000lI(Io1lilII0O1 io1lilII0O1) throws GeneralSecurityException {
/* 7 */             if (io1lilII0O1.I001lIiIIo1O() < 10) {
/* 107 */               IioIoO10iOiI.I000oI1ioi("tag size too small");
/* 186 */               return;
                    }
/* 13 */            int iOrdinal = io1lilII0O1.I001l0I00().ordinal();
/* 20 */            if (iOrdinal == 1) {
/* 98 */                if (io1lilII0O1.I001lIiIIo1O() <= 20) {
/* 100 */                   return;
                        }
/* 101 */               IioIoO10iOiI.I000oI1ioi("tag size too big");
/* 104 */               return;
                    }
/* 23 */            if (iOrdinal == 2) {
/* 85 */                if (io1lilII0O1.I001lIiIIo1O() <= 48) {
/* 100 */                   return;
                        }
/* 88 */                IioIoO10iOiI.I000oI1ioi("tag size too big");
/* 91 */                return;
                    }
/* 26 */            if (iOrdinal == 3) {
/* 72 */                if (io1lilII0O1.I001lIiIIo1O() <= 32) {
/* 100 */                   return;
                        }
/* 75 */                IioIoO10iOiI.I000oI1ioi("tag size too big");
                    } else if (iOrdinal == 4) {
/* 59 */                if (io1lilII0O1.I001lIiIIo1O() <= 64) {
/* 100 */                   return;
                        }
/* 62 */                IioIoO10iOiI.I000oI1ioi("tag size too big");
                    } else if (iOrdinal != 5) {
/* 49 */                IioIoO10iOiI.I000oI1ioi("unknown hash type");
                    } else {
/* 40 */                if (io1lilII0O1.I001lIiIIo1O() <= 28) {
/* 100 */                   return;
                        }
/* 43 */                IioIoO10iOiI.I000oI1ioi("tag size too big");
                    }
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             return 2;
                }

                @Override
                public final String I0000O() {
/* 1 */             return "type.googleapis.com/google.crypto.tink.HmacKey";
                }

                @Override
                public final I00i01iIIliI I0001Ioi1lo() {
/* 3 */             return new I0OOIoIloi(this);
                }

                @Override
                public final O0O1ii I000II() {
/* 1 */             return O0O1ii.SYMMETRIC;
                }

                @Override
                public final I01Iio10lo I000O01llI0(IIOI1Ii1I iIOI1Ii1I) {
/* 5 */             return Io1lI0.I00II0Ol1O0l(iIOI1Ii1I, Il1llO11O.I00000oIO());
                }

                @Override
                public final void I000OiO(I01Iio10lo i01Iio10lo) {
/* 3 */             I000l1((Io1lI0) i01Iio10lo);
                }
            }
