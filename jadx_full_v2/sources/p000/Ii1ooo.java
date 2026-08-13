            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class Ii1ooo implements Parcelable {
                public static final Parcelable.Creator<Ii1ooo> CREATOR = new i1IIiI1OOo(5);
                public final int I00iOIl;

                public Ii1ooo(int i) {
/* 4 */             this.I00iOIl = i;
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof Ii1ooo) && this.I00iOIl == ((Ii1ooo) obj).I00iOIl;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00iOIl);
                }

                public final String toString() {
/* 7 */             return IIlIOloOOO.I00100l0("DefaultLazyKey(index=", this.I00iOIl, ")");
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeInt(this.I00iOIl);
                }
            }
