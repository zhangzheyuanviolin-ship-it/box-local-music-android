            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            public final class Ill1Oooli01I implements Parcelable {
                public static final Parcelable.Creator<Ill1Oooli01I> CREATOR = new i1IIiI1OOo(7);
                public ArrayList I00iOIl;
                public ArrayList I00iiI;
                public I1loioi1I0Ii[] I00iiO;
                public int I00iio;
                public String I00ilI0I1;
                public ArrayList I00ilO0;
                public ArrayList I00io1l;
                public ArrayList I00ioIO;

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeStringList(this.I00iOIl);
/* 8 */             parcel.writeStringList(this.I00iiI);
/* 13 */            parcel.writeTypedArray(this.I00iiO, i);
/* 18 */            parcel.writeInt(this.I00iio);
/* 23 */            parcel.writeString(this.I00ilI0I1);
/* 28 */            parcel.writeStringList(this.I00ilO0);
/* 33 */            parcel.writeTypedList(this.I00io1l);
/* 38 */            parcel.writeTypedList(this.I00ioIO);
                }
            }
