            package p000;

            import java.lang.reflect.Field;
            
/* 47 */    public final class OOoii0IoiII extends OOoiOooI {
                public OIOi0l1il I00000oOI;

                @Override
                public final Object I0000O() {
/* 3 */             return this.I00000oOI.I00000oOI();
                }

                @Override
                public final void I0001Ioi1lo(Object obj, O01loll1loll o01loll1loll, OOoiOl101 oOoiOl101) throws IllegalAccessException, IllegalArgumentException {
/* 1 */             Field field = oOoiOl101.I00000oOI;
/* 5 */             Object objI00000oOI = oOoiOl101.I0001Ioi1lo.I00000oOI(o01loll1loll);
/* 9 */             if (objI00000oOI == null && oOoiOl101.I000II) {
/* 16 */                return;
                    }
/* 19 */            if (oOoiOl101.I000O01llI0) {
/* 215 */               throw new O01Oo001("Cannot set value of 'static final' ".concat(OOoi0l1.I0000O(field, false)));
                    }
/* 21 */            field.set(obj, objI00000oOI);
                }

                @Override
/* 48 */        public final Object I0000oI00(Object obj) {
/* 49 */            return obj;
                }
            }
