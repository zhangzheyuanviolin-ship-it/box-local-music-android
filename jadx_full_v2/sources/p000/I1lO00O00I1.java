            package p000;

            import android.util.Size;
            import java.lang.invoke.VarHandle;
            import java.util.Map;
            
            public final class I1lO00O00I1 {
                public Size I00000oIO;
                public Map I00000oOI;
                public Size I0000Il00O;
                public Map I0000O;
                public Size I0000oI00;
                public Map I0001Ioi1lo;
                public Map I000II;
                public Map I000O01llI0;
                public Map I000OOo1O;

                public static I1lO00O00I1 I00000oIO(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4, Map map5, Map map6) {
/* 3 */             I1lO00O00I1 i1lO00O00I1 = new I1lO00O00I1();
/* 7 */             if (size == null) {
/* 89 */                IOOlIIilOl0.I000II("Null analysisSize");
/* 6 */                 return null;
                    }
/* 9 */             i1lO00O00I1.I00000oIO = size;
/* 11 */            if (map == null) {
/* 83 */                IOOlIIilOl0.I000II("Null s720pSizeMap");
/* 6 */                 return null;
                    }
/* 13 */            i1lO00O00I1.I00000oOI = map;
/* 15 */            i1lO00O00I1.I0000Il00O = size2;
/* 17 */            if (map2 == null) {
/* 77 */                IOOlIIilOl0.I000II("Null s1440pSizeMap");
/* 6 */                 return null;
                    }
/* 19 */            i1lO00O00I1.I0000O = map2;
/* 21 */            if (size3 == null) {
/* 71 */                IOOlIIilOl0.I000II("Null recordSize");
/* 6 */                 return null;
                    }
/* 23 */            i1lO00O00I1.I0000oI00 = size3;
/* 25 */            if (map3 == null) {
/* 65 */                IOOlIIilOl0.I000II("Null maximumSizeMap");
/* 6 */                 return null;
                    }
/* 27 */            i1lO00O00I1.I0001Ioi1lo = map3;
/* 29 */            if (map4 == null) {
/* 59 */                IOOlIIilOl0.I000II("Null maximum4x3SizeMap");
/* 6 */                 return null;
                    }
/* 31 */            i1lO00O00I1.I000II = map4;
/* 33 */            if (map5 == null) {
/* 53 */                IOOlIIilOl0.I000II("Null maximum16x9SizeMap");
/* 6 */                 return null;
                    }
/* 35 */            i1lO00O00I1.I000O01llI0 = map5;
/* 37 */            if (map6 == null) {
/* 47 */                IOOlIIilOl0.I000II("Null ultraMaximumSizeMap");
/* 6 */                 return null;
                    }
/* 39 */            i1lO00O00I1.I000OOo1O = map6;
/* 41 */            VarHandle.storeStoreFence();
/* 44 */            return i1lO00O00I1;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1lO00O00I1) {
/* 10 */                I1lO00O00I1 i1lO00O00I1 = (I1lO00O00I1) obj;
/* 20 */                if (this.I00000oIO.equals(i1lO00O00I1.I00000oIO) && this.I00000oOI.equals(i1lO00O00I1.I00000oOI) && this.I0000Il00O.equals(i1lO00O00I1.I0000Il00O) && this.I0000O.equals(i1lO00O00I1.I0000O) && this.I0000oI00.equals(i1lO00O00I1.I0000oI00) && this.I0001Ioi1lo.equals(i1lO00O00I1.I0001Ioi1lo) && this.I000II.equals(i1lO00O00I1.I000II) && this.I000O01llI0.equals(i1lO00O00I1.I000O01llI0) && this.I000OOo1O.equals(i1lO00O00I1.I000OOo1O)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 74 */            return this.I000OOo1O.hashCode() ^ ((((((((((((((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode()) * 1000003) ^ this.I0000Il00O.hashCode()) * 1000003) ^ this.I0000O.hashCode()) * 1000003) ^ this.I0000oI00.hashCode()) * 1000003) ^ this.I0001Ioi1lo.hashCode()) * 1000003) ^ this.I000II.hashCode()) * 1000003) ^ this.I000O01llI0.hashCode()) * 1000003);
                }

                public final String toString() {
/* 98 */            return "SurfaceSizeDefinition{analysisSize=" + this.I00000oIO + ", s720pSizeMap=" + this.I00000oOI + ", previewSize=" + this.I0000Il00O + ", s1440pSizeMap=" + this.I0000O + ", recordSize=" + this.I0000oI00 + ", maximumSizeMap=" + this.I0001Ioi1lo + ", maximum4x3SizeMap=" + this.I000II + ", maximum16x9SizeMap=" + this.I000O01llI0 + ", ultraMaximumSizeMap=" + this.I000OOo1O + "}";
                }
            }
