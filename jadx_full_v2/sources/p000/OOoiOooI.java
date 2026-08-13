            package p000;

            import java.io.IOException;
            import java.lang.reflect.InvocationTargetException;
            import java.util.Iterator;
            import java.util.Map;
            
            public abstract class OOoiOooI extends OoO00O1IiOl {
                public final OOoiiiilO I00000oIO;

                public OOoiOooI(OOoiiiilO oOoiiiilO) {
/* 4 */             this.I00000oIO = oOoiiiilO;
                }

                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 8 */             if (o01loll1loll.peek() == 9) {
/* 10 */                o01loll1loll.I00ioIO();
/* 7 */                 return null;
                    }
/* 14 */            Object objI0000O = I0000O();
/* 20 */            Map map = this.I00000oIO.I00000oIO;
                    try {
/* 22 */                o01loll1loll.I0000Il00O();
/* 29 */                while (o01loll1loll.I00IOO()) {
/* 39 */                    OOoiOl101 oOoiOl101 = (OOoiOl101) map.get(o01loll1loll.I00iOIl());
/* 41 */                    if (oOoiOl101 == null) {
/* 43 */                        o01loll1loll.I00oooO();
                            } else {
/* 49 */                        I0001Ioi1lo(objI0000O, o01loll1loll, oOoiOl101);
                            }
                        }
/* 53 */                o01loll1loll.I00100l0();
/* 56 */                return I0000oI00(objI0000O);
                    } catch (IllegalAccessException e) {
/* 61 */                lIo000I lio000i = OOoi0l1.I00000oIO;
/* 65 */                OIiilo1Ool0o.I000iOII("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
/* 7 */                 return null;
                    } catch (IllegalStateException e2) {
/* 186 */               throw new O01Oo001(e2);
                    }
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException, IllegalArgumentException, InvocationTargetException {
/* 1 */             if (obj == null) {
/* 3 */                 o01ooi1IIiiO.I00IOO();
/* 6 */                 return;
                    }
/* 7 */             o01ooi1IIiiO.I000II();
                    try {
/* 14 */                Iterator it = this.I00000oIO.I00000oOI.iterator();
/* 22 */                while (it.hasNext()) {
/* 30 */                    ((OOoiOl101) it.next()).I00000oIO(o01ooi1IIiiO, obj);
                        }
/* 34 */                o01ooi1IIiiO.I00100l0();
                    } catch (IllegalAccessException e) {
/* 39 */                lIo000I lio000i = OOoi0l1.I00000oIO;
/* 43 */                OIiilo1Ool0o.I000iOII("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                    }
                }

                public abstract Object I0000O();

                public abstract Object I0000oI00(Object obj);

                public abstract void I0001Ioi1lo(Object obj, O01loll1loll o01loll1loll, OOoiOl101 oOoiOl101);
            }
