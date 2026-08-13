            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iO01II {
                public static OIo1i1 I00000oIO(int i, float f) {
/* 4 */             if ((i & 1) != 0) {
/* 6 */                 f = 0.0f;
                    }
/* 9 */             float f2 = (i & 2) == 0 ? 8.0f : 0.0f;
/* 16 */            return new OIo1i1(f, f2, f, f2);
                }

                public static OIo1i1 I00000oOI(float f, float f2, float f3, int i) {
/* 4 */             if ((i & 1) != 0) {
/* 6 */                 f = 0.0f;
                    }
/* 13 */            float f4 = (i & 2) != 0 ? 0.0f : 16.0f;
/* 17 */            if ((i & 4) != 0) {
/* 19 */                f2 = 0.0f;
                    }
/* 22 */            if ((i & 8) != 0) {
/* 24 */                f3 = 0.0f;
                    }
/* 27 */            return new OIo1i1(f, f4, f2, f3);
                }

                public static final float I0000Il00O(OIo1Oi1l1lI oIo1Oi1l1lI, O0iOOoiioO o0iOOoiioO) {
                    return o0iOOoiioO == O0iOOoiioO.I00iOIl ? oIo1Oi1l1lI.I0000Il00O(o0iOOoiioO) : oIo1Oi1l1lI.I00000oOI(o0iOOoiioO);
                }

                public static final float I0000O(OIo1Oi1l1lI oIo1Oi1l1lI, O0iOOoiioO o0iOOoiioO) {
                    return o0iOOoiioO == O0iOOoiioO.I00iOIl ? oIo1Oi1l1lI.I00000oOI(o0iOOoiioO) : oIo1Oi1l1lI.I0000Il00O(o0iOOoiioO);
                }

                public static final O1ooiI111i I0000oI00(O1ooiI111i o1ooiI111i, OIo1Oi1l1lI oIo1Oi1l1lI) {
/* 3 */             OIo1i0OiI oIo1i0OiI = new OIo1i0OiI();
/* 6 */             oIo1i0OiI.I00000oIO = oIo1Oi1l1lI;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            return o1ooiI111i.I0000O(oIo1i0OiI);
                }

                public static final O1ooiI111i I0001Ioi1lo(O1ooiI111i o1ooiI111i, float f) {
/* 6 */             return o1ooiI111i.I0000O(new OIo11iIo001(f, f, f, f));
                }

                public static final O1ooiI111i I000II(O1ooiI111i o1ooiI111i, float f, float f2) {
/* 6 */             return o1ooiI111i.I0000O(new OIo11iIo001(f, f2, f, f2));
                }

                public static O1ooiI111i I000O01llI0(O1ooiI111i o1ooiI111i, float f, float f2, int i) {
/* 4 */             if ((i & 1) != 0) {
/* 6 */                 f = 0.0f;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                f2 = 0.0f;
                    }
/* 12 */            return I000II(o1ooiI111i, f, f2);
                }

                public static final O1ooiI111i I000OOo1O(O1ooiI111i o1ooiI111i, float f, float f2, float f3, float f4) {
/* 6 */             return o1ooiI111i.I0000O(new OIo11iIo001(f, f2, f3, f4));
                }

                public static O1ooiI111i I000OiO(O1ooiI111i o1ooiI111i, float f, float f2, float f3, float f4, int i) {
/* 4 */             if ((i & 1) != 0) {
/* 6 */                 f = 0.0f;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                f2 = 0.0f;
                    }
/* 14 */            if ((i & 4) != 0) {
/* 16 */                f3 = 0.0f;
                    }
/* 19 */            if ((i & 8) != 0) {
/* 21 */                f4 = 0.0f;
                    }
/* 22 */            return I000OOo1O(o1ooiI111i, f, f2, f3, f4);
                }
            }
