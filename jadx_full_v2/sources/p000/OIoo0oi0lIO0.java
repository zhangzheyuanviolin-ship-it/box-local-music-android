            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import androidx.work.WorkerParameters;
            import java.lang.invoke.VarHandle;
            
            public final class OIoo0oi0lIO0 implements Parcelable {
                public static final Parcelable.Creator<OIoo0oi0lIO0> CREATOR = new i1IIiI1OOo(19);
                public String I00iOIl;
                public OO00o1o I00iiI;

                public OIoo0oi0lIO0(String str, WorkerParameters workerParameters) {
/* 4 */             this.I00iOIl = str;
/* 8 */             OO00o1o oO00o1o = new OO00o1o();
/* 13 */            oO00o1o.I00iOIl = workerParameters.I00000oIO;
/* 17 */            oO00o1o.I00iiI = workerParameters.I00000oOI;
/* 21 */            oO00o1o.I00iiO = workerParameters.I0000Il00O;
/* 25 */            oO00o1o.I00iio = workerParameters.I0000O;
/* 29 */            oO00o1o.I00ilI0I1 = workerParameters.I0000oI00;
/* 33 */            oO00o1o.I00ilO0 = workerParameters.I000l1;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            this.I00iiI = oO00o1o;
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeString(this.I00iOIl);
/* 8 */             this.I00iiI.writeToParcel(parcel, i);
                }
            }
