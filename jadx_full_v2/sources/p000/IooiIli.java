            package p000;

            import android.content.Intent;
            import android.content.IntentSender;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class IooiIli implements Parcelable {
                public static final Parcelable.Creator<IooiIli> CREATOR = new i1IIiI1OOo(9);
                public final IntentSender I00iOIl;
                public final Intent I00iiI;
                public final int I00iiO;
                public final int I00iio;

                public IooiIli(IntentSender intentSender, Intent intent, int i, int i2) {
/* 4 */             this.I00iOIl = intentSender;
/* 6 */             this.I00iiI = intent;
/* 8 */             this.I00iiO = i;
/* 10 */            this.I00iio = i2;
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeParcelable(this.I00iOIl, i);
/* 8 */             parcel.writeParcelable(this.I00iiI, i);
/* 13 */            parcel.writeInt(this.I00iiO);
/* 18 */            parcel.writeInt(this.I00iio);
                }
            }
