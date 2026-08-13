            package p000;

            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            
            public abstract class I0OOlli {
                public static final OIolII0 I00000oIO;
                public static final OIolI1l1 I00000oOI;
                public static final O0OI1o1Ii I0000Il00O;
                public static final O0OI0O I0000O;

                static {
/* 3 */             IIOIlli0IO iIOIlli0IOI00000oOI = Ooll0Ooo1.I00000oOI("type.googleapis.com/google.crypto.tink.AesCmacKey");
/* 9 */             OIolII0 oIolII0 = new OIolII0();
/* 14 */            oIolII0.I00000oIO = I0OOi0.class;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            I00000oIO = oIolII0;
/* 23 */            OIolI1l1 oIolI1l1 = new OIolI1l1();
/* 26 */            oIolI1l1.I00000oIO = iIOIlli0IOI00000oOI;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            I00000oOI = oIolI1l1;
/* 35 */            O0OI1o1Ii o0OI1o1Ii = new O0OI1o1Ii();
/* 40 */            o0OI1o1Ii.I00000oIO = I0OO1IoI0.class;
/* 42 */            VarHandle.storeStoreFence();
/* 45 */            I0000Il00O = o0OI1o1Ii;
/* 57 */            I0000O = O0OI0O.I00000oIO(new I000II(6), iIOIlli0IOI00000oOI);
                }

                public static I0OOO1l0IoO I00000oIO(OIl1lli oIl1lli) throws GeneralSecurityException {
/* 1 */             int iOrdinal = oIl1lli.ordinal();
/* 6 */             if (iOrdinal == 1) {
/* 50 */                return I0OOO1l0IoO.I0000Il00O;
                    }
/* 9 */             if (iOrdinal == 2) {
/* 47 */                return I0OOO1l0IoO.I0000oI00;
                    }
/* 12 */            if (iOrdinal == 3) {
/* 44 */                return I0OOO1l0IoO.I0001Ioi1lo;
                    }
/* 15 */            if (iOrdinal == 4) {
/* 17 */                return I0OOO1l0IoO.I0000O;
                    }
/* 43 */            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + oIl1lli.I00000oOI());
                }
            }
