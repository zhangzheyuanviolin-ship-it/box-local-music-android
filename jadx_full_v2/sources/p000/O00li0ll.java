            package p000;

            import java.util.Collection;
            
/* 32 */    public final class O00li0ll {
                public final OIOOOO0 I00000oIO;
                public final Collection I00000oOI;
                public final boolean I0000Il00O;
                public final boolean I0000O;
                public final boolean I0000oI00;

                public O00li0ll(OIOOOO0 oioooo0, Collection collection, int i) {
/* 30 */            this(oioooo0, collection, oioooo0.I00000oIO == OIOOOO.I00iiO, (i & 8) == 0, (i & 16) == 0);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O00li0ll)) {
/* 7 */                 return false;
                    }
/* 11 */            O00li0ll o00li0ll = (O00li0ll) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o00li0ll.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o00li0ll.I00000oOI) && this.I0000Il00O == o00li0ll.I0000Il00O && this.I0000O == o00li0ll.I0000O && this.I0000oI00 == o00li0ll.I0000oI00;
                }

                public final int hashCode() {
/* 36 */            return Boolean.hashCode(this.I0000oI00) + Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31, 31, this.I0000Il00O), 31, this.I0000O);
                }

                public final String toString() {
/* 58 */            return "JavaDefaultQualifiers(nullabilityQualifier=" + this.I00000oIO + ", qualifierApplicabilityTypes=" + this.I00000oOI + ", definitelyNotNull=" + this.I0000Il00O + ", preferQualifierOverBound=" + this.I0000O + ", preferQualifierOverSupertype=" + this.I0000oI00 + ')';
                }

/* 33 */        public O00li0ll(OIOOOO0 oioooo0, Collection collection, boolean z, boolean z2, boolean z3) {
/* 35 */            this.I00000oIO = oioooo0;
/* 36 */            this.I00000oOI = collection;
/* 37 */            this.I0000Il00O = z;
/* 38 */            this.I0000O = z2;
/* 39 */            this.I0000oI00 = z3;
                }
            }
