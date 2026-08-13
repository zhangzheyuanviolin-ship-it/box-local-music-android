            package p000;

            import android.os.Parcel;
            import android.util.SparseIntArray;
            
/* 31 */    public final class OooOIIIO extends OooOI0Il00l {
                public final SparseIntArray I0000O;
                public final Parcel I0000oI00;
                public final int I0001Ioi1lo;
                public final int I000II;
                public final String I000O01llI0;
                public int I000OOo1O;
                public int I000OiO;
                public int I000iOII;

                public OooOIIIO(Parcel parcel) {
/* 29 */            this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new I1Io0i0II(0), new I1Io0i0II(0), new I1Io0i0II(0));
                }

                @Override
                public final OooOIIIO I00000oIO() {
/* 3 */             Parcel parcel = this.I0000oI00;
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             int i = this.I000OiO;
/* 13 */            if (i == this.I0001Ioi1lo) {
/* 15 */                i = this.I000II;
                    }
/* 36 */            return new OooOIIIO(parcel, iDataPosition, i, IIl001iO0Io.I00100l0(new StringBuilder(), this.I000O01llI0, "  "), this.I00000oIO, this.I00000oOI, this.I0000Il00O);
                }

                @Override
                public final boolean I0000oI00(int i) {
                    while (true) {
/* 1 */                 int i2 = this.I000OiO;
/* 3 */                 int i3 = this.I000iOII;
/* 7 */                 if (i2 >= this.I000II) {
                            return i3 == i;
                        }
/* 9 */                 if (i3 == i) {
/* 52 */                    return true;
                        }
/* 24 */                if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
/* 54 */                    return false;
                        }
/* 27 */                int i4 = this.I000OiO;
/* 29 */                Parcel parcel = this.I0000oI00;
/* 31 */                parcel.setDataPosition(i4);
/* 34 */                int i5 = parcel.readInt();
/* 42 */                this.I000iOII = parcel.readInt();
                        this.I000OiO += i5;
                    }
                }

                @Override
                public final void I000O01llI0(int i) {
/* 1 */             int i2 = this.I000OOo1O;
/* 3 */             SparseIntArray sparseIntArray = this.I0000O;
/* 5 */             Parcel parcel = this.I0000oI00;
/* 7 */             if (i2 >= 0) {
/* 9 */                 int i3 = sparseIntArray.get(i2);
/* 13 */                int iDataPosition = parcel.dataPosition();
/* 19 */                parcel.setDataPosition(i3);
/* 22 */                parcel.writeInt(iDataPosition - i3);
/* 25 */                parcel.setDataPosition(iDataPosition);
                    }
/* 28 */            this.I000OOo1O = i;
/* 34 */            sparseIntArray.put(i, parcel.dataPosition());
/* 38 */            parcel.writeInt(0);
/* 41 */            parcel.writeInt(i);
                }

/* 32 */        public OooOIIIO(Parcel parcel, int i, int i2, String str, I1Io0i0II i1Io0i0II, I1Io0i0II i1Io0i0II2, I1Io0i0II i1Io0i0II3) {
/* 34 */            this.I00000oIO = i1Io0i0II;
/* 35 */            this.I00000oOI = i1Io0i0II2;
/* 36 */            this.I0000Il00O = i1Io0i0II3;
/* 37 */            this.I0000O = new SparseIntArray();
/* 38 */            this.I000OOo1O = -1;
/* 39 */            this.I000iOII = -1;
/* 40 */            this.I0000oI00 = parcel;
/* 41 */            this.I0001Ioi1lo = i;
/* 42 */            this.I000II = i2;
/* 43 */            this.I000OiO = i;
/* 44 */            this.I000O01llI0 = str;
                }
            }
