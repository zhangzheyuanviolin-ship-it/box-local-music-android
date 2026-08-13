            package p000;

            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            
            public abstract class Io1lilllio1 {
                public static final OIolII0 I00000oIO;
                public static final OIolI1l1 I00000oOI;
                public static final O0OI1o1Ii I0000Il00O;
                public static final O0OI0O I0000O;

                static {
/* 3 */             IIOIlli0IO iIOIlli0IOI00000oOI = Ooll0Ooo1.I00000oOI("type.googleapis.com/google.crypto.tink.HmacKey");
/* 9 */             OIolII0 oIolII0 = new OIolII0();
/* 14 */            oIolII0.I00000oIO = Io1li0o.class;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            I00000oIO = oIolII0;
/* 23 */            OIolI1l1 oIolI1l1 = new OIolI1l1();
/* 26 */            oIolI1l1.I00000oIO = iIOIlli0IOI00000oOI;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            I00000oOI = oIolI1l1;
/* 35 */            O0OI1o1Ii o0OI1o1Ii = new O0OI1o1Ii();
/* 40 */            o0OI1o1Ii.I00000oIO = Io1lIilI1II.class;
/* 42 */            VarHandle.storeStoreFence();
/* 45 */            I0000Il00O = o0OI1o1Ii;
/* 58 */            I0000O = O0OI0O.I00000oIO(new IioIoO10iOiI(28), iIOIlli0IOI00000oOI);
                }

                public static I0i0io0oOOi I00000oIO(Io1IOo0o10ol io1IOo0o10ol) throws GeneralSecurityException {
/* 1 */             int iOrdinal = io1IOo0o10ol.ordinal();
/* 6 */             if (iOrdinal == 1) {
/* 56 */                return I0i0io0oOOi.I00ilO0;
                    }
/* 9 */             if (iOrdinal == 2) {
/* 53 */                return I0i0io0oOOi.I00l0I0l0lO1;
                    }
/* 12 */            if (iOrdinal == 3) {
/* 50 */                return I0i0io0oOOi.I00ioIO;
                    }
/* 15 */            if (iOrdinal == 4) {
/* 47 */                return I0i0io0oOOi.I00l0OO0IO;
                    }
/* 18 */            if (iOrdinal == 5) {
/* 20 */                return I0i0io0oOOi.I00io1l;
                    }
/* 46 */            throw new GeneralSecurityException("Unable to parse HashType: " + io1IOo0o10ol.I00000oOI());
                }

                public static Io1lOlI I00000oOI(OIl1lli oIl1lli) throws GeneralSecurityException {
/* 1 */             int iOrdinal = oIl1lli.ordinal();
/* 6 */             if (iOrdinal == 1) {
/* 50 */                return Io1lOlI.I0000Il00O;
                    }
/* 9 */             if (iOrdinal == 2) {
/* 47 */                return Io1lOlI.I0000oI00;
                    }
/* 12 */            if (iOrdinal == 3) {
/* 44 */                return Io1lOlI.I0001Ioi1lo;
                    }
/* 15 */            if (iOrdinal == 4) {
/* 17 */                return Io1lOlI.I0000O;
                    }
/* 43 */            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + oIl1lli.I00000oOI());
                }
            }
