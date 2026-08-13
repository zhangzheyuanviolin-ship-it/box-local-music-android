            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            
            public final class lOiIOoIi11I extends I01OlIoIl {
                public static final Parcelable.Creator<lOiIOoIi11I> CREATOR = new iolIll1o(17);
                public final String I00iOIl;
                public final String I00iiI;
                public final int I00iiO;
                public final int I00iio;
                public final int I00ilI0I1;
                public final int I00ilO0;
                public final int I00io1l;
                public final String I00ioIO;

                public lOiIOoIi11I(String str, String str2, int i, int i2, int i3, int i4, int i5, String str3) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = str2;
/* 8 */             this.I00iiO = i;
/* 10 */            this.I00iio = i2;
/* 12 */            this.I00ilI0I1 = i3;
/* 14 */            this.I00ilO0 = i4;
/* 16 */            this.I00io1l = i5;
/* 18 */            this.I00ioIO = str3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof lOiIOoIi11I)) {
/* 7 */                 return false;
                    }
/* 11 */            lOiIOoIi11I loiiooii11i = (lOiIOoIi11I) obj;
                    return this.I00iiO == loiiooii11i.I00iiO && this.I00iio == loiiooii11i.I00iio && Objects.equals(this.I00iOIl, loiiooii11i.I00iOIl) && this.I00ilI0I1 == loiiooii11i.I00ilI0I1 && this.I00ilO0 == loiiooii11i.I00ilO0;
                }

                public final int hashCode() {
/* 31 */            return Objects.hash(this.I00iOIl, Integer.valueOf(this.I00iiO), Integer.valueOf(this.I00iio), Integer.valueOf(this.I00ilI0I1), Integer.valueOf(this.I00ilO0));
                }

                public final String toString() {
/* 5 */             String simpleName = lOiIOoIi11I.class.getSimpleName();
/* 10 */            l1IllOOOo1 l1illoooo1 = new l1IllOOOo1(2);
/* 15 */            l1Il1IliOI1l l1il1ilioi1l = new l1Il1IliOI1l();
/* 18 */            l1illoooo1.I00iiO = l1il1ilioi1l;
/* 20 */            l1illoooo1.I00iio = l1il1ilioi1l;
/* 22 */            l1illoooo1.I00iiI = simpleName;
/* 24 */            VarHandle.storeStoreFence();
/* 29 */            l1Il1IliOI1l l1il1ilioi1l2 = new l1Il1IliOI1l();
/* 32 */            l1il1ilioi1l.I00iiO = l1il1ilioi1l2;
/* 34 */            l1illoooo1.I00iio = l1il1ilioi1l2;
/* 38 */            l1il1ilioi1l2.I00iiI = this.I00iOIl;
/* 42 */            l1il1ilioi1l2.I00iOIl = "name";
/* 46 */            l1Il1IliOI1l l1il1ilioi1l3 = new l1Il1IliOI1l();
/* 49 */            l1il1ilioi1l2.I00iiO = l1il1ilioi1l3;
/* 51 */            l1illoooo1.I00iio = l1il1ilioi1l3;
/* 55 */            l1il1ilioi1l3.I00iiI = this.I00iiI;
/* 59 */            l1il1ilioi1l3.I00iOIl = "modelName";
/* 65 */            l1illoooo1.I0000oI00(this.I00iiO, "type");
/* 72 */            l1illoooo1.I0000oI00(this.I00iio, "variant");
/* 79 */            l1illoooo1.I0000oI00(this.I00ilI0I1, "id");
/* 86 */            l1illoooo1.I0000oI00(this.I00ilO0, "version");
/* 89 */            return l1illoooo1.toString();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, this.I00iOIl);
/* 16 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 21 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 26 */            parcel.writeInt(this.I00iiO);
/* 29 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 34 */            parcel.writeInt(this.I00iio);
/* 38 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 43 */            parcel.writeInt(this.I00ilI0I1);
/* 47 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 52 */            parcel.writeInt(this.I00ilO0);
/* 56 */            lO0IioIooIl.I000oI1ioi(parcel, 7, 4);
/* 61 */            parcel.writeInt(this.I00io1l);
/* 68 */            lO0IioIooIl.I000OiO(parcel, 8, this.I00ioIO);
/* 71 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
