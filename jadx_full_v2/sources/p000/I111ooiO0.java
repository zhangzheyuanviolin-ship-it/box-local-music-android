            package p000;

            import java.util.Map;
            
            public final class I111ooiO0 implements I111oOiIiO0 {
                public final O0iIl1 I00000oIO;
                public final Map I00000oOI;
                public final OlI1o0ooI I0000Il00O;

                public I111ooiO0(Ol0O0iI0l0O ol0O0iI0l0O, Map map, OlI1o0ooI olI1o0ooI) {
/* 2 */             if (ol0O0iI0l0O == null) {
/* 22 */                I00000oIO(0);
/* 215 */               throw null;
                    }
/* 4 */             if (map == null) {
/* 17 */                I00000oIO(1);
/* 20 */                throw null;
                    }
/* 9 */             this.I00000oIO = ol0O0iI0l0O;
/* 11 */            this.I00000oOI = map;
/* 13 */            this.I0000Il00O = olI1o0ooI;
                }

                public static void I00000oIO(int i) {
/* 13 */            String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 25 */            Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
/* 31 */            if (i == 1) {
/* 56 */                objArr[0] = "valueArguments";
                    } else if (i == 2) {
/* 51 */                objArr[0] = "source";
                    } else if (i == 3 || i == 4 || i == 5) {
/* 46 */                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
                    } else {
/* 43 */                objArr[0] = "annotationType";
                    }
/* 58 */            if (i == 3) {
/* 79 */                objArr[1] = "getType";
                    } else if (i == 4) {
/* 74 */                objArr[1] = "getAllValueArguments";
                    } else if (i != 5) {
/* 64 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
                    } else {
/* 69 */                objArr[1] = "getSource";
                    }
/* 81 */            if (i != 3 && i != 4 && i != 5) {
/* 89 */                objArr[2] = "<init>";
                    }
/* 91 */            String str2 = String.format(str, objArr);
/* 95 */            if (i != 3 && i != 4 && i != 5) {
/* 186 */               throw new IllegalArgumentException(str2);
                    }
/* 186 */           throw new IllegalStateException(str2);
                }

                @Override
                public final OlI1o0ooI I0010I0i() {
/* 1 */             return this.I0000Il00O;
                }

                @Override
                public final Ill0IO I0010o() {
/* 1 */             OI000ilOol oI000ilOolI0000O = IiOiOOIo.I0000O(this);
/* 6 */             if (oI000ilOolI0000O != null) {
/* 12 */                if (Il0ooiloI.I0000oI00(oI000ilOolI0000O)) {
/* 15 */                    oI000ilOolI0000O = null;
                        }
/* 16 */                if (oI000ilOolI0000O != null) {
/* 18 */                    return IiOiOOIo.I0000Il00O(oI000ilOolI0000O);
                        }
                    }
/* 5 */             return null;
                }

                @Override
                public final Map I00111O() {
/* 1 */             Map map = this.I00000oOI;
/* 3 */             if (map != null) {
/* 5 */                 return map;
                    }
/* 7 */             I00000oIO(4);
/* 29 */            throw null;
                }

                @Override
                public final O0iIl1 getType() {
/* 1 */             O0iIl1 o0iIl1 = this.I00000oIO;
/* 3 */             if (o0iIl1 != null) {
/* 5 */                 return o0iIl1;
                    }
/* 7 */             I00000oIO(3);
/* 29 */            throw null;
                }

                public final String toString() {
/* 4 */             return IiOOllOI0io.I0000Il00O.I001IO000(this, null);
                }
            }
