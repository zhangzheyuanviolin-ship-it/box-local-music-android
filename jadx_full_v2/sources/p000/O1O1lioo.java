            package p000;

            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ConcurrentMap;
            import java.util.logging.Logger;
            
            public final class O1O1lioo implements OOIil101I0I {
                public static final Logger I00000oIO = Logger.getLogger(O1O1lioo.class.getName());
                public static final byte[] I00000oOI = {0};
                public static final O1O1lioo I0000Il00O = new O1O1lioo();

                @Override
                public final Class I00000oIO() {
/* 1 */             return O1O1I111l.class;
                }

                @Override
                public final Class I00000oOI() {
/* 1 */             return O1O1I111l.class;
                }

                @Override
                public final Object I0000Il00O(IOO000ilo iOO000ilo) throws GeneralSecurityException {
/* 9 */             Iterator it = ((ConcurrentMap) iOO000ilo.I00iiI).values().iterator();
/* 17 */            while (it.hasNext()) {
/* 33 */                for (OOIiiiO oOIiiiO : (List) it.next()) {
/* 41 */                    l0il1i0011O l0il1i0011o = oOIiiiO.I000O01llI0;
/* 45 */                    if (l0il1i0011o instanceof O1O1iOiloi) {
/* 47 */                        O1O1iOiloi o1O1iOiloi = (O1O1iOiloi) l0il1i0011o;
/* 49 */                        byte[] bArr = oOIiiiO.I0000Il00O;
/* 60 */                        IIOIlli0IO iIOIlli0IOI00000oIO = IIOIlli0IO.I00000oIO(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
/* 72 */                        if (!iIOIlli0IOI00000oIO.equals(o1O1iOiloi.I00000oIO())) {
/* 81 */                            StringBuilder sb = new StringBuilder("Mac Key with parameters ");
/* 88 */                            sb.append(o1O1iOiloi.I00000oOI());
/* 91 */                            IIOIlli0IO iIOIlli0IOI00000oIO2 = o1O1iOiloi.I00000oIO();
/* 97 */                            sb.append(" has wrong output prefix (");
/* 100 */                           sb.append(iIOIlli0IOI00000oIO2);
/* 105 */                           sb.append(") instead of (");
/* 108 */                           sb.append(iIOIlli0IOI00000oIO);
/* 113 */                           sb.append(")");
/* 123 */                           throw new GeneralSecurityException(sb.toString());
                                }
                            }
                        }
                    }
/* 126 */           O1O1lOli1 o1O1lOli1 = new O1O1lOli1();
/* 129 */           o1O1lOli1.I00000oIO = iOO000ilo;
/* 137 */           boolean zIsEmpty = ((OI00il1O) iOO000ilo.I00iio).I00000oIO.isEmpty();
/* 141 */           iolOOiI iolooii = OI00lo.I00000oIO;
/* 143 */           if (zIsEmpty) {
/* 173 */               o1O1lOli1.I00000oOI = iolooii;
/* 175 */               o1O1lOli1.I0000Il00O = iolooii;
                    } else {
/* 153 */               OI0lol oI0lol = (OI0lol) OI0o00Oo0.I00000oOI.I00000oIO.get();
/* 155 */               if (oI0lol == null) {
/* 157 */                   oI0lol = OI0o00Oo0.I0000Il00O;
                        }
/* 159 */               OI00lo.I00000oIO(iOO000ilo);
/* 162 */               oI0lol.getClass();
/* 165 */               o1O1lOli1.I00000oOI = iolooii;
/* 167 */               o1O1lOli1.I0000Il00O = iolooii;
                    }
/* 169 */           VarHandle.storeStoreFence();
/* 172 */           return o1O1lOli1;
                }
            }
