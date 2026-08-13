            package p000;
            
            public final class o000OlilI01O implements llOo0OilI {
                public final Class I00iOIl;
                public final Class I00iiI;
                public final llOl001olOi I00iiO;

                public o000OlilI01O(Class cls, Class cls2, llOl001olOi llol001oloi) {
/* 4 */             this.I00iOIl = cls;
/* 6 */             this.I00iiI = cls2;
/* 8 */             this.I00iiO = llol001oloi;
                }

                @Override
                public final llOl001olOi I00000oIO(I1ii1o0 i1ii1o0, o0IOi0io1iOo o0ioi0io1ioo) {
/* 1 */             Class cls = o0ioi0io1ioo.I00000oIO;
/* 5 */             if (cls == this.I00iOIl || cls == this.I00iiI) {
/* 14 */                return this.I00iiO;
                    }
/* 12 */            return null;
                }

                public final String toString() {
/* 3 */             String name = this.I00iiI.getName();
/* 9 */             String name2 = this.I00iOIl.getName();
/* 15 */            String strValueOf = String.valueOf(this.I00iiO);
/* 19 */            int length = name.length();
/* 41 */            StringBuilder sb = new StringBuilder(length + 14 + name2.length() + 9 + strValueOf.length() + 1);
/* 48 */            IIl001iO0Io.I001lIiIIo1O(sb, "Factory[type=", name, "+", name2);
/* 55 */            return IIlIOloOOO.I0010I0i(sb, ",adapter=", strValueOf, "]");
                }
            }
