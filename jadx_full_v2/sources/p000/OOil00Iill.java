            package p000;

            import java.util.Objects;
            import java.util.Set;
            
            public final class OOil00Iill {
                public boolean I00000oIO;
                public Set I00000oOI;
                public Set I0000Il00O;

                public final boolean I00000oIO(Class cls, boolean z) {
/* 7 */             if (this.I00000oOI.contains(cls)) {
/* 25 */                return true;
                    }
                    return !this.I0000Il00O.contains(cls) && this.I00000oIO && z;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof OOil00Iill)) {
/* 3 */                 return false;
                    }
/* 8 */             if (this == obj) {
/* 7 */                 return true;
                    }
/* 11 */            OOil00Iill oOil00Iill = (OOil00Iill) obj;
                    return this.I00000oIO == oOil00Iill.I00000oIO && Objects.equals(this.I00000oOI, oOil00Iill.I00000oOI) && Objects.equals(this.I0000Il00O, oOil00Iill.I0000Il00O);
                }

                public final int hashCode() {
/* 15 */            return Objects.hash(Boolean.valueOf(this.I00000oIO), this.I00000oOI, this.I0000Il00O);
                }

                public final String toString() {
/* 38 */            return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.I00000oIO + ", forceEnabledQuirks=" + this.I00000oOI + ", forceDisabledQuirks=" + this.I0000Il00O + '}';
                }
            }
