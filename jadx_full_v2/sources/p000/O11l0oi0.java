            package p000;

            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public final class O11l0oi0 {
                public final boolean I00000oIO;
                public final boolean I00000oOI;
                public final Map I0000Il00O;
                public final OOOIOO1 I0000O;

                public O11l0oi0(boolean z, boolean z2, Map map, OOOIOO1 oooioo1) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = z2;
/* 8 */             this.I0000Il00O = map;
/* 10 */            this.I0000O = oooioo1;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
                public static O11l0oi0 I00000oIO(O11l0oi0 o11l0oi0, boolean z, boolean z2, LinkedHashMap linkedHashMap, OOOIOO1 oooioo1, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 z = o11l0oi0.I00000oIO;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                z2 = o11l0oi0.I00000oOI;
                    }
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
/* 15 */            if ((i & 4) != 0) {
/* 17 */                linkedHashMap2 = o11l0oi0.I0000Il00O;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                oooioo1 = o11l0oi0.I0000O;
                    }
/* 25 */            o11l0oi0.getClass();
/* 30 */            return new O11l0oi0(z, z2, linkedHashMap2, oooioo1);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 44 */                return true;
                    }
/* 6 */             if (!(obj instanceof O11l0oi0)) {
/* 42 */                return false;
                    }
/* 9 */             O11l0oi0 o11l0oi0 = (O11l0oi0) obj;
                    return this.I00000oIO == o11l0oi0.I00000oIO && this.I00000oOI == o11l0oi0.I00000oOI && this.I0000Il00O.equals(o11l0oi0.I0000Il00O) && this.I0000O == o11l0oi0.I0000O;
                }

                public final int hashCode() {
/* 28 */            return this.I0000O.hashCode() + Oi010OO0.I000iOII(this.I0000Il00O, Oi010OO0.I000OOo1O(Boolean.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31);
                }

                public final String toString() {
/* 48 */            return "LlmSingleTurnUiState(inProgress=" + this.I00000oIO + ", preparing=" + this.I00000oOI + ", responsesByModel=" + this.I0000Il00O + ", selectedPromptTemplateType=" + this.I0000O + ")";
                }
            }
