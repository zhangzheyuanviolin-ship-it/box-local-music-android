            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class OIooi1iOiOol extends OlO1IOi1lli implements Parcelable, Ol1ll0O, OlO01l1oOil, OI10i0Il {
                public static final Parcelable.Creator<OIooi1iOiOol> CREATOR = new i1IIiI1OOo(24);
                public Ol1lioioI I00iiI;

                public OIooi1iOiOol(int i) {
/* 4 */             Ol1il1o1 ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 14 */            Ol1lioioI ol1lioioI = new Ol1lioioI(i, ol1il1o1I000O01llI0.I000II());
/* 19 */            if (!(ol1il1o1I000O01llI0 instanceof Io0O010)) {
/* 28 */                ol1lioioI.I00000oOI = new Ol1lioioI(i, 1L);
                    }
/* 30 */            this.I00iiI = ol1lioioI;
                }

                @Override
                public final OlO1Ol0il0i I00000oOI() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final OlO1Ol0il0i I0000O(OlO1Ol0il0i olO1Ol0il0i, OlO1Ol0il0i olO1Ol0il0i2, OlO1Ol0il0i olO1Ol0il0i3) {
/* 10 */            if (((Ol1lioioI) olO1Ol0il0i2).I0000Il00O == ((Ol1lioioI) olO1Ol0il0i3).I0000Il00O) {
/* 12 */                return olO1Ol0il0i2;
                    }
/* 13 */            return null;
                }

                @Override
                public final Ol1lllIil I0000oI00() {
/* 1 */             return Io1Oioii1111.I00ilO0;
                }

                public final int I000II() {
/* 9 */             return ((Ol1lioioI) Ol1l1lI1Ili.I0010o(this.I00iiI, this)).I0000Il00O;
                }

                public final void I000O01llI0(int i) {
                    Ol1il1o1 ol1il1o1I000O01llI0;
/* 7 */             Ol1lioioI ol1lioioI = (Ol1lioioI) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iiI);
/* 11 */            if (ol1lioioI.I0000Il00O != i) {
/* 13 */                Ol1lioioI ol1lioioI2 = this.I00iiI;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 18 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 28 */                    ((Ol1lioioI) Ol1l1lI1Ili.I000o00OoI0I(ol1lioioI2, this, ol1il1o1I000O01llI0, ol1lioioI)).I0000Il00O = i;
                        }
/* 31 */                Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
                    }
                }

                @Override
                public final void I000OOo1O(OlO1Ol0il0i olO1Ol0il0i) {
/* 3 */             this.I00iiI = (Ol1lioioI) olO1Ol0il0i;
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final Object getValue() {
/* 5 */             return Integer.valueOf(I000II());
                }

                @Override
                public final void setValue(Object obj) {
/* 7 */             I000O01llI0(((Number) obj).intValue());
                }

                public final String toString() {
/* 19 */            return IIl001iO0Io.I000l1(((Ol1lioioI) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iiI)).I0000Il00O, hashCode(), "MutableIntState(value=", ")@");
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 5 */             parcel.writeInt(I000II());
                }
            }
