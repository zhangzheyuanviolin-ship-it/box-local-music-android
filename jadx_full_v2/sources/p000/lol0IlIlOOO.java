            package p000;

            import java.lang.reflect.Field;
            
/* 27 */    public final class lol0IlIlOOO extends loio01lO {
                public lo11I0lO I00000oOI;

                @Override
                public final Object I0000Il00O() {
/* 3 */             return this.I00000oOI.zza();
                }

                @Override
                public final void I0000O(Object obj, o0IlOioo o0iloioo, loill0OOio loill0ooio) throws IllegalAccessException, IllegalArgumentException {
/* 1 */             Field field = loill0ooio.I00000oIO;
/* 5 */             Object objI00000oIO = loill0ooio.I0000Il00O.I00000oIO(o0iloioo);
/* 9 */             if (objI00000oIO == null && loill0ooio.I0000O) {
/* 16 */                return;
                    }
/* 19 */            if (loill0ooio.I0000oI00) {
/* 98 */                throw new llIIooI0iolO("Cannot set value of 'static final' ".concat(o01l0i.I00000oOI(field, false)), 25);
                    }
/* 21 */            field.set(obj, objI00000oIO);
                }

                @Override
/* 28 */        public final Object I0000oI00(Object obj) {
/* 29 */            return obj;
                }
            }
