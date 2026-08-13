            package p000;
            
            public abstract class OoOi1Ol implements OoOI1Ooo1 {
                public abstract Ooo0Ioii0o0 I00000oIO();

                public abstract O0iIl1 I00000oOI();

                public abstract boolean I0000Il00O();

                public abstract OoOi1Ol I0000O(O0iIoIOO0O0 o0iIoIOO0O0);

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 49 */                return true;
                    }
/* 6 */             if (!(obj instanceof OoOi1Ol)) {
/* 47 */                return false;
                    }
/* 9 */             OoOi1Ol ooOi1Ol = (OoOi1Ol) obj;
                    return I0000Il00O() == ooOi1Ol.I0000Il00O() && I00000oIO() == ooOi1Ol.I00000oIO() && I00000oOI().equals(ooOi1Ol.I00000oOI());
                }

                public final int hashCode() {
/* 5 */             int iHashCode = I00000oIO().hashCode();
/* 17 */            if (OoOilo0Oliii.I000lI(I00000oOI())) {
/* 21 */                return (iHashCode * 31) + 19;
                    }
/* 43 */            return (iHashCode * 31) + (I0000Il00O() ? 17 : I00000oOI().hashCode());
                }

                public final String toString() {
/* 5 */             if (I0000Il00O()) {
/* 7 */                 return "*";
                    }
/* 16 */            if (I00000oIO() == Ooo0Ioii0o0.I00iiO) {
/* 22 */                return I00000oOI().toString();
                    }
/* 51 */            return I00000oIO() + " " + I00000oOI();
                }
            }
