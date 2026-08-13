            package p000;

            import kotlin.Metadata;
            import kotlin.jvm.functions.Function3;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIill1IlI1oO0;", "LO1oooooIio;", "LIillIill1IO1;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class Iill1IlI1oO0 extends O1oooooIio {
                public static final Iil0iiOiI I000OOo1O = new Iil0iiOiI(2);
                public Ol111o0 I00000oIO;
                public OIilII I00000oOI;
                public boolean I0000Il00O;
                public OI0lOIiOIOOo I0000O;
                public boolean I0000oI00;
                public IillI1lo11l0 I0001Ioi1lo;
                public Function3 I000II;
                public boolean I000O01llI0;

                @Override
                public final O1ooOo I000II() {
/* 3 */             Ol111o0 ol111o0 = this.I00000oIO;
/* 5 */             OIilII oIilII = this.I00000oOI;
/* 7 */             boolean z = this.I0000Il00O;
/* 9 */             OI0lOIiOIOOo oI0lOIiOIOOo = this.I0000O;
/* 11 */            boolean z2 = this.I0000oI00;
/* 13 */            IillI1lo11l0 iillI1lo11l0 = this.I0001Ioi1lo;
/* 15 */            Function3 function3 = this.I000II;
/* 17 */            boolean z3 = this.I000O01llI0;
/* 21 */            IillIill1IO1 iillIill1IO1 = new IillIill1IO1(I000OOo1O, z, oI0lOIiOIOOo, oIilII);
/* 24 */            iillIill1IO1.I010OIo1l = ol111o0;
/* 26 */            iillIill1IO1.I010i10l = z2;
/* 28 */            iillIill1IO1.I010iIIOlo = iillI1lo11l0;
/* 30 */            iillIill1IO1.I010ioo = function3;
/* 32 */            iillIill1IO1.I010l10O = z3;
/* 55 */            return iillIill1IO1;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
                    boolean z;
/* 2 */             IillIill1IO1 iillIill1IO1 = (IillIill1IO1) o1ooOo;
/* 4 */             Ol111o0 ol111o0 = this.I00000oIO;
/* 6 */             OIilII oIilII = this.I00000oOI;
/* 8 */             boolean z2 = this.I0000Il00O;
/* 10 */            OI0lOIiOIOOo oI0lOIiOIOOo = this.I0000O;
/* 12 */            boolean z3 = this.I0000oI00;
/* 14 */            IillI1lo11l0 iillI1lo11l0 = this.I0001Ioi1lo;
/* 16 */            Function3 function3 = this.I000II;
/* 18 */            boolean z4 = this.I000O01llI0;
/* 26 */            boolean z5 = true;
/* 27 */            if (O0000Ioio00.I0000O(iillIill1IO1.I010OIo1l, ol111o0)) {
/* 33 */                z = false;
                    } else {
/* 29 */                iillIill1IO1.I010OIo1l = ol111o0;
/* 31 */                z = true;
                    }
/* 36 */            if (iillIill1IO1.I010l10O != z4) {
/* 38 */                iillIill1IO1.I010l10O = z4;
                    } else {
/* 41 */                z5 = z;
                    }
/* 42 */            iillIill1IO1.I010iIIOlo = iillI1lo11l0;
/* 44 */            iillIill1IO1.I010ioo = function3;
/* 46 */            iillIill1IO1.I010i10l = z3;
/* 51 */            iillIill1IO1.I011lO1liO1O(I000OOo1O, z2, oI0lOIiOIOOo, oIilII, z5);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 91 */                return true;
                    }
/* 4 */             if (obj == null || Iill1IlI1oO0.class != obj.getClass()) {
/* 89 */                return false;
                    }
/* 16 */            Iill1IlI1oO0 iill1IlI1oO0 = (Iill1IlI1oO0) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iill1IlI1oO0.I00000oIO) && this.I00000oOI == iill1IlI1oO0.I00000oOI && this.I0000Il00O == iill1IlI1oO0.I0000Il00O && O0000Ioio00.I0000O(this.I0000O, iill1IlI1oO0.I0000O) && this.I0000oI00 == iill1IlI1oO0.I0000oI00 && O0000Ioio00.I0000O(this.I0001Ioi1lo, iill1IlI1oO0.I0001Ioi1lo) && O0000Ioio00.I0000O(this.I000II, iill1IlI1oO0.I000II) && this.I000O01llI0 == iill1IlI1oO0.I000O01llI0;
                }

                public final int hashCode() {
/* 20 */            int iI000OOo1O = Oi010OO0.I000OOo1O((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31, 31, this.I0000Il00O);
/* 24 */            OI0lOIiOIOOo oI0lOIiOIOOo = this.I0000O;
/* 64 */            return Boolean.hashCode(this.I000O01llI0) + ((this.I000II.hashCode() + ((this.I0001Ioi1lo.hashCode() + Oi010OO0.I000OOo1O((iI000OOo1O + (oI0lOIiOIOOo != null ? oI0lOIiOIOOo.hashCode() : 0)) * 31, 31, this.I0000oI00)) * 31)) * 31);
                }
            }
