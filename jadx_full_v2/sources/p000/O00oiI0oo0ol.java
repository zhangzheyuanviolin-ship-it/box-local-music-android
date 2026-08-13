            package p000;

            import java.util.Set;
            
/* 29 */    public final class O00oiI0oo0ol {
                public final OoOilOl1 I00000oIO;
                public final O00oiIoOo1o I00000oOI;
                public final boolean I0000Il00O;
                public final boolean I0000O;
                public final Set I0000oI00;
                public final Ol0O0iI0l0O I0001Ioi1lo;

                public O00oiI0oo0ol(OoOilOl1 ooOilOl1, boolean z, boolean z2, Set set, int i) {
/* 27 */            this(ooOilOl1, O00oiIoOo1o.I00iOIl, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, null);
                }

                public static O00oiI0oo0ol I00000oIO(O00oiI0oo0ol o00oiI0oo0ol, O00oiIoOo1o o00oiIoOo1o, boolean z, Set set, Ol0O0iI0l0O ol0O0iI0l0O, int i) {
/* 1 */             OoOilOl1 ooOilOl1 = o00oiI0oo0ol.I00000oIO;
/* 5 */             if ((i & 2) != 0) {
/* 7 */                 o00oiIoOo1o = o00oiI0oo0ol.I00000oOI;
                    }
/* 9 */             O00oiIoOo1o o00oiIoOo1o2 = o00oiIoOo1o;
/* 12 */            if ((i & 4) != 0) {
/* 14 */                z = o00oiI0oo0ol.I0000Il00O;
                    }
/* 16 */            boolean z2 = z;
/* 17 */            boolean z3 = o00oiI0oo0ol.I0000O;
/* 21 */            if ((i & 16) != 0) {
/* 23 */                set = o00oiI0oo0ol.I0000oI00;
                    }
/* 25 */            Set set2 = set;
/* 28 */            if ((i & 32) != 0) {
/* 30 */                ol0O0iI0l0O = o00oiI0oo0ol.I0001Ioi1lo;
                    }
/* 33 */            o00oiI0oo0ol.getClass();
/* 38 */            return new O00oiI0oo0ol(ooOilOl1, o00oiIoOo1o2, z2, z3, set2, ol0O0iI0l0O);
                }

                public final O00oiI0oo0ol I00000oOI(O00oiIoOo1o o00oiIoOo1o) {
/* 8 */             return I00000oIO(this, o00oiIoOo1o, false, null, null, 61);
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof O00oiI0oo0ol)) {
/* 3 */                 return false;
                    }
/* 7 */             O00oiI0oo0ol o00oiI0oo0ol = (O00oiI0oo0ol) obj;
                    return O0000Ioio00.I0000O(o00oiI0oo0ol.I0001Ioi1lo, this.I0001Ioi1lo) && o00oiI0oo0ol.I00000oIO == this.I00000oIO && o00oiI0oo0ol.I00000oOI == this.I00000oOI && o00oiI0oo0ol.I0000Il00O == this.I0000Il00O && o00oiI0oo0ol.I0000O == this.I0000O;
                }

                public final int hashCode() {
/* 1 */             Ol0O0iI0l0O ol0O0iI0l0O = this.I0001Ioi1lo;
/* 10 */            int iHashCode = ol0O0iI0l0O != null ? ol0O0iI0l0O.hashCode() : 0;
/* 20 */            int iHashCode2 = this.I00000oIO.hashCode() + (iHashCode * 31) + iHashCode;
/* 30 */            int iHashCode3 = this.I00000oOI.hashCode() + (iHashCode2 * 31) + iHashCode2;
/* 36 */            int i = (iHashCode3 * 31) + (this.I0000Il00O ? 1 : 0) + iHashCode3;
/* 42 */            return (i * 31) + (this.I0000O ? 1 : 0) + i;
                }

                public final String toString() {
/* 68 */            return "JavaTypeAttributes(howThisTypeIsUsed=" + this.I00000oIO + ", flexibility=" + this.I00000oOI + ", isRaw=" + this.I0000Il00O + ", isForAnnotationParameter=" + this.I0000O + ", visitedTypeParameters=" + this.I0000oI00 + ", defaultType=" + this.I0001Ioi1lo + ')';
                }

/* 30 */        public O00oiI0oo0ol(OoOilOl1 ooOilOl1, O00oiIoOo1o o00oiIoOo1o, boolean z, boolean z2, Set set, Ol0O0iI0l0O ol0O0iI0l0O) {
/* 32 */            this.I00000oIO = ooOilOl1;
/* 33 */            this.I00000oOI = o00oiIoOo1o;
/* 34 */            this.I0000Il00O = z;
/* 35 */            this.I0000O = z2;
/* 36 */            this.I0000oI00 = set;
/* 37 */            this.I0001Ioi1lo = ol0O0iI0l0O;
                }
            }
