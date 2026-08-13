            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class OIooliIO0 extends OlO1IOi1lli implements Parcelable, Ol1ll0O {
                public static final Parcelable.Creator<OIooliIO0> CREATOR = new OIoolIIoO00l(0);
                public final Ol1lllIil I00iiI;
                public Ol1llO1o I00iiO;

                public OIooliIO0(Object obj, Ol1lllIil ol1lllIil) {
/* 4 */             this.I00iiI = ol1lllIil;
/* 6 */             Ol1il1o1 ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 16 */            Ol1llO1o ol1llO1o = new Ol1llO1o(ol1il1o1I000O01llI0.I000II(), obj);
/* 21 */            if (!(ol1il1o1I000O01llI0 instanceof Io0O010)) {
/* 30 */                ol1llO1o.I00000oOI = new Ol1llO1o(1L, obj);
                    }
/* 32 */            this.I00iiO = ol1llO1o;
                }

                @Override
                public final OlO1Ol0il0i I00000oOI() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final OlO1Ol0il0i I0000O(OlO1Ol0il0i olO1Ol0il0i, OlO1Ol0il0i olO1Ol0il0i2, OlO1Ol0il0i olO1Ol0il0i3) {
/* 18 */            if (this.I00iiI.I0000O(((Ol1llO1o) olO1Ol0il0i2).I0000Il00O, ((Ol1llO1o) olO1Ol0il0i3).I0000Il00O)) {
/* 20 */                return olO1Ol0il0i2;
                    }
/* 21 */            return null;
                }

                @Override
                public final Ol1lllIil I0000oI00() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final void I000OOo1O(OlO1Ol0il0i olO1Ol0il0i) {
/* 3 */             this.I00iiO = (Ol1llO1o) olO1Ol0il0i;
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final Object getValue() {
/* 9 */             return ((Ol1llO1o) Ol1l1lI1Ili.I0010o(this.I00iiO, this)).I0000Il00O;
                }

                @Override
                public final void setValue(Object obj) {
                    Ol1il1o1 ol1il1o1I000O01llI0;
/* 7 */             Ol1llO1o ol1llO1o = (Ol1llO1o) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iiO);
/* 17 */            if (this.I00iiI.I0000O(ol1llO1o.I0000Il00O, obj)) {
/* 77 */                return;
                    }
/* 19 */            Ol1llO1o ol1llO1o2 = this.I00iiO;
                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 24 */                ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 34 */                ((Ol1llO1o) Ol1l1lI1Ili.I000o00OoI0I(ol1llO1o2, this, ol1il1o1I000O01llI0, ol1llO1o)).I0000Il00O = obj;
                    }
/* 37 */            Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
                }

                public final String toString() {
/* 33 */            return "MutableState(value=" + ((Ol1llO1o) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iiO)).I0000Il00O + ")@" + hashCode();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
                    int i2;
/* 5 */             parcel.writeValue(getValue());
/* 8 */             IIIOlol iIIOlol = IIIOlol.I00ilO0;
/* 10 */            Ol1lllIil ol1lllIil = this.I00iiI;
/* 16 */            if (ol1lllIil.equals(iIIOlol)) {
/* 18 */                i2 = 0;
                    } else if (ol1lllIil.equals(Io1Oioii1111.I00ilO0)) {
/* 28 */                i2 = 1;
                    } else {
/* 36 */                if (!ol1lllIil.equals(IOO0o0I1l.I00ilI0I1)) {
/* 45 */                    I000II.I001IO000("Only known types of MutableState's SnapshotMutationPolicy are supported");
/* 106 */                   return;
                        }
/* 38 */                i2 = 2;
                    }
/* 39 */            parcel.writeInt(i2);
                }
            }
