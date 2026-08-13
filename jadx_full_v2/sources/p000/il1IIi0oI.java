            package p000;

            import android.os.IBinder;
            import android.os.Messenger;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class il1IIi0oI implements Parcelable {
                public static final Parcelable.Creator<il1IIi0oI> CREATOR = new iIlI1lioo0lO(9);
                public final Messenger I00iOIl;

                public il1IIi0oI(IBinder iBinder) {
/* 9 */             this.I00iOIl = new Messenger(iBinder);
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == null) {
/* 22 */                return false;
                    }
                    try {
/* 17 */                return this.I00iOIl.getBinder().equals(((il1IIi0oI) obj).I00iOIl.getBinder());
                    } catch (ClassCastException unused) {
/* 22 */                return false;
                    }
                }

                public final int hashCode() {
/* 7 */             return this.I00iOIl.getBinder().hashCode();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 7 */             parcel.writeStrongBinder(this.I00iOIl.getBinder());
                }
            }
