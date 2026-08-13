            package androidx.versionedparcelable;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.lang.reflect.InvocationTargetException;
            import p000.OooOIIIO;
            import p000.OooOO0O0Olo;
            import p000.i1IIiI1OOo;
            
            public class ParcelImpl implements Parcelable {
                public static final Parcelable.Creator<ParcelImpl> CREATOR = new i1IIiI1OOo(13);
                public OooOO0O0Olo I00iOIl;

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 8 */             new OooOIIIO(parcel).I000OOo1O(this.I00iOIl);
                }
            }
