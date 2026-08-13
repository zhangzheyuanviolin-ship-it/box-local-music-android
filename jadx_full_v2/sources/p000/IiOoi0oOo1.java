            package p000;

            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import java.util.logging.Logger;
            
            public final class IiOoi0oOo1 implements OOIil101I0I {
                public static final Logger I00000oIO = Logger.getLogger(IiOoi0oOo1.class.getName());
                public static final IiOoi0oOo1 I00000oOI = new IiOoi0oOo1();

                @Override
                public final Class I00000oIO() {
/* 1 */             return IiOoOl0oIOi.class;
                }

                @Override
                public final Class I00000oOI() {
/* 1 */             return IiOoOl0oIOi.class;
                }

                @Override
                public final Object I0000Il00O(IOO000ilo iOO000ilo) throws GeneralSecurityException {
/* 3 */             IiOoi0iOi1 iiOoi0iOi1 = new IiOoi0iOi1();
/* 6 */             iiOoi0iOi1.I00000oIO = iOO000ilo;
/* 14 */            boolean zIsEmpty = ((OI00il1O) iOO000ilo.I00iio).I00000oIO.isEmpty();
/* 18 */            iolOOiI iolooii = OI00lo.I00000oIO;
/* 20 */            if (zIsEmpty) {
/* 50 */                iiOoi0iOi1.I00000oOI = iolooii;
/* 52 */                iiOoi0iOi1.I0000Il00O = iolooii;
                    } else {
/* 30 */                OI0lol oI0lol = (OI0lol) OI0o00Oo0.I00000oOI.I00000oIO.get();
/* 32 */                if (oI0lol == null) {
/* 34 */                    oI0lol = OI0o00Oo0.I0000Il00O;
                        }
/* 36 */                OI00lo.I00000oIO(iOO000ilo);
/* 39 */                oI0lol.getClass();
/* 42 */                iiOoi0iOi1.I00000oOI = iolooii;
/* 44 */                iiOoi0iOi1.I0000Il00O = iolooii;
                    }
/* 46 */            VarHandle.storeStoreFence();
/* 49 */            return iiOoi0iOi1;
                }
            }
