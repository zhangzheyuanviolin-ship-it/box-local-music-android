            package p000;

            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            
            public final class Io00Iioo {
                public final I01Ilioliio I00000oIO;
                public final Object I00000oOI;
                public final I01Ilioliio I0000Il00O;
                public final Io0010Ill I0000O;
                public final Method I0000oI00;

                public Io00Iioo(I01Ilioliio i01Ilioliio, Object obj, I01Ilioliio i01Ilioliio2, Io0010Ill io0010Ill, Class cls) {
/* 5 */             if (i01Ilioliio == null) {
/* 86 */                I000II.I000iOII("Null containingTypeDefaultInstance");
/* 966 */               throw null;
                    }
/* 11 */            if (io0010Ill.I00iiI == i011io1o0i.I00ilO0 && i01Ilioliio2 == null) {
/* 18 */                I000II.I000iOII("Null messageDefaultInstance");
/* 21 */                throw null;
                    }
/* 22 */            this.I00000oIO = i01Ilioliio;
/* 24 */            this.I00000oOI = obj;
/* 26 */            this.I0000Il00O = i01Ilioliio2;
/* 28 */            this.I0000O = io0010Ill;
/* 36 */            if (!Iooili11110O.class.isAssignableFrom(cls)) {
/* 81 */                this.I0000oI00 = null;
/* 83 */                return;
                    }
                    try {
/* 50 */                this.I0000oI00 = cls.getMethod("valueOf", Integer.TYPE);
                    } catch (NoSuchMethodException e) {
/* 54 */                String name = cls.getName();
/* 77 */                OIiilo1Ool0o.I000iOII(IIlIOloOOO.I0010I0i(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
/* 80 */                throw null;
                    }
                }

                public final Object I00000oIO(Object obj) {
/* 9 */             if (this.I0000O.I00iiI.I00iOIl != i011loO.ENUM) {
/* 186 */               return obj;
                    }
                    try {
/* 20 */                return this.I0000oI00.invoke(null, (Integer) obj);
                    } catch (IllegalAccessException e) {
/* 53 */                OIiilo1Ool0o.I000iOII("Couldn't use Java reflection to implement protocol message reflection.", e);
/* 19 */                return null;
                    } catch (InvocationTargetException e2) {
/* 26 */                Throwable cause = e2.getCause();
/* 32 */                if (cause instanceof RuntimeException) {
/* 49 */                    throw ((RuntimeException) cause);
                        }
/* 36 */                if (cause instanceof Error) {
/* 46 */                    throw ((Error) cause);
                        }
/* 40 */                OIiilo1Ool0o.I000iOII("Unexpected exception thrown by generated accessor method.", cause);
/* 19 */                return null;
                    }
                }

                public final Object I00000oOI(Object obj) {
                    return this.I0000O.I00iiI.I00iOIl == i011loO.ENUM ? Integer.valueOf(((Iooili11110O) obj).I00000oIO()) : obj;
                }
            }
