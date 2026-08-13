            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import java.util.ArrayList;
            
            public final class I1loioi1I0Ii implements Parcelable {
                public static final Parcelable.Creator<I1loioi1I0Ii> CREATOR = new i1IIiI1OOo(3);
                public int[] I00iOIl;
                public ArrayList I00iiI;
                public int[] I00iiO;
                public int[] I00iio;
                public int I00ilI0I1;
                public String I00ilO0;
                public int I00io1l;
                public int I00ioIO;
                public CharSequence I00l0I0l0lO1;
                public int I00l0OO0IO;
                public CharSequence I00li1OI;
                public ArrayList I00ll1;
                public ArrayList I00lli11;
                public boolean I00lll10;

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeIntArray(this.I00iOIl);
/* 8 */             parcel.writeStringList(this.I00iiI);
/* 13 */            parcel.writeIntArray(this.I00iiO);
/* 18 */            parcel.writeIntArray(this.I00iio);
/* 23 */            parcel.writeInt(this.I00ilI0I1);
/* 28 */            parcel.writeString(this.I00ilO0);
/* 33 */            parcel.writeInt(this.I00io1l);
/* 38 */            parcel.writeInt(this.I00ioIO);
/* 44 */            TextUtils.writeToParcel(this.I00l0I0l0lO1, parcel, 0);
/* 49 */            parcel.writeInt(this.I00l0OO0IO);
/* 54 */            TextUtils.writeToParcel(this.I00li1OI, parcel, 0);
/* 59 */            parcel.writeStringList(this.I00ll1);
/* 64 */            parcel.writeStringList(this.I00lli11);
/* 69 */            parcel.writeInt(this.I00lll10 ? 1 : 0);
                }
            }
