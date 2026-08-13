            package p000;

            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            
            public final class I0OOO01 extends O0OIoll1 {
                public static final OOIOlI0lIO I0000oI00;

                static {
/* 4 */             I000II i000ii = new I000II(5);
/* 9 */             OOIOlI0lIO oOIOlI0lIO = new OOIOlI0lIO();
/* 12 */            oOIOlI0lIO.I00000oOI = i000ii;
/* 16 */            oOIOlI0lIO.I00000oIO = I0OO1IoI0.class;
/* 18 */            VarHandle.storeStoreFence();
/* 21 */            I0000oI00 = oOIOlI0lIO;
                }

                public static void I000iOII(I0OOl1o0oO i0OOl1o0oO) {
/* 7 */             if (i0OOl1o0oO.I001l0I00() < 10) {
/* 26 */                IioIoO10iOiI.I000oI1ioi("tag size too short");
                    } else {
/* 15 */                if (i0OOl1o0oO.I001l0I00() <= 16) {
/* 17 */                    return;
                        }
/* 20 */                IioIoO10iOiI.I000oI1ioi("tag size too long");
                    }
                }

                @Override
                public final String I0000O() {
/* 1 */             return "type.googleapis.com/google.crypto.tink.AesCmacKey";
                }

                @Override
                public final I00i01iIIliI I0001Ioi1lo() {
/* 5 */             return new I0OOIoIloi(I0OO1o1ooI.class);
                }

                @Override
                public final O0O1ii I000II() {
/* 1 */             return O0O1ii.SYMMETRIC;
                }

                @Override
                public final I01Iio10lo I000O01llI0(IIOI1Ii1I iIOI1Ii1I) {
/* 5 */             return I0OO0l00IIO.I001lloI(iIOI1Ii1I, Il1llO11O.I00000oIO());
                }

                @Override
                public final void I000OiO(I01Iio10lo i01Iio10lo) throws GeneralSecurityException {
/* 1 */             I0OO0l00IIO i0OO0l00IIO = (I0OO0l00IIO) i01Iio10lo;
/* 7 */             Oolo11o0IIio.I0000Il00O(i0OO0l00IIO.I001lIiIIo1O());
/* 20 */            if (i0OO0l00IIO.I001iOo1i0O().size() == 32) {
/* 26 */                I000iOII(i0OO0l00IIO.I001l0I00());
                    } else {
/* 32 */                IioIoO10iOiI.I000oI1ioi("AesCmacKey size wrong, must be 32 bytes");
                    }
                }
            }
