            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class OIooO00 extends OlO1IOi1lli implements Parcelable, Ol1ll0O, OlO01l1oOil, OI10i0Il {
                public static final Parcelable.Creator<OIooO00> CREATOR = new i1IIiI1OOo(22);
                public Ol1lOlo1oo I00iiI;

                public OIooO00(double d) {
/* 4 */             Ol1il1o1 ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 14 */            Ol1lOlo1oo ol1lOlo1oo = new Ol1lOlo1oo(ol1il1o1I000O01llI0.I000II(), d);
/* 19 */            if (!(ol1il1o1I000O01llI0 instanceof Io0O010)) {
/* 28 */                ol1lOlo1oo.I00000oOI = new Ol1lOlo1oo(1L, d);
                    }
/* 30 */            this.I00iiI = ol1lOlo1oo;
                }

                @Override
                public final OlO1Ol0il0i I00000oOI() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final OlO1Ol0il0i I0000O(OlO1Ol0il0i olO1Ol0il0i, OlO1Ol0il0i olO1Ol0il0i2, OlO1Ol0il0i olO1Ol0il0i3) {
/* 12 */            if (((Ol1lOlo1oo) olO1Ol0il0i2).I0000Il00O == ((Ol1lOlo1oo) olO1Ol0il0i3).I0000Il00O) {
/* 14 */                return olO1Ol0il0i2;
                    }
/* 15 */            return null;
                }

                @Override
                public final Ol1lllIil I0000oI00() {
/* 1 */             return Io1Oioii1111.I00ilO0;
                }

                public final void I000II(double d) {
                    Ol1il1o1 ol1il1o1I000O01llI0;
/* 7 */             Ol1lOlo1oo ol1lOlo1oo = (Ol1lOlo1oo) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iiI);
/* 13 */            if (ol1lOlo1oo.I0000Il00O == d) {
/* 15 */                return;
                    }
/* 16 */            Ol1lOlo1oo ol1lOlo1oo2 = this.I00iiI;
                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 21 */                ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 31 */                ((Ol1lOlo1oo) Ol1l1lI1Ili.I000o00OoI0I(ol1lOlo1oo2, this, ol1il1o1I000O01llI0, ol1lOlo1oo)).I0000Il00O = d;
                    }
/* 34 */            Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
                }

                @Override
                public final void I000OOo1O(OlO1Ol0il0i olO1Ol0il0i) {
/* 3 */             this.I00iiI = (Ol1lOlo1oo) olO1Ol0il0i;
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final Object getValue() {
/* 11 */            return Double.valueOf(((Ol1lOlo1oo) Ol1l1lI1Ili.I0010o(this.I00iiI, this)).I0000Il00O);
                }

                @Override
                public final void setValue(Object obj) {
/* 7 */             I000II(((Number) obj).doubleValue());
                }

                public final String toString() {
/* 33 */            return "MutableDoubleState(value=" + ((Ol1lOlo1oo) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iiI)).I0000Il00O + ")@" + hashCode();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 11 */            parcel.writeDouble(((Ol1lOlo1oo) Ol1l1lI1Ili.I0010o(this.I00iiI, this)).I0000Il00O);
                }
            }
