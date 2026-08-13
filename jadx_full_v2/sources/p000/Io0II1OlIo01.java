            package p000;

            import android.accounts.Account;
            import android.os.Binder;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.android.gms.common.api.Scope;
            
            public final class Io0II1OlIo01 extends I01OlIoIl {
                public static final Parcelable.Creator<Io0II1OlIo01> CREATOR = new iolIll1o(15);
                public static final Scope[] I00o0iI0io1 = new Scope[0];
                public static final IlIII1l[] I00o0l1o1o0 = new IlIII1l[0];
                public final int I00iOIl;
                public final int I00iiI;
                public final int I00iiO;
                public String I00iio;
                public IBinder I00ilI0I1;
                public Scope[] I00ilO0;
                public Bundle I00io1l;
                public Account I00ioIO;
                public IlIII1l[] I00l0I0l0lO1;
                public IlIII1l[] I00l0OO0IO;
                public final boolean I00li1OI;
                public final int I00ll1;
                public boolean I00lli11;
                public final String I00lll10;

                public Io0II1OlIo01(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, IlIII1l[] ilIII1lArr, IlIII1l[] ilIII1lArr2, boolean z, int i4, boolean z2, String str2) {
                    Account account2;
/* 9 */             Scope[] scopeArr2 = scopeArr == null ? I00o0iI0io1 : scopeArr;
/* 18 */            Bundle bundle2 = bundle == null ? new Bundle() : bundle;
/* 19 */            IlIII1l[] ilIII1lArr3 = I00o0l1o1o0;
/* 25 */            IlIII1l[] ilIII1lArr4 = ilIII1lArr == null ? ilIII1lArr3 : ilIII1lArr;
/* 27 */            ilIII1lArr3 = ilIII1lArr2 != null ? ilIII1lArr2 : ilIII1lArr3;
/* 32 */            this.I00iOIl = i;
/* 34 */            this.I00iiI = i2;
/* 36 */            this.I00iiO = i3;
/* 44 */            if ("com.google.android.gms".equals(str)) {
/* 46 */                this.I00iio = "com.google.android.gms";
                    } else {
/* 49 */                this.I00iio = str;
                    }
/* 52 */            if (i < 2) {
/* 54 */                account2 = null;
/* 55 */                if (iBinder != null) {
/* 57 */                    int i5 = I0I0Oollll1i.I000O01llI0;
/* 61 */                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
/* 76 */                    IoOiO1o1oI loo1iool0 = iInterfaceQueryLocalInterface instanceof IoOiO1o1oI ? (IoOiO1o1oI) iInterfaceQueryLocalInterface : new loO1Iool0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 10);
/* 79 */                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                            try {
                                try {
/* 83 */                            loO1Iool0 loo1iool02 = (loO1Iool0) loo1iool0;
/* 89 */                            Parcel parcelI00IoO0 = loo1iool02.I00IoO0(2, loo1iool02.I00Iooi00oi());
/* 99 */                            Account account3 = (Account) iil1OIloI1i.I00000oIO(parcelI00IoO0, Account.CREATOR);
/* 101 */                           parcelI00IoO0.recycle();
/* 104 */                           Binder.restoreCallingIdentity(jClearCallingIdentity);
/* 107 */                           account2 = account3;
                                } catch (RemoteException unused) {
/* 113 */                           Log.w("AccountAccessor", "Remote account accessor probably died");
/* 116 */                           Binder.restoreCallingIdentity(jClearCallingIdentity);
                                }
                            } catch (Throwable th) {
/* 122 */                       Binder.restoreCallingIdentity(jClearCallingIdentity);
/* 125 */                       throw th;
                            }
                        }
                    } else {
/* 129 */               this.I00ilI0I1 = iBinder;
/* 131 */               account2 = account;
                    }
/* 126 */           this.I00ioIO = account2;
/* 133 */           this.I00ilO0 = scopeArr2;
/* 135 */           this.I00io1l = bundle2;
/* 137 */           this.I00l0I0l0lO1 = ilIII1lArr4;
/* 139 */           this.I00l0OO0IO = ilIII1lArr3;
/* 143 */           this.I00li1OI = z;
/* 147 */           this.I00ll1 = i4;
/* 151 */           this.I00lli11 = z2;
/* 155 */           this.I00lll10 = str2;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             iolIll1o.I00000oIO(this, parcel, i);
                }
            }
