            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOo1IIoOI0;", "LO1oooooIio;", "LOo1Ii1lloO1;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class Oo1IIoOI0 extends O1oooooIio {
                public final boolean I00000oIO;
                public final OI0lOIiOIOOo I00000oOI;
                public final Iol100iI0lO I0000Il00O;
                public final boolean I0000O;
                public final Oi1o00lo I0000oI00;
                public final Function1 I0001Ioi1lo;

                public Oo1IIoOI0(boolean z, OI0lOIiOIOOo oI0lOIiOIOOo, Iol100iI0lO iol100iI0lO, boolean z2, Oi1o00lo oi1o00lo, Function1 function1) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = oI0lOIiOIOOo;
/* 8 */             this.I0000Il00O = iol100iI0lO;
/* 10 */            this.I0000O = z2;
/* 12 */            this.I0000oI00 = oi1o00lo;
/* 14 */            this.I0001Ioi1lo = function1;
                }

                @Override
                public final O1ooOo I000II() {
/* 6 */             I0I0O00 i0i0o00 = new I0I0O00(2);
/* 9 */             Function1 function1 = this.I0001Ioi1lo;
/* 11 */            i0i0o00.I00iiI = function1;
/* 13 */            boolean z = this.I00000oIO;
/* 15 */            i0i0o00.I00iiO = z;
/* 17 */            VarHandle.storeStoreFence();
/* 30 */            Oo1Ii1lloO1 oo1Ii1lloO1 = new Oo1Ii1lloO1(this.I00000oOI, this.I0000Il00O, false, this.I0000O, null, this.I0000oI00, i0i0o00);
/* 33 */            oo1Ii1lloO1.I010ioo = z;
/* 35 */            oo1Ii1lloO1.I010l10O = function1;
/* 41 */            OlOi0iollo olOi0iollo = new OlOi0iollo(11);
/* 44 */            olOi0iollo.I00iiI = oo1Ii1lloO1;
/* 46 */            VarHandle.storeStoreFence();
/* 49 */            oo1Ii1lloO1.I010l1O = olOi0iollo;
/* 51 */            VarHandle.storeStoreFence();
/* 55 */            return oo1Ii1lloO1;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 2 */             Oo1Ii1lloO1 oo1Ii1lloO1 = (Oo1Ii1lloO1) o1ooOo;
/* 4 */             boolean z = oo1Ii1lloO1.I010ioo;
/* 6 */             boolean z2 = this.I00000oIO;
/* 8 */             if (z != z2) {
/* 10 */                oo1Ii1lloO1.I010ioo = z2;
/* 12 */                lO1OiIiIo0oi.I00000oOI(oo1Ii1lloO1);
                    }
/* 17 */            oo1Ii1lloO1.I010l10O = this.I0001Ioi1lo;
/* 31 */            oo1Ii1lloO1.I011iO(this.I00000oOI, this.I0000Il00O, false, this.I0000O, null, this.I0000oI00, oo1Ii1lloO1.I010l1O);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 73 */                return true;
                    }
/* 4 */             if (obj == null || Oo1IIoOI0.class != obj.getClass()) {
/* 71 */                return false;
                    }
/* 16 */            Oo1IIoOI0 oo1IIoOI0 = (Oo1IIoOI0) obj;
                    return this.I00000oIO == oo1IIoOI0.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, oo1IIoOI0.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oo1IIoOI0.I0000Il00O) && this.I0000O == oo1IIoOI0.I0000O && O0000Ioio00.I0000O(this.I0000oI00, oo1IIoOI0.I0000oI00) && this.I0001Ioi1lo == oo1IIoOI0.I0001Ioi1lo;
                }

                public final int hashCode() {
/* 9 */             int iHashCode = Boolean.hashCode(this.I00000oIO) * 31;
/* 11 */            OI0lOIiOIOOo oI0lOIiOIOOo = this.I00000oOI;
/* 22 */            int iHashCode2 = (iHashCode + (oI0lOIiOIOOo != null ? oI0lOIiOIOOo.hashCode() : 0)) * 31;
/* 23 */            Iol100iI0lO iol100iI0lO = this.I0000Il00O;
/* 41 */            int iI000OOo1O = Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O((iHashCode2 + (iol100iI0lO != null ? iol100iI0lO.hashCode() : 0)) * 31, 31, false), 31, this.I0000O);
/* 45 */            Oi1o00lo oi1o00lo = this.I0000oI00;
/* 63 */            return this.I0001Ioi1lo.hashCode() + ((iI000OOo1O + (oi1o00lo != null ? Integer.hashCode(oi1o00lo.I00000oIO) : 0)) * 31);
                }
            }
