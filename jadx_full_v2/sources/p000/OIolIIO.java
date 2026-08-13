            package p000;

            import android.net.NetworkRequest;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class OIolIIO implements Parcelable {
                public static final Parcelable.Creator<OIolIIO> CREATOR = new i1IIiI1OOo(14);
                public IOo0o10i1IO I00iOIl;

                public OIolIIO(IOo0o10i1IO iOo0o10i1IO) {
/* 4 */             this.I00iOIl = iOo0o10i1IO;
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             IOo0o10i1IO iOo0o10i1IO = this.I00iOIl;
/* 9 */             parcel.writeInt(liIOOIo0.I000O01llI0(iOo0o10i1IO.I00000oIO));
/* 14 */            parcel.writeInt(iOo0o10i1IO.I0000oI00 ? 1 : 0);
/* 19 */            parcel.writeInt(iOo0o10i1IO.I0000Il00O ? 1 : 0);
/* 24 */            parcel.writeInt(iOo0o10i1IO.I0001Ioi1lo ? 1 : 0);
/* 29 */            parcel.writeInt(iOo0o10i1IO.I0000O ? 1 : 0);
/* 32 */            boolean zI00000oOI = iOo0o10i1IO.I00000oOI();
/* 36 */            parcel.writeInt(zI00000oOI ? 1 : 0);
/* 39 */            if (zI00000oOI) {
/* 47 */                parcel.writeByteArray(liIOOIo0.I000OiO(iOo0o10i1IO.I000OOo1O));
                    }
/* 52 */            parcel.writeLong(iOo0o10i1IO.I000O01llI0);
/* 57 */            parcel.writeLong(iOo0o10i1IO.I000II);
/* 60 */            NetworkRequest networkRequestI00000oIO = iOo0o10i1IO.I00000oIO();
/* 68 */            int i2 = networkRequestI00000oIO != null ? 1 : 0;
/* 69 */            parcel.writeInt(i2);
/* 72 */            if (i2 != 0) {
/* 78 */                parcel.writeIntArray(networkRequestI00000oIO.getCapabilities());
/* 85 */                parcel.writeIntArray(networkRequestI00000oIO.getTransportTypes());
                    }
                }
            }
