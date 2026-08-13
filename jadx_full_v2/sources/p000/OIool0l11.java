            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class OIool0l11 extends OlO1IOi1lli implements Parcelable, Ol1ll0O, OlO01l1oOil, OI10i0Il {
                public static final Parcelable.Creator<OIool0l11> CREATOR = new i1IIiI1OOo(25);
                public Ol1ll00 I00iiI;

                public OIool0l11(long j) {
/* 4 */             Ol1il1o1 ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 14 */            Ol1ll00 ol1ll00 = new Ol1ll00(ol1il1o1I000O01llI0.I000II(), j);
/* 19 */            if (!(ol1il1o1I000O01llI0 instanceof Io0O010)) {
/* 28 */                ol1ll00.I00000oOI = new Ol1ll00(1L, j);
                    }
/* 30 */            this.I00iiI = ol1ll00;
                }

                @Override
                public final OlO1Ol0il0i I00000oOI() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final OlO1Ol0il0i I0000O(OlO1Ol0il0i olO1Ol0il0i, OlO1Ol0il0i olO1Ol0il0i2, OlO1Ol0il0i olO1Ol0il0i3) {
/* 12 */            if (((Ol1ll00) olO1Ol0il0i2).I0000Il00O == ((Ol1ll00) olO1Ol0il0i3).I0000Il00O) {
/* 14 */                return olO1Ol0il0i2;
                    }
/* 15 */            return null;
                }

                @Override
                public final Ol1lllIil I0000oI00() {
/* 1 */             return Io1Oioii1111.I00ilO0;
                }

                public final long I000II() {
/* 9 */             return ((Ol1ll00) Ol1l1lI1Ili.I0010o(this.I00iiI, this)).I0000Il00O;
                }

                public final void I000O01llI0(long j) {
                    Ol1il1o1 ol1il1o1I000O01llI0;
/* 7 */             Ol1ll00 ol1ll00 = (Ol1ll00) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iiI);
/* 13 */            if (ol1ll00.I0000Il00O != j) {
/* 15 */                Ol1ll00 ol1ll002 = this.I00iiI;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 20 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 30 */                    ((Ol1ll00) Ol1l1lI1Ili.I000o00OoI0I(ol1ll002, this, ol1il1o1I000O01llI0, ol1ll00)).I0000Il00O = j;
                        }
/* 33 */                Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
                    }
                }

                @Override
                public final void I000OOo1O(OlO1Ol0il0i olO1Ol0il0i) {
/* 3 */             this.I00iiI = (Ol1ll00) olO1Ol0il0i;
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final Object getValue() {
/* 5 */             return Long.valueOf(I000II());
                }

                @Override
                public final void setValue(Object obj) {
/* 7 */             I000O01llI0(((Number) obj).longValue());
                }

                public final String toString() {
/* 33 */            return "MutableLongState(value=" + ((Ol1ll00) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iiI)).I0000Il00O + ")@" + hashCode();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 5 */             parcel.writeLong(I000II());
                }
            }
