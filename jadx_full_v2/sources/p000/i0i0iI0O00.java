            package p000;

            import android.accounts.Account;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
            
            public final class i0i0iI0O00 extends I01OlIoIl {
                public static final Parcelable.Creator<i0i0iI0O00> CREATOR = new OO00iO(17);
                public final int I00iOIl;
                public final Account I00iiI;
                public final int I00iiO;
                public final GoogleSignInAccount I00iio;

                public i0i0iI0O00(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = account;
/* 8 */             this.I00iiO = i2;
/* 10 */            this.I00iio = googleSignInAccount;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 20 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 24 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 29 */            parcel.writeInt(this.I00iiO);
/* 34 */            lO0IioIooIl.I000OOo1O(parcel, 4, this.I00iio, i);
/* 37 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
