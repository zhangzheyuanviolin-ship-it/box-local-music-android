            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Date;
            import java.util.HashMap;
            
            public final class O01IiIi1l implements Il0IIIOll {
                public static final O01IOIooI0 I0001Ioi1lo;
                public static final O01IOIooI0 I000II;
                public final HashMap I00000oIO;
                public final HashMap I00000oOI;
                public final O01IO1I0 I0000Il00O;
                public boolean I0000O;
                public static final O01IO1I0 I0000oI00 = new O01IO1I0(0);
                public static final O01IOO I000O01llI0 = new O01IOO();

                /* JADX WARN: Type inference failed for: r0v1, types: [O01IOIooI0] */
                /* JADX WARN: Type inference failed for: r0v2, types: [O01IOIooI0] */
                static {
/* 3 */             final int i = 0;
/* 14 */            I0001Ioi1lo = new OoloOoIl() {
                        @Override
                        public final void encode(Object obj, Object obj2) {
                            switch (i) {
                                case 0:
/* 22 */                            ((OoloiiOiiil) obj2).add((String) obj);
                                    break;
                                default:
/* 14 */                            ((OoloiiOiiil) obj2).add(((Boolean) obj).booleanValue());
                                    break;
                            }
                        }
                    };
/* 18 */            final int i2 = 1;
/* 22 */            I000II = new OoloOoIl() {
                        @Override
                        public final void encode(Object obj, Object obj2) {
                            switch (i2) {
                                case 0:
/* 22 */                            ((OoloiiOiiil) obj2).add((String) obj);
                                    break;
                                default:
/* 14 */                            ((OoloiiOiiil) obj2).add(((Boolean) obj).booleanValue());
                                    break;
                            }
                        }
                    };
                }

                public O01IiIi1l() {
/* 6 */             HashMap map = new HashMap();
/* 9 */             this.I00000oIO = map;
/* 13 */            HashMap map2 = new HashMap();
/* 16 */            this.I00000oOI = map2;
/* 20 */            this.I0000Il00O = I0000oI00;
/* 23 */            this.I0000O = false;
/* 29 */            map2.put(String.class, I0001Ioi1lo);
/* 32 */            map.remove(String.class);
/* 39 */            map2.put(Boolean.class, I000II);
/* 42 */            map.remove(Boolean.class);
/* 49 */            map2.put(Date.class, I000O01llI0);
/* 52 */            map.remove(Date.class);
                }

                public final I0IIiO0iI I00000oIO() {
/* 5 */             I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(14);
/* 8 */             i0IIiO0iI.I00iiI = this;
/* 10 */            VarHandle.storeStoreFence();
/* 29 */            return i0IIiO0iI;
                }

                @Override
                public final Il0IIIOll registerEncoder(Class cls, OIOi0lOI oIOi0lOI) {
/* 3 */             this.I00000oIO.put(cls, oIOi0lOI);
/* 8 */             this.I00000oOI.remove(cls);
/* 89 */            return this;
                }
            }
